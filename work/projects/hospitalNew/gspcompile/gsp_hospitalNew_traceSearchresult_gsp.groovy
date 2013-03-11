import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_traceSearchresult_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/traceSearch/result.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
codecOut.print(resource(dir:'css',file:'main.css'))
printHtmlPart(3)
codecOut.print(resource(dir:'images',file:'favicon.ico'))
printHtmlPart(4)
invokeTag('set','g',10,['var':("entityName"),'value':(message(code: 'reslut.label', default: 'ItemType'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',11,['code':("site.name"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',47,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(6)
invokeTag('message','g',56,['code':("serial.number"),'default':("Symbol")],-1)
printHtmlPart(7)
codecOut.print(patient?.sampleId)
printHtmlPart(8)
invokeTag('message','g',58,['code':("name.label"),'default':("Symbol")],-1)
printHtmlPart(7)
codecOut.print(patient?.name)
printHtmlPart(8)
invokeTag('message','g',60,['code':("age.label"),'default':("Symbol")],-1)
printHtmlPart(7)
codecOut.print(patient?.ageInfo)
printHtmlPart(8)
invokeTag('message','g',62,['code':("sex.label"),'default':("Symbol")],-1)
printHtmlPart(7)
codecOut.print(patient?.sex)
printHtmlPart(9)
invokeTag('message','g',66,['code':("send.dep.label"),'default':("Symbol")],-1)
printHtmlPart(7)
codecOut.print(patient?.keShi)
printHtmlPart(8)
invokeTag('message','g',68,['code':("sample.label"),'default':("Symbol")],-1)
printHtmlPart(7)
codecOut.print(patient?.type)
printHtmlPart(8)
invokeTag('message','g',70,['code':("hospital.no.label"),'default':("Symbol")],-1)
printHtmlPart(10)
invokeTag('message','g',72,['code':("send.doctor.label"),'default':("Symbol")],-1)
printHtmlPart(7)
codecOut.print(patient?.sendDoctor)
printHtmlPart(11)
invokeTag('message','g',84,['code':("trace.label")],-1)
printHtmlPart(12)
invokeTag('message','g',86,['code':("test.value.label")],-1)
printHtmlPart(12)
invokeTag('message','g',88,['code':("unit1.label")],-1)
printHtmlPart(13)
invokeTag('message','g',89,['code':("child.label")],-1)
printHtmlPart(13)
invokeTag('message','g',90,['code':("adult.label")],-1)
printHtmlPart(14)
loop:{
int i = 0
for( resultInstance in (resultList) ) {
printHtmlPart(15)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(16)
codecOut.print(fieldValue(bean: resultInstance, field: "name"))
printHtmlPart(17)
codecOut.print(fieldValue(bean: resultInstance, field: "result"))
printHtmlPart(17)
codecOut.print(fieldValue(bean: resultInstance, field: "unit"))
printHtmlPart(17)
codecOut.print(fieldValue(bean: resultInstance, field: "child"))
printHtmlPart(17)
codecOut.print(fieldValue(bean: resultInstance, field: "adult"))
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('message','g',129,['code':("test.doctor")],-1)
printHtmlPart(20)
codecOut.print(patient?.doctor)
printHtmlPart(21)
invokeTag('message','g',135,['code':("test.time.label")],-1)
printHtmlPart(20)
codecOut.print(patient?.date)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',152,['id':("body")],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345215772800L
public static final String DEFAULT_CODEC = null
}
