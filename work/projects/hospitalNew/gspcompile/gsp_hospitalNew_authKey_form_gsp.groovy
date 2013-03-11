import com.sjzsqjy.www.auth.AuthKey
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_authKey_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/authKey/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: authKeyInstance, field: 'clientKey', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("authKey.clientKey.label"),'default':("Client Key")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("clientKey"),'required':(""),'value':(authKeyInstance?.clientKey)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: authKeyInstance, field: 'type', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("authKey.type.label"),'default':("Type")],-1)
printHtmlPart(2)
invokeTag('select','g',18,['name':("type"),'from':(com.sjzsqjy.www.auth.AuthKey$DataType?.values()),'keys':(com.sjzsqjy.www.auth.AuthKey$DataType.values()*.name()),'required':(""),'value':(authKeyInstance?.type?.name())],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1341320203980L
public static final String DEFAULT_CODEC = null
}
