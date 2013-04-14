import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_sampleSearchresult_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/sampleSearch/result.gsp" }
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
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('message','g',22,['code':("name.label"),'default':("Symbol")],-1)
printHtmlPart(6)
codecOut.print(patient?.name)
printHtmlPart(7)
invokeTag('message','g',24,['code':("age.label"),'default':("Symbol")],-1)
printHtmlPart(6)
codecOut.print(patient?.age)
printHtmlPart(7)
invokeTag('message','g',26,['code':("section.label"),'default':("Symbol")],-1)
printHtmlPart(8)
invokeTag('message','g',28,['code':("sample.type.label"),'default':("Symbol")],-1)
printHtmlPart(9)
invokeTag('message','g',31,['code':("sample.type.no.label"),'default':("Symbol")],-1)
printHtmlPart(6)
codecOut.print(patient?.sampleId)
printHtmlPart(10)
invokeTag('message','g',36,['code':("sex.label"),'default':("Symbol")],-1)
printHtmlPart(6)
codecOut.print(patient?.sex)
printHtmlPart(11)
invokeTag('message','g',40,['code':("send.doctor.label"),'default':("Symbol")],-1)
printHtmlPart(6)
codecOut.print(patient?.sendDoctor)
printHtmlPart(12)
codecOut.print(date)
printHtmlPart(13)
loop:{
int i = 0
for( resultInstance in (resultList) ) {
printHtmlPart(14)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(15)
codecOut.print(i+1)
printHtmlPart(16)
codecOut.print(fieldValue(bean: resultInstance, field: "code"))
printHtmlPart(17)
codecOut.print(fieldValue(bean: resultInstance, field: "name"))
printHtmlPart(17)
codecOut.print(fieldValue(bean: resultInstance, field: "value"))
printHtmlPart(18)
if(true && (resultInstance.isNormal==-1)) {
printHtmlPart(19)
}
printHtmlPart(6)
if(true && (resultInstance.isNormal==1)) {
printHtmlPart(20)
}
printHtmlPart(21)
codecOut.print(fieldValue(bean: resultInstance, field: "low"))
printHtmlPart(22)
codecOut.print(fieldValue(bean: resultInstance, field: "high"))
printHtmlPart(23)
if(true && (resultInstance.unit=='null')) {
}
else {
printHtmlPart(24)
codecOut.print(fieldValue(bean: resultInstance, field: "unit"))
printHtmlPart(25)
}
printHtmlPart(26)
i++
}
}
printHtmlPart(27)
codecOut.print(date)
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',121,['id':("body")],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1365350065710L
public static final String DEFAULT_CODEC = null
}
