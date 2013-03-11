package com.sjzsqjy.www.site

class QqController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [qqInstanceList: Qq.list(params), qqInstanceTotal: Qq.count()]
    }

    def create = {
        def qqInstance = new Qq()
        qqInstance.properties = params
        return [qqInstance: qqInstance]
    }

    def save = {
        def qqInstance = new Qq(params)
        if (qqInstance.save(flush: true)) {
            flash.message = "${message(code: 'default.created.message', args: [message(code: 'qq.label', default: 'Qq'), qqInstance.id])}"
            redirect(action: "show", id: qqInstance.id)
        }
        else {
            render(view: "create", model: [qqInstance: qqInstance])
        }
    }

    def show = {
        def qqInstance = Qq.get(params.id)
        if (!qqInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'qq.label', default: 'Qq'), params.id])}"
            redirect(action: "list")
        }
        else {
            [qqInstance: qqInstance]
        }
    }

    def edit = {
        def qqInstance = Qq.get(params.id)
        if (!qqInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'qq.label', default: 'Qq'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [qqInstance: qqInstance]
        }
    }

    def update = {
        def qqInstance = Qq.get(params.id)
        if (qqInstance) {
            if (params.version) {
                def version = params.version.toLong()
                if (qqInstance.version > version) {
                    
                    qqInstance.errors.rejectValue("version", "default.optimistic.locking.failure", [message(code: 'qq.label', default: 'Qq')] as Object[], "Another user has updated this Qq while you were editing")
                    render(view: "edit", model: [qqInstance: qqInstance])
                    return
                }
            }
            qqInstance.properties = params
            if (!qqInstance.hasErrors() && qqInstance.save(flush: true)) {
                flash.message = "${message(code: 'default.updated.message', args: [message(code: 'qq.label', default: 'Qq'), qqInstance.id])}"
                redirect(action: "show", id: qqInstance.id)
            }
            else {
                render(view: "edit", model: [qqInstance: qqInstance])
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'qq.label', default: 'Qq'), params.id])}"
            redirect(action: "list")
        }
    }

    def delete = {
        def qqInstance = Qq.get(params.id)
        if (qqInstance) {
            try {
                qqInstance.delete(flush: true)
                flash.message = "${message(code: 'default.deleted.message', args: [message(code: 'qq.label', default: 'Qq'), params.id])}"
                redirect(action: "list")
            }
            catch (org.springframework.dao.DataIntegrityViolationException e) {
                flash.message = "${message(code: 'default.not.deleted.message', args: [message(code: 'qq.label', default: 'Qq'), params.id])}"
                redirect(action: "show", id: params.id)
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'qq.label', default: 'Qq'), params.id])}"
            redirect(action: "list")
        }
    }
}
