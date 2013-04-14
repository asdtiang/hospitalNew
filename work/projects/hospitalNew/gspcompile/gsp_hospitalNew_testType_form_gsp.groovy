import com.sjzsqjy.www.data.TestType
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_testType_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/testType/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: testTypeInstance, field: 'typeName', 'error'))
printHtmlPart(1)
invokeTag('message','g',8,['code':("testType.typeName.label"),'default':("Type Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',11,['name':("typeName"),'value':(testTypeInstance?.typeName)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: testTypeInstance, field: 'typeTag', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("testType.typeTag.label"),'default':("Type Tag")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("typeTag"),'value':(testTypeInstance?.typeTag)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: testTypeInstance, field: 'content', 'error'))
printHtmlPart(5)
invokeTag('message','g',24,['code':("testType.content.label"),'default':("Content")],-1)
printHtmlPart(6)
invokeTag('textArea','g',27,['name':("content"),'value':(testTypeInstance?.content)],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1365341705455L
public static final String DEFAULT_CODEC = null
}
