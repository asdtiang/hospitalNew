import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_shiQiaoSearchresult_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/shiQiaoSearch/result.gsp" }
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
invokeTag('message','g',23,['code':("name.label"),'default':("Symbol")],-1)
printHtmlPart(6)
codecOut.print(patient?.name)
printHtmlPart(7)
invokeTag('message','g',27,['code':("sex.label"),'default':("Symbol")],-1)
printHtmlPart(6)
codecOut.print(patient?.sex)
printHtmlPart(8)
invokeTag('message','g',31,['code':("age.label"),'default':("Symbol")],-1)
printHtmlPart(9)
invokeTag('message','g',33,['code':("sample.no.label"),'default':("Symbol")],-1)
printHtmlPart(6)
codecOut.print(patient?.sampleId)
printHtmlPart(10)
invokeTag('message','g',39,['code':("patient.no.label"),'default':("Symbol")],-1)
printHtmlPart(9)
invokeTag('message','g',41,['code':("section.label"),'default':("Symbol")],-1)
printHtmlPart(11)
invokeTag('message','g',43,['code':("bed.no.label"),'default':("Symbol")],-1)
printHtmlPart(9)
invokeTag('message','g',45,['code':("send.doctor.label"),'default':("Symbol")],-1)
printHtmlPart(12)
invokeTag('message','g',57,['code':("item.code.label")],-1)
printHtmlPart(13)
invokeTag('message','g',60,['code':("item.name.label")],-1)
printHtmlPart(13)
invokeTag('message','g',63,['code':("result.label")],-1)
printHtmlPart(14)
invokeTag('message','g',66,['code':("sample.value.label")],-1)
printHtmlPart(15)
invokeTag('message','g',70,['code':("unit.label")],-1)
printHtmlPart(16)
loop:{
int i = 0
for( resultInstance in (resultList) ) {
printHtmlPart(17)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(18)
codecOut.print(fieldValue(bean: resultInstance, field: "code"))
printHtmlPart(19)
codecOut.print(fieldValue(bean: resultInstance, field: "name"))
printHtmlPart(19)
codecOut.print(fieldValue(bean: resultInstance, field: "value"))
printHtmlPart(20)
if(true && (resultInstance.isNormal==-1)) {
printHtmlPart(21)
}
printHtmlPart(22)
if(true && (resultInstance.isNormal==1)) {
printHtmlPart(23)
}
printHtmlPart(24)
if(true && (resultInstance.low!=resultInstance.hight)) {
printHtmlPart(22)
codecOut.print(fieldValue(bean: resultInstance, field: "low"))
printHtmlPart(25)
codecOut.print(fieldValue(bean: resultInstance, field: "hight"))
}
printHtmlPart(26)
codecOut.print(fieldValue(bean: resultInstance, field: "unit"))
printHtmlPart(27)
invokeTag('set','g',98,['var':("counter"),'value':(i)],-1)
printHtmlPart(28)
i++
}
}
printHtmlPart(29)
if(true && (counter>15)) {
printHtmlPart(30)
codecOut.print(createLinkTo(dir: 'uploads/pic/', file:patient.date+'/1-'+patient.sampleId+'-CWBC.bmp'))
printHtmlPart(31)
codecOut.print(createLinkTo(dir: 'uploads/pic/', file:patient.date+'/1-'+patient.sampleId+'-CRBC.bmp'))
printHtmlPart(32)
codecOut.print(createLinkTo(dir: 'uploads/pic/', file:patient.date+'/1-'+patient.sampleId+'-CPLT.bmp'))
printHtmlPart(33)
}
printHtmlPart(34)
invokeTag('message','g',121,['code':("send.date.label"),'default':("Symbol")],-1)
printHtmlPart(6)
codecOut.print(patient?.date)
printHtmlPart(8)
invokeTag('message','g',125,['code':("test.date.label"),'default':("Symbol")],-1)
printHtmlPart(6)
codecOut.print(patient?.date)
printHtmlPart(8)
invokeTag('message','g',129,['code':("test.doctor.label"),'default':("Symbol")],-1)
printHtmlPart(6)
codecOut.print(doctor?.name)
printHtmlPart(8)
invokeTag('message','g',133,['code':("check.doctor.label"),'default':("Symbol")],-1)
printHtmlPart(35)
invokeTag('message','g',140,['code':("result.issue.label"),'default':("Symbol")],-1)
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',152,[:],1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345866040980L
public static final String DEFAULT_CODEC = null
}
