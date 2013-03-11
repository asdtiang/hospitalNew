import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_loginindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/index.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',5,['code':("spring.security.ui.login.title")],-1)
})
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("register")],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
codecOut.print(postUrl)
printHtmlPart(4)
invokeTag('message','g',18,['code':("spring.security.ui.login.signin")],-1)
printHtmlPart(5)
invokeTag('message','g',22,['code':("spring.security.ui.login.username")],-1)
printHtmlPart(6)
invokeTag('message','g',26,['code':("spring.security.ui.login.password")],-1)
printHtmlPart(7)
codecOut.print(rememberMeParameter)
printHtmlPart(8)
invokeTag('message','g',32,['code':("spring.security.ui.login.rememberme")],-1)
printHtmlPart(9)
createTagBody(2, {->
invokeTag('message','g',34,['code':("spring.security.ui.login.forgotPassword")],-1)
})
invokeTag('link','g',34,['controller':("register"),'action':("forgotPassword")],2)
printHtmlPart(10)
invokeTag('linkButton','s2ui',40,['elementId':("register"),'controller':("register"),'messageCode':("spring.security.ui.login.register")],-1)
printHtmlPart(11)
invokeTag('submitButton','s2ui',41,['elementId':("loginButton"),'form':("loginForm"),'messageCode':("spring.security.ui.login.login")],-1)
printHtmlPart(12)
invokeTag('initCheckboxes','s2ui',56,[:],-1)
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',60,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264358L
public static final String DEFAULT_CODEC = null
}
