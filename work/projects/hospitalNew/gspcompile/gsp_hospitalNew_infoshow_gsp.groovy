import com.sjzsqjy.www.site.Info
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_infoshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/info/show.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
codecOut.print(infoInstance?.infoType?.name?.encodeAsHTML())
printHtmlPart(2)
codecOut.print(infoInstance?.title?.encodeAsHTML())
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(3)
codecOut.print(resource(dir: 'print', file: 'LodopFuncs.js'))
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',29,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
codecOut.print(resource(dir: 'print', file: 'install_lodop32.exe'))
printHtmlPart(7)
codecOut.print(resource(dir: 'images', file: 'flash2.jpg'))
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
createTagBody(3, {->
printHtmlPart(10)
invokeTag('message','g',40,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(1)
})
invokeTag('link','g',41,['class':("list"),'action':("list")],3)
printHtmlPart(11)
createTagBody(3, {->
printHtmlPart(10)
invokeTag('message','g',42,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(1)
})
invokeTag('link','g',43,['class':("create"),'action':("create")],3)
printHtmlPart(12)
createTagBody(3, {->
printHtmlPart(10)
invokeTag('hiddenField','g',44,['name':("id"),'value':(infoInstance?.id)],-1)
printHtmlPart(13)
invokeTag('actionSubmit','g',46,['class':("edit"),'action':("edit"),'value':(message(code: 'default.button.edit.label', default: 'Edit'))],-1)
printHtmlPart(14)
invokeTag('actionSubmit','g',50,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(15)
})
invokeTag('form','g',51,[:],3)
printHtmlPart(16)
})
invokeTag('ifAllGranted','sec',52,['roles':("ROLE_ADMIN")],2)
printHtmlPart(17)
if(true && (flash.message)) {
printHtmlPart(18)
codecOut.print(flash.message)
printHtmlPart(19)
}
printHtmlPart(20)
invokeTag('include','g',63,['controller':("index"),'action':("siteNotice")],-1)
printHtmlPart(21)
invokeTag('include','g',64,['controller':("index"),'action':("feedBack")],-1)
printHtmlPart(22)
codecOut.print(resource(dir: 'images', file: 'web_31.jpg'))
printHtmlPart(23)
codecOut.print(createLink(uri: '/'))
printHtmlPart(24)
createTagBody(2, {->
printHtmlPart(25)
codecOut.print(infoInstance?.infoType?.name?.encodeAsHTML())
printHtmlPart(26)
})
invokeTag('link','g',73,['controller':("infoType"),'action':("show"),'id':(infoInstance?.infoType?.id)],2)
printHtmlPart(27)
codecOut.print(infoInstance?.title?.encodeAsHTML())
printHtmlPart(28)
codecOut.print(infoInstance?.title?.encodeAsHTML())
printHtmlPart(29)
invokeTag('message','g',82,['code':("lastUpdated.label"),'default':("Last Updated")],-1)
printHtmlPart(30)
invokeTag('formatDate','g',83,['date':(infoInstance?.lastUpdated),'format':("yyyy-MM-dd")],-1)
printHtmlPart(31)
invokeTag('message','g',84,['code':("dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(30)
invokeTag('formatDate','g',85,['date':(infoInstance?.dateCreated),'format':("yyyy-MM-dd")],-1)
printHtmlPart(32)
codecOut.print(infoInstance?.content)
printHtmlPart(33)
})
invokeTag('captureBody','sitemesh',94,[:],1)
printHtmlPart(34)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1353594315366L
public static final String DEFAULT_CODEC = null
}
