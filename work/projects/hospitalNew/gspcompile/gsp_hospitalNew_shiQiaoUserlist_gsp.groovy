import com.sjzsqjy.www.data.shiqiao.ShiQiaoUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_shiQiaoUserlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/shiQiaoUser/list.gsp" }
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
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',15,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('autoComplete','resource',17,['skin':("default")],-1)
printHtmlPart(6)
invokeTag('message','g',18,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(7)
codecOut.print(createLink(uri: '/'))
printHtmlPart(8)
invokeTag('message','g',21,['code':("default.home.label")],-1)
printHtmlPart(9)
createTagBody(2, {->
invokeTag('message','g',22,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',22,['class':("create"),'action':("create")],2)
printHtmlPart(10)
invokeTag('message','g',26,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
codecOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
invokeTag('sortableColumn','g',34,['property':("name"),'title':(message(code: 'shiQiaoUser.name.label', default: 'Name'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',36,['property':("sex"),'title':(message(code: 'shiQiaoUser.sex.label', default: 'Sex'))],-1)
printHtmlPart(16)
invokeTag('message','g',38,['code':("shiQiaoUser.doctor.label"),'default':("Doctor")],-1)
printHtmlPart(17)
invokeTag('message','g',40,['code':("shiQiaoUser.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(18)
invokeTag('sortableColumn','g',42,['property':("birth"),'title':(message(code: 'shiQiaoUser.birth.label', default: 'Brith'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',44,['property':("date"),'title':(message(code: 'shiQiaoUser.date.label', default: 'Date'))],-1)
printHtmlPart(19)
loop:{
int i = 0
for( shiQiaoUserInstance in (shiQiaoUserInstanceList) ) {
printHtmlPart(20)
codecOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(21)
createTagBody(3, {->
codecOut.print(fieldValue(bean: shiQiaoUserInstance, field: "name"))
})
invokeTag('link','g',52,['action':("show"),'id':(shiQiaoUserInstance.id)],3)
printHtmlPart(22)
codecOut.print(fieldValue(bean: shiQiaoUserInstance, field: "sex"))
printHtmlPart(22)
codecOut.print(shiQiaoUserInstance?.doctor?.name)
printHtmlPart(23)
invokeTag('set','g',57,['var':("updateId"),'value':("${com.sjzsqjy.www.util.SiteConstant.DATA_TYPE_SHIQIAO}${shiQiaoUserInstance.id}")],-1)
printHtmlPart(24)
codecOut.print(updateId)
printHtmlPart(25)
createTagBody(3, {->
printHtmlPart(26)
codecOut.print(shiQiaoUserInstance?.clinic?.name)
printHtmlPart(27)
})
invokeTag('remoteLink','g',62,['controller':("clinic"),'update':(updateId),'params':([id:shiQiaoUserInstance.id,type:com.sjzsqjy.www.util.SiteConstant.DATA_TYPE_SHIQIAO]),'action':("showSearchClinic")],3)
printHtmlPart(28)
codecOut.print(fieldValue(bean: shiQiaoUserInstance, field: "birth"))
printHtmlPart(22)
codecOut.print(fieldValue(bean: shiQiaoUserInstance, field: "date"))
printHtmlPart(29)
i++
}
}
printHtmlPart(30)
invokeTag('paginate','g',75,['total':(shiQiaoUserInstanceTotal)],-1)
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',78,[:],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345213716949L
public static final String DEFAULT_CODEC = null
}
