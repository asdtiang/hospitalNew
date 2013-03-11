package com.sjzsqjy.www.data.blood



import org.junit.*
import grails.test.mixin.*

@TestFor(BloodUserController)
@Mock(BloodUser)
class BloodUserControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/bloodUser/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.bloodUserInstanceList.size() == 0
        assert model.bloodUserInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.bloodUserInstance != null
    }

    void testSave() {
        controller.save()

        assert model.bloodUserInstance != null
        assert view == '/bloodUser/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/bloodUser/show/1'
        assert controller.flash.message != null
        assert BloodUser.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/bloodUser/list'

        populateValidParams(params)
        def bloodUser = new BloodUser(params)

        assert bloodUser.save() != null

        params.id = bloodUser.id

        def model = controller.show()

        assert model.bloodUserInstance == bloodUser
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/bloodUser/list'

        populateValidParams(params)
        def bloodUser = new BloodUser(params)

        assert bloodUser.save() != null

        params.id = bloodUser.id

        def model = controller.edit()

        assert model.bloodUserInstance == bloodUser
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/bloodUser/list'

        response.reset()

        populateValidParams(params)
        def bloodUser = new BloodUser(params)

        assert bloodUser.save() != null

        // test invalid parameters in update
        params.id = bloodUser.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/bloodUser/edit"
        assert model.bloodUserInstance != null

        bloodUser.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/bloodUser/show/$bloodUser.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        bloodUser.clearErrors()

        populateValidParams(params)
        params.id = bloodUser.id
        params.version = -1
        controller.update()

        assert view == "/bloodUser/edit"
        assert model.bloodUserInstance != null
        assert model.bloodUserInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/bloodUser/list'

        response.reset()

        populateValidParams(params)
        def bloodUser = new BloodUser(params)

        assert bloodUser.save() != null
        assert BloodUser.count() == 1

        params.id = bloodUser.id

        controller.delete()

        assert BloodUser.count() == 0
        assert BloodUser.get(bloodUser.id) == null
        assert response.redirectedUrl == '/bloodUser/list'
    }
}
