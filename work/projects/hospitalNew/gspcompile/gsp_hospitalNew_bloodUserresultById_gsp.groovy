import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_bloodUserresultById_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bloodUser/resultById.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
codecOut.print(resource(dir:'css',file:'main.css'))
printHtmlPart(3)
codecOut.print(resource(dir:'images',file:'favicon.ico'))
printHtmlPart(4)
createTagBody(2, {->
createTagBody(3, {->
printHtmlPart(5)
codecOut.print(patient.name)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
codecOut.print(patient?.name)
printHtmlPart(8)
codecOut.print(patient?.sendDate)
printHtmlPart(8)
codecOut.print(patient?.testDate)
printHtmlPart(8)
codecOut.print(patient.checkNum)
printHtmlPart(9)
codecOut.print(patient?.patientNum)
printHtmlPart(10)
codecOut.print(patient?.sex)
printHtmlPart(8)
codecOut.print(patient?.sendDoctor)
printHtmlPart(9)
codecOut.print(patient?.testDoctor)
printHtmlPart(8)
codecOut.print(patient?.hospitalNum)
printHtmlPart(8)
codecOut.print(patient?.bedNum)
printHtmlPart(10)
codecOut.print(patient?.age)
printHtmlPart(8)
codecOut.print(patient?.keBie)
printHtmlPart(8)
codecOut.print(patient?.sampleId)
printHtmlPart(8)
codecOut.print(patient?.type)
printHtmlPart(11)
loop:{
int i = 0
for( resultInstance in (resultList) ) {
printHtmlPart(12)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(13)
codecOut.print(resultInstance[0])
printHtmlPart(14)
codecOut.print(resultInstance[1])
printHtmlPart(15)
if(true && (resultInstance[1]<resultInstance[2])) {
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (resultInstance[1]>resultInstance[3])) {
printHtmlPart(18)
}
printHtmlPart(19)
codecOut.print(resultInstance[2])
printHtmlPart(20)
codecOut.print(resultInstance[3])
printHtmlPart(21)
i++
}
}
printHtmlPart(22)
codecOut.print(createLinkTo(dir: 'images', file:'blood.jpg'))
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',130,['id':("center")],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1345301542941L
public static final String DEFAULT_CODEC = null
}
