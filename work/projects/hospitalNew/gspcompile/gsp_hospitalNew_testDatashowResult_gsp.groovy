import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_testDatashowResult_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/testData/showResult.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
codecOut.print(resource(dir:'css',file:'main.css'))
printHtmlPart(3)
codecOut.print(resource(dir:'images',file:'favicon.ico'))
printHtmlPart(4)
invokeTag('set','g',14,['var':("entityName"),'value':(message(code: 'reslut.label', default: 'ItemType'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',16,['code':("site.name"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',16,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',16,[:],2)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',16,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(5)
codecOut.print(result)
printHtmlPart(1)
})
invokeTag('captureBody','sitemesh',17,['id':("body")],1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1365349421939L
public static final String DEFAULT_CODEC = null
}
