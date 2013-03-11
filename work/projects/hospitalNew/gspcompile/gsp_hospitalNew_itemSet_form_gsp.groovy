import com.sjzsqjy.www.data.shiqiao.ItemSet
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_itemSet_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/itemSet/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: itemSetInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("itemSet.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'value':(itemSetInstance?.name)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: itemSetInstance, field: 'unit', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("itemSet.unit.label"),'default':("Unit")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("unit"),'value':(itemSetInstance?.unit)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: itemSetInstance, field: 'code', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("itemSet.code.label"),'default':("Code")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("code"),'value':(itemSetInstance?.code)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: itemSetInstance, field: 'hight', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("itemSet.hight.label"),'default':("Hight")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("hight"),'value':(itemSetInstance?.hight)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: itemSetInstance, field: 'itemType', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("itemSet.itemType.label"),'default':("Item Type")],-1)
printHtmlPart(8)
invokeTag('select','g',42,['id':("itemType"),'name':("itemType.id"),'from':(com.sjzsqjy.www.data.shiqiao.ItemType.list()),'optionKey':("id"),'required':(""),'value':(itemSetInstance?.itemType?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: itemSetInstance, field: 'low', 'error'))
printHtmlPart(9)
invokeTag('message','g',47,['code':("itemSet.low.label"),'default':("Low")],-1)
printHtmlPart(2)
invokeTag('textField','g',50,['name':("low"),'value':(itemSetInstance?.low)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: itemSetInstance, field: 'sequence', 'error'))
printHtmlPart(10)
invokeTag('message','g',55,['code':("itemSet.sequence.label"),'default':("Sequence")],-1)
printHtmlPart(8)
invokeTag('field','g',58,['type':("number"),'name':("sequence"),'required':(""),'value':(itemSetInstance.sequence)],-1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340550336499L
public static final String DEFAULT_CODEC = null
}
