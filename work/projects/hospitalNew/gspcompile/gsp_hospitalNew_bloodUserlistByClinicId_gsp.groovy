import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_bloodUserlistByClinicId_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bloodUser/listByClinicId.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
invokeTag('message','g',12,['code':("bloodUser.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('message','g',14,['code':("bloodUser.sex.label"),'default':("sex")],-1)
printHtmlPart(2)
invokeTag('message','g',15,['code':("bloodUser.age.label"),'default':("Brith")],-1)
printHtmlPart(2)
invokeTag('message','g',17,['code':("bloodUser.testDate.label"),'default':("sampleId")],-1)
printHtmlPart(3)
loop:{
int i = 0
for( bloodUser in (dataList) ) {
printHtmlPart(4)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(5)
createTagBody(2, {->
codecOut.print(bloodUser[1].substring(bloodUser[1].indexOf("：")+1,bloodUser[1].length()))
})
invokeTag('link','g',22,['controller':("bloodUser"),'action':("resultById"),'id':(bloodUser[0])],2)
printHtmlPart(6)
codecOut.print(bloodUser[2].substring(bloodUser[2].indexOf("：")+1,bloodUser[2].length()))
printHtmlPart(6)
codecOut.print(bloodUser[3].substring(bloodUser[3].indexOf("：")+1,bloodUser[3].length()))
printHtmlPart(6)
codecOut.print(bloodUser[4].substring(bloodUser[4].indexOf("：")+1,bloodUser[4].length()))
printHtmlPart(7)
i++
}
}
printHtmlPart(8)
invokeTag('jquery','paginate',26,['update':("bloodList"),'total':(dataTotal),'selectMax':("15")],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1353248510109L
public static final String DEFAULT_CODEC = null
}
