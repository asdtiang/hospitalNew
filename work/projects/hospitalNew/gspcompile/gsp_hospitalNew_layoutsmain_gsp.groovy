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
codecOut.print(resource(dir: 'js', file: 'tb.js'))
printHtmlPart(5)
codecOut.print(resource(dir: 'css', file: 'css.css'))
printHtmlPart(6)
codecOut.print(resource(dir: 'images', file: 'favicon.ico'))
printHtmlPart(7)
invokeTag('layoutHead','g',16,[:],-1)
printHtmlPart(2)
invokeTag('resources','jq',17,[:],-1)
printHtmlPart(8)
invokeTag('resources','paginate',18,[:],-1)
printHtmlPart(9)
})
invokeTag('captureHead','sitemesh',18,[:],1)
printHtmlPart(9)
createTagBody(1, {->
printHtmlPart(10)
codecOut.print(application.configMap?.siteName)
printHtmlPart(11)
codecOut.print(application.configMap?.siteName)
printHtmlPart(12)
codecOut.print(application.configMap?.contactTel)
printHtmlPart(13)
createTagBody(2, {->
printHtmlPart(14)
createClosureForHtmlPart(15, 3)
invokeTag('link','g',35,['controller':("login"),'action':("loginAfter")],3)
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',38,['controller':("logout")],3)
printHtmlPart(18)
})
invokeTag('ifLoggedIn','sec',38,[:],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(2)
invokeTag('include','g',39,['controller':("login"),'action':("authIndex")],-1)
printHtmlPart(9)
})
invokeTag('ifNotLoggedIn','sec',39,[:],2)
printHtmlPart(19)
invokeTag('include','g',45,['controller':("index"),'action':("menu")],-1)
printHtmlPart(20)
invokeTag('layoutBody','g',49,[:],-1)
printHtmlPart(21)
invokeTag('include','g',53,['controller':("link"),'action':("menu")],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',56,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1365688654801L
public static final String DEFAULT_CODEC = null
}
