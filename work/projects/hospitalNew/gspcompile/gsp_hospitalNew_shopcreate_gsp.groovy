import com.sjzsqjy.www.statistics.Shop
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_shopcreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/shop/create.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("sta")],-1)
printHtmlPart(1)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'shop.label', default: 'Shop'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
createClosureForHtmlPart(3, 2)
invokeTag('link','g',14,['class':("home"),'controller':("index"),'action':("staIndex")],2)
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('message','g',16,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(6)
})
invokeTag('link','g',17,['class':("list"),'action':("list")],2)
printHtmlPart(7)
invokeTag('message','g',21,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(8)
if(true && (flash.message)) {
printHtmlPart(9)
codecOut.print(flash.message)
printHtmlPart(10)
}
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
createTagBody(3, {->
printHtmlPart(13)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(14)
codecOut.print(error.field)
printHtmlPart(15)
}
printHtmlPart(16)
invokeTag('message','g',33,['error':(error)],-1)
printHtmlPart(17)
})
invokeTag('eachError','g',34,['bean':(shopInstance),'var':("error")],3)
printHtmlPart(18)
})
invokeTag('hasErrors','g',36,['bean':(shopInstance)],2)
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(19)
invokeTag('render','g',39,['template':("form")],-1)
printHtmlPart(20)
invokeTag('submitButton','g',43,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(21)
})
invokeTag('form','g',45,['action':("save")],2)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',47,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264656L
public static final String DEFAULT_CODEC = null
}
