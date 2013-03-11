import com.sjzsqjy.www.data.trace.TraceResult
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_traceResultlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/traceResult/list.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'traceResult.label', default: 'TraceResult'))],-1)
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
invokeTag('sortableColumn','g',27,['property':("result"),'title':(message(code: 'traceResult.result.label', default: 'Result'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("sampleId"),'title':(message(code: 'traceResult.sampleId.label', default: 'Sample Id'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("typeStr"),'title':(message(code: 'traceResult.typeStr.label', default: 'Type Str'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',33,['property':("ybStr"),'title':(message(code: 'traceResult.ybStr.label', default: 'Yb Str'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( traceResultInstance in (traceResultInstanceList) ) {
printHtmlPart(15)
codecOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
createTagBody(3, {->
codecOut.print(fieldValue(bean: traceResultInstance, field: "result"))
})
invokeTag('link','g',41,['action':("show"),'id':(traceResultInstance.id)],3)
printHtmlPart(17)
codecOut.print(fieldValue(bean: traceResultInstance, field: "sampleId"))
printHtmlPart(17)
codecOut.print(fieldValue(bean: traceResultInstance, field: "typeStr"))
printHtmlPart(17)
codecOut.print(fieldValue(bean: traceResultInstance, field: "ybStr"))
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('paginate','g',54,['total':(traceResultInstanceTotal)],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',57,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1353935439011L
public static final String DEFAULT_CODEC = null
}
