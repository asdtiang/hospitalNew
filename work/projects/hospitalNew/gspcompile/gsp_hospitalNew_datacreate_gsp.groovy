import com.sjzsqjy.www.statistics.Data
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_datacreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/data/create.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(0)
invokeTag('javascript','g',7,['src':("My97DatePicker/WdatePicker.js")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("sta")],-1)
printHtmlPart(0)
invokeTag('set','g',10,['var':("entityName"),'value':(message(code: 'data.label', default: 'Data'))],-1)
printHtmlPart(0)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',12,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',52,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(3)
createClosureForHtmlPart(4, 2)
invokeTag('link','g',56,['class':("home"),'controller':("index"),'action':("staIndex")],2)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('message','g',58,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(7)
})
invokeTag('link','g',59,['class':("list"),'action':("list")],2)
printHtmlPart(8)
invokeTag('message','g',63,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
codecOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('renderErrors','g',72,['bean':(dataInstance),'as':("list")],-1)
printHtmlPart(11)
})
invokeTag('hasErrors','g',74,['bean':(dataInstance)],2)
printHtmlPart(12)
invokeTag('autoComplete','resource',75,['skin':("default")],-1)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('message','g',83,['code':("data.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(15)
codecOut.print(hasErrors(bean: dataInstance, field: 'clinic', 'errors'))
printHtmlPart(16)
invokeTag('autoComplete','richui',87,['maxResultsDisplayed':("500"),'name':("clinicName"),'action':(createLinkTo('dir': 'data/searchAJAX'))],-1)
printHtmlPart(17)
invokeTag('message','g',93,['code':("data.name.label"),'default':("Name")],-1)
printHtmlPart(18)
codecOut.print(hasErrors(bean: dataInstance, field: 'name', 'errors'))
printHtmlPart(16)
invokeTag('textField','g',96,['name':("name"),'value':(dataInstance?.name)],-1)
printHtmlPart(19)
invokeTag('message','g',102,['code':("data.item.label"),'default':("Item")],-1)
printHtmlPart(18)
codecOut.print(hasErrors(bean: dataInstance, field: 'item', 'errors'))
printHtmlPart(20)
invokeTag('checkBoxListItem','g',108,['name':("items"),'from':(com.sjzsqjy.www.statistics.Item.list()),'optionKey':("name"),'optionValue':("price"),'lineCount':("7")],-1)
printHtmlPart(21)
invokeTag('message','g',115,['code':("data.money.label"),'default':("Money")],-1)
printHtmlPart(18)
codecOut.print(hasErrors(bean: dataInstance, field: 'money', 'errors'))
printHtmlPart(16)
invokeTag('textField','g',119,['name':("money"),'value':(fieldValue(bean: dataInstance, field: 'money'))],-1)
printHtmlPart(22)
invokeTag('message','g',125,['code':("data.date.label"),'default':("Date")],-1)
printHtmlPart(18)
codecOut.print(hasErrors(bean: dataInstance, field: 'date', 'errors'))
printHtmlPart(23)
invokeTag('submitButton','g',155,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(24)
})
invokeTag('form','g',157,['action':("save"),'method':("post")],2)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',159,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264418L
public static final String DEFAULT_CODEC = null
}
