import com.sjzsqjy.www.site.SiteInfo
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_siteInfocreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/siteInfo/create.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'siteInfo.label', default: 'SiteInfo'))],-1)
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
invokeTag('renderErrors','g',23,['bean':(siteInfoInstance),'as':("list")],-1)
printHtmlPart(12)
})
invokeTag('hasErrors','g',25,['bean':(siteInfoInstance)],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('message','g',34,['code':("siteInfo.name.label"),'default':("Name")],-1)
printHtmlPart(14)
codecOut.print(hasErrors(bean: siteInfoInstance, field: 'name', 'errors'))
printHtmlPart(15)
invokeTag('textField','g',37,['name':("name"),'value':(siteInfoInstance?.name)],-1)
printHtmlPart(16)
invokeTag('message','g',42,['code':("siteInfo.keyWords.label"),'default':("Key Words")],-1)
printHtmlPart(14)
codecOut.print(hasErrors(bean: siteInfoInstance, field: 'keyWords', 'errors'))
printHtmlPart(15)
invokeTag('textField','g',45,['name':("keyWords"),'value':(siteInfoInstance?.keyWords)],-1)
printHtmlPart(17)
invokeTag('message','g',50,['code':(""),'default':("Description")],-1)
printHtmlPart(14)
codecOut.print(hasErrors(bean: siteInfoInstance, field: 'description', 'errors'))
printHtmlPart(15)
invokeTag('textField','g',53,['name':("description"),'value':(siteInfoInstance?.description)],-1)
printHtmlPart(18)
invokeTag('message','g',58,['code':("siteInfo.address.label"),'default':("Address")],-1)
printHtmlPart(14)
codecOut.print(hasErrors(bean: siteInfoInstance, field: 'address', 'errors'))
printHtmlPart(15)
invokeTag('textField','g',61,['name':("address"),'value':(siteInfoInstance?.address)],-1)
printHtmlPart(19)
invokeTag('submitButton','g',75,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(20)
})
invokeTag('form','g',77,['action':("save"),'method':("post")],2)
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',79,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121372713L
public static final String DEFAULT_CODEC = null
}
