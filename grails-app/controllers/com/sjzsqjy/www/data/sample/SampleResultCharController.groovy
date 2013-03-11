package com.sjzsqjy.www.data.sample

import groovy.sql.Sql 
import java.sql.Connection 
import java.sql.DriverManager 
import java.sql.ResultSet 
import java.sql.Statement 

class SampleResultCharController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [sampleResultCharInstanceList: SampleResultChar.list(params), sampleResultCharInstanceTotal: SampleResultChar.count()]
    }

    def create = {
        def sampleResultCharInstance = new SampleResultChar()
        sampleResultCharInstance.properties = params
        return [sampleResultCharInstance: sampleResultCharInstance]
    }

    def save = {
        def sampleResultCharInstance = new SampleResultChar(params)
        if (sampleResultCharInstance.save(flush: true)) {
            flash.message = "${message(code: 'default.created.message', args: [message(code: 'sampleResultChar.label', default: 'SampleResultChar'), sampleResultCharInstance.id])}"
            redirect(action: "show", id: sampleResultCharInstance.id)
        }
        else {
            render(view: "create", model: [sampleResultCharInstance: sampleResultCharInstance])
        }
    }

    def show = {
        def sampleResultCharInstance = SampleResultChar.get(params.id)
        if (!sampleResultCharInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'sampleResultChar.label', default: 'SampleResultChar'), params.id])}"
            redirect(action: "list")
        }
        else {
            [sampleResultCharInstance: sampleResultCharInstance]
        }
    }

    def edit = {
        def sampleResultCharInstance = SampleResultChar.get(params.id)
        if (!sampleResultCharInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'sampleResultChar.label', default: 'SampleResultChar'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [sampleResultCharInstance: sampleResultCharInstance]
        }
    }

    def update = {
        def sampleResultCharInstance = SampleResultChar.get(params.id)
        if (sampleResultCharInstance) {
            if (params.version) {
                def version = params.version.toLong()
                if (sampleResultCharInstance.version > version) {
                    
                    sampleResultCharInstance.errors.rejectValue("version", "default.optimistic.locking.failure", [message(code: 'sampleResultChar.label', default: 'SampleResultChar')] as Object[], "Another user has updated this SampleResultChar while you were editing")
                    render(view: "edit", model: [sampleResultCharInstance: sampleResultCharInstance])
                    return
                }
            }
            sampleResultCharInstance.properties = params
            if (!sampleResultCharInstance.hasErrors() && sampleResultCharInstance.save(flush: true)) {
                flash.message = "${message(code: 'default.updated.message', args: [message(code: 'sampleResultChar.label', default: 'SampleResultChar'), sampleResultCharInstance.id])}"
                redirect(action: "show", id: sampleResultCharInstance.id)
            }
            else {
                render(view: "edit", model: [sampleResultCharInstance: sampleResultCharInstance])
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'sampleResultChar.label', default: 'SampleResultChar'), params.id])}"
            redirect(action: "list")
        }
    }

    def delete = {
        def sampleResultCharInstance = SampleResultChar.get(params.id)
        if (sampleResultCharInstance) {
            try {
                sampleResultCharInstance.delete(flush: true)
                flash.message = "${message(code: 'default.deleted.message', args: [message(code: 'sampleResultChar.label', default: 'SampleResultChar'), params.id])}"
                redirect(action: "list")
            }
            catch (org.springframework.dao.DataIntegrityViolationException e) {
                flash.message = "${message(code: 'default.not.deleted.message', args: [message(code: 'sampleResultChar.label', default: 'SampleResultChar'), params.id])}"
                redirect(action: "show", id: params.id)
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'sampleResultChar.label', default: 'SampleResultChar'), params.id])}"
            redirect(action: "list")
        }
    }
    def traceSql3={
		try {		
			String strurl = "jdbc:odbc:Driver={MicroSoft Access Driver (*.mdb)};DBQ=F:/ABAD.mdb;useUnicode=false;characterEncoding=gbk";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn = DriverManager.getConnection(strurl);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select   *   from   SAMPLE_ITEM_PRINT_RESULT;");
			String str="";
			UUID uuid=UUID.randomUUID();
			System.out.println(uuid.toString());
			
			Sql sql=Sql.newInstance("jdbc:mysql://localhost:3306/hospital","root", "asdtiang","com.mysql.jdbc.Driver");
			
			def insertCnts = sql.withBatch { stmt1 ->
			    int i=0
				while(rs.next()) {
					def name=new String(rs.getBytes("FULL_NAME"),"gbk")
					def value=""
				//	println rs.getString("DATA_TYPE")
					if(rs.getString("DATA_TYPE")=="1")
					{
						value=rs.getString("RESULT_D")
					}
					else{
						value=new String(rs.getBytes("RESULT_S"),"gbk")
					}
					
					def str1="""insert into sample_result_char(item,name,value,low,hight,sample_id,unit,version) values
			             ('${rs.getString("ITEM")}','${name}','${value}','${rs.getString("NORMAL_LOW")}',
						'${rs.getString("NORMAL_HIGH")}','${rs.getString("SAMPLE_ID")}','${rs.getString("UNIT")}',
						0)"""
					
					stmt1.addBatch( str1 )	
					i++
					
				}
			    println i
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
