import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_customDatashowByClinic_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/customData/showByClinic.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
loop:{
int i = 0
for( customData in (dataList) ) {
printHtmlPart(2)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(3)
createTagBody(2, {->
codecOut.print(customData[1])
})
invokeTag('link','g',22,['action':("show"),'id':(customData[0])],2)
printHtmlPart(4)
codecOut.print(customData[2])
printHtmlPart(5)
i++
}
}
printHtmlPart(6)
invokeTag('jquery','paginate',27,['update':("customDataDiv"),'total':(dataTotal),'selectMax':("15")],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1365688693658L
public static final String DEFAULT_CODEC = null
}
