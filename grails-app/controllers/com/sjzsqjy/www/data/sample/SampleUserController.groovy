package com.sjzsqjy.www.data.sample

import groovy.sql.Sql 
import java.sql.Connection 
import java.sql.DriverManager 
import java.sql.ResultSet 
import java.sql.Statement
import com.sjzsqjy.www.data.shiqiao.ShiQiaoUser

class SampleUserController {
	
	static allowedMethods = [save: "POST", update: "POST", delete: "POST"]
	def ajaxPaginateService
	def index = {
		redirect(action: "list", params: params)
	}
	
	def list = {
		params.max = Math.min(params.max ? params.int('max') : 10, 100)
        params.order = "desc"
		[sampleUserInstanceList: SampleUser.listOrderById(params), sampleUserInstanceTotal: SampleUser.count()]
	}

    def listByClinicId(){
        params.max = Math.min(params.max ? params.int('max') : 15, 100)
        params.controller= "sampleUser"
        params.action="listByClinicId"
        def hql="""select id,name,sex,age,sampleId from SampleUser where clinic.id=:clinicId"""
        println "class:"+session.clinicId
        ajaxPaginateService.getResultMap(params,ShiQiaoUser.class,hql,[clinicId:params.clinicId as long])
    }


    def create = {
		def sampleUserInstance = new SampleUser()
		sampleUserInstance.properties = params
		return [sampleUserInstance: sampleUserInstance]
	}
	
	def save = {
		def sampleUserInstance = new SampleUser(params)
		if (sampleUserInstance.save(flush: true)) {
			flash.message = "${message(code: 'default.created.message', args: [message(code: 'sampleUser.label', default: 'SampleUser'), sampleUserInstance.id])}"
			redirect(action: "show", id: sampleUserInstance.id)
		}
		else {
			render(view: "create", model: [sampleUserInstance: sampleUserInstance])
		}
	}
	
	def show = {
		def sampleUserInstance = SampleUser.get(params.id)
		if (!sampleUserInstance) {
			flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'sampleUser.label', default: 'SampleUser'), params.id])}"
			redirect(action: "list")
		}
		else {
			[sampleUserInstance: sampleUserInstance]
		}
	}
	
	def edit = {
		def sampleUserInstance = SampleUser.get(params.id)
		if (!sampleUserInstance) {
			flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'sampleUser.label', default: 'SampleUser'), params.id])}"
			redirect(action: "list")
		}
		else {
			return [sampleUserInstance: sampleUserInstance]
		}
	}
	
	def update = {
		def sampleUserInstance = SampleUser.get(params.id)
		if (sampleUserInstance) {
			if (params.version) {
				def version = params.version.toLong()
				if (sampleUserInstance.version > version) {
					
					sampleUserInstance.errors.rejectValue("version", "default.optimistic.locking.failure", [message(code: 'sampleUser.label', default: 'SampleUser')] as Object[], "Another user has updated this SampleUser while you were editing")
					render(view: "edit", model: [sampleUserInstance: sampleUserInstance])
					return
				}
			}
			sampleUserInstance.properties = params
			if (!sampleUserInstance.hasErrors() && sampleUserInstance.save(flush: true)) {
				flash.message = "${message(code: 'default.updated.message', args: [message(code: 'sampleUser.label', default: 'SampleUser'), sampleUserInstance.id])}"
				redirect(action: "show", id: sampleUserInstance.id)
			}
			else {
				render(view: "edit", model: [sampleUserInstance: sampleUserInstance])
			}
		}
		else {
			flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'sampleUser.label', default: 'SampleUser'), params.id])}"
			redirect(action: "list")
		}
	}
	
	def delete = {
		def sampleUserInstance = SampleUser.get(params.id)
		if (sampleUserInstance) {
			try {
				sampleUserInstance.delete(flush: true)
				flash.message = "${message(code: 'default.deleted.message', args: [message(code: 'sampleUser.label', default: 'SampleUser'), params.id])}"
				redirect(action: "list")
			}
			catch (org.springframework.dao.DataIntegrityViolationException e) {
				flash.message = "${message(code: 'default.not.deleted.message', args: [message(code: 'sampleUser.label', default: 'SampleUser'), params.id])}"
				redirect(action: "show", id: params.id)
			}
		}
		else {
			flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'sampleUser.label', default: 'SampleUser'), params.id])}"
			redirect(action: "list")
		}
	}
	def traceSql={
		try {		
			String strurl = "jdbc:odbc:Driver={MicroSoft Access Driver (*.mdb)};DBQ=F:/ABAD.mdb;useUnicode=false;characterEncoding=gbk";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn = DriverManager.getConnection(strurl);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select   *   from   SAMPLE_PATIENT_INFO;");
			String str="";
			UUID uuid=UUID.randomUUID();
			System.out.println(uuid.toString());
			
			Sql sql=Sql.newInstance("jdbc:mysql://localhost:3306/hospital","root", "asdtiang","com.mysql.jdbc.Driver");
			def insertCnts = sql.withBatch { stmt1 ->
				while(rs.next()) {
					byte[] b=rs.getBytes("FIRST_NAME")
					def name
					if(b) {
						name=new String(b,"gbk")
					}
					else {
						name=""
					}
					byte[] c=rs.getBytes("SEX")
					def sex
					if(c)
					{
						sex=new String(c,"gbk")
					}
					else{
						sex=""
					}					
					def age=rs.getString("age")
					
					
					def str1="""insert into sample_user(sex,name,age,sample_id,version) values
				('${sex}','${name}','${age}'
						,'${rs.getString("ID")}',0)"""
					println str1
					stmt1.addBatch( str1 )				
				}
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
