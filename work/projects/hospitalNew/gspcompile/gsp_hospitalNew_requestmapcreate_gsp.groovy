import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_requestmapcreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/requestmap/create.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("springSecurityUI")],-1)
printHtmlPart(1)
invokeTag('set','g',5,['var':("entityName"),'value':(message(code: 'requestmap.label', default: 'Requestmap'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',6,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
createTagBody(3, {->
printHtmlPart(6)
invokeTag('textFieldRow','s2ui',25,['name':("url"),'labelCode':("requestmap.url.label"),'bean':(requestmap),'size':("50"),'labelCodeDefault':("URL"),'value':(requestmap?.url)],-1)
printHtmlPart(7)
invokeTag('textFieldRow','s2ui',29,['name':("configAttribute"),'labelCode':("requestmap.configAttribute.label"),'size':("50"),'bean':(requestmap),'labelCodeDefault':("Config Attribute"),'value':(requestmap?.configAttribute)],-1)
printHtmlPart(8)
invokeTag('submitButton','s2ui',35,['elementId':("create"),'form':("requestmapCreateForm"),'messageCode':("default.button.create.label")],-1)
printHtmlPart(9)
})
invokeTag('form','g',43,['action':("save"),'name':("requestmapCreateForm")],3)
printHtmlPart(5)
})
invokeTag('form','s2ui',45,['width':("100%"),'height':("225"),'elementId':("formContainer"),'titleCode':("default.create.label"),'titleCodeArgs':([entityName])],2)
printHtmlPart(10)
})
invokeTag('captureBody','sitemesh',55,[:],1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264455L
public static final String DEFAULT_CODEC = null
}
