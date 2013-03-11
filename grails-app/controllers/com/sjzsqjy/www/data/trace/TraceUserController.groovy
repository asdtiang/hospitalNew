package com.sjzsqjy.www.data.trace

import org.springframework.dao.DataIntegrityViolationException
import com.sjzsqjy.www.data.shiqiao.ShiQiaoUser

class TraceUserController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def ajaxPaginateService

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        params.order = "desc"
        [traceUserInstanceList: TraceUser.listOrderById(params), traceUserInstanceTotal: TraceUser.count()]
    }

    def listByClinicId(){
        params.max = Math.min(params.max ? params.int('max') : 15, 100)
        params.controller= "traceUser"
        params.action="listByClinicId"
        def hql="""select id,name,sex,ageInfo,date from TraceUser where clinic.id=:clinicId"""
        println "class:"+session.clinicId
        ajaxPaginateService.getResultMap(params,TraceUser.class,hql,[clinicId:params.clinicId as long])
    }

    def create() {
        [traceUserInstance: new TraceUser(params)]
    }

    def save() {
        def traceUserInstance = new TraceUser(params)
        if (!traceUserInstance.save(flush: true)) {
            render(view: "create", model: [traceUserInstance: traceUserInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'traceUser.label', default: 'TraceUser'), traceUserInstance.id])
        redirect(action: "show", id: traceUserInstance.id)
    }

    def show(Long id) {
        def traceUserInstance = TraceUser.get(id)
        if (!traceUserInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'traceUser.label', default: 'TraceUser'), id])
            redirect(action: "list")
            return
        }

        [traceUserInstance: traceUserInstance]
    }

    def edit(Long id) {
        def traceUserInstance = TraceUser.get(id)
        if (!traceUserInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'traceUser.label', default: 'TraceUser'), id])
            redirect(action: "list")
            return
        }

        [traceUserInstance: traceUserInstance]
    }

    def update(Long id, Long version) {
        def traceUserInstance = TraceUser.get(id)
        if (!traceUserInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'traceUser.label', default: 'TraceUser'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (traceUserInstance.version > version) {
                traceUserInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'traceUser.label', default: 'TraceUser')] as Object[],
                          "Another user has updated this TraceUser while you were editing")
                render(view: "edit", model: [traceUserInstance: traceUserInstance])
                return
            }
        }

        traceUserInstance.properties = params

        if (!traceUserInstance.save(flush: true)) {
            render(view: "edit", model: [traceUserInstance: traceUserInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'traceUser.label', default: 'TraceUser'), traceUserInstance.id])
        redirect(action: "show", id: traceUserInstance.id)
    }

    def delete(Long id) {
        def traceUserInstance = TraceUser.get(id)
        if (!traceUserInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'traceUser.label', default: 'TraceUser'), id])
            redirect(action: "list")
            return
        }

        try {
            traceUserInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'traceUser.label', default: 'TraceUser'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'traceUser.label', default: 'TraceUser'), id])
            redirect(action: "show", id: id)
        }
    }
}
