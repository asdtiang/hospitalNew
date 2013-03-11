import com.sjzsqjy.www.site.InfoType
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_infoTypeshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/infoType/show.gsp" }
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
invokeTag('set','g',9,['var':("entityName"),'value':(infoTypeInstance?.name)],-1)
printHtmlPart(0)
createTagBody(2, {->
createTagBody(3, {->
codecOut.print(entityName)
})
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(2)
codecOut.print(resource(dir: 'images', file: 'flash2.jpg'))
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
createTagBody(3, {->
printHtmlPart(5)
invokeTag('message','g',17,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(6)
})
invokeTag('link','g',18,['class':("list"),'action':("list")],3)
printHtmlPart(7)
createTagBody(3, {->
printHtmlPart(5)
invokeTag('message','g',19,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(6)
})
invokeTag('link','g',20,['class':("create"),'action':("create")],3)
printHtmlPart(8)
createTagBody(3, {->
printHtmlPart(9)
invokeTag('hiddenField','g',22,['name':("id"),'value':(infoTypeInstance?.id)],-1)
printHtmlPart(10)
invokeTag('actionSubmit','g',24,['class':("edit"),'action':("edit"),'value':(message(code: 'default.button.edit.label', default: 'Edit'))],-1)
printHtmlPart(11)
invokeTag('actionSubmit','g',28,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(12)
})
invokeTag('form','g',29,[:],3)
printHtmlPart(13)
})
invokeTag('ifAllGranted','sec',30,['roles':("ROLE_ADMIN")],2)
printHtmlPart(0)
if(true && (flash.message)) {
printHtmlPart(14)
codecOut.print(flash.message)
printHtmlPart(15)
}
printHtmlPart(16)
invokeTag('include','g',41,['controller':("index"),'action':("siteNotice")],-1)
printHtmlPart(9)
invokeTag('include','g',42,['controller':("index"),'action':("feedBack")],-1)
printHtmlPart(17)
codecOut.print(resource(dir: 'images', file: 'web_31.jpg'))
printHtmlPart(18)
codecOut.print(createLink(uri: '/'))
printHtmlPart(19)
codecOut.print(infoTypeInstance?.name)
printHtmlPart(20)
for( i in (infoTypeInstance.info) ) {
printHtmlPart(21)
createTagBody(3, {->
printHtmlPart(22)
if(true && (infoTypeInstance.image)) {
printHtmlPart(23)
codecOut.print(createLinkTo(dir: 'images/info', file: i.id+'.jpg'))
printHtmlPart(24)
codecOut.print(createLinkTo(dir: 'images/info', file: 'default.jpg'))
printHtmlPart(25)
}
printHtmlPart(26)
invokeTag('formatDate','g',59,['format':("yyyy-MM-dd"),'date':(i.lastUpdated)],-1)
printHtmlPart(27)
codecOut.print(i?.title?.encodeAsHTML())
printHtmlPart(28)
})
invokeTag('link','g',61,['controller':("info"),'action':("show"),'id':(i.id)],3)
printHtmlPart(29)
}
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',73,[:],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352990328859L
public static final String DEFAULT_CODEC = null
}
