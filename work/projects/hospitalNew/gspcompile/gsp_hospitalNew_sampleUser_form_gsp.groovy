import com.sjzsqjy.www.data.sample.SampleUser
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_sampleUser_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/sampleUser/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
codecOut.print(hasErrors(bean: sampleUserInstance, field: 'name', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("sampleUser.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("name"),'value':(sampleUserInstance?.name)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: sampleUserInstance, field: 'sex', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("sampleUser.sex.label"),'default':("Sex")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("sex"),'value':(sampleUserInstance?.sex)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: sampleUserInstance, field: 'age', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("sampleUser.age.label"),'default':("Age")],-1)
printHtmlPart(2)
invokeTag('textField','g',26,['name':("age"),'value':(sampleUserInstance?.age)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: sampleUserInstance, field: 'sendDoctor', 'error'))
printHtmlPart(6)
invokeTag('message','g',31,['code':("sampleUser.sendDoctor.label"),'default':("Send Doctor")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("sendDoctor"),'value':(sampleUserInstance?.sendDoctor)],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: sampleUserInstance, field: 'clinic', 'error'))
printHtmlPart(7)
invokeTag('message','g',39,['code':("sampleUser.clinic.label"),'default':("Clinic")],-1)
printHtmlPart(2)
invokeTag('select','g',42,['id':("clinic"),'name':("clinic.id"),'from':(com.sjzsqjy.www.statistics.Clinic.list()),'optionKey':("id"),'value':(sampleUserInstance?.clinic?.id),'class':("many-to-one"),'noSelection':(['null': ''])],-1)
printHtmlPart(3)
codecOut.print(hasErrors(bean: sampleUserInstance, field: 'sampleId', 'error'))
printHtmlPart(8)
invokeTag('message','g',47,['code':("sampleUser.sampleId.label"),'default':("Sample Id")],-1)
printHtmlPart(2)
invokeTag('textField','g',50,['name':("sampleId"),'value':(sampleUserInstance?.sampleId)],-1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1341931842658L
public static final String DEFAULT_CODEC = null
}
