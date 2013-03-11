import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_layoutssta_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/sta.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',4,['default':("数据统计--石家庄社区检验网")],-1)
})
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("Author"),'content':("asdtiang-QQ:250753635")],-1)
printHtmlPart(2)
codecOut.print(resource(dir: 'css', file: 'sta.css'))
printHtmlPart(3)
codecOut.print(resource(dir: 'images', file: 'favicon.ico'))
printHtmlPart(4)
invokeTag('layoutResources','r',9,[:],-1)
printHtmlPart(1)
invokeTag('resources','jq',10,[:],-1)
printHtmlPart(1)
invokeTag('layoutHead','g',11,[:],-1)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
codecOut.print(resource(dir: '/'))
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
if(true && (session.shopName==null)) {
printHtmlPart(9)
}
else {
printHtmlPart(10)
codecOut.print(session?.shopName)
printHtmlPart(11)
}
printHtmlPart(5)
})
invokeTag('link','g',22,['style':("text-align:center;margin-top:20px;"),'controller':("shop"),'action':("shopInit")],2)
printHtmlPart(5)
invokeTag('layoutBody','g',23,[:],-1)
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',25,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1342794270369L
public static final String DEFAULT_CODEC = null
}
