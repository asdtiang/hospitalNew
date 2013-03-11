package com.sjzsqjy.www.data.blood

import org.springframework.dao.DataIntegrityViolationException
import com.sjzsqjy.www.data.trace.TraceUser

class BloodUserController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]
    def ajaxPaginateService
    def index() {
        redirect(action: "list", params: params)
    }

    def listByClinicId(){
        params.max = Math.min(params.max ? params.int('max') : 15, 100)
        params.controller= "BloodUser"
        params.action="listByClinicId"
        def hql="""select id,name,sex,age,testDate from BloodUser where clinic.id=:clinicId"""
        ajaxPaginateService.getResultMap(params,BloodUser.class,hql,[clinicId:params.clinicId as long])
    }
    def resultById={
        def patient = BloodUser.get(params.id)
        if(!patient){
            render "信息不存在";
            return;
        }
        def resultList = BloodResult.executeQuery("""select item.name,result.value,item.low,item.high from
             BloodResult result,BloodItem item where result.keyStr='${patient.keyStr}' and result.sequence
            = item.sequence order by result.sequence asc""");
        [patient:patient,resultList:resultList]
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        params.order = "desc"
        [bloodUserInstanceList: BloodUser.listOrderById(params), bloodUserInstanceTotal: BloodUser.count()]
    }

    def create() {
        [bloodUserInstance: new BloodUser(params)]
    }

    def save() {
        def bloodUserInstance = new BloodUser(params)
        if (!bloodUserInstance.save(flush: true)) {
            render(view: "create", model: [bloodUserInstance: bloodUserInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'bloodUser.label', default: 'BloodUser'), bloodUserInstance.id])
        redirect(action: "show", id: bloodUserInstance.id)
    }

    def show(Long id) {
        def bloodUserInstance = BloodUser.get(id)
        if (!bloodUserInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'bloodUser.label', default: 'BloodUser'), id])
            redirect(action: "list")
            return
        }

        [bloodUserInstance: bloodUserInstance]
    }

    def edit(Long id) {
        def bloodUserInstance = BloodUser.get(id)
        if (!bloodUserInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'bloodUser.label', default: 'BloodUser'), id])
            redirect(action: "list")
            return
        }

        [bloodUserInstance: bloodUserInstance]
    }

    def update(Long id, Long version) {
        def bloodUserInstance = BloodUser.get(id)
        if (!bloodUserInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'bloodUser.label', default: 'BloodUser'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (bloodUserInstance.version > version) {
                bloodUserInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'bloodUser.label', default: 'BloodUser')] as Object[],
                        "Another user has updated this BloodUser while you were editing")
                render(view: "edit", model: [bloodUserInstance: bloodUserInstance])
                return
            }
        }

        bloodUserInstance.properties = params

        if (!bloodUserInstance.save(flush: true)) {
            render(view: "edit", model: [bloodUserInstance: bloodUserInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'bloodUser.label', default: 'BloodUser'), bloodUserInstance.id])
        redirect(action: "show", id: bloodUserInstance.id)
    }

    def delete(Long id) {
        def bloodUserInstance = BloodUser.get(id)
        if (!bloodUserInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'bloodUser.label', default: 'BloodUser'), id])
            redirect(action: "list")
            return
        }

        try {
            bloodUserInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'bloodUser.label', default: 'BloodUser'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'bloodUser.label', default: 'BloodUser'), id])
            redirect(action: "show", id: id)
        }
    }
}
