import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_staindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/sta/index.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',3,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("sta")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createClosureForHtmlPart(5, 2)
invokeTag('link','g',9,['class':("home"),'controller':("index"),'action':("staIndex")],2)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
codecOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('renderErrors','g',18,['bean':(dataInstance),'as':("list")],-1)
printHtmlPart(11)
})
invokeTag('hasErrors','g',20,['bean':(dataInstance)],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('message','g',28,['code':("data.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(13)
codecOut.print(hasErrors(bean: dataInstance, field: 'clinic', 'errors'))
printHtmlPart(14)
invokeTag('select','g',31,['name':("clinicId"),'from':(com.sjzsqjy.www.statistics.Clinic.list()),'optionKey':("id"),'optionValue':("name"),'value':(dataInstance?.clinic?.id)],-1)
printHtmlPart(15)
invokeTag('message','g',38,['code':("data.date.label"),'default':("Date")],-1)
printHtmlPart(13)
codecOut.print(hasErrors(bean: dataInstance, field: 'date', 'errors'))
printHtmlPart(14)
invokeTag('datePicker','g',41,['name':("date"),'precision':("month"),'value':(dataInstance?.date)],-1)
printHtmlPart(16)
})
invokeTag('form','g',51,['action':("staByClinic"),'target':("_blank"),'method':("post")],2)
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',53,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264498L
public static final String DEFAULT_CODEC = null
}
