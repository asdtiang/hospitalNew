import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_layoutsadmin_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/admin.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("Author"),'content':("asdtiang-QQ:250753635")],-1)
printHtmlPart(4)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',18,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',18,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',18,[:],2)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(5)
codecOut.print(resource(dir: 'images', file: 'favicon.ico'))
printHtmlPart(6)
codecOut.print(resource(dir: 'images', file: 'apple-touch-icon.png'))
printHtmlPart(7)
codecOut.print(resource(dir: 'images', file: 'apple-touch-icon-retina.png'))
printHtmlPart(8)
codecOut.print(resource(dir: 'css', file: 'admin.css'))
printHtmlPart(9)
codecOut.print(resource(dir: 'css', file: 'mobile.css'))
printHtmlPart(10)
invokeTag('layoutHead','g',24,[:],-1)
printHtmlPart(3)
invokeTag('layoutResources','r',24,[:],-1)
printHtmlPart(3)
invokeTag('resources','jq',25,[:],-1)
printHtmlPart(11)
})
invokeTag('captureHead','sitemesh',25,[:],1)
printHtmlPart(12)
createTagBody(1, {->
printHtmlPart(13)
codecOut.print(resource(dir: '/'))
printHtmlPart(14)
codecOut.print(resource(dir: 'images', file: 'grails_logo.png'))
printHtmlPart(15)
createClosureForHtmlPart(16, 2)
invokeTag('link','g',32,['controller':("index"),'action':("staIndex")],2)
printHtmlPart(17)
invokeTag('layoutBody','g',32,[:],-1)
printHtmlPart(18)
invokeTag('message','g',40,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(19)
invokeTag('layoutResources','r',40,[:],-1)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',41,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1342794243029L
public static final String DEFAULT_CODEC = null
}
