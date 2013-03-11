import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_securityInfousercache_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/securityInfo/usercache.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("springSecurityUI")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(4)
if(true && (cache)) {
printHtmlPart(5)
codecOut.print(cache.getClass().name)
printHtmlPart(6)
codecOut.print(cache.size)
printHtmlPart(7)
codecOut.print(cache.status)
printHtmlPart(8)
codecOut.print(cache.name)
printHtmlPart(9)
codecOut.print(cache.guid)
printHtmlPart(10)
codecOut.print(cache.statistics.cacheHits)
printHtmlPart(11)
codecOut.print(cache.statistics.inMemoryHits)
printHtmlPart(12)
codecOut.print(cache.statistics.onDiskHits)
printHtmlPart(13)
codecOut.print(cache.statistics.cacheMisses)
printHtmlPart(14)
codecOut.print(cache.statistics.objectCount)
printHtmlPart(15)
codecOut.print(cache.statistics.memoryStoreObjectCount)
printHtmlPart(16)
codecOut.print(cache.statistics.diskStoreObjectCount)
printHtmlPart(17)
codecOut.print(cache.statistics.statisticsAccuracyDescription)
printHtmlPart(18)
codecOut.print(cache.statistics.averageGetTime)
printHtmlPart(19)
codecOut.print(cache.statistics.evictionCount)
printHtmlPart(20)
codecOut.print(cache.size)
printHtmlPart(21)
codecOut.print(cache.size == 1 ? '' : 's')
printHtmlPart(22)
for( k in (cache.keys) ) {
printHtmlPart(23)
codecOut.print(k)
printHtmlPart(24)
codecOut.print(cache.get(k)?.value)
printHtmlPart(25)
}
printHtmlPart(26)
}
else {
printHtmlPart(27)
}
printHtmlPart(4)
})
invokeTag('captureBody','sitemesh',95,[:],1)
printHtmlPart(28)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340368264689L
public static final String DEFAULT_CODEC = null
}
