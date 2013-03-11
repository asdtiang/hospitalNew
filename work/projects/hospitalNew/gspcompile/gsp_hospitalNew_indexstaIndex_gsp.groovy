import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_indexstaIndex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index/staIndex.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',4,['code':("site.name"),'args':(['首页'])],-1)
})
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("sta")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(4)
createClosureForHtmlPart(5, 3)
invokeTag('link','g',13,['controller':("shop"),'class':("myLink")],3)
printHtmlPart(6)
createClosureForHtmlPart(7, 3)
invokeTag('link','g',16,['controller':("clinic"),'class':("myLink")],3)
printHtmlPart(8)
createClosureForHtmlPart(9, 3)
invokeTag('link','g',19,['controller':("item"),'class':("myLink")],3)
printHtmlPart(10)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',24,['controller':("data"),'action':("create"),'class':("myLink")],3)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',27,['controller':("sta"),'class':("myLink")],3)
printHtmlPart(14)
createTagBody(3, {->
printHtmlPart(15)
invokeTag('datePicker','g',36,['name':("date"),'precision':("month"),'value':(new Date())],-1)
printHtmlPart(16)
})
invokeTag('form','g',37,['controller':("sta"),'action':("sta"),'target':("_blank")],3)
printHtmlPart(17)
createTagBody(3, {->
printHtmlPart(18)
invokeTag('datePicker','g',43,['name':("date"),'precision':("month"),'value':(new Date())],-1)
printHtmlPart(19)
})
invokeTag('form','g',45,['controller':("sta"),'action':("sumMonth"),'target':("_blank")],3)
printHtmlPart(20)
createClosureForHtmlPart(21, 3)
invokeTag('link','g',48,['controller':("sta"),'action':("sumAll"),'target':("_blank"),'class':("myLink")],3)
printHtmlPart(20)
createClosureForHtmlPart(22, 3)
invokeTag('link','g',51,['controller':("data"),'action':("deleteByDate"),'target':("_blank"),'class':("myLink")],3)
printHtmlPart(20)
createClosureForHtmlPart(23, 3)
invokeTag('link','g',53,['target':("_blank"),'class':("myLink"),'controller':("shiQiaoUser")],3)
printHtmlPart(24)
createClosureForHtmlPart(25, 3)
invokeTag('link','g',54,['target':("_blank"),'class':("myLink"),'controller':("sampleUser")],3)
printHtmlPart(20)
createClosureForHtmlPart(26, 3)
invokeTag('link','g',56,['target':("_blank"),'class':("myLink"),'controller':("traceUser")],3)
printHtmlPart(20)
createClosureForHtmlPart(27, 3)
invokeTag('link','g',58,['target':("_blank"),'class':("myLink"),'controller':("bloodUser")],3)
printHtmlPart(20)
createClosureForHtmlPart(28, 3)
invokeTag('link','g',60,['target':("_blank"),'controller':("user")],3)
printHtmlPart(20)
createClosureForHtmlPart(29, 3)
invokeTag('link','g',62,['target':("_blank"),'controller':("requestmap")],3)
printHtmlPart(20)
createClosureForHtmlPart(30, 3)
invokeTag('link','g',64,['target':("_blank"),'controller':("link")],3)
printHtmlPart(31)
})
invokeTag('ifAllGranted','sec',69,['roles':("ROLE_ADMIN")],2)
printHtmlPart(2)
})
invokeTag('captureBody','sitemesh',70,[:],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345304410224L
public static final String DEFAULT_CODEC = null
}
