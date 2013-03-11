import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_indexscroll_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index/scroll.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
for( i in (infoTypeInstance.info) ) {
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(2)
codecOut.print(createLinkTo(dir: 'images/info', file: i.id + '.jpg'))
printHtmlPart(3)
codecOut.print(createLinkTo(dir: 'images/info', file: 'default.jpg'))
printHtmlPart(4)
})
invokeTag('link','g',9,['controller':("info"),'action':("show"),'id':(i.id)],2)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
if(true && (i.title.length()>10)) {
printHtmlPart(7)
codecOut.print(i?.title?.subSequence(0,10)?.encodeAsHTML())
printHtmlPart(8)
}
else {
printHtmlPart(7)
codecOut.print(i?.title?.encodeAsHTML())
printHtmlPart(6)
}
printHtmlPart(9)
})
invokeTag('link','g',20,['controller':("info"),'action':("show"),'id':(i.id)],2)
printHtmlPart(10)
}
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1351778785001L
public static final String DEFAULT_CODEC = null
}
