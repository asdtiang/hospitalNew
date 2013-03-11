import com.sjzsqjy.www.data.trace.TraceUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_traceUserlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/traceUser/list.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("admin")],-1)
printHtmlPart(3)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'traceUser.label', default: 'TraceUser'))],-1)
printHtmlPart(3)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('autoComplete','resource',11,['skin':("default")],-1)
printHtmlPart(6)
invokeTag('message','g',12,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(7)
codecOut.print(createLink(uri: '/'))
printHtmlPart(8)
invokeTag('message','g',15,['code':("default.home.label")],-1)
printHtmlPart(9)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(10)
invokeTag('message','g',20,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
codecOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
invokeTag('sortableColumn','g',27,['property':("name"),'title':(message(code: 'traceUser.name.label', default: 'name'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',28,['property':("sex"),'title':(message(code: 'traceUser.sex.label', default: 'Sex'))],-1)
printHtmlPart(16)
invokeTag('sortableColumn','g',30,['property':("ageInfo"),'title':(message(code: 'traceUser.ageInfo.label', default: 'Age Info'))],-1)
printHtmlPart(17)
invokeTag('message','g',34,['code':("traceUser.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(18)
invokeTag('sortableColumn','g',36,['property':("date"),'title':(message(code: 'traceUser.date.label', default: 'Date'))],-1)
printHtmlPart(16)
invokeTag('sortableColumn','g',38,['property':("doctor"),'title':(message(code: 'traceUser.doctor.label', default: 'Doctor'))],-1)
printHtmlPart(19)
loop:{
int i = 0
for( traceUserInstance in (traceUserInstanceList) ) {
printHtmlPart(20)
codecOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(21)
createTagBody(3, {->
codecOut.print(fieldValue(bean: traceUserInstance, field: "name"))
})
invokeTag('link','g',46,['action':("show"),'id':(traceUserInstance.id)],3)
printHtmlPart(22)
codecOut.print(fieldValue(bean: traceUserInstance, field: "sex"))
printHtmlPart(23)
codecOut.print(fieldValue(bean: traceUserInstance, field: "ageInfo"))
printHtmlPart(24)
invokeTag('set','g',52,['var':("updateId"),'value':("${com.sjzsqjy.www.util.SiteConstant.DATA_TYPE_TRACE}${traceUserInstance.id}")],-1)
printHtmlPart(25)
codecOut.print(updateId)
printHtmlPart(26)
createTagBody(3, {->
printHtmlPart(27)
codecOut.print(traceUserInstance?.clinic?.name)
printHtmlPart(28)
})
invokeTag('remoteLink','g',57,['controller':("clinic"),'update':(updateId),'params':([id:traceUserInstance.id,type:com.sjzsqjy.www.util.SiteConstant.DATA_TYPE_TRACE]),'action':("showSearchClinic")],3)
printHtmlPart(29)
codecOut.print(fieldValue(bean: traceUserInstance?.clinic, field: "name"))
printHtmlPart(23)
codecOut.print(fieldValue(bean: traceUserInstance, field: "date"))
printHtmlPart(23)
codecOut.print(fieldValue(bean: traceUserInstance, field: "doctor"))
printHtmlPart(30)
i++
}
}
printHtmlPart(31)
invokeTag('paginate','g',70,['total':(traceUserInstanceTotal)],-1)
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',73,[:],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345214670590L
public static final String DEFAULT_CODEC = null
}
