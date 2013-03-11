
<%@ page import="com.sjzsqjy.www.site.Qq" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'qq.label', default: 'Qq')}" />
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
            <g:hasErrors bean="${qqInstance}">
            <div class="errors">
                <g:renderErrors bean="${qqInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="save" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="sequence"><g:message code="qq.sequence.label" default="Sequence" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: qqInstance, field: 'sequence', 'errors')}">
                                    <g:textField name="sequence" value="${qqInstance?.sequence}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="code"><g:message code="qq.code.label" default="Code" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: qqInstance, field: 'code', 'errors')}">
                                    <g:textArea name="code" value="${qqInstance?.code}" rows="5" cols="40"/>
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="info"><g:message code="qq.info.label" default="Info" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: qqInstance, field: 'info', 'errors')}">
                                    <g:textField name="info" value="${qqInstance?.info}" />
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
