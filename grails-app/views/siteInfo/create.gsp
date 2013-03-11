
<%@ page import="com.sjzsqjy.www.site.SiteInfo" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'siteInfo.label', default: 'SiteInfo')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}">Home</a></span>
            <span class="menuButton"><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.create.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${siteInfoInstance}">
            <div class="errors">
                <g:renderErrors bean="${siteInfoInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                        
                        <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="name"><g:message code="siteInfo.name.label" default="Name" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: siteInfoInstance, field: 'name', 'errors')}">
                                    <g:textField name="name" value="${siteInfoInstance?.name}" />
                                </td>
                            </tr>
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="keyWords"><g:message code="siteInfo.keyWords.label" default="Key Words" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: siteInfoInstance, field: 'keyWords', 'errors')}">
                                    <g:textField name="keyWords" value="${siteInfoInstance?.keyWords}" />
                                </td>
                            </tr>
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="description"><g:message code="" default="Description" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: siteInfoInstance, field: 'description', 'errors')}">
                                    <g:textField name="description" value="${siteInfoInstance?.description}" />
                                </td>
                            </tr>
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="address"><g:message code="siteInfo.address.label" default="Address" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: siteInfoInstance, field: 'address', 'errors')}">
                                    <g:textField name="address" value="${siteInfoInstance?.address}" />
                                </td>
                            </tr>
                        
                            
                        
                            
                        
                            
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
