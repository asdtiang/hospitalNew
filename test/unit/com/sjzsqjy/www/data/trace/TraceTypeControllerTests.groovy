package com.sjzsqjy.www.data.trace



import org.junit.*
import grails.test.mixin.*

@TestFor(TraceTypeController)
@Mock(TraceType)
class TraceTypeControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/traceType/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.traceTypeInstanceList.size() == 0
        assert model.traceTypeInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.traceTypeInstance != null
    }

    void testSave() {
        controller.save()

        assert model.traceTypeInstance != null
        assert view == '/traceType/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/traceType/show/1'
        assert controller.flash.message != null
        assert TraceType.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/traceType/list'

        populateValidParams(params)
        def traceType = new TraceType(params)

        assert traceType.save() != null

        params.id = traceType.id

        def model = controller.show()

        assert model.traceTypeInstance == traceType
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/traceType/list'

        populateValidParams(params)
        def traceType = new TraceType(params)

        assert traceType.save() != null

        params.id = traceType.id

        def model = controller.edit()

        assert model.traceTypeInstance == traceType
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/traceType/list'

        response.reset()

        populateValidParams(params)
        def traceType = new TraceType(params)

        assert traceType.save() != null

        // test invalid parameters in update
        params.id = traceType.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/traceType/edit"
        assert model.traceTypeInstance != null

        traceType.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/traceType/show/$traceType.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        traceType.clearErrors()

        populateValidParams(params)
        params.id = traceType.id
        params.version = -1
        controller.update()

        assert view == "/traceType/edit"
        assert model.traceTypeInstance != null
        assert model.traceTypeInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/traceType/list'

        response.reset()

        populateValidParams(params)
        def traceType = new TraceType(params)

        assert traceType.save() != null
        assert TraceType.count() == 1

        params.id = traceType.id

        controller.delete()

        assert TraceType.count() == 0
        assert TraceType.get(traceType.id) == null
        assert response.redirectedUrl == '/traceType/list'
    }
}
