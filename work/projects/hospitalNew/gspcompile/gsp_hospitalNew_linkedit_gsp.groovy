import com.sjzsqjy.www.site.Link
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_linkedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/link/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'link.label', default: 'Link'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
codecOut.print(createLink(uri: '/'))
printHtmlPart(5)
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("list"),'action':("list")],2)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(7)
invokeTag('message','g',18,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
codecOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('renderErrors','g',24,['bean':(linkInstance),'as':("list")],-1)
printHtmlPart(13)
})
invokeTag('hasErrors','g',26,['bean':(linkInstance)],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('hiddenField','g',28,['name':("id"),'value':(linkInstance?.id)],-1)
printHtmlPart(14)
invokeTag('hiddenField','g',29,['name':("version"),'value':(linkInstance?.version)],-1)
printHtmlPart(15)
invokeTag('message','g',36,['code':("link.address.label"),'default':("Address")],-1)
printHtmlPart(16)
codecOut.print(hasErrors(bean: linkInstance, field: 'address', 'errors'))
printHtmlPart(17)
invokeTag('textField','g',39,['name':("address"),'value':(linkInstance?.address)],-1)
printHtmlPart(18)
invokeTag('message','g',45,['code':("link.showTitle.label"),'default':("Show Title")],-1)
printHtmlPart(16)
codecOut.print(hasErrors(bean: linkInstance, field: 'showTitle', 'errors'))
printHtmlPart(17)
invokeTag('textField','g',48,['name':("showTitle"),'value':(linkInstance?.showTitle)],-1)
printHtmlPart(19)
invokeTag('actionSubmit','g',56,['class':("save"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(20)
invokeTag('actionSubmit','g',57,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(21)
})
invokeTag('form','g',59,['method':("post")],2)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',61,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121372533L
public static final String DEFAULT_CODEC = null
}
