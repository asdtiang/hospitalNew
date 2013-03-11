import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_sampleUserlistByClinicId_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/sampleUser/listByClinicId.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
invokeTag('message','g',17,['code':("sampleUser.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('message','g',19,['code':("sampleUser.sex.label"),'default':("sex")],-1)
printHtmlPart(3)
invokeTag('message','g',22,['code':("sampleUser.age.label"),'default':("Brith")],-1)
printHtmlPart(2)
invokeTag('message','g',24,['code':("sampleUser.sampleId.label"),'default':("sampleId")],-1)
printHtmlPart(4)
loop:{
int i = 0
for( sampleUser in (dataList) ) {
printHtmlPart(5)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(6)
createTagBody(2, {->
codecOut.print(sampleUser[1])
})
invokeTag('link','g',27,['controller':("sampleSearch"),'action':("resultById"),'id':(sampleUser[0])],2)
printHtmlPart(7)
codecOut.print(sampleUser[2])
printHtmlPart(7)
codecOut.print(sampleUser[3])
printHtmlPart(7)
codecOut.print(sampleUser[4])
printHtmlPart(8)
i++
}
}
printHtmlPart(9)
invokeTag('jquery','paginate',32,['update':("samplelist"),'total':(dataTotal),'selectMax':("15")],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1353248325174L
public static final String DEFAULT_CODEC = null
}
