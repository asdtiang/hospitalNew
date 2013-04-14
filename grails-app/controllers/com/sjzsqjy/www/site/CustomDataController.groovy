package com.sjzsqjy.www.site

import com.sjzsqjy.www.statistics.Clinic
import com.sjzsqjy.www.util.SiteConstant
import org.springframework.dao.DataIntegrityViolationException

class CustomDataController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]
    def ajaxPaginateService

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [customDataInstanceList: CustomData.list(params), customDataInstanceTotal: CustomData.count()]
    }

    def create() {
        [customDataInstance: new CustomData(params)]
    }

    def save() {
        def clinic = Clinic.findByName(params.clinicName)
        def customDataInstance = new CustomData(params)
        customDataInstance.clinic = clinic
        if (!customDataInstance.save(flush: true)) {
            render(view: "create", model: [customDataInstance: customDataInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'customData.label', default: 'CustomData'), customDataInstance.id])
        redirect(action: "show", id: customDataInstance.id)
    }

    def show(Long id) {
        def customDataInstance = CustomData.get(id)
        if (!customDataInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'customData.label', default: 'CustomData'), id])
            redirect(action: "list")
            return
        }

        [customDataInstance: customDataInstance]
    }

    def edit(Long id) {
        def customDataInstance = CustomData.get(id)
        if (!customDataInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'customData.label', default: 'CustomData'), id])
            redirect(action: "list")
            return
        }

        [customDataInstance: customDataInstance]
    }

    def update(Long id, Long version) {
        def customDataInstance = CustomData.get(id)
        if (!customDataInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'customData.label', default: 'CustomData'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (customDataInstance.version > version) {
                customDataInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'customData.label', default: 'CustomData')] as Object[],
                        "Another user has updated this CustomData while you were editing")
                render(view: "edit", model: [customDataInstance: customDataInstance])
                return
            }
        }

        customDataInstance.properties = params

        if (!customDataInstance.save(flush: true)) {
            render(view: "edit", model: [customDataInstance: customDataInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'customData.label', default: 'CustomData'), customDataInstance.id])
        redirect(action: "show", id: customDataInstance.id)
    }

    def delete(Long id) {
        def customDataInstance = CustomData.get(id)
        if (!customDataInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'customData.label', default: 'CustomData'), id])
            redirect(action: "list")
            return
        }

        try {
            customDataInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'customData.label', default: 'CustomData'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'customData.label', default: 'CustomData'), id])
            redirect(action: "show", id: id)
        }
    }

    def showByClinic(Long clinicId) {
        def searchDays = servletContext.configMap.get(SiteConstant.CLINIC_SHOW_DATE) as int
        println "searchDays:" + searchDays
        log.info "searchDays:" + searchDays
        def searchDate = new Date() - searchDays
        params.max = Math.min(params.max ? params.int('max') : 15, 100)
        params.controller = "customData"
        params.action = "showByClinic"
        params.sort ="c.testDate desc,c.template.id"
        def hql = """select id, patientName,testDate from CustomData as c where c.testDate>:searchDate and c.clinic.id=:clinicId
                     """
        println "class:" + session.clinicId
        ajaxPaginateService.getResultMap(params, CustomData.class, hql, [searchDate: searchDate, clinicId: clinicId])
    }
}
