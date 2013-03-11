package com.sjzsqjy.www.auth

import org.springframework.dao.DataIntegrityViolationException

class AuthKeyController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [authKeyInstanceList: AuthKey.list(params), authKeyInstanceTotal: AuthKey.count()]
    }

    def create() {
        params.clientKey =  UUID.randomUUID().toString()
        [authKeyInstance: new AuthKey(params)]
    }

    def save() {
        def authKeyInstance = new AuthKey(params)
        if (!authKeyInstance.save(flush: true)) {
            render(view: "create", model: [authKeyInstance: authKeyInstance])
            return
        }

		flash.message = message(code: 'default.created.message', args: [message(code: 'authKey.label', default: 'AuthKey'), authKeyInstance.id])
        redirect(action: "show", id: authKeyInstance.id)
    }

    def show() {
        def authKeyInstance = AuthKey.get(params.id)
        if (!authKeyInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'authKey.label', default: 'AuthKey'), params.id])
            redirect(action: "list")
            return
        }

        [authKeyInstance: authKeyInstance]
    }

    def edit() {
        def authKeyInstance = AuthKey.get(params.id)
        if (!authKeyInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'authKey.label', default: 'AuthKey'), params.id])
            redirect(action: "list")
            return
        }

        [authKeyInstance: authKeyInstance]
    }

    def update() {
        def authKeyInstance = AuthKey.get(params.id)
        if (!authKeyInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'authKey.label', default: 'AuthKey'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (authKeyInstance.version > version) {
                authKeyInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'authKey.label', default: 'AuthKey')] as Object[],
                          "Another user has updated this AuthKey while you were editing")
                render(view: "edit", model: [authKeyInstance: authKeyInstance])
                return
            }
        }

        authKeyInstance.properties = params

        if (!authKeyInstance.save(flush: true)) {
            render(view: "edit", model: [authKeyInstance: authKeyInstance])
            return
        }

		flash.message = message(code: 'default.updated.message', args: [message(code: 'authKey.label', default: 'AuthKey'), authKeyInstance.id])
        redirect(action: "show", id: authKeyInstance.id)
    }

    def delete() {
        def authKeyInstance = AuthKey.get(params.id)
        if (!authKeyInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'authKey.label', default: 'AuthKey'), params.id])
            redirect(action: "list")
            return
        }

        try {
            authKeyInstance.delete(flush: true)
			flash.message = message(code: 'default.deleted.message', args: [message(code: 'authKey.label', default: 'AuthKey'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
			flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'authKey.label', default: 'AuthKey'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}
