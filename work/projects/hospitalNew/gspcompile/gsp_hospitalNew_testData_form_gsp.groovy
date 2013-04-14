import com.sjzsqjy.www.data.TestData
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_testData_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/testData/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: testDataInstance, field: 'age', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("testData.age.label"),'default':("Age")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("age"),'value':(testDataInstance?.age)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: testDataInstance, field: 'clinic', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("testData.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(5)
invokeTag('select','g',18,['id':("clinic"),'name':("clinic.id"),'from':(com.sjzsqjy.www.statistics.Clinic.list()),'optionKey':("id"),'optionValue':("name"),'required':(""),'value':(testDataInstance?.clinic?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: testDataInstance, field: 'jsonData', 'error'))
printHtmlPart(6)
invokeTag('message','g',23,['code':("testData.jsonData.label"),'default':("Json Data")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("jsonData"),'value':(testDataInstance?.jsonData)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: testDataInstance, field: 'name', 'error'))
printHtmlPart(7)
invokeTag('message','g',31,['code':("testData.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("name"),'value':(testDataInstance?.name)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: testDataInstance, field: 'testDate', 'error'))
printHtmlPart(8)
invokeTag('message','g',39,['code':("testData.testDate.label"),'default':("Test Date")],-1)
printHtmlPart(5)
invokeTag('datePicker','g',42,['name':("testDate"),'precision':("day"),'value':(testDataInstance?.testDate)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: testDataInstance, field: 'type', 'error'))
printHtmlPart(9)
invokeTag('message','g',47,['code':("testData.type.label"),'default':("Type")],-1)
printHtmlPart(5)
invokeTag('select','g',50,['id':("type"),'name':("type.id"),'from':(com.sjzsqjy.www.data.TestType.list()),'optionKey':("id"),'required':(""),'value':(testDataInstance?.type?.id),'class':("many-to-one")],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1365347867973L
public static final String DEFAULT_CODEC = null
}
