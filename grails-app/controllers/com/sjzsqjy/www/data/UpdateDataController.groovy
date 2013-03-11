package com.sjzsqjy.www.data

import com.sjzsqjy.www.auth.AuthKey
import java.sql.Connection
import java.sql.Statement
import grails.converters.JSON
import groovy.json.JsonBuilder


class UpdateDataController {
    static allowedMethods = [index:"POST"]
    def sessionFactory
    def index() {
        println params
        if(params.key){
           def authKey = AuthKey.findByClientKey(params.key)
            if (authKey){
                Connection connection = sessionFactory.openSession().connection();
                Statement statement = connection.createStatement();
                if(!params.sql){
                    render "";
                    return
                }
                params.sql.eachLine{
                    statement.addBatch(it)
                }
               int[] ints= statement.executeBatch()

                //   connection.commit()
                connection.close()
                render ints
            }
            else{
                render "key is not right!!"
            }

        }
        else{
            render "key is required"
        }
    }

    def file() {
        println params
        if(params.key){
            def authKey = AuthKey.findByClientKey(params.key)
            if (authKey){
                def f = request.getFile('file')
                if (f.empty) {
                    flash.message = 'file cannot be empty'
                    render "file empty"
                    return
                 }
                println servletContext.getRealPath("/")+"uploads/pic/"+params.date+"/"+f.getOriginalFilename()
                def fileDir = new File(servletContext.getRealPath("/")+"uploads/pic/"+params.date)
                if (!fileDir.exists()){
                     fileDir.mkdirs()
                }
                f.transferTo(new File(servletContext.getRealPath("/")+"uploads/pic/"+params.date+"/"+f.getOriginalFilename()))
                render "ok"
            }
            else{
                render "key is not right!!"
            }
          }
        else{
            render "key is required"
        }
    }
}
