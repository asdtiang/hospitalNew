package com.sjzsqjy.www.site

class SiteInfoController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [siteInfoInstanceList: SiteInfo.list(params), siteInfoInstanceTotal: SiteInfo.count()]
    }

    def create = {
        def siteInfoInstance = new SiteInfo()
        siteInfoInstance.properties = params
        return [siteInfoInstance: siteInfoInstance]
    }

    def save = {
        def siteInfoInstance = new SiteInfo(params)
        if (siteInfoInstance.save(flush: true)) {
            flash.message = "${message(code: 'default.created.message', args: [message(code: 'siteInfo.label', default: 'SiteInfo'), siteInfoInstance.id])}"
            redirect(action: "show", id: siteInfoInstance.id)
        }
        else {
            render(view: "create", model: [siteInfoInstance: siteInfoInstance])
        }
    }

    def show = {
        def siteInfoInstance = SiteInfo.get(params.id)
        if (!siteInfoInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'siteInfo.label', default: 'SiteInfo'), params.id])}"
            redirect(action: "list")
        }
        else {
            [siteInfoInstance: siteInfoInstance]
        }
    }

    def edit = {
        def siteInfoInstance = SiteInfo.get(params.id)
        if (!siteInfoInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'siteInfo.label', default: 'SiteInfo'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [siteInfoInstance: siteInfoInstance]
        }
    }

    def update = {
        def siteInfoInstance = SiteInfo.get(params.id)
        if (siteInfoInstance) {
            if (params.version) {
                def version = params.version.toLong()
                if (siteInfoInstance.version > version) {
                    
                    siteInfoInstance.errors.rejectValue("version", "default.optimistic.locking.failure", [message(code: 'siteInfo.label', default: 'SiteInfo')] as Object[], "Another user has updated this SiteInfo while you were editing")
                    render(view: "edit", model: [siteInfoInstance: siteInfoInstance])
                    return
                }
            }
            siteInfoInstance.properties = params
            if (!siteInfoInstance.hasErrors() && siteInfoInstance.save(flush: true)) {
                flash.message = "${message(code: 'default.updated.message', args: [message(code: 'siteInfo.label', default: 'SiteInfo'), siteInfoInstance.id])}"
                redirect(action: "show", id: siteInfoInstance.id)
            }
            else {
                render(view: "edit", model: [siteInfoInstance: siteInfoInstance])
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'siteInfo.label', default: 'SiteInfo'), params.id])}"
            redirect(action: "list")
        }
    }

    def delete = {
        def siteInfoInstance = SiteInfo.get(params.id)
        if (siteInfoInstance) {
            try {
                siteInfoInstance.delete(flush: true)
                flash.message = "${message(code: 'default.deleted.message', args: [message(code: 'siteInfo.label', default: 'SiteInfo'), params.id])}"
                redirect(action: "list")
            }
            catch (org.springframework.dao.DataIntegrityViolationException e) {
                flash.message = "${message(code: 'default.not.deleted.message', args: [message(code: 'siteInfo.label', default: 'SiteInfo'), params.id])}"
                redirect(action: "show", id: params.id)
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'siteInfo.label', default: 'SiteInfo'), params.id])}"
            redirect(action: "list")
        }
    }
	def oldIndex={
		render view:'index'
		}
}
