package com.sjzsqjy.www.data.blood



import org.junit.*
import grails.test.mixin.*

@TestFor(BloodResultController)
@Mock(BloodResult)
class BloodResultControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/bloodResult/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.bloodResultInstanceList.size() == 0
        assert model.bloodResultInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.bloodResultInstance != null
    }

    void testSave() {
        controller.save()

        assert model.bloodResultInstance != null
        assert view == '/bloodResult/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/bloodResult/show/1'
        assert controller.flash.message != null
        assert BloodResult.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/bloodResult/list'

        populateValidParams(params)
        def bloodResult = new BloodResult(params)

        assert bloodResult.save() != null

        params.id = bloodResult.id

        def model = controller.show()

        assert model.bloodResultInstance == bloodResult
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/bloodResult/list'

        populateValidParams(params)
        def bloodResult = new BloodResult(params)

        assert bloodResult.save() != null

        params.id = bloodResult.id

        def model = controller.edit()

        assert model.bloodResultInstance == bloodResult
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/bloodResult/list'

        response.reset()

        populateValidParams(params)
        def bloodResult = new BloodResult(params)

        assert bloodResult.save() != null

        // test invalid parameters in update
        params.id = bloodResult.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/bloodResult/edit"
        assert model.bloodResultInstance != null

        bloodResult.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/bloodResult/show/$bloodResult.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        bloodResult.clearErrors()

        populateValidParams(params)
        params.id = bloodResult.id
        params.version = -1
        controller.update()

        assert view == "/bloodResult/edit"
        assert model.bloodResultInstance != null
        assert model.bloodResultInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/bloodResult/list'

        response.reset()

        populateValidParams(params)
        def bloodResult = new BloodResult(params)

        assert bloodResult.save() != null
        assert BloodResult.count() == 1

        params.id = bloodResult.id

        controller.delete()

        assert BloodResult.count() == 0
        assert BloodResult.get(bloodResult.id) == null
        assert response.redirectedUrl == '/bloodResult/list'
    }
}
