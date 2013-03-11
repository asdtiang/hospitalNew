package com.sjzsqjy.www.data.sample

import groovy.sql.Sql 
import java.sql.Connection 
import java.sql.DriverManager 
import java.sql.ResultSet 
import java.sql.Statement 

class SampleTypeController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [sampleTypeInstanceList: SampleType.list(params), sampleTypeInstanceTotal: SampleType.count()]
    }

    def create = {
        def sampleTypeInstance = new SampleType()
        sampleTypeInstance.properties = params
        return [sampleTypeInstance: sampleTypeInstance]
    }

    def save = {
        def sampleTypeInstance = new SampleType(params)
        if (sampleTypeInstance.save(flush: true)) {
            flash.message = "${message(code: 'default.created.message', args: [message(code: 'sampleType.label', default: 'SampleType'), sampleTypeInstance.id])}"
            redirect(action: "show", id: sampleTypeInstance.id)
        }
        else {
            render(view: "create", model: [sampleTypeInstance: sampleTypeInstance])
        }
    }

    def show = {
        def sampleTypeInstance = SampleType.get(params.id)
        if (!sampleTypeInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'sampleType.label', default: 'SampleType'), params.id])}"
            redirect(action: "list")
        }
        else {
            [sampleTypeInstance: sampleTypeInstance]
        }
    }

    def edit = {
        def sampleTypeInstance = SampleType.get(params.id)
        if (!sampleTypeInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'sampleType.label', default: 'SampleType'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [sampleTypeInstance: sampleTypeInstance]
        }
    }

    def update = {
        def sampleTypeInstance = SampleType.get(params.id)
        if (sampleTypeInstance) {
            if (params.version) {
                def version = params.version.toLong()
                if (sampleTypeInstance.version > version) {
                    
                    sampleTypeInstance.errors.rejectValue("version", "default.optimistic.locking.failure", [message(code: 'sampleType.label', default: 'SampleType')] as Object[], "Another user has updated this SampleType while you were editing")
                    render(view: "edit", model: [sampleTypeInstance: sampleTypeInstance])
                    return
                }
            }
            sampleTypeInstance.properties = params
            if (!sampleTypeInstance.hasErrors() && sampleTypeInstance.save(flush: true)) {
                flash.message = "${message(code: 'default.updated.message', args: [message(code: 'sampleType.label', default: 'SampleType'), sampleTypeInstance.id])}"
                redirect(action: "show", id: sampleTypeInstance.id)
            }
            else {
                render(view: "edit", model: [sampleTypeInstance: sampleTypeInstance])
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'sampleType.label', default: 'SampleType'), params.id])}"
            redirect(action: "list")
        }
    }

    def delete = {
        def sampleTypeInstance = SampleType.get(params.id)
        if (sampleTypeInstance) {
            try {
                sampleTypeInstance.delete(flush: true)
                flash.message = "${message(code: 'default.deleted.message', args: [message(code: 'sampleType.label', default: 'SampleType'), params.id])}"
                redirect(action: "list")
            }
            catch (org.springframework.dao.DataIntegrityViolationException e) {
                flash.message = "${message(code: 'default.not.deleted.message', args: [message(code: 'sampleType.label', default: 'SampleType'), params.id])}"
                redirect(action: "show", id: params.id)
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'sampleType.label', default: 'SampleType'), params.id])}"
            redirect(action: "list")
        }
    }
    def traceSql={
		try {		
			String strurl = "jdbc:odbc:Driver={MicroSoft Access Driver (*.mdb)};DBQ=F:/ABAD.mdb;useUnicode=false;characterEncoding=gbk";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn = DriverManager.getConnection(strurl);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select   *   from   ITEM_PARA_MAIN;");
			String str="";
			UUID uuid=UUID.randomUUID();
			System.out.println(uuid.toString());
			
			Sql sql=Sql.newInstance("jdbc:mysql://localhost:3306/hospital","root", "asdtiang","com.mysql.jdbc.Driver");
			int i=0
			while(rs.next()) {  			
				def name=new String(rs.getBytes("FULL_NAME"),"gbk")
				def str1="""insert into sample_type(unit,name,item,low,hight,version) values
				('${rs.getString("UNIT")}','${name}','${rs.getString("item")}'
						,'${rs.getString("NORMAL_LOW")}','${rs.getString("NORMAL_HIGH")}',0)"""
				sql.executeInsert (str1)
//				i++
//				if(i==2)
//				{
//					break
//				}
				
			}
//			def insertCnts = sql.withBatch { stmt1 ->
//				while(rs.next()) {
//					def charValue=new String(rs.getBytes("chr_value"),"gbk")
//					def str1="""insert into shi_qiao_result(date,sample_id,type_id,item_code,value,input_type,char_value,version) values
//					('${rs.getString("dat_inputdate").split()[0]}','${rs.getString("num_samplenum")}','${rs.getString("num_typeid")}'
//							,'${rs.getString("chr_itemcode")}','${rs.getString("num_value")}','${rs.getString("num_inputtype")}','${charValue}',0)"""
//					stmt1.addBatch( str1 )				
//				}
//			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
