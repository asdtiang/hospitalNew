package com.sjzsqjy.www.site

import com.sjzsqjy.www.tools.ImageCompress


class InfoController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]
	def fileAuthService
    def index = {
        redirect(action: "list", params: params)
    }

    def list = {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [infoInstanceList: Info.list(params), infoInstanceTotal: Info.count()]
    }

    def create = {
        def infoInstance = new Info()
        infoInstance.properties = params
        return [infoInstance: infoInstance]
    }

    def save = {
        def infoInstance = new Info(params)
        if (infoInstance.save(flush: true)) {
            flash.message = "${message(code: 'default.created.message', args: [message(code: 'info.label', default: 'Info'), infoInstance.id])}"
            redirect(action: "show", id: infoInstance.id)
        }
        else {
            render(view: "create", model: [infoInstance: infoInstance])
        }
    }

    def show = {
        def infoInstance = Info.get(params.id)
        if (!infoInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'info.label', default: 'Info'), params.id])}"
            redirect(action: "list")
        }
        else {
            [infoInstance: infoInstance]
        }
    }

    def edit = {
        def infoInstance = Info.get(params.id)
        if (!infoInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'info.label', default: 'Info'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [infoInstance: infoInstance]
        }
    }

    def update = {
        def infoInstance = Info.get(params.id)
        if (infoInstance) {
            if (params.version) {
                def version = params.version.toLong()
                if (infoInstance.version > version) {
                    
                    infoInstance.errors.rejectValue("version", "default.optimistic.locking.failure", [message(code: 'info.label', default: 'Info')] as Object[], "Another user has updated this Info while you were editing")
                    render(view: "edit", model: [infoInstance: infoInstance])
                    return
                }
            }
            infoInstance.properties = params
            if (!infoInstance.hasErrors() && infoInstance.save(flush: true)) {
                flash.message = "${message(code: 'default.updated.message', args: [message(code: 'info.label', default: 'Info'), infoInstance.id])}"
                redirect(action: "show", id: infoInstance.id)
            }
            else {
                render(view: "edit", model: [infoInstance: infoInstance])
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'info.label', default: 'Info'), params.id])}"
            redirect(action: "list")
        }
    }

    def delete = {
        def infoInstance = Info.get(params.id)
        if (infoInstance) {
            try {
                infoInstance.delete(flush: true)
                flash.message = "${message(code: 'default.deleted.message', args: [message(code: 'info.label', default: 'Info'), params.id])}"
                redirect(action: "list")
            }
            catch (org.springframework.dao.DataIntegrityViolationException e) {
                flash.message = "${message(code: 'default.not.deleted.message', args: [message(code: 'info.label', default: 'Info'), params.id])}"
                redirect(action: "show", id: params.id)
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'info.label', default: 'Info'), params.id])}"
            redirect(action: "list")
        }
    }
	def uploadLogo={
		def f = request.getFile("myFile") //获取文件
		log.info f.getContentType()
		
		   def fileType=f.getContentType()
		   log.info fileType
		   log.info fileType.substring(fileType.lastIndexOf('/')+1)
		  
		if(fileAuthService.photoAuth(fileType.substring(fileType.lastIndexOf('/')+1))==false){
			render "图片格式不正确"+"${message(code: 'photo.type.error.message')}"
			return
		}
		if(!f.empty){
			def imageCompress=ImageCompress.getImageCompress();
			log.info servletContext.getRealPath("/images/info/${params.id}.jpg")
			imageCompress.compress f.getInputStream(),new File(servletContext.getRealPath("/images/info/${params.id}.jpg"))//将文件上传
		}
		else{
		}
		render "上传成功"
	}
	def alterLogo={
		
		render view:"upload",model:[id:params.id]
	}
}
