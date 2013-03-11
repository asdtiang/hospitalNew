import com.sjzsqjy.www.site.SiteInfo
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_siteInfolist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/siteInfo/list.gsp" }
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
invokeTag('message','g',9,['code':("default.list.label"),'args':([entityName])],-1)
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
invokeTag('message','g',14,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("create"),'action':("create")],2)
printHtmlPart(6)
invokeTag('message','g',17,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
codecOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
invokeTag('sortableColumn','g',28,['property':("address"),'title':(message(code: 'siteInfo.address.label', default: 'Address'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',30,['property':("description"),'title':(message(code: 'siteInfo.description.label', default: 'Description'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',32,['property':("name"),'title':(message(code: 'siteInfo.name.label', default: 'Name'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',34,['property':("keyWords"),'title':(message(code: 'siteInfo.keyWords.label', default: 'Key Words'))],-1)
printHtmlPart(12)
loop:{
int i = 0
for( siteInfoInstance in (siteInfoInstanceList) ) {
printHtmlPart(13)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(14)
createTagBody(3, {->
codecOut.print(fieldValue(bean: siteInfoInstance, field: "address"))
})
invokeTag('link','g',44,['action':("show"),'id':(siteInfoInstance.id)],3)
printHtmlPart(15)
codecOut.print(fieldValue(bean: siteInfoInstance, field: "description"))
printHtmlPart(15)
codecOut.print(fieldValue(bean: siteInfoInstance, field: "name"))
printHtmlPart(15)
codecOut.print(fieldValue(bean: siteInfoInstance, field: "keyWords"))
printHtmlPart(16)
i++
}
}
printHtmlPart(17)
invokeTag('paginate','g',58,['total':(siteInfoInstanceTotal)],-1)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',61,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121372840L
public static final String DEFAULT_CODEC = null
}
