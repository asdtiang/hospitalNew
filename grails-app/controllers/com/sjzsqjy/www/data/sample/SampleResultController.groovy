package com.sjzsqjy.www.data.sample

import groovy.sql.Sql 
import java.sql.Connection 
import java.sql.DriverManager 
import java.sql.ResultSet 
import java.sql.Statement 

class SampleResultController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [sampleResultInstanceList: SampleResult.list(params), sampleResultInstanceTotal: SampleResult.count()]
    }

    def create = {
        def sampleResultInstance = new SampleResult()
        sampleResultInstance.properties = params
        return [sampleResultInstance: sampleResultInstance]
    }

    def save = {
        def sampleResultInstance = new SampleResult(params)
        if (sampleResultInstance.save(flush: true)) {
            flash.message = "${message(code: 'default.created.message', args: [message(code: 'sampleResult.label', default: 'SampleResult'), sampleResultInstance.id])}"
            redirect(action: "show", id: sampleResultInstance.id)
        }
        else {
            render(view: "create", model: [sampleResultInstance: sampleResultInstance])
        }
    }

    def show = {
        def sampleResultInstance = SampleResult.get(params.id)
        if (!sampleResultInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'sampleResult.label', default: 'SampleResult'), params.id])}"
            redirect(action: "list")
        }
        else {
            [sampleResultInstance: sampleResultInstance]
        }
    }

    def edit = {
        def sampleResultInstance = SampleResult.get(params.id)
        if (!sampleResultInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'sampleResult.label', default: 'SampleResult'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [sampleResultInstance: sampleResultInstance]
        }
    }

    def update = {
        def sampleResultInstance = SampleResult.get(params.id)
        if (sampleResultInstance) {
            if (params.version) {
                def version = params.version.toLong()
                if (sampleResultInstance.version > version) {
                    
                    sampleResultInstance.errors.rejectValue("version", "default.optimistic.locking.failure", [message(code: 'sampleResult.label', default: 'SampleResult')] as Object[], "Another user has updated this SampleResult while you were editing")
                    render(view: "edit", model: [sampleResultInstance: sampleResultInstance])
                    return
                }
            }
            sampleResultInstance.properties = params
            if (!sampleResultInstance.hasErrors() && sampleResultInstance.save(flush: true)) {
                flash.message = "${message(code: 'default.updated.message', args: [message(code: 'sampleResult.label', default: 'SampleResult'), sampleResultInstance.id])}"
                redirect(action: "show", id: sampleResultInstance.id)
            }
            else {
                render(view: "edit", model: [sampleResultInstance: sampleResultInstance])
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'sampleResult.label', default: 'SampleResult'), params.id])}"
            redirect(action: "list")
        }
    }

    def delete = {
        def sampleResultInstance = SampleResult.get(params.id)
        if (sampleResultInstance) {
            try {
                sampleResultInstance.delete(flush: true)
                flash.message = "${message(code: 'default.deleted.message', args: [message(code: 'sampleResult.label', default: 'SampleResult'), params.id])}"
                redirect(action: "list")
            }
            catch (org.springframework.dao.DataIntegrityViolationException e) {
                flash.message = "${message(code: 'default.not.deleted.message', args: [message(code: 'sampleResult.label', default: 'SampleResult'), params.id])}"
                redirect(action: "show", id: params.id)
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'sampleResult.label', default: 'SampleResult'), params.id])}"
            redirect(action: "list")
        }
    }
    def traceSql={
		try {		
			String strurl = "jdbc:odbc:Driver={MicroSoft Access Driver (*.mdb)};DBQ=F:/ABAD.mdb;useUnicode=false;characterEncoding=gbk";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn = DriverManager.getConnection(strurl);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select   *   from   SAMPLE_ITEM_CAL_RESULT;");
			String str="";
			UUID uuid=UUID.randomUUID();
			System.out.println(uuid.toString());
			
			Sql sql=Sql.newInstance("jdbc:mysql://localhost:3306/hospital","root", "asdtiang","com.mysql.jdbc.Driver");
			int i=0
			def insertCnts = sql.withBatch { stmt1 ->
				while(rs.next()) {
					def str1="""insert into sample_result(name,value,sample_id,version) values
			             ('${rs.getString("ITEM")}','${rs.getString("RESULT")}','${rs.getString("SAMPLE_ID")}',0)"""
					stmt1.addBatch( str1 )	
					i++
				}
			}
			println i
			
			
		} catch (Exception e) {
			System.out.println(new String(e.getMessage(),"gbk"));
		}
	}
    def traceSql2={
		try {		
			String strurl = "jdbc:odbc:Driver={MicroSoft Access Driver (*.mdb)};DBQ=F:/ABAD.mdb;useUnicode=false;characterEncoding=gbk";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn = DriverManager.getConnection(strurl);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select   *   from   SAMPLE_ITEM_TEST_RESULT;");
			String str="";
			UUID uuid=UUID.randomUUID();
			System.out.println(uuid.toString());
			
			Sql sql=Sql.newInstance("jdbc:mysql://localhost:3306/hospital","root", "asdtiang","com.mysql.jdbc.Driver");
			int i=0
			def insertCnts = sql.withBatch { stmt1 ->
				while(rs.next()) {
					def str1="""insert into sample_result(name,value,sample_id,version) values
			             ('${rs.getString("ITEM")}','${rs.getString("RESULT")}','${rs.getString("SAMPLE_ID")}',0)"""
					stmt1.addBatch( str1 )	
					i++
				}
			}
			println i
			
			
		} catch (Exception e) {
			System.out.println(new String(e.getMessage(),"gbk"));
		}
	}
    def traceSql3={
		try {		
			String strurl = "jdbc:odbc:Driver={MicroSoft Access Driver (*.mdb)};DBQ=F:/ABAD.mdb;useUnicode=false;characterEncoding=gbk";
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection conn = DriverManager.getConnection(strurl);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select   *   from   SAMPLE_ITEM_INPUT_RESULT;");
			String str="";
			UUID uuid=UUID.randomUUID();
			System.out.println(uuid.toString());
			
			Sql sql=Sql.newInstance("jdbc:mysql://localhost:3306/hospital","root", "asdtiang","com.mysql.jdbc.Driver");
			int i=0
			def insertCnts = sql.withBatch { stmt1 ->
				while(rs.next()) {
					def str1="""insert into sample_result(name,value,sample_id,version) values
			             ('${rs.getString("ITEM")}','${rs.getString("RESULT")}','${rs.getString("SAMPLE_ID")}',0)"""
					stmt1.addBatch( str1 )	
					i++
				}
			}
			println i
			
			
		} catch (Exception e) {
			System.out.println(new String(e.getMessage(),"gbk"));
		}
	}
}
