import com.sjzsqjy.www.statistics.Clinic
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_cliniccreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/clinic/create.gsp" }
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
createClosureForHtmlPart(5, 2)
invokeTag('link','g',13,['class':("home"),'controller':("index"),'action':("staIndex")],2)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("list"),'action':("list")],2)
printHtmlPart(7)
invokeTag('message','g',17,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
codecOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('renderErrors','g',23,['bean':(clinicInstance),'as':("list")],-1)
printHtmlPart(13)
})
invokeTag('hasErrors','g',25,['bean':(clinicInstance)],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('message','g',33,['code':("clinic.name.label"),'default':("Name")],-1)
printHtmlPart(15)
codecOut.print(hasErrors(bean: clinicInstance, field: 'name', 'errors'))
printHtmlPart(16)
invokeTag('textField','g',36,['name':("name"),'value':(clinicInstance?.name)],-1)
printHtmlPart(17)
codecOut.print(hasErrors(bean: clinicInstance, field: 'shop', 'errors'))
printHtmlPart(18)
invokeTag('select','g',46,['name':("shop.id"),'from':(com.sjzsqjy.www.statistics.Shop.list()),'optionValue':("name"),'value':(clinicInstance?.shop?.id),'optionKey':("id")],-1)
printHtmlPart(19)
invokeTag('message','g',53,['code':("clinic.checkOutWay.label"),'default':("checkOutWay")],-1)
printHtmlPart(15)
codecOut.print(hasErrors(bean: clinicInstance, field: 'checkOutWay', 'errors'))
printHtmlPart(18)
invokeTag('select','g',56,['name':("checkOutWay"),'from':([[id:1,name:'月结'],[id:2,name:'次结']]),'optionValue':("name"),'value':(clinicInstance?.checkOutWay),'optionKey':("id")],-1)
printHtmlPart(20)
invokeTag('message','g',62,['code':("clinic.info.label"),'default':("Info")],-1)
printHtmlPart(15)
codecOut.print(hasErrors(bean: clinicInstance, field: 'info', 'errors'))
printHtmlPart(16)
invokeTag('textField','g',65,['name':("info"),'value':(clinicInstance?.info)],-1)
printHtmlPart(21)
invokeTag('submitButton','g',73,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(22)
})
invokeTag('form','g',75,['action':("save"),'method':("post")],2)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',77,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264436L
public static final String DEFAULT_CODEC = null
}
