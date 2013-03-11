import com.sjzsqjy.www.statistics.Data
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_datashow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/data/show.gsp" }
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
invokeTag('message','g',9,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('message','g',18,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
codecOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('message','g',29,['code':("data.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(12)
createTagBody(2, {->
codecOut.print(dataInstance?.clinic?.name?.encodeAsHTML())
})
invokeTag('link','g',31,['controller':("clinic"),'action':("show"),'id':(dataInstance?.clinic?.id)],2)
printHtmlPart(13)
invokeTag('message','g',36,['code':("data.name.label"),'default':("Name")],-1)
printHtmlPart(12)
codecOut.print(fieldValue(bean: dataInstance, field: "name"))
printHtmlPart(13)
invokeTag('message','g',43,['code':("data.item.label"),'default':("Item")],-1)
printHtmlPart(12)
codecOut.print(dataInstance?.item?.encodeAsHTML())
printHtmlPart(14)
invokeTag('message','g',52,['code':("data.money.label"),'default':("Money")],-1)
printHtmlPart(12)
codecOut.print(fieldValue(bean: dataInstance, field: "money"))
printHtmlPart(15)
invokeTag('message','g',62,['code':("data.date.label"),'default':("Date")],-1)
printHtmlPart(12)
invokeTag('formatDate','g',64,['format':("yyyy-MM-dd"),'date':(dataInstance?.date)],-1)
printHtmlPart(16)
invokeTag('message','g',70,['code':("data.dateCreated.label"),'default':("Date")],-1)
printHtmlPart(12)
invokeTag('formatDate','g',72,['format':("yyyy-MM-dd hh:mm:ss"),'date':(dataInstance?.dateCreated)],-1)
printHtmlPart(17)
createTagBody(2, {->
printHtmlPart(18)
invokeTag('hiddenField','g',81,['name':("id"),'value':(dataInstance?.id)],-1)
printHtmlPart(19)
invokeTag('actionSubmit','g',82,['class':("edit"),'action':("edit"),'value':(message(code: 'default.button.edit.label', default: 'Edit'))],-1)
printHtmlPart(20)
invokeTag('actionSubmit','g',83,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(21)
})
invokeTag('form','g',84,[:],2)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',87,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264420L
public static final String DEFAULT_CODEC = null
}
