import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_indexcheckService_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index/checkService.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createClosureForHtmlPart(1, 1)
invokeTag('link','g',3,['controller':("infoType"),'action':("show"),'id':("2"),'title':("更多${com.sjzsqjy.www.site.InfoType.get('2')?.name}")],1)
printHtmlPart(2)
for( i in (infoList) ) {
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
invokeTag('formatDate','g',7,['format':("yyyy-MM-dd"),'date':(i.dateCreated)],-1)
printHtmlPart(5)
codecOut.print(i.title)
})
invokeTag('link','g',7,['controller':("info"),'action':("show"),'id':(i.id)],2)
printHtmlPart(6)
}
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1351779999368L
public static final String DEFAULT_CODEC = null
}
