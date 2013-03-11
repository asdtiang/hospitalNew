package com.sjzsqjy.www.site

class InfoTypeController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [infoTypeInstanceList: InfoType.list(params), infoTypeInstanceTotal: InfoType.count()]
    }

    def create = {
        def infoTypeInstance = new InfoType()
        infoTypeInstance.properties = params
        return [infoTypeInstance: infoTypeInstance]
    }

    def save = {
        def infoTypeInstance = new InfoType(params)
        if (infoTypeInstance.save(flush: true)) {
            flash.message = "${message(code: 'default.created.message', args: [message(code: 'infoType.label', default: 'InfoType'), infoTypeInstance.id])}"
            redirect(action: "show", id: infoTypeInstance.id)
        }
        else {
            render(view: "create", model: [infoTypeInstance: infoTypeInstance])
        }
    }

    def show = {
        def infoTypeInstance = InfoType.get(params.id)
        if (!infoTypeInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'infoType.label', default: 'InfoType'), params.id])}"
            redirect(action: "list")
        }
        else {
            [infoTypeInstance: infoTypeInstance]
        }
    }

    def edit = {
        def infoTypeInstance = InfoType.get(params.id)
        if (!infoTypeInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'infoType.label', default: 'InfoType'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [infoTypeInstance: infoTypeInstance]
        }
    }

    def update = {
        def infoTypeInstance = InfoType.get(params.id)
        if (infoTypeInstance) {
            if (params.version) {
                def version = params.version.toLong()
                if (infoTypeInstance.version > version) {
                    
                    infoTypeInstance.errors.rejectValue("version", "default.optimistic.locking.failure", [message(code: 'infoType.label', default: 'InfoType')] as Object[], "Another user has updated this InfoType while you were editing")
                    render(view: "edit", model: [infoTypeInstance: infoTypeInstance])
                    return
                }
            }
            infoTypeInstance.properties = params
            if (!infoTypeInstance.hasErrors() && infoTypeInstance.save(flush: true)) {
                flash.message = "${message(code: 'default.updated.message', args: [message(code: 'infoType.label', default: 'InfoType'), infoTypeInstance.id])}"
                redirect(action: "show", id: infoTypeInstance.id)
            }
            else {
                render(view: "edit", model: [infoTypeInstance: infoTypeInstance])
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'infoType.label', default: 'InfoType'), params.id])}"
            redirect(action: "list")
        }
    }

    def delete = {
        def infoTypeInstance = InfoType.get(params.id)
        if (infoTypeInstance) {
            try {
                infoTypeInstance.delete(flush: true)
                flash.message = "${message(code: 'default.deleted.message', args: [message(code: 'infoType.label', default: 'InfoType'), params.id])}"
                redirect(action: "list")
            }
            catch (org.springframework.dao.DataIntegrityViolationException e) {
                flash.message = "${message(code: 'default.not.deleted.message', args: [message(code: 'infoType.label', default: 'InfoType'), params.id])}"
                redirect(action: "show", id: params.id)
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'infoType.label', default: 'InfoType'), params.id])}"
            redirect(action: "list")
        }
    }
}
