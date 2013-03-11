import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_bloodSearchresult_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/bloodSearch/result.gsp" }
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
invokeTag('set','g',10,['var':("entityName"),'value':(message(code: 'reslut.label', default: 'ItemType'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',11,['code':("site.name"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(5)
codecOut.print(patient?.name)
printHtmlPart(6)
codecOut.print(patient?.sendDate)
printHtmlPart(6)
codecOut.print(patient?.testDate)
printHtmlPart(6)
codecOut.print(patient?.doorNum)
printHtmlPart(7)
codecOut.print(patient?.patientNum)
printHtmlPart(8)
codecOut.print(patient?.sex)
printHtmlPart(6)
codecOut.print(patient?.sendDoctor)
printHtmlPart(7)
codecOut.print(patient?.testDoctor)
printHtmlPart(6)
codecOut.print(patient?.hospitalNum)
printHtmlPart(6)
codecOut.print(patient?.bedNum)
printHtmlPart(8)
codecOut.print(patient?.age)
printHtmlPart(6)
codecOut.print(patient?.keBie)
printHtmlPart(6)
codecOut.print(patient?.sampleId)
printHtmlPart(6)
codecOut.print(patient?.type)
printHtmlPart(9)
loop:{
int i = 0
for( resultInstance in (resultList) ) {
printHtmlPart(10)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(11)
codecOut.print(resultInstance.item)
printHtmlPart(12)
codecOut.print(fieldValue(bean: resultInstance, field: "value"))
printHtmlPart(13)
codecOut.print(fieldValue(bean: resultInstance, field: "result"))
printHtmlPart(14)
if(true && (sex==1)) {
printHtmlPart(15)
codecOut.print(resultInstance.normalList1[i][0])
printHtmlPart(16)
codecOut.print(resultInstance.normalList1[i][1])
printHtmlPart(17)
}
else {
codecOut.print(resultInstance.normalList[i][0])
printHtmlPart(16)
codecOut.print(resultInstance.normalList[i][1])
}
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
codecOut.print(createLinkTo(dir: 'images', file:'blood.jpg'))
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',132,['id':("center")],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264574L
public static final String DEFAULT_CODEC = null
}
