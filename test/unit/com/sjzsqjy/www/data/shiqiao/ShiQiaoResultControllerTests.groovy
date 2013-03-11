package com.sjzsqjy.www.data.shiqiao



import org.junit.*
import grails.test.mixin.*

@TestFor(ShiQiaoResultController)
@Mock(ShiQiaoResult)
class ShiQiaoResultControllerTests {


    def populateValidParams(params) {
      assert params != null
      // TODO: Populate valid properties like...
      //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/shiQiaoResult/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.shiQiaoResultInstanceList.size() == 0
        assert model.shiQiaoResultInstanceTotal == 0
    }

    void testCreate() {
       def model = controller.create()

       assert model.shiQiaoResultInstance != null
    }

    void testSave() {
        controller.save()

        assert model.shiQiaoResultInstance != null
        assert view == '/shiQiaoResult/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/shiQiaoResult/show/1'
        assert controller.flash.message != null
        assert ShiQiaoResult.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/shiQiaoResult/list'


        populateValidParams(params)
        def shiQiaoResult = new ShiQiaoResult(params)

        assert shiQiaoResult.save() != null

        params.id = shiQiaoResult.id

        def model = controller.show()

        assert model.shiQiaoResultInstance == shiQiaoResult
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/shiQiaoResult/list'


        populateValidParams(params)
        def shiQiaoResult = new ShiQiaoResult(params)

        assert shiQiaoResult.save() != null

        params.id = shiQiaoResult.id

        def model = controller.edit()

        assert model.shiQiaoResultInstance == shiQiaoResult
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/shiQiaoResult/list'

        response.reset()


        populateValidParams(params)
        def shiQiaoResult = new ShiQiaoResult(params)

        assert shiQiaoResult.save() != null

        // test invalid parameters in update
        params.id = shiQiaoResult.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/shiQiaoResult/edit"
        assert model.shiQiaoResultInstance != null

        shiQiaoResult.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/shiQiaoResult/show/$shiQiaoResult.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        shiQiaoResult.clearErrors()

        populateValidParams(params)
        params.id = shiQiaoResult.id
        params.version = -1
        controller.update()

        assert view == "/shiQiaoResult/edit"
        assert model.shiQiaoResultInstance != null
        assert model.shiQiaoResultInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/shiQiaoResult/list'

        response.reset()

        populateValidParams(params)
        def shiQiaoResult = new ShiQiaoResult(params)

        assert shiQiaoResult.save() != null
        assert ShiQiaoResult.count() == 1

        params.id = shiQiaoResult.id

        controller.delete()

        assert ShiQiaoResult.count() == 0
        assert ShiQiaoResult.get(shiQiaoResult.id) == null
        assert response.redirectedUrl == '/shiQiaoResult/list'
    }
}
