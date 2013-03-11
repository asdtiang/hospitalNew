import org.asdtiang.grails.paginate.TestAjax
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='paginate-ajax', version='0.1')
class gsp_paginateAjax_testAjaxedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/paginate-ajax-0.1/grails-app/views/testAjax/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',8,['var':("entityName"),'value':(message(code: 'testAjax.label', default: 'TestAjax'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',9,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',10,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
codecOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',13,['code':("default.home.label")],-1)
printHtmlPart(6)
createTagBody(2, {->
invokeTag('message','g',14,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',14,['class':("list"),'action':("list")],2)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',18,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
codecOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('renderErrors','g',24,['bean':(testAjaxInstance),'as':("list")],-1)
printHtmlPart(14)
})
invokeTag('hasErrors','g',26,['bean':(testAjaxInstance)],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(15)
invokeTag('hiddenField','g',28,['name':("id"),'value':(testAjaxInstance?.id)],-1)
printHtmlPart(15)
invokeTag('hiddenField','g',29,['name':("version"),'value':(testAjaxInstance?.version)],-1)
printHtmlPart(16)
invokeTag('message','g',36,['code':("testAjax.name.label"),'default':("Name")],-1)
printHtmlPart(17)
codecOut.print(hasErrors(bean: testAjaxInstance, field: 'name', 'errors'))
printHtmlPart(18)
invokeTag('textField','g',39,['name':("name"),'value':(testAjaxInstance?.name)],-1)
printHtmlPart(19)
invokeTag('actionSubmit','g',47,['class':("save"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(20)
invokeTag('actionSubmit','g',48,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(21)
})
invokeTag('form','g',50,['method':("post")],2)
printHtmlPart(22)
})
invokeTag('captureBody','sitemesh',52,[:],1)
printHtmlPart(23)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1332861668000L
public static final String DEFAULT_CODEC = null
}
