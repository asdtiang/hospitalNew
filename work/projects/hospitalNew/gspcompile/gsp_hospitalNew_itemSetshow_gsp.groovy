import com.sjzsqjy.www.data.shiqiao.ItemSet
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_itemSetshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/itemSet/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'itemSet.label', default: 'ItemSet'))],-1)
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
if(true && (itemSetInstance?.name)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("itemSet.name.label"),'default':("Name")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(itemSetInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (itemSetInstance?.unit)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("itemSet.unit.label"),'default':("Unit")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(itemSetInstance),'field':("unit")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (itemSetInstance?.code)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("itemSet.code.label"),'default':("Code")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(itemSetInstance),'field':("code")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (itemSetInstance?.hight)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("itemSet.hight.label"),'default':("Hight")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(itemSetInstance),'field':("hight")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (itemSetInstance?.itemType)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("itemSet.itemType.label"),'default':("Item Type")],-1)
printHtmlPart(25)
createTagBody(3, {->
codecOut.print(itemSetInstance?.itemType?.encodeAsHTML())
})
invokeTag('link','g',66,['controller':("itemType"),'action':("show"),'id':(itemSetInstance?.itemType?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (itemSetInstance?.low)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("itemSet.low.label"),'default':("Low")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(itemSetInstance),'field':("low")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (itemSetInstance?.sequence)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("itemSet.sequence.label"),'default':("Sequence")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(itemSetInstance),'field':("sequence")],-1)
printHtmlPart(16)
}
printHtmlPart(30)
createTagBody(2, {->
printHtmlPart(31)
invokeTag('hiddenField','g',92,['name':("id"),'value':(itemSetInstance?.id)],-1)
printHtmlPart(32)
createTagBody(3, {->
invokeTag('message','g',93,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',93,['class':("edit"),'action':("edit"),'id':(itemSetInstance?.id)],3)
printHtmlPart(32)
invokeTag('actionSubmit','g',94,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(33)
})
invokeTag('form','g',96,[:],2)
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',98,[:],1)
printHtmlPart(35)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340714720943L
public static final String DEFAULT_CODEC = null
}
