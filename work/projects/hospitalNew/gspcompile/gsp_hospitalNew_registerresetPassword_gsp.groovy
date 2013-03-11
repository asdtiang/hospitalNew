import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_registerresetPassword_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/register/resetPassword.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',4,['code':("spring.security.ui.resetPassword.title")],-1)
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
invokeTag('hiddenField','g',21,['name':("t"),'value':(token)],-1)
printHtmlPart(9)
invokeTag('message','g',23,['code':("spring.security.ui.resetPassword.description")],-1)
printHtmlPart(10)
invokeTag('passwordFieldRow','s2ui',27,['name':("password"),'labelCode':("resetPasswordCommand.password.label"),'bean':(command),'labelCodeDefault':("Password"),'value':(command?.password)],-1)
printHtmlPart(11)
invokeTag('passwordFieldRow','s2ui',30,['name':("password2"),'labelCode':("resetPasswordCommand.password2.label"),'bean':(command),'labelCodeDefault':("Password (again)"),'value':(command?.password2)],-1)
printHtmlPart(12)
invokeTag('submitButton','s2ui',33,['elementId':("reset"),'form':("resetPasswordForm"),'messageCode':("spring.security.ui.resetPassword.submit")],-1)
printHtmlPart(8)
})
invokeTag('form','g',34,['action':("resetPassword"),'name':("resetPasswordForm"),'autocomplete':("off")],3)
printHtmlPart(6)
})
invokeTag('form','s2ui',36,['width':("550"),'height':("280"),'elementId':("resetPasswordFormContainer"),'titleCode':("spring.security.ui.resetPassword.header"),'center':("true")],2)
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',45,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1353245747827L
public static final String DEFAULT_CODEC = null
}
