import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_clinicshowSearchClinic_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/clinic/showSearchClinic.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
codecOut.print(id)
printHtmlPart(3)
codecOut.print(type)
printHtmlPart(4)
invokeTag('autoComplete','richui',12,['maxResultsDisplayed':("500"),'name':("clinicName"),'action':(createLinkTo('dir': 'data/listClinicByName'))],-1)
printHtmlPart(1)
invokeTag('submitToRemote','g',13,['update':("${type}${id}"),'url':([controller:'clinic',action:'updateClinic']),'value':("更新")],-1)
printHtmlPart(1)
})
invokeTag('form','g',13,['controller':("clinic"),'action':("updateClinic")],1)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340719919679L
public static final String DEFAULT_CODEC = null
}
