import com.sjzsqjy.www.site.InfoType
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_infoTypeedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/infoType/edit.gsp" }
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
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
createTagBody(3, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("list")],3)
printHtmlPart(5)
createTagBody(3, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],3)
printHtmlPart(6)
invokeTag('message','g',19,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
codecOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(3, {->
printHtmlPart(11)
invokeTag('renderErrors','g',25,['bean':(infoTypeInstance),'as':("list")],-1)
printHtmlPart(12)
})
invokeTag('hasErrors','g',27,['bean':(infoTypeInstance)],3)
printHtmlPart(10)
createTagBody(3, {->
printHtmlPart(13)
invokeTag('hiddenField','g',29,['name':("id"),'value':(infoTypeInstance?.id)],-1)
printHtmlPart(13)
invokeTag('hiddenField','g',30,['name':("version"),'value':(infoTypeInstance?.version)],-1)
printHtmlPart(14)
invokeTag('message','g',37,['code':("infoType.name.label"),'default':("Name")],-1)
printHtmlPart(15)
codecOut.print(hasErrors(bean: infoTypeInstance, field: 'name', 'errors'))
printHtmlPart(16)
invokeTag('textField','g',40,['name':("name"),'value':(infoTypeInstance?.name)],-1)
printHtmlPart(17)
invokeTag('message','g',46,['code':("infoType.sequence.label"),'default':("Sequence")],-1)
printHtmlPart(15)
codecOut.print(hasErrors(bean: infoTypeInstance, field: 'sequence', 'errors'))
printHtmlPart(16)
invokeTag('textField','g',49,['name':("sequence"),'value':(fieldValue(bean: infoTypeInstance, field: 'sequence'))],-1)
printHtmlPart(18)
invokeTag('message','g',55,['code':("infoType.image.label"),'default':("Image")],-1)
printHtmlPart(15)
codecOut.print(hasErrors(bean: infoTypeInstance, field: 'image', 'errors'))
printHtmlPart(16)
invokeTag('checkBox','g',58,['name':("image"),'value':(infoTypeInstance?.image)],-1)
printHtmlPart(19)
invokeTag('message','g',64,['code':("infoType.indexShow.label"),'default':("Index Show")],-1)
printHtmlPart(15)
codecOut.print(hasErrors(bean: infoTypeInstance, field: 'indexShow', 'errors'))
printHtmlPart(16)
invokeTag('checkBox','g',67,['name':("indexShow"),'value':(infoTypeInstance?.indexShow)],-1)
printHtmlPart(20)
invokeTag('message','g',73,['code':("infoType.info.label"),'default':("Info")],-1)
printHtmlPart(15)
codecOut.print(hasErrors(bean: infoTypeInstance, field: 'info', 'errors'))
printHtmlPart(21)
for( i in (infoTypeInstance?.info) ) {
printHtmlPart(22)
createTagBody(5, {->
codecOut.print(i?.title?.encodeAsHTML())
})
invokeTag('link','g',79,['controller':("info"),'action':("show"),'id':(i.id)],5)
printHtmlPart(23)
}
printHtmlPart(24)
createTagBody(4, {->
codecOut.print(message(code: 'default.add.label', args: [message(code: 'info.label', default: 'Info')]))
})
invokeTag('link','g',82,['controller':("info"),'action':("create"),'params':(['infoType.id': infoTypeInstance?.id])],4)
printHtmlPart(25)
invokeTag('actionSubmit','g',91,['class':("save"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(26)
invokeTag('actionSubmit','g',92,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(27)
})
invokeTag('form','g',94,['method':("post")],3)
printHtmlPart(28)
})
invokeTag('ifAllGranted','sec',96,['roles':("ROLE_ADMIN")],2)
printHtmlPart(3)
})
invokeTag('captureBody','sitemesh',97,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121278630L
public static final String DEFAULT_CODEC = null
}
