package com.sjzsqjy.www.statistics
import java.text.SimpleDateFormat 


class DataController {
	
	static allowedMethods = [save: "POST", update: "POST", delete: "POST"]
	def sessionFactory

	def index = {
		redirect(action: "list", params: params)
	}
	
//	def list = {
//		params.max = Math.min(params.max ? params.int('max') : 50, 100)
//		params.offset=Math.min(params.offset ? params.int('offset') : 0, 100)
//		
//		def c = Data.createCriteria()	
//		def results = c.list {
//				order("date", "desc")
//				order("dateCreated","asc")
//				maxResults(params.max)
//				firstResult(params.offset)
//				fetchMode("aRelationship", FM.EAGER)
//		}
//		
//		[dataInstanceList:  results, dataInstanceTotal: Data.count()]
//	}
	def test={
		params.max = Math.min(params.max ? params.int('max') : 15, 100)
		params.offset=Math.min(params.offset ? params.int('offset') : 1, 100)
		render view:"list",model:[dataInstanceList:  Data.list(params), dataInstanceTotal: Data.count()]
		}
	def create = {
		if(null==session.shopId){
			flash.message = "${message(code: 'shop.id.lost')}"
			redirect (action:'loginAfter',controller:'login')
			return
			}
		def dataInstance = new Data()
		dataInstance.properties = params
		dataInstance.money=0
		return [dataInstance: dataInstance]
	}
	
	def save = {
		def dataInstance = new Data(params)
		SimpleDateFormat   df   =new   SimpleDateFormat("yyyy-MM-dd");
		def date= df.parse(params.testDate.trim() )
		dataInstance.date=date
		dataInstance.month=date.format("MM")
		dataInstance.year=date.format("yyyy")
		dataInstance.item=""
		def clinic=Clinic.findByName(params.clinicName)
        if (null==clinic){
            flash.message = "诊所名不存在！"
            render view: 'create',  model: [dataInstance: dataInstance]
            return
        }
        dataInstance.clinic=clinic
		params.items.each{
			dataInstance.item=dataInstance.item+it
		}
		if (dataInstance.save(flush: true)) {
			flash.message = "${message(code: 'default.created.message', args: [message(code: 'data.label', default: 'Data'), dataInstance.id])}"
			redirect(action: "show", id: dataInstance.id)
		}
		else {
			render(view: "create", model: [dataInstance: dataInstance])
		}
	}
	
