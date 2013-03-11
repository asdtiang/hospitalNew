import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_indexlogin_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index/login.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',4,['code':("site.name"),'args':(['首页'])],-1)
})
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',57,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',60,['code':("site.name"),'args':(['首页'])],-1)
printHtmlPart(4)
createClosureForHtmlPart(5, 2)
invokeTag('link','g',63,['controller':("login")],2)
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',65,['controller':("logout")],2)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
createClosureForHtmlPart(10, 3)
invokeTag('link','g',70,['controller':("hosUser")],3)
printHtmlPart(11)
createClosureForHtmlPart(12, 3)
invokeTag('link','g',72,['controller':("hosRequestMap")],3)
printHtmlPart(13)
})
invokeTag('ifAllGranted','sec',73,['roles':("ROLE_ADMIN")],2)
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',78,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121372806L
public static final String DEFAULT_CODEC = null
}
