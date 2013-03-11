import com.sjzsqjy.www.data.shiqiao.ShiQiaoResult
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_shiQiaoResultlist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/shiQiaoResult/list.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("admin")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'shiQiaoResult.label', default: 'ShiQiaoResult'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
codecOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
codecOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("charValue"),'title':(message(code: 'shiQiaoResult.charValue.label', default: 'Char Value'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("sequence"),'title':(message(code: 'shiQiaoResult.sequence.label', default: 'Sequence'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("date"),'title':(message(code: 'shiQiaoResult.date.label', default: 'Date'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',33,['property':("inputType"),'title':(message(code: 'shiQiaoResult.inputType.label', default: 'Input Type'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',35,['property':("itemCode"),'title':(message(code: 'shiQiaoResult.itemCode.label', default: 'Item Code'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',37,['property':("sampleId"),'title':(message(code: 'shiQiaoResult.sampleId.label', default: 'Sample Id'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( shiQiaoResultInstance in (shiQiaoResultInstanceList) ) {
printHtmlPart(15)
codecOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
createTagBody(3, {->
codecOut.print(fieldValue(bean: shiQiaoResultInstance, field: "charValue"))
})
invokeTag('link','g',45,['action':("show"),'id':(shiQiaoResultInstance.id)],3)
printHtmlPart(17)
codecOut.print(fieldValue(bean: shiQiaoResultInstance, field: "sequence"))
printHtmlPart(17)
codecOut.print(fieldValue(bean: shiQiaoResultInstance, field: "date"))
printHtmlPart(17)
codecOut.print(fieldValue(bean: shiQiaoResultInstance, field: "inputType"))
printHtmlPart(17)
codecOut.print(fieldValue(bean: shiQiaoResultInstance, field: "itemCode"))
printHtmlPart(17)
codecOut.print(fieldValue(bean: shiQiaoResultInstance, field: "sampleId"))
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('paginate','g',62,['total':(shiQiaoResultInstanceTotal)],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340714720894L
public static final String DEFAULT_CODEC = null
}
