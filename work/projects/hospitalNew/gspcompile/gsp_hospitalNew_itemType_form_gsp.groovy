import com.sjzsqjy.www.data.shiqiao.ItemType
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_itemType_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/itemType/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: itemTypeInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("itemType.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'value':(itemTypeInstance?.name)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: itemTypeInstance, field: 'symbol', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("itemType.symbol.label"),'default':("Symbol")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("symbol"),'value':(itemTypeInstance?.symbol)],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340550367861L
public static final String DEFAULT_CODEC = null
}
