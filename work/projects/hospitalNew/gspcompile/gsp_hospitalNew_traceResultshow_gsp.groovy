import com.sjzsqjy.www.data.trace.TraceResult
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_traceResultshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/traceResult/show.gsp" }
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
if(true && (traceResultInstance?.result)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("traceResult.result.label"),'default':("Result")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(traceResultInstance),'field':("result")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (traceResultInstance?.sampleId)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("traceResult.sampleId.label"),'default':("Sample Id")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(traceResultInstance),'field':("sampleId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (traceResultInstance?.typeStr)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("traceResult.typeStr.label"),'default':("Type Str")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(traceResultInstance),'field':("typeStr")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (traceResultInstance?.ybStr)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("traceResult.ybStr.label"),'default':("Yb Str")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(traceResultInstance),'field':("ybStr")],-1)
printHtmlPart(16)
}
printHtmlPart(24)
createTagBody(2, {->
printHtmlPart(25)
invokeTag('hiddenField','g',65,['name':("id"),'value':(traceResultInstance?.id)],-1)
printHtmlPart(26)
createTagBody(3, {->
invokeTag('message','g',66,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',66,['class':("edit"),'action':("edit"),'id':(traceResultInstance?.id)],3)
printHtmlPart(26)
invokeTag('actionSubmit','g',67,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(27)
})
invokeTag('form','g',69,[:],2)
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',71,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1353935439951L
public static final String DEFAULT_CODEC = null
}
