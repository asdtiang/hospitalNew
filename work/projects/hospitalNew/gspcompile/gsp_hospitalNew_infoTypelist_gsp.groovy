import com.sjzsqjy.www.site.InfoType
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_infoTypelist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/infoType/list.gsp" }
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
invokeTag('message','g',18,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
codecOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
invokeTag('sortableColumn','g',29,['property':("name"),'title':(message(code: 'infoType.name.label', default: 'Name'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',31,['property':("sequence"),'title':(message(code: 'infoType.sequence.label', default: 'Sequence'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',33,['property':("image"),'title':(message(code: 'infoType.image.label', default: 'Image'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',35,['property':("indexShow"),'title':(message(code: 'infoType.indexShow.label', default: 'Index Show'))],-1)
printHtmlPart(11)
loop:{
int i = 0
for( infoTypeInstance in (infoTypeInstanceList) ) {
printHtmlPart(12)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(13)
createTagBody(4, {->
codecOut.print(fieldValue(bean: infoTypeInstance, field: "name"))
})
invokeTag('link','g',45,['action':("show"),'id':(infoTypeInstance.id)],4)
printHtmlPart(14)
codecOut.print(fieldValue(bean: infoTypeInstance, field: "sequence"))
printHtmlPart(14)
invokeTag('formatBoolean','g',49,['boolean':(infoTypeInstance.image)],-1)
printHtmlPart(14)
invokeTag('formatBoolean','g',51,['boolean':(infoTypeInstance.indexShow)],-1)
printHtmlPart(15)
i++
}
}
printHtmlPart(16)
invokeTag('paginate','g',59,['total':(infoTypeInstanceTotal)],-1)
printHtmlPart(17)
})
invokeTag('ifAllGranted','sec',62,['roles':("ROLE_ADMIN")],2)
printHtmlPart(3)
})
invokeTag('captureBody','sitemesh',63,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121273325L
public static final String DEFAULT_CODEC = null
}
