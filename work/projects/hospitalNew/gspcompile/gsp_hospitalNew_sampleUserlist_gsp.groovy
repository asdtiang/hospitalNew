import com.sjzsqjy.www.data.sample.SampleUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_sampleUserlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/sampleUser/list.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'sampleUser.label', default: 'SampleUser'))],-1)
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
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('autoComplete','resource',11,['skin':("default")],-1)
printHtmlPart(5)
invokeTag('message','g',12,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(6)
codecOut.print(createLink(uri: '/'))
printHtmlPart(7)
invokeTag('message','g',15,['code':("default.home.label")],-1)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
codecOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('sortableColumn','g',28,['property':("name"),'title':(message(code: 'sampleUser.name.label', default: 'Name'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',30,['property':("sex"),'title':(message(code: 'sampleUser.sex.label', default: 'Sex'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',32,['property':("age"),'title':(message(code: 'sampleUser.age.label', default: 'Age'))],-1)
printHtmlPart(15)
invokeTag('message','g',34,['code':("sampleUser.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(16)
invokeTag('sortableColumn','g',36,['property':("sampleId"),'title':(message(code: 'sampleUser.sampleId.label', default: 'Sample Id'))],-1)
printHtmlPart(17)
loop:{
int i = 0
for( sampleUserInstance in (sampleUserInstanceList) ) {
printHtmlPart(18)
codecOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(19)
createTagBody(3, {->
codecOut.print(fieldValue(bean: sampleUserInstance, field: "name"))
})
invokeTag('link','g',44,['action':("show"),'id':(sampleUserInstance.id)],3)
printHtmlPart(20)
codecOut.print(fieldValue(bean: sampleUserInstance, field: "sex"))
printHtmlPart(20)
codecOut.print(fieldValue(bean: sampleUserInstance, field: "age"))
printHtmlPart(21)
invokeTag('set','g',50,['var':("updateId"),'value':("${com.sjzsqjy.www.util.SiteConstant.DATA_TYPE_SAMPLE}${sampleUserInstance.id}")],-1)
printHtmlPart(22)
codecOut.print(updateId)
printHtmlPart(23)
createTagBody(3, {->
printHtmlPart(24)
codecOut.print(sampleUserInstance?.clinic?.name)
printHtmlPart(25)
})
invokeTag('remoteLink','g',55,['controller':("clinic"),'update':(updateId),'params':([id:sampleUserInstance.id,type:com.sjzsqjy.www.util.SiteConstant.DATA_TYPE_SAMPLE]),'action':("showSearchClinic")],3)
printHtmlPart(26)
codecOut.print(fieldValue(bean: sampleUserInstance, field: "sampleId"))
printHtmlPart(27)
i++
}
}
printHtmlPart(28)
invokeTag('paginate','g',65,['total':(sampleUserInstanceTotal)],-1)
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',68,[:],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345302859154L
public static final String DEFAULT_CODEC = null
}
