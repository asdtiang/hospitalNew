import com.sjzsqjy.www.data.blood.BloodUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_bloodUsershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bloodUser/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'bloodUser.label', default: 'BloodUser'))],-1)
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
if(true && (bloodUserInstance?.clinic)) {
printHtmlPart(15)
invokeTag('message','g',28,['code':("bloodUser.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(16)
createTagBody(3, {->
codecOut.print(bloodUserInstance?.clinic?.encodeAsHTML())
})
invokeTag('link','g',30,['controller':("clinic"),'action':("show"),'id':(bloodUserInstance?.clinic?.id)],3)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodUserInstance?.age)) {
printHtmlPart(19)
invokeTag('message','g',37,['code':("bloodUser.age.label"),'default':("Age")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',39,['bean':(bloodUserInstance),'field':("age")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodUserInstance?.bedNum)) {
printHtmlPart(21)
invokeTag('message','g',46,['code':("bloodUser.bedNum.label"),'default':("Bed Num")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',48,['bean':(bloodUserInstance),'field':("bedNum")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodUserInstance?.checkNum)) {
printHtmlPart(23)
invokeTag('message','g',55,['code':("bloodUser.checkNum.label"),'default':("Check Num")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',57,['bean':(bloodUserInstance),'field':("checkNum")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodUserInstance?.hospitalNum)) {
printHtmlPart(25)
invokeTag('message','g',64,['code':("bloodUser.hospitalNum.label"),'default':("Hospital Num")],-1)
printHtmlPart(26)
invokeTag('fieldValue','g',66,['bean':(bloodUserInstance),'field':("hospitalNum")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodUserInstance?.keBie)) {
printHtmlPart(27)
invokeTag('message','g',73,['code':("bloodUser.keBie.label"),'default':("Ke Bie")],-1)
printHtmlPart(28)
invokeTag('fieldValue','g',75,['bean':(bloodUserInstance),'field':("keBie")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodUserInstance?.keyStr)) {
printHtmlPart(29)
invokeTag('message','g',82,['code':("bloodUser.keyStr.label"),'default':("Key Str")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',84,['bean':(bloodUserInstance),'field':("keyStr")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodUserInstance?.name)) {
printHtmlPart(31)
invokeTag('message','g',91,['code':("bloodUser.name.label"),'default':("Name")],-1)
printHtmlPart(32)
invokeTag('fieldValue','g',93,['bean':(bloodUserInstance),'field':("name")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodUserInstance?.patientNum)) {
printHtmlPart(33)
invokeTag('message','g',100,['code':("bloodUser.patientNum.label"),'default':("Patient Num")],-1)
printHtmlPart(34)
invokeTag('fieldValue','g',102,['bean':(bloodUserInstance),'field':("patientNum")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodUserInstance?.sampleId)) {
printHtmlPart(35)
invokeTag('message','g',109,['code':("bloodUser.sampleId.label"),'default':("Sample Id")],-1)
printHtmlPart(36)
invokeTag('fieldValue','g',111,['bean':(bloodUserInstance),'field':("sampleId")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodUserInstance?.sendDate)) {
printHtmlPart(37)
invokeTag('message','g',118,['code':("bloodUser.sendDate.label"),'default':("Send Date")],-1)
printHtmlPart(38)
invokeTag('fieldValue','g',120,['bean':(bloodUserInstance),'field':("sendDate")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodUserInstance?.sendDoctor)) {
printHtmlPart(39)
invokeTag('message','g',127,['code':("bloodUser.sendDoctor.label"),'default':("Send Doctor")],-1)
printHtmlPart(40)
invokeTag('fieldValue','g',129,['bean':(bloodUserInstance),'field':("sendDoctor")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodUserInstance?.sex)) {
printHtmlPart(41)
invokeTag('message','g',136,['code':("bloodUser.sex.label"),'default':("Sex")],-1)
printHtmlPart(42)
invokeTag('fieldValue','g',138,['bean':(bloodUserInstance),'field':("sex")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodUserInstance?.testDate)) {
printHtmlPart(43)
invokeTag('message','g',145,['code':("bloodUser.testDate.label"),'default':("Test Date")],-1)
printHtmlPart(44)
invokeTag('fieldValue','g',147,['bean':(bloodUserInstance),'field':("testDate")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodUserInstance?.testDoctor)) {
printHtmlPart(45)
invokeTag('message','g',154,['code':("bloodUser.testDoctor.label"),'default':("Test Doctor")],-1)
printHtmlPart(46)
invokeTag('fieldValue','g',156,['bean':(bloodUserInstance),'field':("testDoctor")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodUserInstance?.type)) {
printHtmlPart(47)
invokeTag('message','g',163,['code':("bloodUser.type.label"),'default':("Type")],-1)
printHtmlPart(48)
invokeTag('fieldValue','g',165,['bean':(bloodUserInstance),'field':("type")],-1)
printHtmlPart(17)
}
printHtmlPart(49)
createTagBody(2, {->
printHtmlPart(50)
invokeTag('hiddenField','g',173,['name':("id"),'value':(bloodUserInstance?.id)],-1)
printHtmlPart(51)
createTagBody(3, {->
invokeTag('message','g',174,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',174,['class':("edit"),'action':("edit"),'id':(bloodUserInstance?.id)],3)
printHtmlPart(51)
invokeTag('actionSubmit','g',175,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(52)
})
invokeTag('form','g',177,[:],2)
printHtmlPart(53)
})
invokeTag('captureBody','sitemesh',179,[:],1)
printHtmlPart(54)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345132618035L
public static final String DEFAULT_CODEC = null
}
