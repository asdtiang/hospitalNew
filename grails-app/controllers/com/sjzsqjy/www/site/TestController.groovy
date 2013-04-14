package com.sjzsqjy.www.site

import org.codehaus.groovy.grails.plugins.springsecurity.SpringSecurityUtils
import grails.util.GrailsNameUtils
import grails.converters.JSON
import com.sjzsqjy.www.tools.PageUtil
import com.sjzsqjy.www.tools.SafeProperties





class TestController {

    def createMessage={
        if (request.getMethod() == "POST" && params.className) {
            def object = PageUtil.getInstanceByName(params.className.trim())
            if(null==object){
                render "类不存在，要加包名的"
                return
            }
            def path=request.getRealPath("/")
            path=path.substring(0,path.length()-1)
            path=path.substring(0,path.lastIndexOf(File.separator))+"/grails-app/i18n/messages_zh_CN.properties"

            FileInputStream input = new FileInputStream(path);

            SafeProperties safeProp = new SafeProperties();

            safeProp.load(input);

            input.close();


            if (object) {
                def value
                def key=GrailsNameUtils.getShortName(params.className)
                key=key.charAt(0).toLowerCase().toString()+key.substring(1)+"..label"
                if(!safeProp.get(key.replace("..","."))&&object.class.getAnnotation(org.asdtiang.grails.annotation.Title)){
                    safeProp.put(key.replace("..","."),object.class.getAnnotation(org.asdtiang.grails.annotation.Title).value())
                }
                def key1
                object.class.getDeclaredFields().each {
                    if (it.getAnnotation(org.asdtiang.grails.annotation.Title)) {
                        value = it.getAnnotation(org.asdtiang.grails.annotation.Title).value();
                        key1=key.replace("..","."+it.getName()+".")
                        if(!safeProp.get(key1)){
                            safeProp.put(key1,value)
                        }
                    }
                }
            }
            FileOutputStream output = new FileOutputStream(path);
            safeProp.store( output,null)
            output.close();
        }
    }
    def file={

    }
    def upload={
       Collection result = []
       request.getFileNames().each {
         result << [name: request.getFile(it).getOriginalFilename() , size: request.getFile(it).getSize()]
       }
       render result as JSON
    }

    /**
     * test freemarker
     */
    def index = {
        println "freemarker controller ok!!"
        render view: 'index.ftl', model: [name: 'Jake', state: 'Missouri']
      }

    def frerMarker = {
            println "freemarker controller ok!!"
            render view: 'frerMarker'
          }
}
