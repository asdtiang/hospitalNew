import com.sjzsqjy.www.data.trace.TraceUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_traceUsershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/traceUser/show.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("admin")],-1)
printHtmlPart(3)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'traceUser.label', default: 'TraceUser'))],-1)
printHtmlPart(3)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(6)
codecOut.print(createLink(uri: '/'))
printHtmlPart(7)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("list")],2)
printHtmlPart(9)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(10)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
codecOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
if(true && (traceUserInstance?.sex)) {
printHtmlPart(15)
invokeTag('message','g',28,['code':("traceUser.sex.label"),'default':("Sex")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',30,['bean':(traceUserInstance),'field':("sex")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (traceUserInstance?.ageInfo)) {
printHtmlPart(19)
invokeTag('message','g',37,['code':("traceUser.ageInfo.label"),'default':("Age Info")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',39,['bean':(traceUserInstance),'field':("ageInfo")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (traceUserInstance?.sendDoctor)) {
printHtmlPart(21)
invokeTag('message','g',46,['code':("traceUser.sendDoctor.label"),'default':("Send Doctor")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',48,['bean':(traceUserInstance),'field':("sendDoctor")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (traceUserInstance?.clinic)) {
printHtmlPart(23)
invokeTag('message','g',55,['code':("traceUser.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(24)
createTagBody(3, {->
printHtmlPart(25)
codecOut.print(traceUserInstance?.clinic?.name?.encodeAsHTML())
})
invokeTag('link','g',58,['controller':("clinic"),'action':("show"),'id':(traceUserInstance?.clinic?.id)],3)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (traceUserInstance?.date)) {
printHtmlPart(26)
invokeTag('message','g',65,['code':("traceUser.date.label"),'default':("Date")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',67,['bean':(traceUserInstance),'field':("date")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (traceUserInstance?.doctor)) {
printHtmlPart(28)
invokeTag('message','g',74,['code':("traceUser.doctor.label"),'default':("Doctor")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',76,['bean':(traceUserInstance),'field':("doctor")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (traceUserInstance?.keShi)) {
printHtmlPart(30)
invokeTag('message','g',83,['code':("traceUser.keShi.label"),'default':("Ke Shi")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',85,['bean':(traceUserInstance),'field':("keShi")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (traceUserInstance?.name)) {
printHtmlPart(32)
invokeTag('message','g',92,['code':("traceUser.name.label"),'default':("Name")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',94,['bean':(traceUserInstance),'field':("name")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (traceUserInstance?.sampleId)) {
printHtmlPart(34)
invokeTag('message','g',101,['code':("traceUser.sampleId.label"),'default':("Sample Id")],-1)
printHtmlPart(35)
invokeTag('fieldValue','g',103,['bean':(traceUserInstance),'field':("sampleId")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (traceUserInstance?.type)) {
printHtmlPart(36)
invokeTag('message','g',110,['code':("traceUser.type.label"),'default':("Type")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',112,['bean':(traceUserInstance),'field':("type")],-1)
printHtmlPart(17)
}
printHtmlPart(38)
createTagBody(2, {->
printHtmlPart(39)
invokeTag('hiddenField','g',120,['name':("id"),'value':(traceUserInstance?.id)],-1)
printHtmlPart(40)
createTagBody(3, {->
invokeTag('message','g',121,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',121,['class':("edit"),'action':("edit"),'id':(traceUserInstance?.id)],3)
printHtmlPart(40)
invokeTag('actionSubmit','g',122,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(41)
})
invokeTag('form','g',124,[:],2)
printHtmlPart(42)
})
invokeTag('captureBody','sitemesh',126,[:],1)
printHtmlPart(43)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345214518661L
public static final String DEFAULT_CODEC = null
}
