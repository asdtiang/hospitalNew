import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_stastaResult_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/sta/staResult.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("null")],-1)
printHtmlPart(3)
codecOut.print(resource(dir: 'css', file: 'sta.css'))
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',16,[:],1)
printHtmlPart(5)
loop:{
int j = 0
for( result in (resultList) ) {
printHtmlPart(6)
codecOut.print(result?.name)
printHtmlPart(7)
codecOut.print(month)
printHtmlPart(8)
invokeTag('message','g',24,['code':("data.date.label"),'default':("date")],-1)
printHtmlPart(9)
invokeTag('message','g',26,['code':("data.name.label"),'default':("name")],-1)
printHtmlPart(9)
invokeTag('message','g',28,['code':("data.item.label"),'default':("Item")],-1)
printHtmlPart(10)
invokeTag('message','g',31,['code':("data.money.label"),'default':("money")],-1)
printHtmlPart(11)
loop:{
int i = 0
for( dataInstance in (resultList[j].dataList) ) {
printHtmlPart(12)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(13)
invokeTag('formatDate','g',37,['format':("yyyy-MM-dd"),'date':(dataInstance.date)],-1)
printHtmlPart(14)
codecOut.print(fieldValue(bean: dataInstance, field: "name"))
printHtmlPart(15)
codecOut.print(dataInstance?.item)
printHtmlPart(16)
codecOut.print(fieldValue(bean: dataInstance, field: "money"))
printHtmlPart(17)
i++
}
}
printHtmlPart(18)
codecOut.print(result.sum)
printHtmlPart(19)
j++
}
}
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264499L
public static final String DEFAULT_CODEC = null
}
