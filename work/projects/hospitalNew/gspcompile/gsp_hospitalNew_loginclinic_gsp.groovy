import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_loginclinic_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/clinic.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(4)
invokeTag('resources','jq',13,[:],-1)
printHtmlPart(4)
invokeTag('resources','paginate',13,[:],-1)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',14,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
invokeTag('username','sec',14,[:],-1)
printHtmlPart(7)
if(true && (session.clinicName!=null)) {
codecOut.print(session.clinicName)
}
printHtmlPart(5)
if(true && (session.clinicId!=null)) {
printHtmlPart(5)
invokeTag('include','g',19,['controller':("sampleUser"),'action':("listByClinicId"),'params':([clinicId:session.clinicId])],-1)
printHtmlPart(8)
invokeTag('include','g',21,['controller':("shiQiaoUser"),'action':("listByClinicId"),'params':([clinicId:session.clinicId])],-1)
printHtmlPart(9)
invokeTag('include','g',23,['controller':("traceUser"),'action':("listByClinicId"),'params':([clinicId:session.clinicId])],-1)
printHtmlPart(10)
invokeTag('include','g',25,['controller':("bloodUser"),'action':("listByClinicId"),'params':([clinicId:session.clinicId])],-1)
printHtmlPart(5)
}
else {
printHtmlPart(11)
}
printHtmlPart(12)
})
invokeTag('captureBody','sitemesh',27,[:],1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1353246148829L
public static final String DEFAULT_CODEC = null
}
