import com.sjzsqjy.www.site.FeedBack
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_feedBack_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/feedBack/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: feedBackInstance, field: 'unitName', 'error'))
printHtmlPart(1)
invokeTag('textField','g',17,['name':("unitName"),'size':("20"),'required':(""),'value':(feedBackInstance?.unitName)],-1)
printHtmlPart(2)
codecOut.print(hasErrors(bean: feedBackInstance, field: 'comment', 'error'))
printHtmlPart(3)
invokeTag('message','g',22,['code':("feedBack.comment.label"),'default':("Comment")],-1)
printHtmlPart(4)
invokeTag('textArea','g',25,['cols':("50"),'rows':("5"),'name':("comment"),'required':(""),'value':(feedBackInstance?.comment)],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352992193575L
public static final String DEFAULT_CODEC = null
}
