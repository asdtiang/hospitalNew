import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_staresult_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/sta/result.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
createClosureForHtmlPart(0, 1)
invokeTag('captureHead','sitemesh',13,[:],1)
printHtmlPart(1)
codecOut.print(clinicName)
printHtmlPart(2)
codecOut.print(month)
printHtmlPart(3)
invokeTag('message','g',23,['code':("data.date.label"),'default':("date")],-1)
printHtmlPart(4)
invokeTag('message','g',24,['code':("data.name.label"),'default':("name")],-1)
printHtmlPart(5)
invokeTag('message','g',27,['code':("data.item.label"),'default':("Item")],-1)
printHtmlPart(6)
invokeTag('message','g',29,['code':("data.money.label"),'default':("money")],-1)
printHtmlPart(7)
loop:{
int i = 0
for( dataInstance in (dataList) ) {
printHtmlPart(8)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(9)
invokeTag('formatDate','g',41,['format':("yyyy-MM-dd"),'date':(dataInstance.date)],-1)
printHtmlPart(10)
codecOut.print(fieldValue(bean: dataInstance, field: "name"))
printHtmlPart(11)
codecOut.print(dataInstance?.item)
printHtmlPart(12)
codecOut.print(fieldValue(bean: dataInstance, field: "money"))
printHtmlPart(13)
i++
}
}
printHtmlPart(14)
codecOut.print(sum)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264501L
public static final String DEFAULT_CODEC = null
}
