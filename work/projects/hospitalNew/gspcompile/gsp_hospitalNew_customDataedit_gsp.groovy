import com.sjzsqjy.www.site.CustomData
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_customDataedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/customData/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("admin")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'customData.label', default: 'CustomData'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(2)
invokeTag('resources','ckeditor',9,[:],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('autoComplete','resource',12,['skin':("default")],-1)
printHtmlPart(5)
invokeTag('message','g',13,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(6)
codecOut.print(createLink(uri: '/'))
printHtmlPart(7)
invokeTag('message','g',16,['code':("default.home.label")],-1)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',17,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',17,['class':("list"),'action':("list")],2)
printHtmlPart(9)
createTagBody(2, {->
invokeTag('message','g',18,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',18,['class':("create"),'action':("create")],2)
printHtmlPart(10)
invokeTag('message','g',22,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(11)
if(true && (flash.message)) {
printHtmlPart(12)
codecOut.print(flash.message)
printHtmlPart(13)
}
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
createTagBody(3, {->
printHtmlPart(16)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(17)
codecOut.print(error.field)
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('message','g',29,['error':(error)],-1)
printHtmlPart(20)
})
invokeTag('eachError','g',30,['bean':(customDataInstance),'var':("error")],3)
printHtmlPart(21)
})
invokeTag('hasErrors','g',32,['bean':(customDataInstance)],2)
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(22)
invokeTag('hiddenField','g',34,['name':("id"),'value':(customDataInstance?.id)],-1)
printHtmlPart(22)
invokeTag('hiddenField','g',35,['name':("version"),'value':(customDataInstance?.version)],-1)
printHtmlPart(23)
invokeTag('render','g',37,['template':("form")],-1)
printHtmlPart(24)
invokeTag('actionSubmit','g',40,['class':("save"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(25)
invokeTag('actionSubmit','g',41,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'formnovalidate':(""),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(26)
})
invokeTag('form','g',43,['method':("post")],2)
printHtmlPart(27)
})
invokeTag('captureBody','sitemesh',45,[:],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1364478628950L
public static final String DEFAULT_CODEC = null
}
