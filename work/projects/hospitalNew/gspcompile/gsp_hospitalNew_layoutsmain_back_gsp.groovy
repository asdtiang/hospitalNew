import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_layoutsmain_back_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main-back.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',4,['default':("石家庄社区检验网")],-1)
})
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("Author"),'content':("asdtiang-QQ:250753635")],-1)
printHtmlPart(3)
codecOut.print(resource(dir: 'css', file: 'main.css'))
printHtmlPart(4)
codecOut.print(resource(dir: 'images', file: 'favicon.ico'))
printHtmlPart(5)
invokeTag('layoutHead','g',10,[:],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',11,[:],-1)
printHtmlPart(1)
invokeTag('javascript','g',12,['library':("application")],-1)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',44,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
codecOut.print(resource(dir: 'js', file: 'date.js'))
printHtmlPart(9)
codecOut.print(resource(dir: 'images', file: 'ten.jpg'))
printHtmlPart(10)
codecOut.print(createLink(uri: '/'))
printHtmlPart(11)
codecOut.print(createLink(uri: '/'))
printHtmlPart(12)
invokeTag('include','g',89,['controller':("login"),'action':("indexAuth1")],-1)
printHtmlPart(13)
invokeTag('include','g',91,['controller':("index"),'action':("menu")],-1)
printHtmlPart(14)
invokeTag('include','g',93,['controller':("index"),'action':("scrollNotice")],-1)
printHtmlPart(15)
invokeTag('layoutBody','g',95,[:],-1)
printHtmlPart(16)
invokeTag('include','g',98,['controller':("link"),'action':("menu")],-1)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',102,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264627L
public static final String DEFAULT_CODEC = null
}
