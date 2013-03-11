import com.sjzsqjy.www.statistics.Data
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_datalist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/data/list.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("sta")],-1)
printHtmlPart(2)
invokeTag('javascript','g',8,['src':("My97DatePicker/WdatePicker.js")],-1)
printHtmlPart(3)
invokeTag('resources','jq',9,[:],-1)
printHtmlPart(3)
invokeTag('resources','paginate',10,[:],-1)
printHtmlPart(3)
invokeTag('resources','calendar',11,['lang':("cn")],-1)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
createClosureForHtmlPart(5, 2)
invokeTag('link','g',16,['class':("home"),'controller':("index"),'action':("staIndex")],2)
printHtmlPart(6)
createTagBody(2, {->
printHtmlPart(7)
invokeTag('message','g',19,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(0)
})
invokeTag('link','g',20,['class':("create"),'action':("create")],2)
printHtmlPart(8)
codecOut.print(condition)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('formatDate','g',26,['format':("yyyy-MM-dd"),'date':(new Date()-30)],-1)
printHtmlPart(11)
invokeTag('formatDate','g',28,['format':("yyyy-MM-dd"),'date':(new Date())],-1)
printHtmlPart(12)
invokeTag('submitToRemote','g',31,['controller':("data"),'action':("search"),'update':("update"),'value':("检索")],-1)
printHtmlPart(13)
})
invokeTag('form','g',33,['controller':("data"),'action':("search")],2)
printHtmlPart(14)
invokeTag('message','g',40,['code':("data.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',43,['property':("name"),'title':(message(code: 'data.name.label', default: 'Name'))],-1)
printHtmlPart(16)
invokeTag('message','g',45,['code':("data.item.label"),'default':("Item")],-1)
printHtmlPart(17)
invokeTag('sortableColumn','g',49,['property':("money"),'title':(message(code: 'data.money.label', default: 'Money'))],-1)
printHtmlPart(18)
invokeTag('sortableColumn','g',51,['property':("date"),'title':(message(code: 'data.date.label', default: 'date'))],-1)
printHtmlPart(19)
loop:{
int i = 0
for( dataInstance in (pageAjaxList) ) {
printHtmlPart(20)
createTagBody(3, {->
printHtmlPart(21)
codecOut.print(dataInstance[1])
printHtmlPart(22)
})
invokeTag('link','g',65,['target':("_blank"),'action':("show"),'id':(dataInstance[0])],3)
printHtmlPart(23)
codecOut.print(dataInstance[2])
printHtmlPart(24)
codecOut.print(dataInstance[3])
printHtmlPart(25)
codecOut.print(dataInstance[4])
printHtmlPart(26)
invokeTag('formatDate','g',78,['format':("yyyy-MM-dd"),'date':(dataInstance[5])],-1)
printHtmlPart(27)
codecOut.print(dataInstance[6])
printHtmlPart(25)
codecOut.print(dataInstance[7])
printHtmlPart(26)
invokeTag('formatDate','g',86,['format':("yyyy-MM-dd hh:mm:ss"),'date':(dataInstance[8])],-1)
printHtmlPart(28)
i++
}
}
printHtmlPart(29)
invokeTag('jquery','paginate',93,['update':("update"),'total':(paginateAjaxTotal),'selectMax':("30")],-1)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',95,[:],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264425L
public static final String DEFAULT_CODEC = null
}
