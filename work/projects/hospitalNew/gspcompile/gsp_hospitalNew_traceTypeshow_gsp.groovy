import com.sjzsqjy.www.data.trace.TraceType
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_traceTypeshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/traceType/show.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'traceType.label', default: 'TraceType'))],-1)
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
if(true && (traceTypeInstance?.adult)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("traceType.adult.label"),'default':("Adult")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(traceTypeInstance),'field':("adult")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (traceTypeInstance?.child)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("traceType.child.label"),'default':("Child")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(traceTypeInstance),'field':("child")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (traceTypeInstance?.name)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("traceType.name.label"),'default':("Name")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(traceTypeInstance),'field':("name")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (traceTypeInstance?.sampleType)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("traceType.sampleType.label"),'default':("Sample Type")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(traceTypeInstance),'field':("sampleType")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (traceTypeInstance?.sequence)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("traceType.sequence.label"),'default':("Sequence")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(traceTypeInstance),'field':("sequence")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (traceTypeInstance?.unit)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("traceType.unit.label"),'default':("Unit")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(traceTypeInstance),'field':("unit")],-1)
printHtmlPart(16)
}
printHtmlPart(28)
createTagBody(2, {->
printHtmlPart(29)
invokeTag('hiddenField','g',83,['name':("id"),'value':(traceTypeInstance?.id)],-1)
printHtmlPart(30)
createTagBody(3, {->
invokeTag('message','g',84,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',84,['class':("edit"),'action':("edit"),'id':(traceTypeInstance?.id)],3)
printHtmlPart(30)
invokeTag('actionSubmit','g',85,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(31)
})
invokeTag('form','g',87,[:],2)
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',89,[:],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121372828L
public static final String DEFAULT_CODEC = null
}
