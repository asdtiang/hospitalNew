import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_shiQiaoUserlistByClinicId_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/shiQiaoUser/listByClinicId.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
invokeTag('message','g',14,['code':("shiQiaoUser.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('message','g',15,['code':("shiQiaoUser.sex.label"),'default':("sex")],-1)
printHtmlPart(3)
invokeTag('message','g',16,['code':("shiQiaoUser.birth.label"),'default':("birth")],-1)
printHtmlPart(3)
invokeTag('message','g',18,['code':("shiQiaoUser.date.label"),'default':("Date")],-1)
printHtmlPart(4)
loop:{
int i = 0
for( shiQiaoUser in (dataList) ) {
printHtmlPart(5)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(6)
createTagBody(2, {->
codecOut.print(shiQiaoUser[1])
})
invokeTag('link','g',22,['controller':("shiQiaoSearch"),'action':("resultById"),'id':(shiQiaoUser[0])],2)
printHtmlPart(7)
codecOut.print(shiQiaoUser[2])
printHtmlPart(7)
codecOut.print(shiQiaoUser[3])
printHtmlPart(7)
codecOut.print(shiQiaoUser[4])
printHtmlPart(8)
i++
}
}
printHtmlPart(9)
invokeTag('jquery','paginate',28,['update':("shiQiaolist"),'total':(dataTotal),'selectMax':("15")],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1353248382735L
public static final String DEFAULT_CODEC = null
}
