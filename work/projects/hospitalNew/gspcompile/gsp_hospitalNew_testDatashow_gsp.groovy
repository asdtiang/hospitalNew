import com.sjzsqjy.www.data.TestData
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_testDatashow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/testData/show.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("admin")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'testData.label', default: 'TestData'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
codecOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("list")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
codecOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (testDataInstance?.age)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("testData.age.label"),'default':("Age")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(testDataInstance),'field':("age")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (testDataInstance?.clinic)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("testData.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(19)
createTagBody(3, {->
codecOut.print(testDataInstance?.clinic?.encodeAsHTML())
})
invokeTag('link','g',39,['controller':("clinic"),'action':("show"),'id':(testDataInstance?.clinic?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (testDataInstance?.dateCreated)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("testData.dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(21)
invokeTag('formatDate','g',48,['date':(testDataInstance?.dateCreated)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (testDataInstance?.jsonData)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("testData.jsonData.label"),'default':("Json Data")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(testDataInstance),'field':("jsonData")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (testDataInstance?.name)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("testData.name.label"),'default':("Name")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(testDataInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (testDataInstance?.testDate)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("testData.testDate.label"),'default':("Test Date")],-1)
printHtmlPart(27)
invokeTag('formatDate','g',75,['date':(testDataInstance?.testDate)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (testDataInstance?.type)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("testData.type.label"),'default':("Type")],-1)
printHtmlPart(29)
createTagBody(3, {->
codecOut.print(testDataInstance?.type?.encodeAsHTML())
})
invokeTag('link','g',84,['controller':("testType"),'action':("show"),'id':(testDataInstance?.type?.id)],3)
printHtmlPart(16)
}
printHtmlPart(30)
createTagBody(2, {->
printHtmlPart(31)
invokeTag('hiddenField','g',92,['name':("id"),'value':(testDataInstance?.id)],-1)
printHtmlPart(32)
createTagBody(3, {->
invokeTag('message','g',93,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',93,['class':("edit"),'action':("edit"),'id':(testDataInstance?.id)],3)
printHtmlPart(32)
invokeTag('actionSubmit','g',94,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(33)
})
invokeTag('form','g',96,[:],2)
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',98,[:],1)
printHtmlPart(35)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1365338550534L
public static final String DEFAULT_CODEC = null
}
