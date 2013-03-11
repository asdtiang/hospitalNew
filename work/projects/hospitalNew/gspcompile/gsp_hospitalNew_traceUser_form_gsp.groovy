import com.sjzsqjy.www.data.trace.TraceUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_traceUser_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/traceUser/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: traceUserInstance, field: 'sex', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("traceUser.sex.label"),'default':("Sex")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("sex"),'value':(traceUserInstance?.sex)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceUserInstance, field: 'ageInfo', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("traceUser.ageInfo.label"),'default':("Age Info")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("ageInfo"),'value':(traceUserInstance?.ageInfo)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceUserInstance, field: 'sendDoctor', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("traceUser.sendDoctor.label"),'default':("Send Doctor")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("sendDoctor"),'value':(traceUserInstance?.sendDoctor)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceUserInstance, field: 'clinic', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("traceUser.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(2)
invokeTag('select','g',34,['id':("clinic"),'name':("clinic.id"),'from':(com.sjzsqjy.www.statistics.Clinic.list()),'optionKey':("id"),'optionValue':("name"),'value':(traceUserInstance?.clinic?.id),'class':("many-to-one"),'noSelection':(['null': ''])],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceUserInstance, field: 'date', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("traceUser.date.label"),'default':("Date")],-1)
printHtmlPart(2)
invokeTag('textField','g',42,['name':("date"),'value':(traceUserInstance?.date)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceUserInstance, field: 'doctor', 'error'))
printHtmlPart(8)
invokeTag('message','g',47,['code':("traceUser.doctor.label"),'default':("Doctor")],-1)
printHtmlPart(2)
invokeTag('textField','g',50,['name':("doctor"),'value':(traceUserInstance?.doctor)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceUserInstance, field: 'keShi', 'error'))
printHtmlPart(9)
invokeTag('message','g',55,['code':("traceUser.keShi.label"),'default':("Ke Shi")],-1)
printHtmlPart(2)
invokeTag('textField','g',58,['name':("keShi"),'value':(traceUserInstance?.keShi)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceUserInstance, field: 'name', 'error'))
printHtmlPart(10)
invokeTag('message','g',63,['code':("traceUser.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',66,['name':("name"),'value':(traceUserInstance?.name)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceUserInstance, field: 'sampleId', 'error'))
printHtmlPart(11)
invokeTag('message','g',71,['code':("traceUser.sampleId.label"),'default':("Sample Id")],-1)
printHtmlPart(2)
invokeTag('textField','g',74,['name':("sampleId"),'value':(traceUserInstance?.sampleId)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: traceUserInstance, field: 'type', 'error'))
printHtmlPart(12)
invokeTag('message','g',79,['code':("traceUser.type.label"),'default':("Type")],-1)
printHtmlPart(2)
invokeTag('textField','g',82,['name':("type"),'value':(traceUserInstance?.type)],-1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345214488946L
public static final String DEFAULT_CODEC = null
}