	def show = {
		def dataInstance = Data.get(params.id)
		
		
		if (!dataInstance) {
			flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'data.label', default: 'Data'), params.id])}"
			redirect(action: "list")
		}
		else {
			[dataInstance: dataInstance]
		}
	}
	
	def edit = {
		def dataInstance = Data.get(params.id)
		if (!dataInstance) {
			flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'data.label', default: 'Data'), params.id])}"
			redirect(action: "list")
		}
		else {
			return [dataInstance: dataInstance]
		}
	}
	
	def update = {
		def dataInstance = Data.get(params.id)
		if (dataInstance) {
			if (params.version) {
				def version = params.version.toLong()
				if (dataInstance.version > version) {
					
					dataInstance.errors.rejectValue("version", "default.optimistic.locking.failure", [message(code: 'data.label', default: 'Data')] as Object[], "Another user has updated this Data while you were editing")
					render(view: "edit", model: [dataInstance: dataInstance])
					return
				}
			}
			dataInstance.properties = params
			if (!dataInstance.hasErrors() && dataInstance.save(flush: true)) {
				flash.message = "${message(code: 'default.updated.message', args: [message(code: 'data.label', default: 'Data'), dataInstance.id])}"
				redirect(action: "show", id: dataInstance.id)
			}
			else {
				render(view: "edit", model: [dataInstance: dataInstance])
			}
		}
		else {
			flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'data.label', default: 'Data'), params.id])}"
			redirect(action: "list")
		}
	}
	
	def delete = {
		def dataInstance = Data.get(params.id)
		if (dataInstance) {
			try {
				dataInstance.delete(flush: true)
				flash.message = "${message(code: 'default.deleted.message', args: [message(code: 'data.label', default: 'Data'), params.id])}"
				redirect(action: "list")
			}
			catch (org.springframework.dao.DataIntegrityViolationException e) {
				flash.message = "${message(code: 'default.not.deleted.message', args: [message(code: 'data.label', default: 'Data'), params.id])}"
				redirect(action: "show", id: params.id)
			}
		}
		else {
			flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'data.label', default: 'Data'), params.id])}"
			redirect(action: "list")
		}
	}
	def searchAJAX = { 
		if(null==session.shopId){
		   flash.message = "${message(code: 'shop.id.lost')}"
		   redirect (action:'loginAfter',controller:'login')
		   return
		   }
		def c = Clinic.createCriteria()
		def shop = Shop.get(session.shopId)
		def clinics = c.list{
			like("name", "%${params.query}%")
			and {
				eq("shop", shop)
			}
		}
		
		//Create XML response
		
		render(contentType: "text/xml") {
			results() { clinics.each { 
					clinic-> result(){
						name(clinic.name)//Optional id which will be available in onItemSelect 
						id(clinic.id) }
				}
			}
		}
	}
    /**
     * 诊所autoComplete
     */
    def listClinicByName={
        def c = Clinic.createCriteria()
        def clinics = c.list{
            like("name", "%${params.query}%")
        }
        render(contentType: "text/xml") {
            results() { clinics.each {
                clinic-> result(){
                    name(clinic.name)//Optional id which will be available in onItemSelect
                    id(clinic.id) }
            }
            }
        }
    }
	
	/**
	*
	*/

   def list = {
	   if(null==session.shopId){
		   flash.message = "${message(code: 'shop.id.lost')}"
		   redirect (action:'loginAfter',controller:'login')
		   return 
		   }
		def hql="select id,clinic.name,name,item,money,date,month,year,dateCreated from Data where clinic.shop.id=:shopId "
		if(!params.total){
			params.total=sessionFactory.currentSession.createQuery(hql).setLong("shopId",session.shopId).list().size()
		}
        println params
		params.view=params.view==null?"list":params.view
		params.max = Math.min(params.max ? params.max as int : 25, 100)
		params.linkTotal = Math.min(params.linkTotal ? params.linkTotal as int : 2, 100)
		if(!params.offset){
            params.offset=0
        }
        else{
            params.offset=params.offset as int
        }
		params.selectMax="true"
		def results = sessionFactory.currentSession.createQuery(hql+" order by date desc, dateCreated asc ")
		   .setLong("shopId",session.shopId)
		   .setCacheable(false)
		   .setReadOnly(true)
		   .setFirstResult(params.offset)
		   .setMaxResults(params.max)
		   .list()
	
		render view:params.view,model:[pageAjaxList:results,paginateAjaxTotal:params.total]
	}
   def search={
	    if(null==session.shopId){
		   flash.message = "${message(code: 'shop.id.lost')}"
		   redirect (action:'loginAfter',controller:'login')
		   return
		   }
	   params.max = Math.min(params.max ? params.max as int : 20, 100)
	   params.linkTotal = Math.min(params.linkTotal ? params.linkTotal as int : 2, 100)
	   if(!params.offset){
            params.offset=0
       }
       else{
            params.offset=params.offset as int
       }
	   params.sort=params.sort==null?"dateCreated":params.sort
	   params.order=params.order==null?"desc":params.order
	   params.view=params.view==null?"list":params.view
	   def hql="select id,clinic.name,name,item,money,date,month,year," +
	   		"dateCreated from Data where clinic.shop.id=:shopId and dateCreated>=:startDate and dateCreated<=:endDate " +
	   		"  order by date desc, dateCreated asc "
//       println       params.startDate
//       println params.offset
//       println params
        SimpleDateFormat   df   =new   SimpleDateFormat("yyyy-MM-dd");
		Date start= df.parse(params.startDate)
		Date end= df.parse(params.endDate)		

       def condition=" 开始时间：${params.startDate} 结束时间：${params.endDate}"	
	   if(!params.total){
		   params.total=sessionFactory.currentSession.createQuery(hql)
				   .setDate("startDate",start)
				   .setDate("endDate",end)
				   .setLong("shopId",session.shopId)
				   .list().size()
	   }
	   def results = sessionFactory.currentSession.createQuery(hql)
			   .setDate("startDate",start)
			   .setDate("endDate",end)
			   .setLong("shopId",session.shopId)
			   .setCacheable(false)
			   .setReadOnly(true)
			   .setFirstResult(params.offset)
			   .setMaxResults(params.max)
			   .list()
	   render view:params.view,model:[pageAjaxList:results,paginateAjaxTotal:params.total,condition:condition]
   }
   def deleteByDate={
	   render view:'deleteByDate'
	   }
   def deleteData={
	   def num=Data.executeUpdate("delete Data d where d.date <?",[params.date])
	   render "<br><br><h1>删除数据成功,删除数据条数：${num}</h1>"

	   }
  

}



