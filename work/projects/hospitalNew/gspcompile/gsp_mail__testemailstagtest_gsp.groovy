import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='mail', version='1.0.1')
class gsp_mail__testemailstagtest_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/mail-1.0.1/grails-app/views/_testemails/tagtest.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (condition)) {
printHtmlPart(1)
}
printHtmlPart(0)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/plain'
public static final long LAST_MODIFIED = 1294077116000L
public static final String DEFAULT_CODEC = null
}
