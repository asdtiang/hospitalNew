package com.sjzsqjy.www.site

import org.springframework.dao.DataIntegrityViolationException
import grails.converters.JSON

class DataTemplateController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [dataTemplateInstanceList: DataTemplate.list(params), dataTemplateInstanceTotal: DataTemplate.count()]
    }

    def create() {
        [dataTemplateInstance: new DataTemplate(params)]
    }

    def save() {
        def dataTemplateInstance = new DataTemplate(params)
        if (!dataTemplateInstance.save(flush: true)) {
            render(view: "create", model: [dataTemplateInstance: dataTemplateInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'dataTemplate.label', default: 'DataTemplate'), dataTemplateInstance.id])
        redirect(action: "show", id: dataTemplateInstance.id)
    }

    def show(Long id) {
        def dataTemplateInstance = DataTemplate.get(id)
        if (!dataTemplateInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'dataTemplate.label', default: 'DataTemplate'), id])
            redirect(action: "list")
            return
        }

        [dataTemplateInstance: dataTemplateInstance]
    }

    def edit(Long id) {
        def dataTemplateInstance = DataTemplate.get(id)
        if (!dataTemplateInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'dataTemplate.label', default: 'DataTemplate'), id])
            redirect(action: "list")
            return
        }

        [dataTemplateInstance: dataTemplateInstance]
    }

    def update(Long id, Long version) {
        def dataTemplateInstance = DataTemplate.get(id)
        if (!dataTemplateInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'dataTemplate.label', default: 'DataTemplate'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (dataTemplateInstance.version > version) {
                dataTemplateInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'dataTemplate.label', default: 'DataTemplate')] as Object[],
                        "Another user has updated this DataTemplate while you were editing")
                render(view: "edit", model: [dataTemplateInstance: dataTemplateInstance])
                return
            }
        }

        dataTemplateInstance.properties = params

        if (!dataTemplateInstance.save(flush: true)) {
            render(view: "edit", model: [dataTemplateInstance: dataTemplateInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'dataTemplate.label', default: 'DataTemplate'), dataTemplateInstance.id])
        redirect(action: "show", id: dataTemplateInstance.id)
    }

    def delete(Long id) {
        def dataTemplateInstance = DataTemplate.get(id)
        if (!dataTemplateInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'dataTemplate.label', default: 'DataTemplate'), id])
            redirect(action: "list")
            return
        }

        try {
            dataTemplateInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'dataTemplate.label', default: 'DataTemplate'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'dataTemplate.label', default: 'DataTemplate'), id])
            redirect(action: "show", id: id)
        }
    }

    def changeTemplate(){
       println params.id
        render(contentType: "text/json") {
            dataTemplate(templateStr: DataTemplate.get(params.id).templateStr)
        }

    }
}
