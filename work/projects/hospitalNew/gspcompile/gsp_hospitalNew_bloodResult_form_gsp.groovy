import com.sjzsqjy.www.data.blood.BloodResult
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_bloodResult_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bloodResult/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: bloodResultInstance, field: 'keyStr', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("bloodResult.keyStr.label"),'default':("Key Str")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("keyStr"),'value':(bloodResultInstance?.keyStr)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: bloodResultInstance, field: 'sequence', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("bloodResult.sequence.label"),'default':("Sequence")],-1)
printHtmlPart(5)
invokeTag('field','g',18,['name':("sequence"),'type':("number"),'value':(bloodResultInstance.sequence),'required':("")],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: bloodResultInstance, field: 'value', 'error'))
printHtmlPart(6)
invokeTag('message','g',23,['code':("bloodResult.value.label"),'default':("Value")],-1)
printHtmlPart(5)
invokeTag('field','g',26,['name':("value"),'value':(fieldValue(bean: bloodResultInstance, field: 'value')),'required':("")],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345131033494L
public static final String DEFAULT_CODEC = null
}
