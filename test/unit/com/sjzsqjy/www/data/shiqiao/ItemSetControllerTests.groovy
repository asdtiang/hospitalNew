package com.sjzsqjy.www.data.shiqiao



import org.junit.*
import grails.test.mixin.*

@TestFor(ItemSetController)
@Mock(ItemSet)
class ItemSetControllerTests {


    def populateValidParams(params) {
      assert params != null
      // TODO: Populate valid properties like...
      //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/itemSet/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.itemSetInstanceList.size() == 0
        assert model.itemSetInstanceTotal == 0
    }

    void testCreate() {
       def model = controller.create()

       assert model.itemSetInstance != null
    }

    void testSave() {
        controller.save()

        assert model.itemSetInstance != null
        assert view == '/itemSet/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/itemSet/show/1'
        assert controller.flash.message != null
        assert ItemSet.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/itemSet/list'


        populateValidParams(params)
        def itemSet = new ItemSet(params)

        assert itemSet.save() != null

        params.id = itemSet.id

        def model = controller.show()

        assert model.itemSetInstance == itemSet
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/itemSet/list'


        populateValidParams(params)
        def itemSet = new ItemSet(params)

        assert itemSet.save() != null

        params.id = itemSet.id

        def model = controller.edit()

        assert model.itemSetInstance == itemSet
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/itemSet/list'

        response.reset()


        populateValidParams(params)
        def itemSet = new ItemSet(params)

        assert itemSet.save() != null

        // test invalid parameters in update
        params.id = itemSet.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/itemSet/edit"
        assert model.itemSetInstance != null

        itemSet.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/itemSet/show/$itemSet.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        itemSet.clearErrors()

        populateValidParams(params)
        params.id = itemSet.id
        params.version = -1
        controller.update()

        assert view == "/itemSet/edit"
        assert model.itemSetInstance != null
        assert model.itemSetInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/itemSet/list'

        response.reset()

        populateValidParams(params)
        def itemSet = new ItemSet(params)

        assert itemSet.save() != null
        assert ItemSet.count() == 1

        params.id = itemSet.id

        controller.delete()

        assert ItemSet.count() == 0
        assert ItemSet.get(itemSet.id) == null
        assert response.redirectedUrl == '/itemSet/list'
    }
}
