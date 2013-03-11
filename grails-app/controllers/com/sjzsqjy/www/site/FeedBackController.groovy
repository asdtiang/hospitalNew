package com.sjzsqjy.www.site

import org.springframework.dao.DataIntegrityViolationException

class FeedBackController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        params.order = "desc"
        [feedBackInstanceList: FeedBack.listOrderByDateCreated(params), feedBackInstanceTotal: FeedBack.count()]
    }

    def create() {
        [feedBackInstance: new FeedBack(params)]
    }

    def save() {
        def feedBackInstance = new FeedBack(params)
        if (!feedBackInstance.save(flush: true)) {
            render(view: "create", model: [feedBackInstance: feedBackInstance])
            return
        }

        flash.message = "留言成功，感谢您的留言"
        redirect(action: "show", id: feedBackInstance.id)
    }

    def show(Long id) {
        def feedBackInstance = FeedBack.get(id)
        if (!feedBackInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'feedBack.label', default: 'FeedBack'), id])
            redirect(action: "list")
            return
        }

        [feedBackInstance: feedBackInstance]
    }

    def edit(Long id) {
        def feedBackInstance = FeedBack.get(id)
        if (!feedBackInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'feedBack.label', default: 'FeedBack'), id])
            redirect(action: "list")
            return
        }

        [feedBackInstance: feedBackInstance]
    }

    def update(Long id, Long version) {
        def feedBackInstance = FeedBack.get(id)
        if (!feedBackInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'feedBack.label', default: 'FeedBack'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (feedBackInstance.version > version) {
                feedBackInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'feedBack.label', default: 'FeedBack')] as Object[],
                          "Another user has updated this FeedBack while you were editing")
                render(view: "edit", model: [feedBackInstance: feedBackInstance])
                return
            }
        }

        feedBackInstance.properties = params

        if (!feedBackInstance.save(flush: true)) {
            render(view: "edit", model: [feedBackInstance: feedBackInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'feedBack.label', default: 'FeedBack'), feedBackInstance.id])
        redirect(action: "show", id: feedBackInstance.id)
    }

    def delete(Long id) {
        def feedBackInstance = FeedBack.get(id)
        if (!feedBackInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'feedBack.label', default: 'FeedBack'), id])
            redirect(action: "list")
            return
        }

        try {
            feedBackInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'feedBack.label', default: 'FeedBack'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'feedBack.label', default: 'FeedBack'), id])
            redirect(action: "show", id: id)
        }
    }
}
