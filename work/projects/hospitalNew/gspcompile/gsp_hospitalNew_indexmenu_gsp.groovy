import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_indexmenu_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index/menu.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(createLink(uri: '/'))
printHtmlPart(1)
loop:{
int i = 0
for( infoTypeInstance in (infoTypeInstanceList) ) {
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(3)
codecOut.print(infoTypeInstance.name)
printHtmlPart(4)
})
invokeTag('link','g',9,['controller':("infoType"),'action':("show"),'id':(infoTypeInstance.id)],2)
printHtmlPart(5)
i++
}
}
printHtmlPart(6)
createClosureForHtmlPart(7, 1)
invokeTag('link','g',14,['controller':("feedBack")],1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1351609039457L
public static final String DEFAULT_CODEC = null
}
