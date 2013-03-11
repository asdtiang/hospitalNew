package com.sjzsqjy.www.data.blood

import org.springframework.dao.DataIntegrityViolationException

class BloodResultController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [bloodResultInstanceList: BloodResult.list(params), bloodResultInstanceTotal: BloodResult.count()]
    }

    def create() {
        [bloodResultInstance: new BloodResult(params)]
    }

    def save() {
        def bloodResultInstance = new BloodResult(params)
        if (!bloodResultInstance.save(flush: true)) {
            render(view: "create", model: [bloodResultInstance: bloodResultInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'bloodResult.label', default: 'BloodResult'), bloodResultInstance.id])
        redirect(action: "show", id: bloodResultInstance.id)
    }

    def show(Long id) {
        def bloodResultInstance = BloodResult.get(id)
        if (!bloodResultInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'bloodResult.label', default: 'BloodResult'), id])
            redirect(action: "list")
            return
        }

        [bloodResultInstance: bloodResultInstance]
    }

    def edit(Long id) {
        def bloodResultInstance = BloodResult.get(id)
        if (!bloodResultInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'bloodResult.label', default: 'BloodResult'), id])
            redirect(action: "list")
            return
        }

        [bloodResultInstance: bloodResultInstance]
    }

    def update(Long id, Long version) {
        def bloodResultInstance = BloodResult.get(id)
        if (!bloodResultInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'bloodResult.label', default: 'BloodResult'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (bloodResultInstance.version > version) {
                bloodResultInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'bloodResult.label', default: 'BloodResult')] as Object[],
                        "Another user has updated this BloodResult while you were editing")
                render(view: "edit", model: [bloodResultInstance: bloodResultInstance])
                return
            }
        }

        bloodResultInstance.properties = params

        if (!bloodResultInstance.save(flush: true)) {
            render(view: "edit", model: [bloodResultInstance: bloodResultInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'bloodResult.label', default: 'BloodResult'), bloodResultInstance.id])
        redirect(action: "show", id: bloodResultInstance.id)
    }

    def delete(Long id) {
        def bloodResultInstance = BloodResult.get(id)
        if (!bloodResultInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'bloodResult.label', default: 'BloodResult'), id])
            redirect(action: "list")
            return
        }

        try {
            bloodResultInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'bloodResult.label', default: 'BloodResult'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'bloodResult.label', default: 'BloodResult'), id])
            redirect(action: "show", id: id)
        }
    }
}
