import com.sjzsqjy.www.statistics.Data
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_dataedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/data/edit.gsp" }
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
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'data.label', default: 'Data'))],-1)
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
invokeTag('renderErrors','g',24,['bean':(dataInstance),'as':("list")],-1)
printHtmlPart(13)
})
invokeTag('hasErrors','g',26,['bean':(dataInstance)],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('hiddenField','g',28,['name':("id"),'value':(dataInstance?.id)],-1)
printHtmlPart(14)
invokeTag('hiddenField','g',29,['name':("version"),'value':(dataInstance?.version)],-1)
printHtmlPart(15)
invokeTag('message','g',36,['code':("data.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(16)
codecOut.print(hasErrors(bean: dataInstance, field: 'clinic', 'errors'))
printHtmlPart(17)
invokeTag('select','g',39,['name':("clinic.id"),'from':(com.sjzsqjy.www.statistics.Clinic.list()),'optionKey':("id"),'optionValue':("name"),'value':(dataInstance?.clinic?.id)],-1)
printHtmlPart(18)
invokeTag('message','g',45,['code':("data.name.label"),'default':("Name")],-1)
printHtmlPart(16)
codecOut.print(hasErrors(bean: dataInstance, field: 'name', 'errors'))
printHtmlPart(17)
invokeTag('textField','g',48,['name':("name"),'value':(dataInstance?.name)],-1)
printHtmlPart(19)
invokeTag('message','g',54,['code':("data.item.label"),'default':("Item")],-1)
printHtmlPart(16)
codecOut.print(hasErrors(bean: dataInstance, field: 'item', 'errors'))
printHtmlPart(17)
invokeTag('textField','g',57,['name':("item"),'value':(dataInstance?.item)],-1)
printHtmlPart(20)
invokeTag('message','g',65,['code':("data.money.label"),'default':("Money")],-1)
printHtmlPart(16)
codecOut.print(hasErrors(bean: dataInstance, field: 'money', 'errors'))
printHtmlPart(17)
invokeTag('textField','g',68,['name':("money"),'value':(fieldValue(bean: dataInstance, field: 'money'))],-1)
printHtmlPart(21)
invokeTag('message','g',78,['code':("data.date.label"),'default':("Date")],-1)
printHtmlPart(16)
codecOut.print(hasErrors(bean: dataInstance, field: 'date', 'errors'))
printHtmlPart(17)
invokeTag('datePicker','g',81,['name':("date"),'precision':("day"),'value':(dataInstance?.date)],-1)
printHtmlPart(22)
codecOut.print(hasErrors(bean: dataInstance, field: 'date', 'errors'))
printHtmlPart(17)
invokeTag('datePicker','g',89,['name':("dateCreated"),'value':(dataInstance?.dateCreated)],-1)
printHtmlPart(23)
invokeTag('actionSubmit','g',100,['class':("save"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(24)
invokeTag('actionSubmit','g',101,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(25)
})
invokeTag('form','g',103,['method':("post")],2)
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',105,[:],1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264423L
public static final String DEFAULT_CODEC = null
}
