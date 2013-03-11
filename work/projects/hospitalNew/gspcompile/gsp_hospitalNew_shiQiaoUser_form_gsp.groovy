import com.sjzsqjy.www.data.shiqiao.ShiQiaoUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_shiQiaoUser_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/shiQiaoUser/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: shiQiaoUserInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("shiQiaoUser.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'value':(shiQiaoUserInstance?.name)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: shiQiaoUserInstance, field: 'sex', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("shiQiaoUser.sex.label"),'default':("Sex")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("sex"),'value':(shiQiaoUserInstance?.sex)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: shiQiaoUserInstance, field: 'doctor', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("shiQiaoUser.doctor.label"),'default':("Doctor")],-1)
printHtmlPart(2)
invokeTag('select','g',26,['id':("doctor"),'name':("doctor.id"),'from':(com.sjzsqjy.www.data.shiqiao.Doctor.list()),'optionKey':("id"),'optionValue':("name"),'value':(shiQiaoUserInstance?.doctor?.id),'class':("many-to-one"),'noSelection':(['null': ''])],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: shiQiaoUserInstance, field: 'clinic', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("shiQiaoUser.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(2)
invokeTag('select','g',34,['id':("clinic"),'name':("clinic.id"),'from':(com.sjzsqjy.www.statistics.Clinic.list()),'optionKey':("id"),'optionValue':("name"),'value':(shiQiaoUserInstance?.clinic?.id),'class':("many-to-one"),'noSelection':(['null': ''])],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: shiQiaoUserInstance, field: 'birth', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("shiQiaoUser.birth.label"),'default':("birth")],-1)
printHtmlPart(2)
invokeTag('textField','g',42,['name':("birth"),'value':(shiQiaoUserInstance?.birth)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: shiQiaoUserInstance, field: 'date', 'error'))
printHtmlPart(8)
invokeTag('message','g',47,['code':("shiQiaoUser.date.label"),'default':("Date")],-1)
printHtmlPart(2)
invokeTag('textField','g',50,['name':("date"),'value':(shiQiaoUserInstance?.date)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: shiQiaoUserInstance, field: 'sampleId', 'error'))
printHtmlPart(9)
invokeTag('message','g',55,['code':("shiQiaoUser.sampleId.label"),'default':("Sample Id")],-1)
printHtmlPart(2)
invokeTag('textField','g',58,['name':("sampleId"),'value':(shiQiaoUserInstance?.sampleId)],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345214196781L
public static final String DEFAULT_CODEC = null
}
