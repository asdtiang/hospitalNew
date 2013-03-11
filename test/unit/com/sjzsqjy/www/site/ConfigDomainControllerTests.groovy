package com.sjzsqjy.www.site



import org.junit.*
import grails.test.mixin.*

@TestFor(ConfigDomainController)
@Mock(ConfigDomain)
class ConfigDomainControllerTests {


    def populateValidParams(params) {
      assert params != null
      // TODO: Populate valid properties like...
      //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/configDomain/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.configDomainInstanceList.size() == 0
        assert model.configDomainInstanceTotal == 0
    }

    void testCreate() {
       def model = controller.create()

       assert model.configDomainInstance != null
    }

    void testSave() {
        controller.save()

        assert model.configDomainInstance != null
        assert view == '/configDomain/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/configDomain/show/1'
        assert controller.flash.message != null
        assert ConfigDomain.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/configDomain/list'


        populateValidParams(params)
        def configDomain = new ConfigDomain(params)

        assert configDomain.save() != null

        params.id = configDomain.id

        def model = controller.show()

        assert model.configDomainInstance == configDomain
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/configDomain/list'


        populateValidParams(params)
        def configDomain = new ConfigDomain(params)

        assert configDomain.save() != null

        params.id = configDomain.id

        def model = controller.edit()

        assert model.configDomainInstance == configDomain
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/configDomain/list'

        response.reset()


        populateValidParams(params)
        def configDomain = new ConfigDomain(params)

        assert configDomain.save() != null

        // test invalid parameters in update
        params.id = configDomain.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/configDomain/edit"
        assert model.configDomainInstance != null

        configDomain.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/configDomain/show/$configDomain.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        configDomain.clearErrors()

        populateValidParams(params)
        params.id = configDomain.id
        params.version = -1
        controller.update()

        assert view == "/configDomain/edit"
        assert model.configDomainInstance != null
        assert model.configDomainInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/configDomain/list'

        response.reset()

        populateValidParams(params)
        def configDomain = new ConfigDomain(params)

        assert configDomain.save() != null
        assert ConfigDomain.count() == 1

        params.id = configDomain.id

        controller.delete()

        assert ConfigDomain.count() == 0
        assert ConfigDomain.get(configDomain.id) == null
        assert response.redirectedUrl == '/configDomain/list'
    }
}
