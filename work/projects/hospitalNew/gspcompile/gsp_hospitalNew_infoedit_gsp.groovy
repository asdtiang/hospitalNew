import com.sjzsqjy.www.site.Info
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_infoedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/info/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(0)
invokeTag('set','g',10,['var':("entityName"),'value':(message(code: 'info.label', default: 'Info'))],-1)
printHtmlPart(0)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',11,['code':("default.edit.label"),'args':([entityName])],-1)
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
createTagBody(3, {->
printHtmlPart(5)
invokeTag('message','g',21,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(0)
})
invokeTag('link','g',22,['class':("create"),'action':("create")],3)
printHtmlPart(7)
invokeTag('message','g',24,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
codecOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
createTagBody(3, {->
printHtmlPart(12)
invokeTag('renderErrors','g',31,['bean':(infoInstance),'as':("list")],-1)
printHtmlPart(13)
})
invokeTag('hasErrors','g',32,['bean':(infoInstance)],3)
printHtmlPart(11)
createTagBody(3, {->
printHtmlPart(5)
invokeTag('hiddenField','g',33,['name':("id"),'value':(infoInstance?.id)],-1)
printHtmlPart(5)
invokeTag('hiddenField','g',34,['name':("version"),'value':(infoInstance?.version)],-1)
printHtmlPart(14)
invokeTag('message','g',40,['code':("info.infoType.label"),'default':("Info Type")],-1)
printHtmlPart(15)
codecOut.print(hasErrors(bean: infoInstance, field: 'infoType', 'errors'))
printHtmlPart(16)
invokeTag('select','g',45,['name':("infoType.id"),'from':(com.sjzsqjy.www.site.InfoType.list()),'optionKey':("id"),'optionValue':("name"),'value':(infoInstance?.infoType?.id)],-1)
printHtmlPart(17)
invokeTag('message','g',49,['code':("info.title.label"),'default':("Title")],-1)
printHtmlPart(15)
codecOut.print(hasErrors(bean: infoInstance, field: 'title', 'errors'))
printHtmlPart(16)
invokeTag('textField','g',52,['name':("title"),'value':(infoInstance?.title)],-1)
printHtmlPart(18)
codecOut.print(createLinkTo(dir: 'images/info', file: infoInstance.id+'.jpg'))
printHtmlPart(19)
codecOut.print(createLinkTo(dir: 'images/info', file: 'default.jpg'))
printHtmlPart(20)
createTagBody(4, {->
printHtmlPart(21)
createClosureForHtmlPart(22, 5)
invokeTag('link','g',63,['target':("_blank"),'controller':("info"),'action':("alterLogo"),'params':([id:infoInstance?.id])],5)
printHtmlPart(23)
})
invokeTag('ifAllGranted','sec',64,['roles':("ROLE_ADMIN")],4)
printHtmlPart(24)
invokeTag('message','g',69,['code':("info.content.label"),'default':("Content")],-1)
printHtmlPart(15)
codecOut.print(hasErrors(bean: infoInstance, field: 'content', 'errors'))
printHtmlPart(25)
invokeTag('config','ckeditor',72,['height':("600px"),'width':("800px")],-1)
printHtmlPart(26)
createTagBody(4, {->
codecOut.print(infoInstance?.content)
})
invokeTag('editor','ckeditor',73,['name':("content")],4)
printHtmlPart(27)
invokeTag('actionSubmit','g',82,['class':("save"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(28)
invokeTag('actionSubmit','g',86,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(29)
})
invokeTag('form','g',88,['method':("post")],3)
printHtmlPart(13)
})
invokeTag('ifAllGranted','sec',89,['roles':("ROLE_ADMIN")],2)
printHtmlPart(0)
})
invokeTag('captureBody','sitemesh',90,[:],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121372664L
public static final String DEFAULT_CODEC = null
}
