package com.sjzsqjy.www.data.search

import com.sjzsqjy.www.data.sample.SampleUser
import com.sjzsqjy.www.data.shiqiao.ShiQiaoUser
import com.sjzsqjy.www.data.trace.TraceUser
import com.sjzsqjy.www.result.format.BloodResultFormat






class SearchController {
    def index={

    }
	def init={
		log.info params.type	
		session.putValue "type",params.type
	}
	def search={
		log.info params.name
		log.info params.myDate.format("yyyy-MM-dd")
		if(!params.name){
			flash.message = "姓名不能为空!!!"
			render view:"init"
			return
			}
		////type==1表示  临床检验报告单查询即思桥软件结果查询
		if(session.type=="1"){
			def patientList=ShiQiaoUser.findAllWhere(date:params.myDate.format("yyyy-MM-dd"), name:params.name)
			log.info "sizedddddd"+patientList.size()
			if(!patientList){
				patientList==ShiQiaoUser.findAllByName(params.name)
			}
			if(!patientList){
				render "没有查询到相关信息"
				return
			}
			if(patientList.size()>1){
				log.info patientList[0].name
				render view:"/shiQiaoSearch/many", model:[patientList:patientList]					
				return
			}
			log.info "size"+patientList.size()
			log.info patientList[0]
			session.putValue "patient", patientList[0]
			redirect( controller:"shiQiaoSearch",action:"result")
		}
		/////type=2样品软件检测报告
		if(session.type=="2"){
			def c=SampleUser.createCriteria()
			def patientList=c.list{
				if(params.name){
					like("name","%${params.name}%")
				}
				if(params.myDate){
					def date=formatDate(params.myDate.format("yyyy-MM-dd"))
					like("sampleId","%${date}%")
				}
			}
			log.info "sizedddddd"+patientList.size()
			if(!patientList){
				patientList==c.list{
					if(params.name){
						like("name","%${params.name}%")
					}
				}
			}
			if(!patientList){
				render "没有查询到相关信息"
				return
              
			}
			if(patientList.size()>1){
				log.info patientList[0].name
				render view:"/sampleSearch/many", model:[patientList:patientList]					
				return
			}
			log.info "size"+patientList.size()
			log.info patientList[0]
			session.putValue "patient", patientList[0]
			redirect( controller:"sampleSearch",action:"result")
		}
		/////type=3血流检测报告
		if(session.type=="3"){
			log.info "dddddd"
			def date=ShiQiaoSearchController.formatDate(params.myDate.format("yyyy-MM-dd"))
			def file0=new File(servletContext.getRealPath("/blood"))//
			def patientList=new ArrayList()
			def p = ~/${date}_\w*_${params.name}.rep/
			log.info p
			file0.eachFileMatch(p) {
				f->
				log.info f.name	
				patientList.add f.name
			}
			if(patientList.size==0){
				render "没有查询到相关信息"
				return
			}
			if(patientList.size()>1){
				log.info patientList[0].name
				render view:"/bloodSearch/many", model:[patientList:patientList]					
				return
			}
			else{
				session.putValue "fileName", patientList[0]
				def file=new File(servletContext.getRealPath("/blood/${patientList[0]}"))
				def resultList=new ArrayList()
				def patient=new BloodResultFormat()
				int i=0
				int j=0
				def b=file.readBytes()
				String string=new String(b,"gbk")
				int sex=5
				if(string.contains('男')){
					sex=1
				}
				else{
					sex=2
				}
				println sex+"sex"
				string.eachLine {
					i++
					switch (i){
						case 1: patient.name=it;break
						case 2: patient.sendDate=it;break
						case 3: patient.testDate=it ;break
						case 4: patient.doorNum=it;break
						case 5: patient.patientNum=it; break
						case 6: patient.sex=it; break
						case 7: patient.sendDoctor=it; break
						case 8: patient.testDoctor=it; break
						case 9: patient.hospitalNum=it; break
						case 10: patient.bedNum=it; break
						case 11: patient.age=it; break
						case 12: patient.keBie=it; break
						case 13: patient.sampleId=it; break
						case 14: patient.type=it; break
						default: def r=new BloodResultFormat()
						def str=it.split(" ")
						
						r.item=r.itemList[j][0]
						try{
							r.value=it.substring(it.length()-5,it.length()).replace(".",".") as float
						}
						catch(Exception e){
							try{
								r.value=it.substring(it.length()-4,it.length()).replace(".",".") as float
							}
							catch(Exception e1){
								try{
									r.value=it.substring(it.length()-2,it.length()).replace(".",".") as float
								}
								catch(Exception e2){
									r.value=it.substring(it.length()-1,it.length()).replace(".",".") as float
								}
							}
						}
						
						r.isNormal(j,sex)
						
						
						j++
						resultList.add r
					}
				}
				render view:"/bloodSearch/result",model:[resultList:resultList,patient:patient,sex:sex]
				return
			}
			
		}
		////type==4,微量元素检测报告
		if(session.type=="4"){
			def patientList=TraceUser.findAllWhere(date:TraceSearchController.formatDate(params.myDate.format("yyyy-MM-dd")),name:params.name)
			log.info "sizedddddd"+patientList.size()
			if(!patientList){
				patientList==TraceUser.findAllByName(params.name)
			}
			if(!patientList){
				render "没有查询到相关信息"
				return
			}
			if(patientList.size()>1){
				log.info patientList[0].name
				render view:"/traceSearch/many", model:[patientList:patientList]					
				return
			}
			log.info "size"+patientList.size()
			log.info patientList[0]
			session.putValue "patient", patientList[0]
			redirect( controller:"traceSearch",action:"result")
		}
	}
	def searchOne={
	}
	static String formatDate(String date){
		def str=date.split("-")
		def result=str[0]+str[1]+str[2]
		return result
	}
}
