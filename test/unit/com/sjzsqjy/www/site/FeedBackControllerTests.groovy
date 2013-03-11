package com.sjzsqjy.www.site



import org.junit.*
import grails.test.mixin.*

@TestFor(FeedBackController)
@Mock(FeedBack)
class FeedBackControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/feedBack/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.feedBackInstanceList.size() == 0
        assert model.feedBackInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.feedBackInstance != null
    }

    void testSave() {
        controller.save()

        assert model.feedBackInstance != null
        assert view == '/feedBack/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/feedBack/show/1'
        assert controller.flash.message != null
        assert FeedBack.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/feedBack/list'

        populateValidParams(params)
        def feedBack = new FeedBack(params)

        assert feedBack.save() != null

        params.id = feedBack.id

        def model = controller.show()

        assert model.feedBackInstance == feedBack
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/feedBack/list'

        populateValidParams(params)
        def feedBack = new FeedBack(params)

        assert feedBack.save() != null

        params.id = feedBack.id

        def model = controller.edit()

        assert model.feedBackInstance == feedBack
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/feedBack/list'

        response.reset()

        populateValidParams(params)
        def feedBack = new FeedBack(params)

        assert feedBack.save() != null

        // test invalid parameters in update
        params.id = feedBack.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/feedBack/edit"
        assert model.feedBackInstance != null

        feedBack.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/feedBack/show/$feedBack.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        feedBack.clearErrors()

        populateValidParams(params)
        params.id = feedBack.id
        params.version = -1
        controller.update()

        assert view == "/feedBack/edit"
        assert model.feedBackInstance != null
        assert model.feedBackInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/feedBack/list'

        response.reset()

        populateValidParams(params)
        def feedBack = new FeedBack(params)

        assert feedBack.save() != null
        assert FeedBack.count() == 1

        params.id = feedBack.id

        controller.delete()

        assert FeedBack.count() == 0
        assert FeedBack.get(feedBack.id) == null
        assert response.redirectedUrl == '/feedBack/list'
    }
}
