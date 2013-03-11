import com.sjzsqjy.www.site.Info
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_infolist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/info/list.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'info.label', default: 'Info'))],-1)
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
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(4)
createTagBody(3, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],3)
printHtmlPart(5)
})
invokeTag('ifAllGranted','sec',17,['roles':("ROLE_ADMIN")],2)
printHtmlPart(6)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
codecOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
invokeTag('sortableColumn','g',27,['property':("title"),'title':(message(code: 'info.title.label', default: 'Title'))],-1)
printHtmlPart(11)
invokeTag('message','g',29,['code':("info.infoType.label"),'default':("Info Type")],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',31,['property':("lastUpdated"),'title':(message(code: 'lastUpdated.label', default: 'Last Updated'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',33,['property':("dateCreated"),'title':(message(code: 'dateCreated.label', default: 'Date Created'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( infoInstance in (infoInstanceList) ) {
printHtmlPart(15)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(16)
createTagBody(3, {->
codecOut.print(fieldValue(bean: infoInstance, field: "title"))
})
invokeTag('link','g',41,['action':("show"),'id':(infoInstance.id)],3)
printHtmlPart(17)
codecOut.print(infoInstance?.infoType?.name)
printHtmlPart(17)
invokeTag('formatDate','g',45,['date':(infoInstance.lastUpdated)],-1)
printHtmlPart(17)
invokeTag('formatDate','g',47,['date':(infoInstance.dateCreated)],-1)
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('paginate','g',55,['total':(infoInstanceTotal)],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',58,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121372483L
public static final String DEFAULT_CODEC = null
}
