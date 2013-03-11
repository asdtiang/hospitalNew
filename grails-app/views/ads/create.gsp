
<%@ page import="com.sjzsqjy.www.site.Ads" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'ads.label', default: 'Ads')}" />
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
            <g:hasErrors bean="${adsInstance}">
            <div class="errors">
                <g:renderErrors bean="${adsInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="height"><g:message code="ads.height.label" default="Height" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: adsInstance, field: 'height', 'errors')}">
                                    <g:textField name="height" value="${fieldValue(bean: adsInstance, field: 'height')}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="sequence"><g:message code="ads.sequence.label" default="Sequence" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: adsInstance, field: 'sequence', 'errors')}">
                                    <g:textField name="sequence" value="${fieldValue(bean: adsInstance, field: 'sequence')}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="width"><g:message code="ads.width.label" default="Width" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: adsInstance, field: 'width', 'errors')}">
                                    <g:textField name="width" value="${fieldValue(bean: adsInstance, field: 'width')}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="name"><g:message code="ads.name.label" default="Name" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: adsInstance, field: 'name', 'errors')}">
                                    <g:textField name="name" value="${adsInstance?.name}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="code"><g:message code="ads.code.label" default="Code" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: adsInstance, field: 'code', 'errors')}">
                                    <g:textField name="code" value="${adsInstance?.code}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="info"><g:message code="ads.info.label" default="Info" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: adsInstance, field: 'info', 'errors')}">
                                    <g:textField name="info" value="${adsInstance?.info}" />
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
