import com.sjzsqjy.www.statistics.Clinic
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_cliniclist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/clinic/list.gsp" }
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
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("sta")],-1)
printHtmlPart(2)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'clinic.label', default: 'Clinic'))],-1)
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
createClosureForHtmlPart(5, 2)
invokeTag('link','g',13,['class':("home"),'controller':("index"),'action':("staIndex")],2)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("create"),'action':("create")],2)
printHtmlPart(7)
invokeTag('message','g',17,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
codecOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('sortableColumn','g',25,['property':("id"),'title':(message(code: 'clinic.id.label', default: 'ID'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',26,['property':("name"),'title':(message(code: 'clinic.name.label', default: 'Name'))],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("shop"),'title':("店名")],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',28,['property':("shop"),'title':(message(code: 'clinic.checkOutWay.label', default: 'Info'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',29,['property':("info"),'title':(message(code: 'clinic.info.label', default: 'Info'))],-1)
printHtmlPart(15)
loop:{
int i = 0
for( clinicInstance in (clinicInstanceList) ) {
printHtmlPart(16)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(17)
codecOut.print(clinicInstance?.id)
printHtmlPart(18)
createTagBody(3, {->
codecOut.print(fieldValue(bean: clinicInstance, field: "name"))
})
invokeTag('link','g',36,['action':("show"),'id':(clinicInstance.id)],3)
printHtmlPart(18)
createTagBody(3, {->
codecOut.print(fieldValue(bean: clinicInstance.shop, field: "name"))
})
invokeTag('link','g',37,['controller':("shop"),'action':("show"),'id':(clinicInstance.shop.id)],3)
printHtmlPart(19)
codecOut.print(clinicInstance?.checkOutWay==1?'月结':'次结')
printHtmlPart(18)
codecOut.print(fieldValue(bean: clinicInstance, field: "info"))
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
invokeTag('paginate','g',47,['total':(clinicInstanceTotal)],-1)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',50,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264441L
public static final String DEFAULT_CODEC = null
}
