package com.sjzsqjy.www.site

class AdsController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [adsInstanceList: Ads.list(params), adsInstanceTotal: Ads.count()]
    }

    def create = {
        def adsInstance = new Ads()
        adsInstance.properties = params
        return [adsInstance: adsInstance]
    }

    def save = {
        def adsInstance = new Ads(params)
        if (adsInstance.save(flush: true)) {
            flash.message = "${message(code: 'default.created.message', args: [message(code: 'ads.label', default: 'Ads'), adsInstance.id])}"
            redirect(action: "show", id: adsInstance.id)
        }
        else {
            render(view: "create", model: [adsInstance: adsInstance])
        }
    }

    def show = {
        def adsInstance = Ads.get(params.id)
        if (!adsInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'ads.label', default: 'Ads'), params.id])}"
            redirect(action: "list")
        }
        else {
            [adsInstance: adsInstance]
        }
    }

    def edit = {
        def adsInstance = Ads.get(params.id)
        if (!adsInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'ads.label', default: 'Ads'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [adsInstance: adsInstance]
        }
    }

    def update = {
        def adsInstance = Ads.get(params.id)
        if (adsInstance) {
            if (params.version) {
                def version = params.version.toLong()
                if (adsInstance.version > version) {
                    
                    adsInstance.errors.rejectValue("version", "default.optimistic.locking.failure", [message(code: 'ads.label', default: 'Ads')] as Object[], "Another user has updated this Ads while you were editing")
                    render(view: "edit", model: [adsInstance: adsInstance])
                    return
                }
            }
            adsInstance.properties = params
            if (!adsInstance.hasErrors() && adsInstance.save(flush: true)) {
                flash.message = "${message(code: 'default.updated.message', args: [message(code: 'ads.label', default: 'Ads'), adsInstance.id])}"
                redirect(action: "show", id: adsInstance.id)
            }
            else {
                render(view: "edit", model: [adsInstance: adsInstance])
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'ads.label', default: 'Ads'), params.id])}"
            redirect(action: "list")
        }
    }

    def delete = {
        def adsInstance = Ads.get(params.id)
        if (adsInstance) {
            try {
                adsInstance.delete(flush: true)
                flash.message = "${message(code: 'default.deleted.message', args: [message(code: 'ads.label', default: 'Ads'), params.id])}"
                redirect(action: "list")
            }
            catch (org.springframework.dao.DataIntegrityViolationException e) {
                flash.message = "${message(code: 'default.not.deleted.message', args: [message(code: 'ads.label', default: 'Ads'), params.id])}"
                redirect(action: "show", id: params.id)
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'ads.label', default: 'Ads'), params.id])}"
            redirect(action: "list")
        }
    }
}
