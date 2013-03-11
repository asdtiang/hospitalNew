import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_traceUserlistByClinicId_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/traceUser/listByClinicId.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
invokeTag('message','g',12,['code':("traceUser.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('message','g',14,['code':("traceUser.sex.label"),'default':("sex")],-1)
printHtmlPart(2)
invokeTag('message','g',15,['code':("traceUser.ageInfo.label"),'default':("ageInfo")],-1)
printHtmlPart(2)
invokeTag('message','g',17,['code':("traceUser.date.label"),'default':("date")],-1)
printHtmlPart(3)
loop:{
int i = 0
for( traceUser in (dataList) ) {
printHtmlPart(4)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(5)
createTagBody(2, {->
codecOut.print(traceUser[1])
})
invokeTag('link','g',21,['controller':("traceSearch"),'action':("resultById"),'id':(traceUser[0])],2)
printHtmlPart(6)
codecOut.print(traceUser[2])
printHtmlPart(6)
codecOut.print(traceUser[3])
printHtmlPart(6)
codecOut.print(traceUser[4])
printHtmlPart(7)
i++
}
}
printHtmlPart(8)
invokeTag('jquery','paginate',27,['update':("traceList"),'total':(dataTotal),'selectMax':("15")],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1353248510087L
public static final String DEFAULT_CODEC = null
}
