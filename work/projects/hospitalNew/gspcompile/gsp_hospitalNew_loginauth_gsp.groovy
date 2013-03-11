import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_loginauth_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/auth.gsp" }
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
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('javascript','g',7,['library':("jquery"),'plugin':("jquery")],-1)
printHtmlPart(2)
invokeTag('resources','jqui',8,[:],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(1)
if(true && (flash.message)) {
printHtmlPart(3)
codecOut.print(flash.message)
printHtmlPart(4)
}
printHtmlPart(5)
codecOut.print(postUrl)
printHtmlPart(6)
codecOut.print(rememberMeParameter)
printHtmlPart(7)
invokeTag('message','g',36,['code':("spring.security.ui.login.rememberme")],-1)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',37,['code':("spring.security.ui.login.forgotPassword")],-1)
})
invokeTag('link','g',37,['controller':("register"),'action':("forgotPassword")],2)
printHtmlPart(9)
createClosureForHtmlPart(10, 2)
invokeTag('link','g',40,['controller':("register")],2)
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',45,[:],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1353244086760L
public static final String DEFAULT_CODEC = null
}
