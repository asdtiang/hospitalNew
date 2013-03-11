import com.sjzsqjy.www.site.Info
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_infocreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/info/create.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(0)
invokeTag('set','g',9,['var':("entityName"),'value':(message(code: 'info.label', default: 'Info'))],-1)
printHtmlPart(0)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',11,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(2)
invokeTag('resources','ckeditor',12,[:],-1)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',13,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(0)
createTagBody(2, {->
printHtmlPart(3)
codecOut.print(createLink(uri: '/'))
printHtmlPart(4)
createTagBody(3, {->
printHtmlPart(5)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(0)
})
invokeTag('link','g',20,['class':("list"),'action':("list")],3)
printHtmlPart(6)
invokeTag('message','g',22,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
codecOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(3, {->
printHtmlPart(11)
invokeTag('renderErrors','g',29,['bean':(infoInstance),'as':("list")],-1)
printHtmlPart(12)
})
invokeTag('hasErrors','g',30,['bean':(infoInstance)],3)
printHtmlPart(10)
createTagBody(3, {->
printHtmlPart(13)
invokeTag('message','g',37,['code':("info.infoType.label"),'default':("Info Type")],-1)
printHtmlPart(14)
codecOut.print(hasErrors(bean: infoInstance, field: 'infoType', 'errors'))
printHtmlPart(15)
invokeTag('select','g',40,['name':("infoType.id"),'from':(com.sjzsqjy.www.site.InfoType.list()),'optionKey':("id"),'optionValue':("name"),'value':(infoInstance?.infoType?.id)],-1)
printHtmlPart(16)
invokeTag('message','g',46,['code':("info.title.label"),'default':("Title")],-1)
printHtmlPart(17)
codecOut.print(hasErrors(bean: infoInstance, field: 'title', 'errors'))
printHtmlPart(18)
invokeTag('textField','g',49,['name':("title"),'value':(infoInstance?.title)],-1)
printHtmlPart(19)
invokeTag('message','g',53,['code':("info.content.label"),'default':("Content")],-1)
printHtmlPart(17)
codecOut.print(hasErrors(bean: infoInstance, field: 'content', 'errors'))
printHtmlPart(20)
createTagBody(4, {->
printHtmlPart(21)
codecOut.print(infoInstance?.content)
printHtmlPart(22)
})
invokeTag('editor','fckeditor',60,['name':("content"),'width':("800"),'height':("800"),'toolbar':("Standard"),'fileBrowser':("default")],4)
printHtmlPart(23)
invokeTag('submitButton','g',72,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(24)
})
invokeTag('form','g',74,['action':("save"),'method':("post")],3)
printHtmlPart(12)
})
invokeTag('ifAllGranted','sec',75,['roles':("ROLE_ADMIN")],2)
printHtmlPart(0)
})
invokeTag('captureBody','sitemesh',76,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121372759L
public static final String DEFAULT_CODEC = null
}
