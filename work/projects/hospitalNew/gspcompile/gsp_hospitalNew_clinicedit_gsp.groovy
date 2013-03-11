import com.sjzsqjy.www.statistics.Clinic
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_clinicedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/clinic/edit.gsp" }
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
invokeTag('message','g',9,['code':("default.edit.label"),'args':([entityName])],-1)
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
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(7)
invokeTag('message','g',18,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
codecOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('renderErrors','g',24,['bean':(clinicInstance),'as':("list")],-1)
printHtmlPart(13)
})
invokeTag('hasErrors','g',26,['bean':(clinicInstance)],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('hiddenField','g',28,['name':("id"),'value':(clinicInstance?.id)],-1)
printHtmlPart(14)
invokeTag('hiddenField','g',29,['name':("version"),'value':(clinicInstance?.version)],-1)
printHtmlPart(15)
invokeTag('message','g',36,['code':("clinic.name.label"),'default':("Name")],-1)
printHtmlPart(16)
codecOut.print(hasErrors(bean: clinicInstance, field: 'name', 'errors'))
printHtmlPart(17)
invokeTag('textField','g',39,['name':("name"),'value':(clinicInstance?.name)],-1)
printHtmlPart(18)
codecOut.print(hasErrors(bean: clinicInstance, field: 'shop', 'errors'))
printHtmlPart(19)
invokeTag('select','g',49,['name':("shop.id"),'from':(com.sjzsqjy.www.statistics.Shop.list()),'optionValue':("name"),'value':(clinicInstance?.shop?.id),'optionKey':("id")],-1)
printHtmlPart(20)
invokeTag('message','g',54,['code':("clinic.checkOutWay.label"),'default':("checkOutWay")],-1)
printHtmlPart(16)
codecOut.print(hasErrors(bean: clinicInstance, field: 'checkOutWay', 'errors'))
printHtmlPart(19)
invokeTag('select','g',57,['name':("checkOutWay"),'from':([[id:1,name:'月结'],[id:2,name:'次结']]),'optionValue':("name"),'value':(clinicInstance?.checkOutWay),'optionKey':("id")],-1)
printHtmlPart(21)
invokeTag('message','g',63,['code':("clinic.info.label"),'default':("Info")],-1)
printHtmlPart(16)
codecOut.print(hasErrors(bean: clinicInstance, field: 'info', 'errors'))
printHtmlPart(17)
invokeTag('textField','g',66,['name':("info"),'value':(clinicInstance?.info)],-1)
printHtmlPart(22)
invokeTag('actionSubmit','g',74,['class':("save"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(23)
invokeTag('actionSubmit','g',75,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(24)
})
invokeTag('form','g',77,['method':("post")],2)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',79,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264439L
public static final String DEFAULT_CODEC = null
}
