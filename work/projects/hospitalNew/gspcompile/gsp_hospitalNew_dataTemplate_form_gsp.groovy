import com.sjzsqjy.www.site.DataTemplate
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_dataTemplate_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dataTemplate/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: dataTemplateInstance, field: 'title', 'error'))
printHtmlPart(1)
invokeTag('message','g',6,['code':("dataTemplate.title.label"),'default':("Title")],-1)
printHtmlPart(2)
invokeTag('textField','g',9,['name':("title"),'value':(dataTemplateInstance?.title)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: dataTemplateInstance, field: 'templateStr', 'error'))
printHtmlPart(4)
invokeTag('message','g',14,['code':("dataTemplate.templateStr.label"),'default':("Template Str")],-1)
printHtmlPart(5)
invokeTag('config','ckeditor',18,['height':("600px"),'width':("800px")],-1)
printHtmlPart(6)
createTagBody(1, {->
codecOut.print(dataTemplateInstance?.templateStr)
})
invokeTag('editor','ckeditor',19,['name':("templateStr")],1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1364473067581L
public static final String DEFAULT_CODEC = null
}
