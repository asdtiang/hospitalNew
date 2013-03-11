import org.codehaus.groovy.grails.plugins.PluginManagerHolder
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_hospitalNew_useredit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(2)
if(true && (user.username)) {
printHtmlPart(2)
invokeTag('set','g',8,['var':("canRunAs"),'value':(true)],-1)
printHtmlPart(2)
}
printHtmlPart(2)
})
invokeTag('ifAllGranted','sec',10,['roles':("ROLE_SWITCH_USER")],2)
printHtmlPart(3)
})
invokeTag('ifNotSwitched','sec',11,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("springSecurityUI")],-1)
printHtmlPart(2)
invokeTag('set','g',15,['var':("entityName"),'value':(message(code: 'user.label', default: 'User'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',16,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',16,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',16,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',17,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',21,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(5)
createTagBody(2, {->
printHtmlPart(3)
invokeTag('hiddenField','g',24,['name':("id"),'value':(user?.id)],-1)
printHtmlPart(3)
invokeTag('hiddenField','g',25,['name':("version"),'value':(user?.version)],-1)
printHtmlPart(1)

def tabData = []
tabData << [name: 'userinfo', icon: 'icon_user', messageCode: 'spring.security.ui.user.info']
tabData << [name: 'roles',    icon: 'icon_role', messageCode: 'spring.security.ui.user.roles']
boolean isOpenId = PluginManagerHolder.pluginManager.hasGrailsPlugin('springSecurityOpenid')
if (isOpenId) {
	tabData << [name: 'openIds', icon: 'icon_role', messageCode: 'spring.security.ui.user.openIds']
}

printHtmlPart(1)
createTagBody(3, {->
printHtmlPart(6)
createTagBody(4, {->
printHtmlPart(7)
invokeTag('textFieldRow','s2ui',44,['name':("username"),'labelCode':("user.username.label"),'bean':(user),'labelCodeDefault':("Username"),'value':(user?.username)],-1)
printHtmlPart(8)
invokeTag('passwordFieldRow','s2ui',47,['name':("password"),'labelCode':("user.password.label"),'bean':(user),'labelCodeDefault':("Password"),'value':(user?.password)],-1)
printHtmlPart(9)
codecOut.print(clinicName)
printHtmlPart(10)
invokeTag('textFieldRow','s2ui',52,['name':("email"),'bean':(user),'labelCode':("user.email.label"),'labelCodeDefault':("邮箱"),'value':(user?.email)],-1)
printHtmlPart(8)
invokeTag('checkboxRow','s2ui',55,['name':("enabled"),'labelCode':("user.enabled.label"),'bean':(user),'labelCodeDefault':("Enabled"),'value':(user?.enabled)],-1)
printHtmlPart(11)
invokeTag('checkboxRow','s2ui',58,['name':("accountExpired"),'labelCode':("user.accountExpired.label"),'bean':(user),'labelCodeDefault':("Account Expired"),'value':(user?.accountExpired)],-1)
printHtmlPart(8)
invokeTag('checkboxRow','s2ui',61,['name':("accountLocked"),'labelCode':("user.accountLocked.label"),'bean':(user),'labelCodeDefault':("Account Locked"),'value':(user?.accountLocked)],-1)
printHtmlPart(8)
invokeTag('checkboxRow','s2ui',64,['name':("passwordExpired"),'labelCode':("user.passwordExpired.label"),'bean':(user),'labelCodeDefault':("Password Expired"),'value':(user?.passwordExpired)],-1)
printHtmlPart(12)
})
invokeTag('tab','s2ui',68,['name':("userinfo"),'height':("275")],4)
printHtmlPart(6)
createTagBody(4, {->
printHtmlPart(13)
for( entry in (roleMap) ) {
printHtmlPart(14)
invokeTag('checkBox','g',73,['name':(entry.key.authority),'value':(entry.value)],-1)
printHtmlPart(15)
createTagBody(6, {->
codecOut.print(entry.key.authority.encodeAsHTML())
})
invokeTag('link','g',74,['controller':("role"),'action':("edit"),'id':(entry.key.id)],6)
printHtmlPart(16)
}
printHtmlPart(2)
})
invokeTag('tab','s2ui',77,['name':("roles"),'height':("275")],4)
printHtmlPart(6)
if(true && (isOpenId)) {
printHtmlPart(2)
createTagBody(5, {->
printHtmlPart(2)
if(true && (user?.openIds)) {
printHtmlPart(17)
for( openId in (user.openIds) ) {
printHtmlPart(18)
codecOut.print(openId.url)
printHtmlPart(19)
}
printHtmlPart(20)
}
else {
printHtmlPart(21)
}
printHtmlPart(2)
})
invokeTag('tab','s2ui',91,['name':("openIds"),'height':("275")],5)
printHtmlPart(2)
}
printHtmlPart(1)
})
invokeTag('tabs','s2ui',94,['elementId':("tabs"),'height':("375"),'data':(tabData)],3)
printHtmlPart(22)
invokeTag('submitButton','s2ui',97,['elementId':("update"),'form':("userEditForm"),'messageCode':("default.button.update.label")],-1)
printHtmlPart(1)
if(true && (user)) {
printHtmlPart(3)
invokeTag('deleteButton','s2ui',100,[:],-1)
printHtmlPart(3)
}
printHtmlPart(1)
if(true && (canRunAs)) {
printHtmlPart(23)
codecOut.print(message(code:'spring.security.ui.runas.submit'))
printHtmlPart(24)
}
printHtmlPart(25)
})
invokeTag('form','g',109,['action':("update"),'name':("userEditForm"),'class':("button-style")],2)
printHtmlPart(1)
if(true && (user)) {
printHtmlPart(3)
invokeTag('deleteButtonForm','s2ui',112,['instanceId':(user.id)],-1)
printHtmlPart(3)
}
printHtmlPart(1)
if(true && (canRunAs)) {
printHtmlPart(26)
codecOut.print(request.contextPath)
printHtmlPart(27)
invokeTag('hiddenField','g',117,['name':("j_username"),'value':(user.username)],-1)
printHtmlPart(28)
}
printHtmlPart(29)
invokeTag('initCheckboxes','s2ui',126,[:],-1)
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',135,[:],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1340420335556L
public static final String DEFAULT_CODEC = null
}
