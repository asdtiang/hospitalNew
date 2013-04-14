package com.sjzsqjy.www.site



import org.junit.*
import grails.test.mixin.*

@TestFor(CustomDataController)
@Mock(CustomData)
class CustomDataControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/customData/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.customDataInstanceList.size() == 0
        assert model.customDataInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.customDataInstance != null
    }

    void testSave() {
        controller.save()

        assert model.customDataInstance != null
        assert view == '/customData/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/customData/show/1'
        assert controller.flash.message != null
        assert CustomData.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/customData/list'

        populateValidParams(params)
        def customData = new CustomData(params)

        assert customData.save() != null

        params.id = customData.id

        def model = controller.show()

        assert model.customDataInstance == customData
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/customData/list'

        populateValidParams(params)
        def customData = new CustomData(params)

        assert customData.save() != null

        params.id = customData.id

        def model = controller.edit()

        assert model.customDataInstance == customData
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/customData/list'

        response.reset()

        populateValidParams(params)
        def customData = new CustomData(params)

        assert customData.save() != null

        // test invalid parameters in update
        params.id = customData.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/customData/edit"
        assert model.customDataInstance != null

        customData.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/customData/show/$customData.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        customData.clearErrors()

        populateValidParams(params)
        params.id = customData.id
        params.version = -1
        controller.update()

        assert view == "/customData/edit"
        assert model.customDataInstance != null
        assert model.customDataInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/customData/list'

        response.reset()

        populateValidParams(params)
        def customData = new CustomData(params)

        assert customData.save() != null
        assert CustomData.count() == 1

        params.id = customData.id

        controller.delete()

        assert CustomData.count() == 0
        assert CustomData.get(customData.id) == null
        assert response.redirectedUrl == '/customData/list'
    }
}
