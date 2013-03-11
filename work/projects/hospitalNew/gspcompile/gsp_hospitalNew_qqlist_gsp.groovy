import com.sjzsqjy.www.site.Qq
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_qqlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/qq/list.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'qq.label', default: 'Qq'))],-1)
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
invokeTag('sortableColumn','g',26,['property':("id"),'title':(message(code: 'qq.id.label', default: 'Id'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',28,['property':("sequence"),'title':(message(code: 'qq.sequence.label', default: 'Sequence'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',30,['property':("code"),'title':(message(code: 'qq.code.label', default: 'Code'))],-1)
printHtmlPart(11)
invokeTag('sortableColumn','g',32,['property':("info"),'title':(message(code: 'qq.info.label', default: 'Info'))],-1)
printHtmlPart(12)
loop:{
int i = 0
for( qqInstance in (qqInstanceList) ) {
printHtmlPart(13)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(14)
createTagBody(3, {->
codecOut.print(fieldValue(bean: qqInstance, field: "id"))
})
invokeTag('link','g',40,['action':("show"),'id':(qqInstance.id)],3)
printHtmlPart(15)
codecOut.print(fieldValue(bean: qqInstance, field: "sequence"))
printHtmlPart(15)
codecOut.print(fieldValue(bean: qqInstance, field: "code"))
printHtmlPart(15)
codecOut.print(fieldValue(bean: qqInstance, field: "info"))
printHtmlPart(16)
i++
}
}
printHtmlPart(17)
invokeTag('paginate','g',54,['total':(qqInstanceTotal)],-1)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',57,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121372846L
public static final String DEFAULT_CODEC = null
}
