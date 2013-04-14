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
invokeTag('captureHead','sitemesh',30,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
codecOut.print(resource(dir: 'images', file: 'flash2.jpg'))
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
createTagBody(3, {->
printHtmlPart(9)
invokeTag('message','g',38,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(1)
})
invokeTag('link','g',39,['class':("list"),'action':("list")],3)
printHtmlPart(10)
createTagBody(3, {->
printHtmlPart(9)
invokeTag('message','g',40,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(1)
})
invokeTag('link','g',41,['class':("create"),'action':("create")],3)
printHtmlPart(11)
createTagBody(3, {->
printHtmlPart(9)
invokeTag('hiddenField','g',42,['name':("id"),'value':(infoInstance?.id)],-1)
printHtmlPart(12)
invokeTag('actionSubmit','g',44,['class':("edit"),'action':("edit"),'value':(message(code: 'default.button.edit.label', default: 'Edit'))],-1)
printHtmlPart(13)
invokeTag('actionSubmit','g',48,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(14)
})
invokeTag('form','g',49,[:],3)
printHtmlPart(15)
})
invokeTag('ifAllGranted','sec',50,['roles':("ROLE_ADMIN")],2)
printHtmlPart(16)
if(true && (flash.message)) {
printHtmlPart(17)
codecOut.print(flash.message)
printHtmlPart(18)
}
printHtmlPart(19)
invokeTag('include','g',61,['controller':("index"),'action':("siteNotice")],-1)
printHtmlPart(20)
invokeTag('include','g',62,['controller':("index"),'action':("feedBack")],-1)
printHtmlPart(21)
codecOut.print(resource(dir: 'images', file: 'web_31.jpg'))
printHtmlPart(22)
codecOut.print(createLink(uri: '/'))
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
codecOut.print(infoInstance?.infoType?.name?.encodeAsHTML())
printHtmlPart(25)
})
invokeTag('link','g',71,['controller':("infoType"),'action':("show"),'id':(infoInstance?.infoType?.id)],2)
printHtmlPart(26)
codecOut.print(infoInstance?.title?.encodeAsHTML())
printHtmlPart(27)
codecOut.print(infoInstance?.title?.encodeAsHTML())
printHtmlPart(28)
invokeTag('message','g',80,['code':("lastUpdated.label"),'default':("Last Updated")],-1)
printHtmlPart(29)
invokeTag('formatDate','g',81,['date':(infoInstance?.lastUpdated),'format':("yyyy-MM-dd")],-1)
printHtmlPart(30)
invokeTag('message','g',82,['code':("dateCreated.label"),'default':("Date Created")],-1)
printHtmlPart(29)
invokeTag('formatDate','g',83,['date':(infoInstance?.dateCreated),'format':("yyyy-MM-dd")],-1)
printHtmlPart(31)
codecOut.print(infoInstance?.content)
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',92,[:],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1354200081584L
public static final String DEFAULT_CODEC = null
}
