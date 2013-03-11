import com.sjzsqjy.www.data.shiqiao.ShiQiaoResult
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_shiQiaoResult_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/shiQiaoResult/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: shiQiaoResultInstance, field: 'charValue', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("shiQiaoResult.charValue.label"),'default':("Char Value")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("charValue"),'value':(shiQiaoResultInstance?.charValue)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: shiQiaoResultInstance, field: 'sequence', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("shiQiaoResult.sequence.label"),'default':("Sequence")],-1)
printHtmlPart(5)
invokeTag('field','g',18,['type':("number"),'name':("sequence"),'required':(""),'value':(shiQiaoResultInstance.sequence)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: shiQiaoResultInstance, field: 'date', 'error'))
printHtmlPart(6)
invokeTag('message','g',23,['code':("shiQiaoResult.date.label"),'default':("Date")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("date"),'value':(shiQiaoResultInstance?.date)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: shiQiaoResultInstance, field: 'inputType', 'error'))
printHtmlPart(7)
invokeTag('message','g',31,['code':("shiQiaoResult.inputType.label"),'default':("Input Type")],-1)
printHtmlPart(5)
invokeTag('field','g',34,['type':("number"),'name':("inputType"),'required':(""),'value':(shiQiaoResultInstance.inputType)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: shiQiaoResultInstance, field: 'itemCode', 'error'))
printHtmlPart(8)
invokeTag('message','g',39,['code':("shiQiaoResult.itemCode.label"),'default':("Item Code")],-1)
printHtmlPart(2)
invokeTag('textField','g',42,['name':("itemCode"),'value':(shiQiaoResultInstance?.itemCode)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: shiQiaoResultInstance, field: 'sampleId', 'error'))
printHtmlPart(9)
invokeTag('message','g',47,['code':("shiQiaoResult.sampleId.label"),'default':("Sample Id")],-1)
printHtmlPart(2)
invokeTag('textField','g',50,['name':("sampleId"),'value':(shiQiaoResultInstance?.sampleId)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: shiQiaoResultInstance, field: 'typeId', 'error'))
printHtmlPart(10)
invokeTag('message','g',55,['code':("shiQiaoResult.typeId.label"),'default':("Type Id")],-1)
printHtmlPart(2)
invokeTag('textField','g',58,['name':("typeId"),'value':(shiQiaoResultInstance?.typeId)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: shiQiaoResultInstance, field: 'value', 'error'))
printHtmlPart(11)
invokeTag('message','g',63,['code':("shiQiaoResult.value.label"),'default':("Value")],-1)
printHtmlPart(2)
invokeTag('textField','g',66,['name':("value"),'value':(shiQiaoResultInstance?.value)],-1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340550388202L
public static final String DEFAULT_CODEC = null
}
