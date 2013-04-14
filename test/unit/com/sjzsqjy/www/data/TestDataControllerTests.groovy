package com.sjzsqjy.www.data



import org.junit.*
import grails.test.mixin.*

@TestFor(TestDataController)
@Mock(TestData)
class TestDataControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/testData/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.testDataInstanceList.size() == 0
        assert model.testDataInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.testDataInstance != null
    }

    void testSave() {
        controller.save()

        assert model.testDataInstance != null
        assert view == '/testData/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/testData/show/1'
        assert controller.flash.message != null
        assert TestData.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/testData/list'

        populateValidParams(params)
        def testData = new TestData(params)

        assert testData.save() != null

        params.id = testData.id

        def model = controller.show()

        assert model.testDataInstance == testData
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/testData/list'

        populateValidParams(params)
        def testData = new TestData(params)

        assert testData.save() != null

        params.id = testData.id

        def model = controller.edit()

        assert model.testDataInstance == testData
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/testData/list'

        response.reset()

        populateValidParams(params)
        def testData = new TestData(params)

        assert testData.save() != null

        // test invalid parameters in update
        params.id = testData.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/testData/edit"
        assert model.testDataInstance != null

        testData.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/testData/show/$testData.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        testData.clearErrors()

        populateValidParams(params)
        params.id = testData.id
        params.version = -1
        controller.update()

        assert view == "/testData/edit"
        assert model.testDataInstance != null
        assert model.testDataInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/testData/list'

        response.reset()

        populateValidParams(params)
        def testData = new TestData(params)

        assert testData.save() != null
        assert TestData.count() == 1

        params.id = testData.id

        controller.delete()

        assert TestData.count() == 0
        assert TestData.get(testData.id) == null
        assert response.redirectedUrl == '/testData/list'
    }
}
