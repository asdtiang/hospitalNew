package com.sjzsqjy.www.data.shiqiao

import org.springframework.dao.DataIntegrityViolationException
import org.asdtiang.grails.paginate.TestAjax

class ShiQiaoUserController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]
    def ajaxPaginateService
    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        params.order = "desc"
        [shiQiaoUserInstanceList: ShiQiaoUser.listOrderById(params), shiQiaoUserInstanceTotal: ShiQiaoUser.count()]
    }
    def listByClinicId(){
        params.max = Math.min(params.max ? params.int('max') : 15, 100)
        params.controller= "shiQiaoUser"
        params.action="listByClinicId"
        def hql="""select id,name,sex,birth,date from ShiQiaoUser where clinic.id=:clinicId"""
        println "class:"+session.clinicId
        ajaxPaginateService.getResultMap(params,ShiQiaoUser.class,hql,[clinicId:params.clinicId as long])
    }

    def create() {
        [shiQiaoUserInstance: new ShiQiaoUser(params)]
    }

    def save() {
        def shiQiaoUserInstance = new ShiQiaoUser(params)
        if (!shiQiaoUserInstance.save(flush: true)) {
            render(view: "create", model: [shiQiaoUserInstance: shiQiaoUserInstance])
            return
        }

		flash.message = message(code: 'default.created.message', args: [message(code: 'shiQiaoUser.label', default: 'ShiQiaoUser'), shiQiaoUserInstance.id])
        redirect(action: "show", id: shiQiaoUserInstance.id)
    }

    def show() {
        def shiQiaoUserInstance = ShiQiaoUser.get(params.id)
        if (!shiQiaoUserInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'shiQiaoUser.label', default: 'ShiQiaoUser'), params.id])
            redirect(action: "list")
            return
        }

        [shiQiaoUserInstance: shiQiaoUserInstance]
    }

    def edit() {
        def shiQiaoUserInstance = ShiQiaoUser.get(params.id)
        if (!shiQiaoUserInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'shiQiaoUser.label', default: 'ShiQiaoUser'), params.id])
            redirect(action: "list")
            return
        }

        [shiQiaoUserInstance: shiQiaoUserInstance]
    }

    def update() {
        def shiQiaoUserInstance = ShiQiaoUser.get(params.id)
        if (!shiQiaoUserInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'shiQiaoUser.label', default: 'ShiQiaoUser'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (shiQiaoUserInstance.version > version) {
                shiQiaoUserInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'shiQiaoUser.label', default: 'ShiQiaoUser')] as Object[],
                          "Another user has updated this ShiQiaoUser while you were editing")
                render(view: "edit", model: [shiQiaoUserInstance: shiQiaoUserInstance])
                return
            }
        }

        shiQiaoUserInstance.properties = params

        if (!shiQiaoUserInstance.save(flush: true)) {
            render(view: "edit", model: [shiQiaoUserInstance: shiQiaoUserInstance])
            return
        }

		flash.message = message(code: 'default.updated.message', args: [message(code: 'shiQiaoUser.label', default: 'ShiQiaoUser'), shiQiaoUserInstance.id])
        redirect(action: "show", id: shiQiaoUserInstance.id)
    }

    def delete() {
        def shiQiaoUserInstance = ShiQiaoUser.get(params.id)
        if (!shiQiaoUserInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'shiQiaoUser.label', default: 'ShiQiaoUser'), params.id])
            redirect(action: "list")
            return
        }

        try {
            shiQiaoUserInstance.delete(flush: true)
			flash.message = message(code: 'default.deleted.message', args: [message(code: 'shiQiaoUser.label', default: 'ShiQiaoUser'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
			flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'shiQiaoUser.label', default: 'ShiQiaoUser'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}
