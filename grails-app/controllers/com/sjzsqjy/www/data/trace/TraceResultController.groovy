package com.sjzsqjy.www.data.trace

import org.springframework.dao.DataIntegrityViolationException

class TraceResultController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [traceResultInstanceList: TraceResult.list(params), traceResultInstanceTotal: TraceResult.count()]
    }

    def create() {
        [traceResultInstance: new TraceResult(params)]
    }

    def save() {
        def traceResultInstance = new TraceResult(params)
        if (!traceResultInstance.save(flush: true)) {
            render(view: "create", model: [traceResultInstance: traceResultInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'traceResult.label', default: 'TraceResult'), traceResultInstance.id])
        redirect(action: "show", id: traceResultInstance.id)
    }

    def show(Long id) {
        def traceResultInstance = TraceResult.get(id)
        if (!traceResultInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'traceResult.label', default: 'TraceResult'), id])
            redirect(action: "list")
            return
        }

        [traceResultInstance: traceResultInstance]
    }

    def edit(Long id) {
        def traceResultInstance = TraceResult.get(id)
        if (!traceResultInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'traceResult.label', default: 'TraceResult'), id])
            redirect(action: "list")
            return
        }

        [traceResultInstance: traceResultInstance]
    }

    def update(Long id, Long version) {
        def traceResultInstance = TraceResult.get(id)
        if (!traceResultInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'traceResult.label', default: 'TraceResult'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (traceResultInstance.version > version) {
                traceResultInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'traceResult.label', default: 'TraceResult')] as Object[],
                        "Another user has updated this TraceResult while you were editing")
                render(view: "edit", model: [traceResultInstance: traceResultInstance])
                return
            }
        }

        traceResultInstance.properties = params

        if (!traceResultInstance.save(flush: true)) {
            render(view: "edit", model: [traceResultInstance: traceResultInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'traceResult.label', default: 'TraceResult'), traceResultInstance.id])
        redirect(action: "show", id: traceResultInstance.id)
    }

    def delete(Long id) {
        def traceResultInstance = TraceResult.get(id)
        if (!traceResultInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'traceResult.label', default: 'TraceResult'), id])
            redirect(action: "list")
            return
        }

        try {
            traceResultInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'traceResult.label', default: 'TraceResult'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'traceResult.label', default: 'TraceResult'), id])
            redirect(action: "show", id: id)
        }
    }
}
