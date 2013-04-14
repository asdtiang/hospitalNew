import com.sjzsqjy.www.site.CustomData
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_customData_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/customData/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(g.createLink(controller:'dataTemplate',action:'changeTemplate'))
printHtmlPart(1)
codecOut.print(hasErrors(bean: customDataInstance, field: 'clinic', 'error'))
printHtmlPart(2)
invokeTag('message','g',30,['code':("customData.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(3)
invokeTag('autoComplete','richui',37,['maxResultsDisplayed':("500"),'name':("clinicName"),'value':(customDataInstance?.clinic?.name),'action':(createLinkTo('dir': 'data/listClinicByName'))],-1)
printHtmlPart(4)
codecOut.print(hasErrors(bean: customDataInstance, field: 'template', 'error'))
printHtmlPart(5)
invokeTag('message','g',43,['code':("customData.template.label"),'default':("Template")],-1)
printHtmlPart(6)
invokeTag('select','g',46,['id':("template"),'name':("template.id"),'onchange':("changeTemplate();"),'from':(com.sjzsqjy.www.site.DataTemplate.list()),'optionKey':("id"),'required':(""),'optionValue':("title"),'value':(customDataInstance?.template?.id),'class':("many-to-one")],-1)
printHtmlPart(7)
codecOut.print(hasErrors(bean: customDataInstance, field: 'patientName', 'error'))
printHtmlPart(8)
invokeTag('message','g',54,['code':("customData.patientName.label"),'default':("Patient Name")],-1)
printHtmlPart(9)
invokeTag('textField','g',57,['name':("patientName"),'value':(customDataInstance?.patientName)],-1)
printHtmlPart(10)
codecOut.print(hasErrors(bean: customDataInstance, field: 'testDate', 'error'))
printHtmlPart(11)
invokeTag('message','g',64,['code':("customData.testDate.label"),'default':("Test Date")],-1)
printHtmlPart(6)
invokeTag('datePicker','g',67,['name':("testDate"),'precision':("day"),'value':(customDataInstance?.testDate)],-1)
printHtmlPart(12)
codecOut.print(hasErrors(bean: customDataInstance, field: 'data', 'error'))
printHtmlPart(13)
invokeTag('message','g',72,['code':("customData.data.label"),'default':("Data")],-1)
printHtmlPart(14)
invokeTag('config','ckeditor',74,['height':("600px"),'width':("800px")],-1)
printHtmlPart(15)
createTagBody(1, {->
codecOut.print(customDataInstance?.data)
})
invokeTag('editor','ckeditor',75,['name':("data")],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1365771637423L
public static final String DEFAULT_CODEC = null
}
