import com.sjzsqjy.www.data.shiqiao.ShiQiaoUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_shiQiaoUsershow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/shiQiaoUser/show.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("admin")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'shiQiaoUser.label', default: 'ShiQiaoUser'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
codecOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("list")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
codecOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (shiQiaoUserInstance?.name)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("shiQiaoUser.name.label"),'default':("Name")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(shiQiaoUserInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (shiQiaoUserInstance?.sex)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("shiQiaoUser.sex.label"),'default':("Sex")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(shiQiaoUserInstance),'field':("sex")],-1)
printHtmlPart(16)
}
printHtmlPart(20)
if(true && (shiQiaoUserInstance?.doctor)) {
printHtmlPart(21)
invokeTag('message','g',46,['code':("shiQiaoUser.doctor.label"),'default':("Doctor")],-1)
printHtmlPart(22)
createTagBody(3, {->
codecOut.print(shiQiaoUserInstance?.doctor?.name?.encodeAsHTML())
})
invokeTag('link','g',48,['controller':("doctor"),'action':("show"),'id':(shiQiaoUserInstance?.doctor?.id)],3)
printHtmlPart(23)
}
printHtmlPart(24)
if(true && (null!=shiQiaoUserInstance?.clinic)) {
printHtmlPart(25)
invokeTag('message','g',56,['code':("shiQiaoUser.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(26)
createTagBody(3, {->
codecOut.print(shiQiaoUserInstance?.clinic?.name?.encodeAsHTML())
})
invokeTag('link','g',58,['controller':("clinic"),'action':("show"),'id':(shiQiaoUserInstance?.clinic?.id)],3)
printHtmlPart(27)
}
printHtmlPart(17)
if(true && (shiQiaoUserInstance?.birth)) {
printHtmlPart(28)
invokeTag('message','g',65,['code':("shiQiaoUser.birth.label"),'default':("birth")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',67,['bean':(shiQiaoUserInstance),'field':("birth")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (shiQiaoUserInstance?.date)) {
printHtmlPart(30)
invokeTag('message','g',74,['code':("shiQiaoUser.date.label"),'default':("Date")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',76,['bean':(shiQiaoUserInstance),'field':("date")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (shiQiaoUserInstance?.sampleId)) {
printHtmlPart(32)
invokeTag('message','g',83,['code':("shiQiaoUser.sampleId.label"),'default':("Sample Id")],-1)
printHtmlPart(33)
invokeTag('fieldValue','g',85,['bean':(shiQiaoUserInstance),'field':("sampleId")],-1)
printHtmlPart(16)
}
printHtmlPart(34)
createTagBody(2, {->
printHtmlPart(35)
invokeTag('hiddenField','g',93,['name':("id"),'value':(shiQiaoUserInstance?.id)],-1)
printHtmlPart(36)
createTagBody(3, {->
invokeTag('message','g',94,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',94,['class':("edit"),'action':("edit"),'id':(shiQiaoUserInstance?.id)],3)
printHtmlPart(36)
invokeTag('actionSubmit','g',95,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(37)
})
invokeTag('form','g',97,[:],2)
printHtmlPart(38)
})
invokeTag('captureBody','sitemesh',99,[:],1)
printHtmlPart(39)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345213991608L
public static final String DEFAULT_CODEC = null
}
