import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_indexfeedBack_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index/feedBack.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createClosureForHtmlPart(2, 1)
invokeTag('link','g',9,['controller':("feedBack"),'action':("list")],1)
printHtmlPart(3)
loop:{
int i = 0
for( feedBackInstance in (feedBackInstanceList) ) {
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
codecOut.print(feedBackInstance?.unitName.length()>5?feedBackInstance?.unitName.substring(0,5)+'..':feedBackInstance?.unitName)
printHtmlPart(5)
codecOut.print(feedBackInstance?.comment.length()>15?feedBackInstance?.comment.substring(0,15)+'..':feedBackInstance?.comment)
printHtmlPart(6)
})
invokeTag('link','g',18,['controller':("feedBack"),'action':("show"),'id':(feedBackInstance.id)],2)
printHtmlPart(7)
i++
}
}
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352122150797L
public static final String DEFAULT_CODEC = null
}
