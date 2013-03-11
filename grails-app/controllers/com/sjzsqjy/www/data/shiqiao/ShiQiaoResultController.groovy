package com.sjzsqjy.www.data.shiqiao

import org.springframework.dao.DataIntegrityViolationException

class ShiQiaoResultController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [shiQiaoResultInstanceList: ShiQiaoResult.list(params), shiQiaoResultInstanceTotal: ShiQiaoResult.count()]
    }

    def create() {
        [shiQiaoResultInstance: new ShiQiaoResult(params)]
    }

    def save() {
        def shiQiaoResultInstance = new ShiQiaoResult(params)
        if (!shiQiaoResultInstance.save(flush: true)) {
            render(view: "create", model: [shiQiaoResultInstance: shiQiaoResultInstance])
            return
        }

		flash.message = message(code: 'default.created.message', args: [message(code: 'shiQiaoResult.label', default: 'ShiQiaoResult'), shiQiaoResultInstance.id])
        redirect(action: "show", id: shiQiaoResultInstance.id)
    }

    def show() {
        def shiQiaoResultInstance = ShiQiaoResult.get(params.id)
        if (!shiQiaoResultInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'shiQiaoResult.label', default: 'ShiQiaoResult'), params.id])
            redirect(action: "list")
            return
        }

        [shiQiaoResultInstance: shiQiaoResultInstance]
    }

    def edit() {
        def shiQiaoResultInstance = ShiQiaoResult.get(params.id)
        if (!shiQiaoResultInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'shiQiaoResult.label', default: 'ShiQiaoResult'), params.id])
            redirect(action: "list")
            return
        }

        [shiQiaoResultInstance: shiQiaoResultInstance]
    }

    def update() {
        def shiQiaoResultInstance = ShiQiaoResult.get(params.id)
        if (!shiQiaoResultInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'shiQiaoResult.label', default: 'ShiQiaoResult'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (shiQiaoResultInstance.version > version) {
                shiQiaoResultInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'shiQiaoResult.label', default: 'ShiQiaoResult')] as Object[],
                          "Another user has updated this ShiQiaoResult while you were editing")
                render(view: "edit", model: [shiQiaoResultInstance: shiQiaoResultInstance])
                return
            }
        }

        shiQiaoResultInstance.properties = params

        if (!shiQiaoResultInstance.save(flush: true)) {
            render(view: "edit", model: [shiQiaoResultInstance: shiQiaoResultInstance])
            return
        }

		flash.message = message(code: 'default.updated.message', args: [message(code: 'shiQiaoResult.label', default: 'ShiQiaoResult'), shiQiaoResultInstance.id])
        redirect(action: "show", id: shiQiaoResultInstance.id)
    }

    def delete() {
        def shiQiaoResultInstance = ShiQiaoResult.get(params.id)
        if (!shiQiaoResultInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'shiQiaoResult.label', default: 'ShiQiaoResult'), params.id])
            redirect(action: "list")
            return
        }

        try {
            shiQiaoResultInstance.delete(flush: true)
			flash.message = message(code: 'default.deleted.message', args: [message(code: 'shiQiaoResult.label', default: 'ShiQiaoResult'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
			flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'shiQiaoResult.label', default: 'ShiQiaoResult'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}
