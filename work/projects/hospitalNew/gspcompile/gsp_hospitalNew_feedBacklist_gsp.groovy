import com.sjzsqjy.www.site.FeedBack
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_feedBacklist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/feedBack/list.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'feedBack.label', default: 'FeedBack'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
codecOut.print(resource(dir: 'images', file: 'flash2.jpg'))
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
codecOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
invokeTag('include','g',19,['controller':("index"),'action':("siteNotice")],-1)
printHtmlPart(10)
invokeTag('include','g',20,['controller':("index"),'action':("feedBack")],-1)
printHtmlPart(11)
codecOut.print(resource(dir: 'images', file: 'web_31.jpg'))
printHtmlPart(12)
codecOut.print(createLink(uri: '/'))
printHtmlPart(13)
createClosureForHtmlPart(14, 2)
invokeTag('link','g',25,['controller':("feedBack"),'action':("create")],2)
printHtmlPart(15)
loop:{
int i = 0
for( feedBackInstance in (feedBackInstanceList) ) {
printHtmlPart(16)
invokeTag('formatDate','g',37,['format':("yyyy-MM-dd"),'date':(feedBackInstance.dateCreated)],-1)
printHtmlPart(17)
codecOut.print(feedBackInstance?.unitName)
printHtmlPart(18)
codecOut.print(feedBackInstance?.unitName.length()>10?feedBackInstance?.unitName.substring(0,10)+'..':feedBackInstance?.unitName)
printHtmlPart(19)
codecOut.print(feedBackInstance?.comment)
printHtmlPart(18)
codecOut.print(feedBackInstance?.comment.length()>30?feedBackInstance?.comment.substring(0,30)+'..':feedBackInstance?.comment)
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',53,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1353248775668L
public static final String DEFAULT_CODEC = null
}
