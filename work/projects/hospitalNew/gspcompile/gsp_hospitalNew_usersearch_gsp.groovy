import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_usersearch_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/search.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("springSecurityUI")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',6,['code':("spring.security.ui.user.search")],-1)
})
invokeTag('captureTitle','sitemesh',6,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',6,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
createTagBody(3, {->
printHtmlPart(6)
invokeTag('message','g',24,['code':("user.username.label"),'default':("Username")],-1)
printHtmlPart(7)
invokeTag('textField','g',25,['name':("username"),'size':("50"),'maxlength':("255"),'autocomplete':("off"),'value':(username)],-1)
printHtmlPart(8)
invokeTag('message','g',29,['code':("spring.security.ui.search.true")],-1)
printHtmlPart(9)
invokeTag('message','g',30,['code':("spring.security.ui.search.false")],-1)
printHtmlPart(9)
invokeTag('message','g',31,['code':("spring.security.ui.search.either")],-1)
printHtmlPart(10)
invokeTag('message','g',34,['code':("user.enabled.label"),'default':("是否启用")],-1)
printHtmlPart(11)
createTagBody(4, {->
printHtmlPart(12)
out.print(it.radio)
printHtmlPart(13)
})
invokeTag('radioGroup','g',37,['name':("enabled"),'labels':(['','','']),'values':([1,-1,0]),'value':(enabled)],4)
printHtmlPart(14)
})
invokeTag('form','g',41,['action':("userSearch"),'name':("userSearchForm")],3)
printHtmlPart(5)
})
invokeTag('form','s2ui',43,['width':("100%"),'height':("375"),'elementId':("formContainer"),'titleCode':("spring.security.ui.user.search")],2)
printHtmlPart(5)
if(true && (searched)) {
printHtmlPart(3)

def queryParams = [username: username, enabled: enabled, accountExpired: accountExpired, accountLocked: accountLocked, passwordExpired: passwordExpired]

printHtmlPart(15)
invokeTag('sortableColumn','g',55,['property':("username"),'title':(message(code: 'user.username.label', default: 'Username')),'params':(queryParams)],-1)
printHtmlPart(16)
invokeTag('sortableColumn','g',56,['property':("enabled"),'title':("是否启用"),'params':(queryParams)],-1)
printHtmlPart(17)
loop:{
int i = 0
for( user in (results) ) {
printHtmlPart(18)
codecOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(19)
createTagBody(4, {->
codecOut.print(user[1])
})
invokeTag('link','g',64,['action':("edit"),'id':(user[0])],4)
printHtmlPart(20)
invokeTag('formatBoolean','g',65,['boolean':(user[2])],-1)
printHtmlPart(21)
codecOut.print(user[3])
printHtmlPart(22)
i++
}
}
printHtmlPart(23)
invokeTag('paginate','g',74,['total':(totalCount),'params':(queryParams)],-1)
printHtmlPart(24)
invokeTag('paginationSummary','s2ui',78,['total':(totalCount)],-1)
printHtmlPart(25)
}
printHtmlPart(26)
codecOut.print(createLink(action: 'ajaxUserSearch'))
printHtmlPart(27)
invokeTag('initCheckboxes','s2ui',94,[:],-1)
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',98,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340421964183L
public static final String DEFAULT_CODEC = null
}
