import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_registerforgotPassword_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/register/forgotPassword.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',4,['code':("spring.security.ui.forgotPassword.title")],-1)
})
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('javascript','g',6,['library':("jquery"),'plugin':("jquery")],-1)
printHtmlPart(3)
codecOut.print(resource(dir:'css',file:'spring-security-ui.css'))
printHtmlPart(4)
invokeTag('resources','jqui',8,[:],-1)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
createTagBody(3, {->
printHtmlPart(8)
if(true && (emailSent)) {
printHtmlPart(9)
invokeTag('message','g',25,['code':("spring.security.ui.forgotPassword.sent")],-1)
printHtmlPart(10)
}
else {
printHtmlPart(11)
invokeTag('message','g',31,['code':("spring.security.ui.forgotPassword.description")],-1)
printHtmlPart(12)
invokeTag('message','g',35,['code':("spring.security.ui.forgotPassword.username")],-1)
printHtmlPart(13)
invokeTag('textField','g',36,['name':("username"),'size':("25")],-1)
printHtmlPart(14)
invokeTag('submitButton','s2ui',40,['elementId':("reset"),'form':("forgotPasswordForm"),'messageCode':("spring.security.ui.forgotPassword.submit")],-1)
printHtmlPart(8)
}
printHtmlPart(8)
})
invokeTag('form','g',44,['action':("forgotPassword"),'name':("forgotPasswordForm"),'autocomplete':("off")],3)
printHtmlPart(1)
})
invokeTag('form','s2ui',45,['width':("374"),'height':("220"),'elementId':("forgotPasswordFormContainer"),'titleCode':("spring.security.ui.forgotPassword.header"),'center':("true")],2)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',53,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352984445107L
public static final String DEFAULT_CODEC = null
}
