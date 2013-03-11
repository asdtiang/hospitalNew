package com.sjzsqjy.www.data.blood

import org.springframework.dao.DataIntegrityViolationException

class BloodItemController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [bloodItemInstanceList: BloodItem.list(params), bloodItemInstanceTotal: BloodItem.count()]
    }

    def create() {
        [bloodItemInstance: new BloodItem(params)]
    }

    def save() {
        def bloodItemInstance = new BloodItem(params)
        if (!bloodItemInstance.save(flush: true)) {
            render(view: "create", model: [bloodItemInstance: bloodItemInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'bloodItem.label', default: 'BloodItem'), bloodItemInstance.id])
        redirect(action: "show", id: bloodItemInstance.id)
    }

    def show(Long id) {
        def bloodItemInstance = BloodItem.get(id)
        if (!bloodItemInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'bloodItem.label', default: 'BloodItem'), id])
            redirect(action: "list")
            return
        }

        [bloodItemInstance: bloodItemInstance]
    }

    def edit(Long id) {
        def bloodItemInstance = BloodItem.get(id)
        if (!bloodItemInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'bloodItem.label', default: 'BloodItem'), id])
            redirect(action: "list")
            return
        }

        [bloodItemInstance: bloodItemInstance]
    }

    def update(Long id, Long version) {
        def bloodItemInstance = BloodItem.get(id)
        if (!bloodItemInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'bloodItem.label', default: 'BloodItem'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (bloodItemInstance.version > version) {
                bloodItemInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'bloodItem.label', default: 'BloodItem')] as Object[],
                          "Another user has updated this BloodItem while you were editing")
                render(view: "edit", model: [bloodItemInstance: bloodItemInstance])
                return
            }
        }

        bloodItemInstance.properties = params

        if (!bloodItemInstance.save(flush: true)) {
            render(view: "edit", model: [bloodItemInstance: bloodItemInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'bloodItem.label', default: 'BloodItem'), bloodItemInstance.id])
        redirect(action: "show", id: bloodItemInstance.id)
    }

    def delete(Long id) {
        def bloodItemInstance = BloodItem.get(id)
        if (!bloodItemInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'bloodItem.label', default: 'BloodItem'), id])
            redirect(action: "list")
            return
        }

        try {
            bloodItemInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'bloodItem.label', default: 'BloodItem'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'bloodItem.label', default: 'BloodItem'), id])
            redirect(action: "show", id: id)
        }
    }
}
