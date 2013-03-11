import com.sjzsqjy.www.data.blood.BloodItem
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_bloodItemlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bloodItem/list.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'bloodItem.label', default: 'BloodItem'))],-1)
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
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(6)
codecOut.print(createLink(uri: '/'))
printHtmlPart(7)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
codecOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
invokeTag('sortableColumn','g',27,['property':("sequence"),'title':(message(code: 'bloodItem.sequence.label', default: 'Sequence'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',29,['property':("high"),'title':(message(code: 'bloodItem.high.label', default: 'High'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',31,['property':("low"),'title':(message(code: 'bloodItem.low.label', default: 'Low'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',33,['property':("name"),'title':(message(code: 'bloodItem.name.label', default: 'Name'))],-1)
printHtmlPart(15)
loop:{
int i = 0
for( bloodItemInstance in (bloodItemInstanceList) ) {
printHtmlPart(16)
codecOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
createTagBody(3, {->
codecOut.print(fieldValue(bean: bloodItemInstance, field: "sequence"))
})
invokeTag('link','g',41,['action':("show"),'id':(bloodItemInstance.id)],3)
printHtmlPart(18)
codecOut.print(fieldValue(bean: bloodItemInstance, field: "high"))
printHtmlPart(18)
codecOut.print(fieldValue(bean: bloodItemInstance, field: "low"))
printHtmlPart(18)
codecOut.print(fieldValue(bean: bloodItemInstance, field: "name"))
printHtmlPart(19)
i++
}
}
printHtmlPart(20)
invokeTag('paginate','g',54,['total':(bloodItemInstanceTotal)],-1)
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',57,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345131266322L
public static final String DEFAULT_CODEC = null
}
