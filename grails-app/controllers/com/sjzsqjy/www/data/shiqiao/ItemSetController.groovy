package com.sjzsqjy.www.data.shiqiao

import org.springframework.dao.DataIntegrityViolationException

class ItemSetController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list() {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [itemSetInstanceList: ItemSet.list(params), itemSetInstanceTotal: ItemSet.count()]
    }

    def create() {
        [itemSetInstance: new ItemSet(params)]
    }

    def save() {
        def itemSetInstance = new ItemSet(params)
        if (!itemSetInstance.save(flush: true)) {
            render(view: "create", model: [itemSetInstance: itemSetInstance])
            return
        }

		flash.message = message(code: 'default.created.message', args: [message(code: 'itemSet.label', default: 'ItemSet'), itemSetInstance.id])
        redirect(action: "show", id: itemSetInstance.id)
    }

    def show() {
        def itemSetInstance = ItemSet.get(params.id)
        if (!itemSetInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'itemSet.label', default: 'ItemSet'), params.id])
            redirect(action: "list")
            return
        }

        [itemSetInstance: itemSetInstance]
    }

    def edit() {
        def itemSetInstance = ItemSet.get(params.id)
        if (!itemSetInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'itemSet.label', default: 'ItemSet'), params.id])
            redirect(action: "list")
            return
        }

        [itemSetInstance: itemSetInstance]
    }

    def update() {
        def itemSetInstance = ItemSet.get(params.id)
        if (!itemSetInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'itemSet.label', default: 'ItemSet'), params.id])
            redirect(action: "list")
            return
        }

        if (params.version) {
            def version = params.version.toLong()
            if (itemSetInstance.version > version) {
                itemSetInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'itemSet.label', default: 'ItemSet')] as Object[],
                          "Another user has updated this ItemSet while you were editing")
                render(view: "edit", model: [itemSetInstance: itemSetInstance])
                return
            }
        }

        itemSetInstance.properties = params

        if (!itemSetInstance.save(flush: true)) {
            render(view: "edit", model: [itemSetInstance: itemSetInstance])
            return
        }

		flash.message = message(code: 'default.updated.message', args: [message(code: 'itemSet.label', default: 'ItemSet'), itemSetInstance.id])
        redirect(action: "show", id: itemSetInstance.id)
    }

    def delete() {
        def itemSetInstance = ItemSet.get(params.id)
        if (!itemSetInstance) {
			flash.message = message(code: 'default.not.found.message', args: [message(code: 'itemSet.label', default: 'ItemSet'), params.id])
            redirect(action: "list")
            return
        }

        try {
            itemSetInstance.delete(flush: true)
			flash.message = message(code: 'default.deleted.message', args: [message(code: 'itemSet.label', default: 'ItemSet'), params.id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
			flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'itemSet.label', default: 'ItemSet'), params.id])
            redirect(action: "show", id: params.id)
        }
    }
}
