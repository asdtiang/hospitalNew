import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',13,[:],-1)
printHtmlPart(3)
codecOut.print(application.configMap?.siteName)
})
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(4)
codecOut.print(resource(dir: 'css', file: 'css.css'))
printHtmlPart(5)
codecOut.print(resource(dir: 'images', file: 'favicon.ico'))
printHtmlPart(6)
invokeTag('layoutHead','g',15,[:],-1)
printHtmlPart(2)
invokeTag('javascript','g',16,['library':("application")],-1)
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',17,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(2)
createClosureForHtmlPart(9, 3)
invokeTag('link','g',24,['controller':("login"),'action':("loginAfter")],3)
printHtmlPart(10)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',26,['controller':("logout")],3)
printHtmlPart(2)
})
invokeTag('ifLoggedIn','sec',26,[:],2)
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',28,['controller':("login")],3)
printHtmlPart(14)
createClosureForHtmlPart(15, 3)
invokeTag('link','g',29,['controller':("register")],3)
printHtmlPart(16)
})
invokeTag('ifNotLoggedIn','sec',30,[:],2)
printHtmlPart(17)
codecOut.print(application.configMap?.siteName)
printHtmlPart(18)
codecOut.print(application.configMap?.contactTel)
printHtmlPart(19)
invokeTag('include','g',37,['controller':("index"),'action':("menu")],-1)
printHtmlPart(20)
invokeTag('layoutBody','g',41,[:],-1)
printHtmlPart(21)
invokeTag('include','g',45,['controller':("link"),'action':("menu")],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',48,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1353852837359L
public static final String DEFAULT_CODEC = null
}
