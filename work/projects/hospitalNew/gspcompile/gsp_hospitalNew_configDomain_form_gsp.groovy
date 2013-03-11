import com.sjzsqjy.www.site.ConfigDomain
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_configDomain_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/configDomain/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: configDomainInstance, field: 'description', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("configDomain.description.label"),'default':("Description")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("description"),'value':(configDomainInstance?.description)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: configDomainInstance, field: 'mapName', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("configDomain.mapName.label"),'default':("Map Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("mapName"),'value':(configDomainInstance?.mapName)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: configDomainInstance, field: 'mapValue', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("configDomain.mapValue.label"),'default':("Map Value")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("mapValue"),'value':(configDomainInstance?.mapValue)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: configDomainInstance, field: 'valueType', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("configDomain.valueType.label"),'default':("Value Type")],-1)
printHtmlPart(7)
invokeTag('select','g',34,['name':("valueType"),'from':(com.sjzsqjy.www.site.ConfigDomain$ValueType?.values()),'keys':(com.sjzsqjy.www.site.ConfigDomain$ValueType.values()*.name()),'required':(""),'value':(configDomainInstance?.valueType?.name())],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264579L
public static final String DEFAULT_CODEC = null
}
