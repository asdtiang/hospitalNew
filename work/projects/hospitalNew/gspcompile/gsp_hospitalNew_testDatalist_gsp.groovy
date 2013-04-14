import com.sjzsqjy.www.data.TestData
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_testDatalist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/testData/list.gsp" }
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
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
codecOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("age"),'title':(message(code: 'testData.age.label', default: 'Age'))],-1)
printHtmlPart(13)
invokeTag('message','g',29,['code':("testData.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',31,['property':("dateCreated"),'title':(message(code: 'testData.dateCreated.label', default: 'Date Created'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',35,['property':("name"),'title':(message(code: 'testData.name.label', default: 'Name'))],-1)
printHtmlPart(16)
invokeTag('sortableColumn','g',37,['property':("testDate"),'title':("检验时间")],-1)
printHtmlPart(17)
loop:{
int i = 0
for( testDataInstance in (testDataInstanceList) ) {
printHtmlPart(18)
codecOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(19)
createTagBody(3, {->
codecOut.print(fieldValue(bean: testDataInstance, field: "age"))
})
invokeTag('link','g',45,['action':("show"),'id':(testDataInstance.id)],3)
printHtmlPart(20)
codecOut.print(fieldValue(bean: testDataInstance, field: "clinic"))
printHtmlPart(20)
invokeTag('formatDate','g',49,['date':(testDataInstance.dateCreated)],-1)
printHtmlPart(21)
codecOut.print(fieldValue(bean: testDataInstance, field: "name"))
printHtmlPart(20)
invokeTag('formatDate','g',55,['date':(testDataInstance.testDate)],-1)
printHtmlPart(22)
i++
}
}
printHtmlPart(23)
invokeTag('paginate','g',62,['total':(testDataInstanceTotal)],-1)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1365771236843L
public static final String DEFAULT_CODEC = null
}
