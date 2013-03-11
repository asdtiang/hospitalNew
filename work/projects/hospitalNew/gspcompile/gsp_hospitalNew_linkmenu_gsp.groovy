import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_linkmenu_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/link/menu.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int i = 0
for( linkInstance in (linkInstanceList) ) {
printHtmlPart(1)
codecOut.print(linkInstance.address)
printHtmlPart(2)
codecOut.print(fieldValue(bean: linkInstance, field: "showTitle"))
printHtmlPart(3)
i++
}
}
printHtmlPart(4)
createClosureForHtmlPart(5, 1)
invokeTag('link','g',9,['controller':("login")],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',14,['controller':("index"),'action':("admin")],2)
printHtmlPart(4)
})
invokeTag('ifAllGranted','sec',15,['roles':("ROLE_ADMIN")],1)
printHtmlPart(8)
createClosureForHtmlPart(9, 1)
invokeTag('link','g',24,['controller':("info"),'action':("show"),'id':("12")],1)
codecOut.print(application.configMap?.ICP)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1353852870330L
public static final String DEFAULT_CODEC = null
}
