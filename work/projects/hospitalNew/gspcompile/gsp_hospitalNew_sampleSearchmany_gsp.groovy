import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_sampleSearchmany_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/sampleSearch/many.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'search.title', default: 'ItemType'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("site.name"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
if(true && (flash.message)) {
printHtmlPart(3)
codecOut.print(flash.message)
printHtmlPart(4)
}
printHtmlPart(5)
invokeTag('sortableColumn','g',25,['property':("name"),'title':(message(code: 'name.label', default: 'Id'))],-1)
printHtmlPart(6)
invokeTag('sortableColumn','g',29,['property':("sampleId"),'title':(message(code: 'sample.no.label', default: 'Name'))],-1)
printHtmlPart(7)
loop:{
int i = 0
for( patient in (patientList) ) {
printHtmlPart(8)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(9)
createTagBody(3, {->
printHtmlPart(10)
codecOut.print(fieldValue(bean:patient, field: "name"))
printHtmlPart(11)
})
invokeTag('link','g',41,['controller':("sampleSearch"),'action':("result"),'params':([sampleId:patient.sampleId])],3)
printHtmlPart(12)
codecOut.print(fieldValue(bean: patient, field: "sampleId"))
printHtmlPart(13)
i++
}
}
printHtmlPart(14)
})
invokeTag('captureBody','sitemesh',56,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1352121372734L
public static final String DEFAULT_CODEC = null
}
