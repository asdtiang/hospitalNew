package com.sjzsqjy.www.auth



import org.junit.*
import grails.test.mixin.*

@TestFor(AuthKeyController)
@Mock(AuthKey)
class AuthKeyControllerTests {


    def populateValidParams(params) {
      assert params != null
      // TODO: Populate valid properties like...
      //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/authKey/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.authKeyInstanceList.size() == 0
        assert model.authKeyInstanceTotal == 0
    }

    void testCreate() {
       def model = controller.create()

       assert model.authKeyInstance != null
    }

    void testSave() {
        controller.save()

        assert model.authKeyInstance != null
        assert view == '/authKey/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/authKey/show/1'
        assert controller.flash.message != null
        assert AuthKey.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/authKey/list'


        populateValidParams(params)
        def authKey = new AuthKey(params)

        assert authKey.save() != null

        params.id = authKey.id

        def model = controller.show()

        assert model.authKeyInstance == authKey
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/authKey/list'


        populateValidParams(params)
        def authKey = new AuthKey(params)

        assert authKey.save() != null

        params.id = authKey.id

        def model = controller.edit()

        assert model.authKeyInstance == authKey
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/authKey/list'

        response.reset()


        populateValidParams(params)
        def authKey = new AuthKey(params)

        assert authKey.save() != null

        // test invalid parameters in update
        params.id = authKey.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/authKey/edit"
        assert model.authKeyInstance != null

        authKey.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/authKey/show/$authKey.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        authKey.clearErrors()

        populateValidParams(params)
        params.id = authKey.id
        params.version = -1
        controller.update()

        assert view == "/authKey/edit"
        assert model.authKeyInstance != null
        assert model.authKeyInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/authKey/list'

        response.reset()

        populateValidParams(params)
        def authKey = new AuthKey(params)

        assert authKey.save() != null
        assert AuthKey.count() == 1

        params.id = authKey.id

        controller.delete()

        assert AuthKey.count() == 0
        assert AuthKey.get(authKey.id) == null
        assert response.redirectedUrl == '/authKey/list'
    }
}
