import com.sjzsqjy.www.data.trace.TraceType
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_traceTypelist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/traceType/list.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'traceType.label', default: 'TraceType'))],-1)
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
invokeTag('sortableColumn','g',27,['property':("adult"),'title':(message(code: 'traceType.adult.label', default: 'Adult'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("child"),'title':(message(code: 'traceType.child.label', default: 'Child'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("name"),'title':(message(code: 'traceType.name.label', default: 'Name'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',33,['property':("sampleType"),'title':(message(code: 'traceType.sampleType.label', default: 'Sample Type'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',35,['property':("sequence"),'title':(message(code: 'traceType.sequence.label', default: 'Sequence'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',37,['property':("unit"),'title':(message(code: 'traceType.unit.label', default: 'Unit'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( traceTypeInstance in (traceTypeInstanceList) ) {
printHtmlPart(15)
codecOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
createTagBody(3, {->
codecOut.print(fieldValue(bean: traceTypeInstance, field: "adult"))
})
invokeTag('link','g',45,['action':("show"),'id':(traceTypeInstance.id)],3)
printHtmlPart(17)
codecOut.print(fieldValue(bean: traceTypeInstance, field: "child"))
printHtmlPart(17)
codecOut.print(fieldValue(bean: traceTypeInstance, field: "name"))
printHtmlPart(17)
codecOut.print(fieldValue(bean: traceTypeInstance, field: "sampleType"))
printHtmlPart(17)
codecOut.print(fieldValue(bean: traceTypeInstance, field: "sequence"))
printHtmlPart(17)
codecOut.print(fieldValue(bean: traceTypeInstance, field: "unit"))
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('paginate','g',62,['total':(traceTypeInstanceTotal)],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121372753L
public static final String DEFAULT_CODEC = null
}
