import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_usercreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/create.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("springSecurityUI")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',7,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',12,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
codecOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(8)
invokeTag('renderErrors','g',18,['bean':(user),'as':("list")],-1)
printHtmlPart(9)
})
invokeTag('hasErrors','g',20,['bean':(user)],2)
printHtmlPart(3)
createTagBody(2, {->
printHtmlPart(3)

def tabData = []
tabData << [name: 'userinfo', icon: 'icon_user', messageCode: 'spring.security.ui.user.info']
tabData << [name: 'roles',    icon: 'icon_role', messageCode: 'spring.security.ui.user.roles']

printHtmlPart(3)
createTagBody(3, {->
printHtmlPart(10)
invokeTag('autoComplete','resource',31,['skin':("default")],-1)
printHtmlPart(1)
createTagBody(4, {->
printHtmlPart(11)
invokeTag('textFieldRow','s2ui',37,['name':("username"),'labelCode':("user.username.label"),'bean':(user),'labelCodeDefault':("Username"),'value':(user?.username)],-1)
printHtmlPart(12)
invokeTag('passwordFieldRow','s2ui',40,['name':("password"),'labelCode':("user.password.label"),'bean':(user),'labelCodeDefault':("Password"),'value':(user?.password)],-1)
printHtmlPart(13)
invokeTag('autoComplete','richui',43,['maxResultsDisplayed':("500"),'name':("clinicName"),'action':(createLinkTo('dir': 'data/listClinicByName'))],-1)
printHtmlPart(14)
invokeTag('textFieldRow','s2ui',46,['name':("email"),'bean':(user),'labelCode':("user.email.label"),'labelCodeDefault':("邮箱"),'value':(user?.email)],-1)
printHtmlPart(12)
invokeTag('checkboxRow','s2ui',49,['name':("enabled"),'labelCode':("user.enabled.label"),'bean':(user),'labelCodeDefault':("Enabled"),'value':("true")],-1)
printHtmlPart(12)
invokeTag('checkboxRow','s2ui',52,['name':("accountExpired"),'labelCode':("user.accountExpired.label"),'bean':(user),'labelCodeDefault':("Account Expired"),'value':(user?.accountExpired)],-1)
printHtmlPart(12)
invokeTag('checkboxRow','s2ui',55,['name':("accountLocked"),'labelCode':("user.accountLocked.label"),'bean':(user),'labelCodeDefault':("Account Locked"),'value':(user?.accountLocked)],-1)
printHtmlPart(12)
invokeTag('checkboxRow','s2ui',58,['name':("passwordExpired"),'labelCode':("user.passwordExpired.label"),'bean':(user),'labelCodeDefault':("Password Expired"),'value':(user?.passwordExpired)],-1)
printHtmlPart(15)
})
invokeTag('tab','s2ui',63,['name':("userinfo"),'height':("280")],4)
printHtmlPart(16)
createTagBody(4, {->
printHtmlPart(17)
for( auth in (authorityList) ) {
printHtmlPart(18)
invokeTag('checkBox','g',68,['name':(auth.authority)],-1)
printHtmlPart(19)
createTagBody(6, {->
codecOut.print(auth.authority.encodeAsHTML())
})
invokeTag('link','g',69,['controller':("role"),'action':("edit"),'id':(auth.id)],6)
printHtmlPart(20)
}
printHtmlPart(1)
})
invokeTag('tab','s2ui',72,['name':("roles"),'height':("280")],4)
printHtmlPart(3)
})
invokeTag('tabs','s2ui',74,['elementId':("tabs"),'height':("375"),'data':(tabData)],3)
printHtmlPart(21)
invokeTag('submitButton','s2ui',77,['elementId':("create"),'form':("userCreateForm"),'messageCode':("default.button.create.label")],-1)
printHtmlPart(22)
})
invokeTag('form','g',80,['action':("save"),'name':("userCreateForm")],2)
printHtmlPart(23)
invokeTag('initCheckboxes','s2ui',85,[:],-1)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',89,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340419070401L
public static final String DEFAULT_CODEC = null
}
