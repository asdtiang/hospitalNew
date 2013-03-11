import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNewindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',14,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
codecOut.print(resource(dir: 'images', file: 'web_10.jpg'))
printHtmlPart(6)
invokeTag('include','g',20,['controller':("index"),'action':("hospitalDesc")],-1)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',26,['controller':("infoType"),'action':("show"),'id':("3"),'title':("更多${com.sjzsqjy.www.site.InfoType.get('3')?.name}")],2)
printHtmlPart(9)
invokeTag('include','g',29,['controller':("index"),'action':("scroll")],-1)
printHtmlPart(10)
invokeTag('include','g',38,['controller':("index"),'action':("checkService")],-1)
printHtmlPart(11)
invokeTag('include','g',41,['controller':("index"),'action':("indexNews")],-1)
printHtmlPart(12)
invokeTag('include','g',48,['controller':("index"),'action':("siteNotice")],-1)
printHtmlPart(2)
invokeTag('include','g',49,['controller':("index"),'action':("feedBack")],-1)
printHtmlPart(13)
})
invokeTag('captureBody','sitemesh',53,[:],1)
printHtmlPart(14)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352904933010L
public static final String DEFAULT_CODEC = null
}
