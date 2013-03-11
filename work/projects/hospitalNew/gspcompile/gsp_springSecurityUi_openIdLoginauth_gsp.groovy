import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='spring-security-ui', version='0.2')
class gsp_springSecurityUi_openIdLoginauth_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/spring-security-ui-0.2/grails-app/views/openIdLogin/auth.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(3)
codecOut.print(resource(dir:'css',file:'reset.css',plugin:'spring-security-ui'))
printHtmlPart(4)
codecOut.print(resource(dir:'css',file:'spring-security-ui.css',plugin:'spring-security-ui'))
printHtmlPart(4)
codecOut.print(resource(dir:'css',file:'auth.css',plugin:'spring-security-ui'))
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
codecOut.print(postUrl)
printHtmlPart(8)
invokeTag('textField','g',17,['name':("openid_identifier"),'class':("text_")],-1)
printHtmlPart(9)
})
invokeTag('captureBody','sitemesh',30,[:],1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1332861666265L
public static final String DEFAULT_CODEC = null
}
