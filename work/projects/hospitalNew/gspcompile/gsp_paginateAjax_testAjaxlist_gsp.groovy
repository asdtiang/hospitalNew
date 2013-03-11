import org.asdtiang.grails.paginate.TestAjax
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='paginate-ajax', version='0.1')
class gsp_paginateAjax_testAjaxlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/paginate-ajax-0.1/grails-app/views/testAjax/list.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('resources','jq',7,[:],-1)
printHtmlPart(2)
invokeTag('resources','paginate',8,[:],-1)
printHtmlPart(2)
invokeTag('set','g',9,['var':("entityName"),'value':(message(code: 'testAjax.label', default: 'TestAjax'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',10,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
codecOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',16,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',17,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',17,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',20,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
codecOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',29,['property':("id"),'title':(message(code: 'testAjax.id.label', default: 'Id'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("name"),'title':(message(code: 'testAjax.name.label', default: 'Name'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( testAjaxInstance in (dataList) ) {
printHtmlPart(15)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(16)
createTagBody(3, {->
codecOut.print(fieldValue(bean: testAjaxInstance, field: "id"))
})
invokeTag('link','g',39,['action':("show"),'id':(testAjaxInstance.id)],3)
printHtmlPart(17)
codecOut.print(fieldValue(bean: testAjaxInstance, field: "name"))
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('jquery','paginate',49,['update':("update"),'total':(dataTotal),'selectMax':("15")],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',53,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1332861668000L
public static final String DEFAULT_CODEC = null
}
