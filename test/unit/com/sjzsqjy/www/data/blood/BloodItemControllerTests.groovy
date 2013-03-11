package com.sjzsqjy.www.data.blood



import org.junit.*
import grails.test.mixin.*

@TestFor(BloodItemController)
@Mock(BloodItem)
class BloodItemControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/bloodItem/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.bloodItemInstanceList.size() == 0
        assert model.bloodItemInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.bloodItemInstance != null
    }

    void testSave() {
        controller.save()

        assert model.bloodItemInstance != null
        assert view == '/bloodItem/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/bloodItem/show/1'
        assert controller.flash.message != null
        assert BloodItem.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/bloodItem/list'

        populateValidParams(params)
        def bloodItem = new BloodItem(params)

        assert bloodItem.save() != null

        params.id = bloodItem.id

        def model = controller.show()

        assert model.bloodItemInstance == bloodItem
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/bloodItem/list'

        populateValidParams(params)
        def bloodItem = new BloodItem(params)

        assert bloodItem.save() != null

        params.id = bloodItem.id

        def model = controller.edit()

        assert model.bloodItemInstance == bloodItem
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/bloodItem/list'

        response.reset()

        populateValidParams(params)
        def bloodItem = new BloodItem(params)

        assert bloodItem.save() != null

        // test invalid parameters in update
        params.id = bloodItem.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/bloodItem/edit"
        assert model.bloodItemInstance != null

        bloodItem.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/bloodItem/show/$bloodItem.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        bloodItem.clearErrors()

        populateValidParams(params)
        params.id = bloodItem.id
        params.version = -1
        controller.update()

        assert view == "/bloodItem/edit"
        assert model.bloodItemInstance != null
        assert model.bloodItemInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/bloodItem/list'

        response.reset()

        populateValidParams(params)
        def bloodItem = new BloodItem(params)

        assert bloodItem.save() != null
        assert BloodItem.count() == 1

        params.id = bloodItem.id

        controller.delete()

        assert BloodItem.count() == 0
        assert BloodItem.get(bloodItem.id) == null
        assert response.redirectedUrl == '/bloodItem/list'
    }
}
