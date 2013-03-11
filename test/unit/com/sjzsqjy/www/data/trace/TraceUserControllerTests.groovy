package com.sjzsqjy.www.data.trace



import org.junit.*
import grails.test.mixin.*

@TestFor(TraceUserController)
@Mock(TraceUser)
class TraceUserControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/traceUser/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.traceUserInstanceList.size() == 0
        assert model.traceUserInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.traceUserInstance != null
    }

    void testSave() {
        controller.save()

        assert model.traceUserInstance != null
        assert view == '/traceUser/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/traceUser/show/1'
        assert controller.flash.message != null
        assert TraceUser.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/traceUser/list'

        populateValidParams(params)
        def traceUser = new TraceUser(params)

        assert traceUser.save() != null

        params.id = traceUser.id

        def model = controller.show()

        assert model.traceUserInstance == traceUser
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/traceUser/list'

        populateValidParams(params)
        def traceUser = new TraceUser(params)

        assert traceUser.save() != null

        params.id = traceUser.id

        def model = controller.edit()

        assert model.traceUserInstance == traceUser
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/traceUser/list'

        response.reset()

        populateValidParams(params)
        def traceUser = new TraceUser(params)

        assert traceUser.save() != null

        // test invalid parameters in update
        params.id = traceUser.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/traceUser/edit"
        assert model.traceUserInstance != null

        traceUser.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/traceUser/show/$traceUser.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        traceUser.clearErrors()

        populateValidParams(params)
        params.id = traceUser.id
        params.version = -1
        controller.update()

        assert view == "/traceUser/edit"
        assert model.traceUserInstance != null
        assert model.traceUserInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/traceUser/list'

        response.reset()

        populateValidParams(params)
        def traceUser = new TraceUser(params)

        assert traceUser.save() != null
        assert TraceUser.count() == 1

        params.id = traceUser.id

        controller.delete()

        assert TraceUser.count() == 0
        assert TraceUser.get(traceUser.id) == null
        assert response.redirectedUrl == '/traceUser/list'
    }
}
