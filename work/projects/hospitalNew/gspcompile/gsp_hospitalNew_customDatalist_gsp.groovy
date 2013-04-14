import com.sjzsqjy.www.site.CustomData
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_customDatalist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/customData/list.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'customData.label', default: 'CustomData'))],-1)
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
invokeTag('message','g',27,['code':("customData.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("dateCreated"),'title':(message(code: 'customData.dateCreated.label', default: 'Date Created'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',33,['property':("patientName"),'title':(message(code: 'customData.patientName.label', default: 'Patient Name'))],-1)
printHtmlPart(15)
invokeTag('message','g',35,['code':("customData.template.label"),'default':("Template")],-1)
printHtmlPart(16)
invokeTag('sortableColumn','g',37,['property':("testDate"),'title':(message(code: 'customData.testDate.label', default: 'Test Date'))],-1)
printHtmlPart(17)
loop:{
int i = 0
for( customDataInstance in (customDataInstanceList) ) {
printHtmlPart(18)
codecOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(19)
createTagBody(3, {->
codecOut.print(fieldValue(bean: customDataInstance?.clinic, field: "name"))
})
invokeTag('link','g',45,['action':("show"),'id':(customDataInstance.id)],3)
printHtmlPart(20)
createClosureForHtmlPart(21, 3)
invokeTag('link','g',46,['action':("edit"),'id':(customDataInstance.id)],3)
printHtmlPart(22)
invokeTag('formatDate','g',51,['date':(customDataInstance.dateCreated)],-1)
printHtmlPart(23)
codecOut.print(fieldValue(bean: customDataInstance, field: "patientName"))
printHtmlPart(23)
codecOut.print(fieldValue(bean: customDataInstance?.template, field: "title"))
printHtmlPart(23)
invokeTag('formatDate','g',57,['date':(customDataInstance.testDate)],-1)
printHtmlPart(24)
i++
}
}
printHtmlPart(25)
invokeTag('paginate','g',64,['total':(customDataInstanceTotal)],-1)
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',67,[:],1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1364478593312L
public static final String DEFAULT_CODEC = null
}
