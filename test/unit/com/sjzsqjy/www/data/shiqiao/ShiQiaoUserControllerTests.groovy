package com.sjzsqjy.www.data.shiqiao



import org.junit.*
import grails.test.mixin.*

@TestFor(ShiQiaoUserController)
@Mock(ShiQiaoUser)
class ShiQiaoUserControllerTests {


    def populateValidParams(params) {
      assert params != null
      // TODO: Populate valid properties like...
      //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/shiQiaoUser/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.shiQiaoUserInstanceList.size() == 0
        assert model.shiQiaoUserInstanceTotal == 0
    }

    void testCreate() {
       def model = controller.create()

       assert model.shiQiaoUserInstance != null
    }

    void testSave() {
        controller.save()

        assert model.shiQiaoUserInstance != null
        assert view == '/shiQiaoUser/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/shiQiaoUser/show/1'
        assert controller.flash.message != null
        assert ShiQiaoUser.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/shiQiaoUser/list'


        populateValidParams(params)
        def shiQiaoUser = new ShiQiaoUser(params)

        assert shiQiaoUser.save() != null

        params.id = shiQiaoUser.id

        def model = controller.show()

        assert model.shiQiaoUserInstance == shiQiaoUser
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/shiQiaoUser/list'


        populateValidParams(params)
        def shiQiaoUser = new ShiQiaoUser(params)

        assert shiQiaoUser.save() != null

        params.id = shiQiaoUser.id

        def model = controller.edit()

        assert model.shiQiaoUserInstance == shiQiaoUser
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/shiQiaoUser/list'

        response.reset()


        populateValidParams(params)
        def shiQiaoUser = new ShiQiaoUser(params)

        assert shiQiaoUser.save() != null

        // test invalid parameters in update
        params.id = shiQiaoUser.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/shiQiaoUser/edit"
        assert model.shiQiaoUserInstance != null

        shiQiaoUser.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/shiQiaoUser/show/$shiQiaoUser.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        shiQiaoUser.clearErrors()

        populateValidParams(params)
        params.id = shiQiaoUser.id
        params.version = -1
        controller.update()

        assert view == "/shiQiaoUser/edit"
        assert model.shiQiaoUserInstance != null
        assert model.shiQiaoUserInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/shiQiaoUser/list'

        response.reset()

        populateValidParams(params)
        def shiQiaoUser = new ShiQiaoUser(params)

        assert shiQiaoUser.save() != null
        assert ShiQiaoUser.count() == 1

        params.id = shiQiaoUser.id

        controller.delete()

        assert ShiQiaoUser.count() == 0
        assert ShiQiaoUser.get(shiQiaoUser.id) == null
        assert response.redirectedUrl == '/shiQiaoUser/list'
    }
}
