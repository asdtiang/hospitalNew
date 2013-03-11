import com.sjzsqjy.www.data.blood.BloodItem
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_bloodItem_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bloodItem/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: bloodItemInstance, field: 'sequence', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("bloodItem.sequence.label"),'default':("Sequence")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['name':("sequence"),'type':("number"),'value':(bloodItemInstance.sequence),'required':("")],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: bloodItemInstance, field: 'high', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("bloodItem.high.label"),'default':("High")],-1)
printHtmlPart(2)
invokeTag('field','g',18,['name':("high"),'type':("number"),'value':(bloodItemInstance.high),'required':("")],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: bloodItemInstance, field: 'low', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("bloodItem.low.label"),'default':("Low")],-1)
printHtmlPart(2)
invokeTag('field','g',26,['name':("low"),'type':("number"),'value':(bloodItemInstance.low),'required':("")],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: bloodItemInstance, field: 'name', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("bloodItem.name.label"),'default':("Name")],-1)
printHtmlPart(7)
invokeTag('textField','g',34,['name':("name"),'value':(bloodItemInstance?.name)],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345130989972L
public static final String DEFAULT_CODEC = null
}
