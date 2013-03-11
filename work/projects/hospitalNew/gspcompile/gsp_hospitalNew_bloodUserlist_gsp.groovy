import com.sjzsqjy.www.data.blood.BloodUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_bloodUserlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bloodUser/list.gsp" }
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
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
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
invokeTag('autoComplete','resource',11,['skin':("default")],-1)
printHtmlPart(6)
invokeTag('message','g',12,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(7)
codecOut.print(createLink(uri: '/'))
printHtmlPart(8)
invokeTag('message','g',15,['code':("default.home.label")],-1)
printHtmlPart(9)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(10)
invokeTag('message','g',20,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
codecOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
invokeTag('message','g',28,['code':("bloodUser.keyStr.label"),'default':("keyStr")],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',30,['property':("clinic"),'title':(message(code: 'bloodUser.clinic.label', default: 'clinic'))],-1)
printHtmlPart(16)
invokeTag('sortableColumn','g',32,['property':("name"),'title':(message(code: 'bloodUser.name.label', default: 'name'))],-1)
printHtmlPart(16)
invokeTag('sortableColumn','g',34,['property':("sendDate"),'title':(message(code: 'bloodUser.sendDate.label', default: 'send date'))],-1)
printHtmlPart(17)
invokeTag('sortableColumn','g',36,['property':("age"),'title':(message(code: 'bloodUser.age.label', default: 'Age'))],-1)
printHtmlPart(18)
loop:{
int i = 0
for( bloodUserInstance in (bloodUserInstanceList) ) {
printHtmlPart(19)
codecOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(20)
createTagBody(3, {->
codecOut.print(fieldValue(bean: bloodUserInstance, field: "keyStr"))
})
invokeTag('link','g',47,['action':("show"),'id':(bloodUserInstance.id)],3)
printHtmlPart(21)
invokeTag('set','g',48,['var':("updateId"),'value':("${com.sjzsqjy.www.util.SiteConstant.DATA_TYPE_BLOOD}${bloodUserInstance.id}")],-1)
printHtmlPart(22)
codecOut.print(updateId)
printHtmlPart(23)
createTagBody(3, {->
printHtmlPart(24)
codecOut.print(bloodUserInstance?.clinic?.name)
printHtmlPart(25)
})
invokeTag('remoteLink','g',53,['controller':("clinic"),'update':(updateId),'params':([id:bloodUserInstance.id,type:com.sjzsqjy.www.util.SiteConstant.DATA_TYPE_BLOOD]),'action':("showSearchClinic")],3)
printHtmlPart(26)
codecOut.print(fieldValue(bean: bloodUserInstance, field: "name"))
printHtmlPart(27)
codecOut.print(fieldValue(bean: bloodUserInstance, field: "sendDate"))
printHtmlPart(28)
codecOut.print(fieldValue(bean: bloodUserInstance, field: "age"))
printHtmlPart(29)
i++
}
}
printHtmlPart(30)
invokeTag('paginate','g',67,['total':(bloodUserInstanceTotal)],-1)
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',70,[:],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345133246199L
public static final String DEFAULT_CODEC = null
}
