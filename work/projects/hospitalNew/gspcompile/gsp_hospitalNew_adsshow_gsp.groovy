import com.sjzsqjy.www.site.Ads
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_adsshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/ads/show.gsp" }
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
codecOut.print(createLink(uri: '/'))
printHtmlPart(5)
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
invokeTag('message','g',27,['code':("ads.id.label"),'default':("Id")],-1)
printHtmlPart(12)
codecOut.print(fieldValue(bean: adsInstance, field: "id"))
printHtmlPart(13)
invokeTag('message','g',34,['code':("ads.height.label"),'default':("Height")],-1)
printHtmlPart(12)
codecOut.print(fieldValue(bean: adsInstance, field: "height"))
printHtmlPart(13)
invokeTag('message','g',41,['code':("ads.sequence.label"),'default':("Sequence")],-1)
printHtmlPart(12)
codecOut.print(fieldValue(bean: adsInstance, field: "sequence"))
printHtmlPart(13)
invokeTag('message','g',48,['code':("ads.width.label"),'default':("Width")],-1)
printHtmlPart(12)
codecOut.print(fieldValue(bean: adsInstance, field: "width"))
printHtmlPart(13)
invokeTag('message','g',55,['code':("ads.name.label"),'default':("Name")],-1)
printHtmlPart(12)
codecOut.print(fieldValue(bean: adsInstance, field: "name"))
printHtmlPart(13)
invokeTag('message','g',62,['code':("ads.code.label"),'default':("Code")],-1)
printHtmlPart(12)
codecOut.print(adsInstance?.code)
printHtmlPart(13)
invokeTag('message','g',69,['code':("ads.info.label"),'default':("Info")],-1)
printHtmlPart(12)
codecOut.print(fieldValue(bean: adsInstance, field: "info"))
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
invokeTag('hiddenField','g',80,['name':("id"),'value':(adsInstance?.id)],-1)
printHtmlPart(16)
invokeTag('actionSubmit','g',81,['class':("edit"),'action':("edit"),'value':(message(code: 'default.button.edit.label', default: 'Edit'))],-1)
printHtmlPart(17)
invokeTag('actionSubmit','g',82,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(18)
})
invokeTag('form','g',83,[:],2)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',86,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121372792L
public static final String DEFAULT_CODEC = null
}
