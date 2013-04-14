package com.sjzsqjy.www.site



import org.junit.*
import grails.test.mixin.*

@TestFor(DataTemplateController)
@Mock(DataTemplate)
class DataTemplateControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/dataTemplate/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.dataTemplateInstanceList.size() == 0
        assert model.dataTemplateInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.dataTemplateInstance != null
    }

    void testSave() {
        controller.save()

        assert model.dataTemplateInstance != null
        assert view == '/dataTemplate/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/dataTemplate/show/1'
        assert controller.flash.message != null
        assert DataTemplate.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/dataTemplate/list'

        populateValidParams(params)
        def dataTemplate = new DataTemplate(params)

        assert dataTemplate.save() != null

        params.id = dataTemplate.id

        def model = controller.show()

        assert model.dataTemplateInstance == dataTemplate
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/dataTemplate/list'

        populateValidParams(params)
        def dataTemplate = new DataTemplate(params)

        assert dataTemplate.save() != null

        params.id = dataTemplate.id

        def model = controller.edit()

        assert model.dataTemplateInstance == dataTemplate
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/dataTemplate/list'

        response.reset()

        populateValidParams(params)
        def dataTemplate = new DataTemplate(params)

        assert dataTemplate.save() != null

        // test invalid parameters in update
        params.id = dataTemplate.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/dataTemplate/edit"
        assert model.dataTemplateInstance != null

        dataTemplate.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/dataTemplate/show/$dataTemplate.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        dataTemplate.clearErrors()

        populateValidParams(params)
        params.id = dataTemplate.id
        params.version = -1
        controller.update()

        assert view == "/dataTemplate/edit"
        assert model.dataTemplateInstance != null
        assert model.dataTemplateInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/dataTemplate/list'

        response.reset()

        populateValidParams(params)
        def dataTemplate = new DataTemplate(params)

        assert dataTemplate.save() != null
        assert DataTemplate.count() == 1

        params.id = dataTemplate.id

        controller.delete()

        assert DataTemplate.count() == 0
        assert DataTemplate.get(dataTemplate.id) == null
        assert response.redirectedUrl == '/dataTemplate/list'
    }
}
