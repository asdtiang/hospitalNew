
<%@ page import="com.sjzsqjy.www.site.InfoType" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'infoType.label', default: 'InfoType')}" />
        <title><g:message code="default.edit.label" args="[entityName]" /></title>
    </head>
    <body>
    <sec:ifAllGranted roles="ROLE_ADMIN">
        <div class="nav">
           
            <span class="menuButton"><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></span>
            <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.edit.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${infoTypeInstance}">
            <div class="errors">
                <g:renderErrors bean="${infoTypeInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <g:hiddenField name="id" value="${infoTypeInstance?.id}" />
                <g:hiddenField name="version" value="${infoTypeInstance?.version}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="name"><g:message code="infoType.name.label" default="Name" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: infoTypeInstance, field: 'name', 'errors')}">
                                    <g:textField name="name" value="${infoTypeInstance?.name}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="sequence"><g:message code="infoType.sequence.label" default="Sequence" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: infoTypeInstance, field: 'sequence', 'errors')}">
                                    <g:textField name="sequence" value="${fieldValue(bean: infoTypeInstance, field: 'sequence')}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="image"><g:message code="infoType.image.label" default="Image" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: infoTypeInstance, field: 'image', 'errors')}">
                                    <g:checkBox name="image" value="${infoTypeInstance?.image}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="indexShow"><g:message code="infoType.indexShow.label" default="Index Show" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: infoTypeInstance, field: 'indexShow', 'errors')}">
                                    <g:checkBox name="indexShow" value="${infoTypeInstance?.indexShow}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="info"><g:message code="infoType.info.label" default="Info" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: infoTypeInstance, field: 'info', 'errors')}">
                                    
<ul>
<g:each in="${infoTypeInstance?.info?}" var="i">
    <li><g:link controller="info" action="show" id="${i.id}">${i?.title?.encodeAsHTML()}</g:link></li>
</g:each>
</ul>
<g:link controller="info" action="create" params="['infoType.id': infoTypeInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'info.label', default: 'Info')])}</g:link>

                                </td>
                            </tr>
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:actionSubmit class="save" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" /></span>
                    <span class="button"><g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" /></span>
                </div>
            </g:form>
        </div>
        </sec:ifAllGranted>
    </body>
</html>
