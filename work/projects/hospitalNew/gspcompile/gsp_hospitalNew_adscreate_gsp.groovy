import com.sjzsqjy.www.site.Ads
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_adscreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/ads/create.gsp" }
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
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'ads.label', default: 'Ads'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.create.label"),'args':([entityName])],-1)
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
codecOut.print(createLink(uri: '/'))
printHtmlPart(5)
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("list"),'action':("list")],2)
printHtmlPart(6)
invokeTag('message','g',17,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(7)
if(true && (flash.message)) {
printHtmlPart(8)
codecOut.print(flash.message)
printHtmlPart(9)
}
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
invokeTag('renderErrors','g',23,['bean':(adsInstance),'as':("list")],-1)
printHtmlPart(12)
})
invokeTag('hasErrors','g',25,['bean':(adsInstance)],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('message','g',33,['code':("ads.height.label"),'default':("Height")],-1)
printHtmlPart(14)
codecOut.print(hasErrors(bean: adsInstance, field: 'height', 'errors'))
printHtmlPart(15)
invokeTag('textField','g',36,['name':("height"),'value':(fieldValue(bean: adsInstance, field: 'height'))],-1)
printHtmlPart(16)
invokeTag('message','g',42,['code':("ads.sequence.label"),'default':("Sequence")],-1)
printHtmlPart(14)
codecOut.print(hasErrors(bean: adsInstance, field: 'sequence', 'errors'))
printHtmlPart(15)
invokeTag('textField','g',45,['name':("sequence"),'value':(fieldValue(bean: adsInstance, field: 'sequence'))],-1)
printHtmlPart(17)
invokeTag('message','g',51,['code':("ads.width.label"),'default':("Width")],-1)
printHtmlPart(14)
codecOut.print(hasErrors(bean: adsInstance, field: 'width', 'errors'))
printHtmlPart(15)
invokeTag('textField','g',54,['name':("width"),'value':(fieldValue(bean: adsInstance, field: 'width'))],-1)
printHtmlPart(18)
invokeTag('message','g',60,['code':("ads.name.label"),'default':("Name")],-1)
printHtmlPart(14)
codecOut.print(hasErrors(bean: adsInstance, field: 'name', 'errors'))
printHtmlPart(15)
invokeTag('textField','g',63,['name':("name"),'value':(adsInstance?.name)],-1)
printHtmlPart(19)
invokeTag('message','g',69,['code':("ads.code.label"),'default':("Code")],-1)
printHtmlPart(14)
codecOut.print(hasErrors(bean: adsInstance, field: 'code', 'errors'))
printHtmlPart(15)
invokeTag('textField','g',72,['name':("code"),'value':(adsInstance?.code)],-1)
printHtmlPart(20)
invokeTag('message','g',78,['code':("ads.info.label"),'default':("Info")],-1)
printHtmlPart(14)
codecOut.print(hasErrors(bean: adsInstance, field: 'info', 'errors'))
printHtmlPart(15)
invokeTag('textField','g',81,['name':("info"),'value':(adsInstance?.info)],-1)
printHtmlPart(21)
invokeTag('submitButton','g',89,['name':("create"),'class':("save"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(22)
})
invokeTag('form','g',91,['action':("save"),'method':("post")],2)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',93,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121372630L
public static final String DEFAULT_CODEC = null
}
