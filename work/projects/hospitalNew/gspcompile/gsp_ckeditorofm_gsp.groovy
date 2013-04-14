import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='ckeditor', version='3.6.3.0')
class gsp_ckeditorofm_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/ckeditor-3.6.3.0/grails-app/views/ofm.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("content-type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(4)
codecOut.print(resource(dir: 'js/ofm/styles', file:'reset.css', plugin: 'ckeditor'))
printHtmlPart(5)
codecOut.print(resource(dir: 'js/ofm/scripts/jquery.filetree', file:'jqueryFileTree.css', plugin: 'ckeditor'))
printHtmlPart(5)
codecOut.print(resource(dir: 'js/ofm/scripts/jquery.contextmenu', file:'jquery.contextMenu-1.01.css', plugin: 'ckeditor'))
printHtmlPart(5)
codecOut.print(resource(dir: 'js/ofm/styles', file:'filemanager.css', plugin: 'ckeditor'))
printHtmlPart(6)
codecOut.print(resource(dir: 'js/ofm/styles', file:'ie.css', plugin: 'ckeditor'))
printHtmlPart(7)
codecOut.print(resource(dir: 'js/ofm', plugin: 'ckeditor'))
printHtmlPart(8)
codecOut.print(ofm.currentLocale())
printHtmlPart(9)
codecOut.print(params.viewMode)
printHtmlPart(10)
codecOut.print(params.fileConnector)
printHtmlPart(11)
codecOut.print(params.showThumbs)
printHtmlPart(12)
codecOut.print(params.space)
printHtmlPart(13)
codecOut.print(params.type)
printHtmlPart(14)
codecOut.print(ofm.baseUrl(space: params.space, type: params.type))
printHtmlPart(15)
})
invokeTag('captureHead','sitemesh',32,[:],1)
printHtmlPart(16)
createTagBody(1, {->
printHtmlPart(17)
codecOut.print(resource(dir: 'js/ofm/scripts', file:'jquery-1.6.1.min.js', plugin: 'ckeditor'))
printHtmlPart(18)
codecOut.print(resource(dir: 'js/ofm/scripts', file:'jquery.form-2.63.js', plugin: 'ckeditor'))
printHtmlPart(18)
codecOut.print(resource(dir: 'js/ofm/scripts/jquery.splitter', file:'jquery.splitter-1.5.1.js', plugin: 'ckeditor'))
printHtmlPart(18)
codecOut.print(resource(dir: 'js/ofm/scripts/jquery.filetree', file:'jqueryFileTree.js', plugin: 'ckeditor'))
printHtmlPart(18)
codecOut.print(resource(dir: 'js/ofm/scripts/jquery.contextmenu', file:'jquery.contextMenu-1.01.js', plugin: 'ckeditor'))
printHtmlPart(18)
codecOut.print(resource(dir: 'js/ofm/scripts', file:'jquery.impromptu-3.1.min.js', plugin: 'ckeditor'))
printHtmlPart(18)
codecOut.print(resource(dir: 'js/ofm/scripts', file:'jquery.tablesorter-2.0.5b.min.js', plugin: 'ckeditor'))
printHtmlPart(18)
codecOut.print(resource(dir: 'js/ofm/scripts', file:'filemanager.js', plugin: 'ckeditor'))
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',75,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1335606498000L
public static final String DEFAULT_CODEC = null
}
