import com.sjzsqjy.www.site.InfoType
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_infoTypecreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/infoType/create.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'infoType.label', default: 'InfoType'))],-1)
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
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
createTagBody(3, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("list")],3)
printHtmlPart(5)
invokeTag('message','g',18,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
codecOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
createTagBody(3, {->
printHtmlPart(10)
invokeTag('renderErrors','g',24,['bean':(infoTypeInstance),'as':("list")],-1)
printHtmlPart(11)
})
invokeTag('hasErrors','g',26,['bean':(infoTypeInstance)],3)
printHtmlPart(9)
createTagBody(3, {->
printHtmlPart(12)
invokeTag('message','g',34,['code':("infoType.name.label"),'default':("Name")],-1)
printHtmlPart(13)
codecOut.print(hasErrors(bean: infoTypeInstance, field: 'name', 'errors'))
printHtmlPart(14)
invokeTag('textField','g',37,['name':("name"),'value':(infoTypeInstance?.name)],-1)
printHtmlPart(15)
invokeTag('message','g',43,['code':("infoType.sequence.label"),'default':("Sequence")],-1)
printHtmlPart(13)
codecOut.print(hasErrors(bean: infoTypeInstance, field: 'sequence', 'errors'))
printHtmlPart(14)
invokeTag('textField','g',46,['name':("sequence"),'value':(fieldValue(bean: infoTypeInstance, field: 'sequence'))],-1)
printHtmlPart(16)
invokeTag('message','g',52,['code':("infoType.image.label"),'default':("Image")],-1)
printHtmlPart(13)
codecOut.print(hasErrors(bean: infoTypeInstance, field: 'image', 'errors'))
printHtmlPart(14)
invokeTag('checkBox','g',55,['name':("image"),'value':(infoTypeInstance?.image)],-1)
printHtmlPart(17)
invokeTag('message','g',61,['code':("infoType.indexShow.label"),'default':("Index Show")],-1)
printHtmlPart(13)
codecOut.print(hasErrors(bean: infoTypeInstance, field: 'indexShow', 'errors'))
printHtmlPart(14)
invokeTag('checkBox','g',64,['name':("indexShow"),'value':(infoTypeInstance?.indexShow)],-1)
printHtmlPart(18)
invokeTag('submitButton','g',72,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(19)
})
invokeTag('form','g',74,['action':("save"),'method':("post")],3)
printHtmlPart(20)
})
invokeTag('ifAllGranted','sec',76,['roles':("ROLE_ADMIN")],2)
printHtmlPart(3)
})
invokeTag('captureBody','sitemesh',77,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121281899L
public static final String DEFAULT_CODEC = null
}
