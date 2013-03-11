import com.sjzsqjy.www.data.blood.BloodItem
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_bloodItemshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bloodItem/show.gsp" }
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
if(true && (bloodItemInstance?.sequence)) {
printHtmlPart(15)
invokeTag('message','g',28,['code':("bloodItem.sequence.label"),'default':("Sequence")],-1)
printHtmlPart(16)
invokeTag('fieldValue','g',30,['bean':(bloodItemInstance),'field':("sequence")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodItemInstance?.high)) {
printHtmlPart(19)
invokeTag('message','g',37,['code':("bloodItem.high.label"),'default':("High")],-1)
printHtmlPart(20)
invokeTag('fieldValue','g',39,['bean':(bloodItemInstance),'field':("high")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodItemInstance?.low)) {
printHtmlPart(21)
invokeTag('message','g',46,['code':("bloodItem.low.label"),'default':("Low")],-1)
printHtmlPart(22)
invokeTag('fieldValue','g',48,['bean':(bloodItemInstance),'field':("low")],-1)
printHtmlPart(17)
}
printHtmlPart(18)
if(true && (bloodItemInstance?.name)) {
printHtmlPart(23)
invokeTag('message','g',55,['code':("bloodItem.name.label"),'default':("Name")],-1)
printHtmlPart(24)
invokeTag('fieldValue','g',57,['bean':(bloodItemInstance),'field':("name")],-1)
printHtmlPart(17)
}
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(26)
invokeTag('hiddenField','g',65,['name':("id"),'value':(bloodItemInstance?.id)],-1)
printHtmlPart(27)
createTagBody(3, {->
invokeTag('message','g',66,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',66,['class':("edit"),'action':("edit"),'id':(bloodItemInstance?.id)],3)
printHtmlPart(27)
invokeTag('actionSubmit','g',67,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(28)
})
invokeTag('form','g',69,[:],2)
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',71,[:],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345131266362L
public static final String DEFAULT_CODEC = null
}
