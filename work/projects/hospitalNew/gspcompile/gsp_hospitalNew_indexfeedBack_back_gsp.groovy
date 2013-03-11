import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_indexfeedBack_back_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index/feedBack-back.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createClosureForHtmlPart(1, 1)
invokeTag('link','g',11,['controller':("feedBack"),'action':("list")],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
codecOut.print(resource(dir: 'images', file: 'more.gif'))
printHtmlPart(4)
})
invokeTag('link','g',16,['controller':("feedBack"),'action':("list")],1)
printHtmlPart(5)
loop:{
int i = 0
for( feedBackInstance in (feedBackInstanceList) ) {
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
codecOut.print(feedBackInstance?.unitName.length()>5?feedBackInstance?.unitName.substring(0,5)+'..':feedBackInstance?.unitName)
printHtmlPart(8)
codecOut.print(feedBackInstance?.comment.length()>15?feedBackInstance?.comment.substring(0,15)+'..':feedBackInstance?.comment)
printHtmlPart(9)
})
invokeTag('link','g',33,['controller':("feedBack"),'action':("show"),'id':(feedBackInstance.id)],2)
printHtmlPart(10)
i++
}
}
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1347457350467L
public static final String DEFAULT_CODEC = null
}
