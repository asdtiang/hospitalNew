package com.sjzsqjy.www.data.trace



import org.junit.*
import grails.test.mixin.*

@TestFor(TraceResultController)
@Mock(TraceResult)
class TraceResultControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/traceResult/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.traceResultInstanceList.size() == 0
        assert model.traceResultInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.traceResultInstance != null
    }

    void testSave() {
        controller.save()

        assert model.traceResultInstance != null
        assert view == '/traceResult/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/traceResult/show/1'
        assert controller.flash.message != null
        assert TraceResult.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/traceResult/list'

        populateValidParams(params)
        def traceResult = new TraceResult(params)

        assert traceResult.save() != null

        params.id = traceResult.id

        def model = controller.show()

        assert model.traceResultInstance == traceResult
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/traceResult/list'

        populateValidParams(params)
        def traceResult = new TraceResult(params)

        assert traceResult.save() != null

        params.id = traceResult.id

        def model = controller.edit()

        assert model.traceResultInstance == traceResult
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/traceResult/list'

        response.reset()

        populateValidParams(params)
        def traceResult = new TraceResult(params)

        assert traceResult.save() != null

        // test invalid parameters in update
        params.id = traceResult.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/traceResult/edit"
        assert model.traceResultInstance != null

        traceResult.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/traceResult/show/$traceResult.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        traceResult.clearErrors()

        populateValidParams(params)
        params.id = traceResult.id
        params.version = -1
        controller.update()

        assert view == "/traceResult/edit"
        assert model.traceResultInstance != null
        assert model.traceResultInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/traceResult/list'

        response.reset()

        populateValidParams(params)
        def traceResult = new TraceResult(params)

        assert traceResult.save() != null
        assert TraceResult.count() == 1

        params.id = traceResult.id

        controller.delete()

        assert TraceResult.count() == 0
        assert TraceResult.get(traceResult.id) == null
        assert response.redirectedUrl == '/traceResult/list'
    }
}
