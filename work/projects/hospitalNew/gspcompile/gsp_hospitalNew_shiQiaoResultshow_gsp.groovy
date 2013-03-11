import com.sjzsqjy.www.data.shiqiao.ShiQiaoResult
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_shiQiaoResultshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/shiQiaoResult/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'shiQiaoResult.label', default: 'ShiQiaoResult'))],-1)
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
if(true && (shiQiaoResultInstance?.charValue)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("shiQiaoResult.charValue.label"),'default':("Char Value")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(shiQiaoResultInstance),'field':("charValue")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (shiQiaoResultInstance?.sequence)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("shiQiaoResult.sequence.label"),'default':("Sequence")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(shiQiaoResultInstance),'field':("sequence")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (shiQiaoResultInstance?.date)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("shiQiaoResult.date.label"),'default':("Date")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(shiQiaoResultInstance),'field':("date")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (shiQiaoResultInstance?.inputType)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("shiQiaoResult.inputType.label"),'default':("Input Type")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(shiQiaoResultInstance),'field':("inputType")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (shiQiaoResultInstance?.itemCode)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("shiQiaoResult.itemCode.label"),'default':("Item Code")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(shiQiaoResultInstance),'field':("itemCode")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (shiQiaoResultInstance?.sampleId)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("shiQiaoResult.sampleId.label"),'default':("Sample Id")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(shiQiaoResultInstance),'field':("sampleId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (shiQiaoResultInstance?.typeId)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("shiQiaoResult.typeId.label"),'default':("Type Id")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(shiQiaoResultInstance),'field':("typeId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (shiQiaoResultInstance?.value)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("shiQiaoResult.value.label"),'default':("Value")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(shiQiaoResultInstance),'field':("value")],-1)
printHtmlPart(16)
}
printHtmlPart(32)
createTagBody(2, {->
printHtmlPart(33)
invokeTag('hiddenField','g',101,['name':("id"),'value':(shiQiaoResultInstance?.id)],-1)
printHtmlPart(34)
createTagBody(3, {->
invokeTag('message','g',102,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',102,['class':("edit"),'action':("edit"),'id':(shiQiaoResultInstance?.id)],3)
printHtmlPart(34)
invokeTag('actionSubmit','g',103,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(35)
})
invokeTag('form','g',105,[:],2)
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',107,[:],1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340714720928L
public static final String DEFAULT_CODEC = null
}
