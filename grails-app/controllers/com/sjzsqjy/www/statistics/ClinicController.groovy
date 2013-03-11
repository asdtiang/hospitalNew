package com.sjzsqjy.www.statistics

class ClinicController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]
    def sessionFactory
    def index = {
        redirect(action: "list", params: params)
    }

    def list = {
        params.max = Math.min(params.max ? params.int('max') : 20, 100)
        [clinicInstanceList: Clinic.list(params), clinicInstanceTotal: Clinic.count()]
    }

    def create = {
        def clinicInstance = new Clinic()
        clinicInstance.properties = params
        return [clinicInstance: clinicInstance]
    }

    def save = {
        def clinicInstance = new Clinic(params)
		
        if (clinicInstance.save(flush: true)) {
            flash.message = "${message(code: 'default.created.message', args: [message(code: 'clinic.label', default: 'Clinic'), clinicInstance.id])}"
            redirect(action: "show", id: clinicInstance.id)
        }
        else {
            render(view: "create", model: [clinicInstance: clinicInstance])
        }
    }

    def show = {
        def clinicInstance = Clinic.get(params.id)
        if (!clinicInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'clinic.label', default: 'Clinic'), params.id])}"
            redirect(action: "list")
        }
        else {
            [clinicInstance: clinicInstance]
        }
    }

    def edit = {
        def clinicInstance = Clinic.get(params.id)
        if (!clinicInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'clinic.label', default: 'Clinic'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [clinicInstance: clinicInstance]
        }
    }

    def update = {
        def clinicInstance = Clinic.get(params.id)
        if (clinicInstance) {
            if (params.version) {
                def version = params.version.toLong()
                if (clinicInstance.version > version) {
                    
                    clinicInstance.errors.rejectValue("version", "default.optimistic.locking.failure", [message(code: 'clinic.label', default: 'Clinic')] as Object[], "Another user has updated this Clinic while you were editing")
                    render(view: "edit", model: [clinicInstance: clinicInstance])
                    return
                }
            }
            clinicInstance.properties = params
            if (!clinicInstance.hasErrors() && clinicInstance.save(flush: true)) {
                flash.message = "${message(code: 'default.updated.message', args: [message(code: 'clinic.label', default: 'Clinic'), clinicInstance.id])}"
                redirect(action: "show", id: clinicInstance.id)
            }
            else {
                render(view: "edit", model: [clinicInstance: clinicInstance])
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'clinic.label', default: 'Clinic'), params.id])}"
            redirect(action: "list")
        }
    }

    def delete = {
        def clinicInstance = Clinic.get(params.id)
        if (clinicInstance) {
            try {
                clinicInstance.delete(flush: true)
                flash.message = "${message(code: 'default.deleted.message', args: [message(code: 'clinic.label', default: 'Clinic'),  params.id])}"
                redirect(action: "list")
            }
            catch (org.springframework.dao.DataIntegrityViolationException e) {
                flash.message = "${message(code: 'default.not.deleted.message', args: [message(code: 'clinic.label', default: 'Clinic'), params.id])}"
                redirect(action: "show", id: params.id)
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'clinic.label', default: 'Clinic'), params.id])}"
            redirect(action: "list")
        }
    }
    def showSearchClinic={
        render(view: "showSearchClinic", model: params)
    }
    def updateClinic={
        def clinic=Clinic.findByName(params.clinicName)
        if (null==clinic){
            flash.message = "诊所名不存在！"
            render view: 'showSearchClinic',  model:params
            return
        }
        sessionFactory.getCurrentSession().createQuery("update ${params.type} set clinic.id=? where id=${params.updateId}").setInteger(0,clinic.id as int).executeUpdate()
        render clinic.name
    }
}
