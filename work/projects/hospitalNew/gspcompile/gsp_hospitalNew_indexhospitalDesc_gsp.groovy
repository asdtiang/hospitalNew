import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_indexhospitalDesc_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index/hospitalDesc.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(index1.content)
printHtmlPart(1)
createClosureForHtmlPart(2, 1)
invokeTag('link','g',2,['controller':("info"),'action':("show"),'id':("4")],1)
printHtmlPart(3)
createClosureForHtmlPart(4, 1)
invokeTag('link','g',1,['controller':("info"),'action':("show"),'id':("4")],1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1351609520130L
public static final String DEFAULT_CODEC = null
}
