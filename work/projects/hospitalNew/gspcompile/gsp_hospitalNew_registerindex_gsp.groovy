import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_registerindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/register/index.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',5,['code':("spring.security.ui.register.title")],-1)
})
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
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
printHtmlPart(9)
if(true && (emailSent)) {
printHtmlPart(10)
invokeTag('message','g',24,['code':("spring.security.ui.register.sent")],-1)
printHtmlPart(1)
}
else {
printHtmlPart(11)
invokeTag('textFieldRow','s2ui',34,['name':("username"),'labelCode':("user.username.label"),'bean':(command),'size':("40"),'labelCodeDefault':("Username"),'value':(command.username)],-1)
printHtmlPart(12)
invokeTag('textFieldRow','s2ui',37,['name':("email"),'bean':(command),'value':(command.email),'size':("40"),'labelCode':("user.email.label"),'labelCodeDefault':("E-mail")],-1)
printHtmlPart(12)
invokeTag('passwordFieldRow','s2ui',40,['name':("password"),'labelCode':("user.password.label"),'bean':(command),'size':("40"),'labelCodeDefault':("Password"),'value':(command.password)],-1)
printHtmlPart(12)
invokeTag('passwordFieldRow','s2ui',43,['name':("password2"),'labelCode':("user.password2.label"),'bean':(command),'size':("40"),'labelCodeDefault':("Password (again)"),'value':(command.password2)],-1)
printHtmlPart(13)
invokeTag('submitButton','s2ui',48,['elementId':("create"),'form':("registerForm"),'messageCode':("spring.security.ui.register.submit")],-1)
printHtmlPart(9)
}
printHtmlPart(8)
})
invokeTag('form','g',52,['action':("register"),'name':("registerForm")],3)
printHtmlPart(8)
})
invokeTag('form','s2ui',54,['width':("450"),'height':("300"),'elementId':("loginFormContainer"),'titleCode':("spring.security.ui.register.description"),'center':("true")],2)
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',63,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352903419500L
public static final String DEFAULT_CODEC = null
}
