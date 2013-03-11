import com.sjzsqjy.www.data.trace.TraceResult
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_traceResult_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/traceResult/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: traceResultInstance, field: 'result', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("traceResult.result.label"),'default':("Result")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("result"),'value':(traceResultInstance?.result)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceResultInstance, field: 'sampleId', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("traceResult.sampleId.label"),'default':("Sample Id")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("sampleId"),'value':(traceResultInstance?.sampleId)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceResultInstance, field: 'typeStr', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("traceResult.typeStr.label"),'default':("Type Str")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("typeStr"),'value':(traceResultInstance?.typeStr)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceResultInstance, field: 'ybStr', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("traceResult.ybStr.label"),'default':("Yb Str")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("ybStr"),'value':(traceResultInstance?.ybStr)],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1353935442047L
public static final String DEFAULT_CODEC = null
}
