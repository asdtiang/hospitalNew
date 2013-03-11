import com.sjzsqjy.www.data.trace.TraceType
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_traceType_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/traceType/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: traceTypeInstance, field: 'adult', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("traceType.adult.label"),'default':("Adult")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("adult"),'value':(traceTypeInstance?.adult)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceTypeInstance, field: 'child', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("traceType.child.label"),'default':("Child")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("child"),'value':(traceTypeInstance?.child)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceTypeInstance, field: 'name', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("traceType.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("name"),'value':(traceTypeInstance?.name)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceTypeInstance, field: 'sampleType', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("traceType.sampleType.label"),'default':("Sample Type")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("sampleType"),'value':(traceTypeInstance?.sampleType)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceTypeInstance, field: 'sequence', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("traceType.sequence.label"),'default':("Sequence")],-1)
printHtmlPart(8)
invokeTag('field','g',42,['name':("sequence"),'type':("number"),'value':(traceTypeInstance.sequence),'required':("")],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceTypeInstance, field: 'unit', 'error'))
printHtmlPart(9)
invokeTag('message','g',47,['code':("traceType.unit.label"),'default':("Unit")],-1)
printHtmlPart(2)
invokeTag('textField','g',50,['name':("unit"),'value':(traceTypeInstance?.unit)],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345133441616L
public static final String DEFAULT_CODEC = null
}
