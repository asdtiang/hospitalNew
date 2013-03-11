import com.sjzsqjy.www.site.Link
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_linkcreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/link/create.gsp" }
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
invokeTag('message','g',9,['code':("default.create.label"),'args':([entityName])],-1)
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
invokeTag('message','g',17,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
codecOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
invokeTag('renderErrors','g',23,['bean':(linkInstance),'as':("list")],-1)
printHtmlPart(12)
})
invokeTag('hasErrors','g',25,['bean':(linkInstance)],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('message','g',32,['code':("link.showTitle.label"),'default':("Show Title")],-1)
printHtmlPart(14)
codecOut.print(hasErrors(bean: linkInstance, field: 'showTitle', 'errors'))
printHtmlPart(15)
invokeTag('textField','g',35,['name':("showTitle"),'value':(linkInstance?.showTitle)],-1)
printHtmlPart(16)
invokeTag('message','g',40,['code':("link.address.label"),'default':("Address")],-1)
printHtmlPart(14)
codecOut.print(hasErrors(bean: linkInstance, field: 'address', 'errors'))
printHtmlPart(15)
invokeTag('textField','g',43,['name':("address"),'value':(linkInstance?.address)],-1)
printHtmlPart(17)
invokeTag('submitButton','g',53,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(18)
})
invokeTag('form','g',55,['action':("save"),'method':("post")],2)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',57,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121372586L
public static final String DEFAULT_CODEC = null
}
