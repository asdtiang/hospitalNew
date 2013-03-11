import com.sjzsqjy.www.statistics.Data
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_datalistData_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/data/listData.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('javascript','g',4,['library':("prototype")],-1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("sta")],-1)
printHtmlPart(2)
invokeTag('set','g',10,['var':("entityName"),'value':(message(code: 'data.label', default: 'Data'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',11,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
createClosureForHtmlPart(4, 2)
invokeTag('link','g',15,['class':("home"),'controller':("index"),'action':("staIndex")],2)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(6)
invokeTag('message','g',17,['code':("default.new.label"),'args':([entityName])],-1)
printHtmlPart(2)
})
invokeTag('link','g',18,['class':("create"),'action':("create")],2)
printHtmlPart(7)
invokeTag('message','g',20,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
codecOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(2)
invokeTag('javascript','g',26,['library':("prototype")],-1)
printHtmlPart(11)
invokeTag('message','g',34,['code':("data.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(12)
invokeTag('sortableColumn','g',37,['property':("name"),'title':(message(code: 'data.name.label', default: 'Name'))],-1)
printHtmlPart(13)
invokeTag('message','g',39,['code':("data.item.label"),'default':("Item")],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',43,['property':("money"),'title':(message(code: 'data.money.label', default: 'Money'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',45,['property':("date"),'title':(message(code: 'data.date.label', default: 'date'))],-1)
printHtmlPart(16)
loop:{
int i = 0
for( dataInstance in (sealInstanceList) ) {
printHtmlPart(17)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(18)
createTagBody(3, {->
printHtmlPart(19)
codecOut.print(dataInstance?.clinic?.name)
printHtmlPart(20)
})
invokeTag('link','g',56,['action':("show"),'id':(dataInstance.id)],3)
printHtmlPart(21)
codecOut.print(fieldValue(bean: dataInstance, field: "name"))
printHtmlPart(22)
codecOut.print(dataInstance?.item)
printHtmlPart(23)
codecOut.print(fieldValue(bean: dataInstance, field: "money"))
printHtmlPart(24)
invokeTag('formatDate','g',69,['format':("yyyy-MM-dd"),'date':(dataInstance.date)],-1)
printHtmlPart(25)
codecOut.print(fieldValue(bean: dataInstance, field: "month"))
printHtmlPart(23)
codecOut.print(fieldValue(bean: dataInstance, field: "year"))
printHtmlPart(24)
invokeTag('formatDate','g',77,['format':("yyyy-MM-dd hh:mm:ss"),'date':(dataInstance.dateCreated)],-1)
printHtmlPart(26)
i++
}
}
printHtmlPart(27)
if(true && ("${params.pageNow!=1} ")) {
printHtmlPart(28)
createClosureForHtmlPart(29, 3)
invokeTag('remoteLink','g',88,['controller':("data"),'action':("page"),'update':("listData"),'params':([pageNow:1])],3)
printHtmlPart(30)
}
else {
printHtmlPart(31)
}
printHtmlPart(32)
if(true && (myParams.pageNow>1)) {
printHtmlPart(28)
createClosureForHtmlPart(33, 3)
invokeTag('remoteLink','g',93,['controller':("data"),'action':("page"),'update':("listData"),'params':([pageNow:myParams.pageNow-1])],3)
printHtmlPart(34)
}
else {
printHtmlPart(35)
}
printHtmlPart(32)

i=0

printHtmlPart(32)
while(i < myParams.pageTotle&&i<20) {
printHtmlPart(6)

i++

printHtmlPart(6)
createTagBody(3, {->
printHtmlPart(36)
codecOut.print(i)
printHtmlPart(6)
})
invokeTag('remoteLink','g',101,['controller':("data"),'action':("page"),'update':("listData"),'params':([pageNow:i])],3)
printHtmlPart(2)
}
printHtmlPart(32)
if(true && (myParams.pageTotle >myParams.pageNow)) {
printHtmlPart(28)
createClosureForHtmlPart(37, 3)
invokeTag('remoteLink','g',104,['controller':("data"),'action':("page"),'update':("listData"),'params':([pageNow:myParams.pageNow+1])],3)
printHtmlPart(38)
}
else {
printHtmlPart(39)
}
printHtmlPart(32)
if(true && (myParams.pageTotle != myParams.pageNow)) {
printHtmlPart(28)
createClosureForHtmlPart(40, 3)
invokeTag('remoteLink','g',109,['controller':("data"),'action':("page"),'update':("listData"),'params':([pageNow:myParams.pageTotle])],3)
printHtmlPart(38)
}
else {
printHtmlPart(41)
}
printHtmlPart(42)
codecOut.print(sealInstanceTotal)
printHtmlPart(43)
})
invokeTag('captureBody','sitemesh',115,[:],1)
printHtmlPart(44)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264406L
public static final String DEFAULT_CODEC = null
}
