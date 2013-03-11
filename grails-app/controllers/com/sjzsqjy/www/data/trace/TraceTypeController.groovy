package com.sjzsqjy.www.data.trace

import org.springframework.dao.DataIntegrityViolationException

class TraceTypeController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [traceTypeInstanceList: TraceType.list(params), traceTypeInstanceTotal: TraceType.count()]
    }

    def create() {
        [traceTypeInstance: new TraceType(params)]
    }

    def save() {
        def traceTypeInstance = new TraceType(params)
        if (!traceTypeInstance.save(flush: true)) {
            render(view: "create", model: [traceTypeInstance: traceTypeInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'traceType.label', default: 'TraceType'), traceTypeInstance.id])
        redirect(action: "show", id: traceTypeInstance.id)
    }

    def show(Long id) {
        def traceTypeInstance = TraceType.get(id)
        if (!traceTypeInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'traceType.label', default: 'TraceType'), id])
            redirect(action: "list")
            return
        }

        [traceTypeInstance: traceTypeInstance]
    }

    def edit(Long id) {
        def traceTypeInstance = TraceType.get(id)
        if (!traceTypeInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'traceType.label', default: 'TraceType'), id])
            redirect(action: "list")
            return
        }

        [traceTypeInstance: traceTypeInstance]
    }

    def update(Long id, Long version) {
        def traceTypeInstance = TraceType.get(id)
        if (!traceTypeInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'traceType.label', default: 'TraceType'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (traceTypeInstance.version > version) {
                traceTypeInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'traceType.label', default: 'TraceType')] as Object[],
                        "Another user has updated this TraceType while you were editing")
                render(view: "edit", model: [traceTypeInstance: traceTypeInstance])
                return
            }
        }

        traceTypeInstance.properties = params

        if (!traceTypeInstance.save(flush: true)) {
            render(view: "edit", model: [traceTypeInstance: traceTypeInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'traceType.label', default: 'TraceType'), traceTypeInstance.id])
        redirect(action: "show", id: traceTypeInstance.id)
    }

    def delete(Long id) {
        def traceTypeInstance = TraceType.get(id)
        if (!traceTypeInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'traceType.label', default: 'TraceType'), id])
            redirect(action: "list")
            return
        }

        try {
            traceTypeInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'traceType.label', default: 'TraceType'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'traceType.label', default: 'TraceType'), id])
            redirect(action: "show", id: id)
        }
    }
}
