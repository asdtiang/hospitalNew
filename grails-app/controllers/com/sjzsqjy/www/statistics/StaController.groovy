package com.sjzsqjy.www.statistics

import grails.plugins.springsecurity.Secured



class StaController {
    @Secured(['ROLE_ADMIN','ROLE_USER'])
	def index={
		
	}
	def staByClinic={
		def date=params.date      		
		def clinic=Clinic.get(params.clinicId)
		def c=Data.createCriteria()
		def dataList=c.list{
			eq("month", date.format("MM"))			
			eq("year", date.format("yyyy"))
			eq("clinic",clinic)
			order("date", "asc")
		}
		float sum=0.0
		dataList.each { 
			sum=it.money+sum
		}
		def month=date.format("yyyy-MM")
		render view:"result",model:[sum:sum,dataList:dataList,month:month,clinicName:clinic.name]
	}
	def sta={
		def date=params.date
	//	println params.date
		if(null==session.shopId){
		   flash.message = "${message(code: 'shop.id.lost')}"
		   redirect (action:'loginAfter',controller:'login')
		   return
		   }
		
		def criteria = Clinic.createCriteria()
		def clinicList = criteria.list {
			eq("shop", Shop.get(session.shopId as long))
			order("checkOutWay", "asc")
		}
		
		def resultList=new ArrayList()	
		def sta
		
		def clinic
		clinicList.each{
			def c=Data.createCriteria()
			sta=new Sta()
			sta.name=it.name
			clinic=it
			println it.id
			sta.dataList=c.list{
				eq("month", date.format("MM"))			
				eq("year", date.format("yyyy"))
				eq("clinic",clinic)
				order("date", "asc")
			}
			float sum=0.0
			sta.dataList.each { 
				sum=it.money+sum
			}
			sta.sum=sum
			if(sum>0){
				resultList.add sta
			}
		}
		def month=date.format("yyyy-MM")
		
		render view:"staResult",model:[resultList:resultList,month:month]	
	}
	def sumMonth={
		def date=params.date
        def month = date.format('MM')
        def year =  date.format('yyyy')
		def sum=Data.executeQuery("select sum(d.money),shop.name from Data d left join  d.clinic.shop  shop where d.month=:month and d.year=:year group by shop.id"
                ,[month:month,year:year]);
		render "本月总计收入：${sum}"
	}
	def sumAll={
		def sum=Data.executeQuery("select sum(data.money) from Data data");
		render "总收入："+sum[0]
	}
	
}

class Sta{
	String name
	List<Data> dataList
	String sum
}
