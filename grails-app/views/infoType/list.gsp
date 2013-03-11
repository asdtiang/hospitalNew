
<%@ page import="com.sjzsqjy.www.site.InfoType" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'infoType.label', default: 'InfoType')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
    <sec:ifAllGranted roles="ROLE_ADMIN">
        <div class="nav">
            
            <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                           
                        
                            <g:sortableColumn property="name" title="${message(code: 'infoType.name.label', default: 'Name')}" />
                        
                            <g:sortableColumn property="sequence" title="${message(code: 'infoType.sequence.label', default: 'Sequence')}" />
                        
                            <g:sortableColumn property="image" title="${message(code: 'infoType.image.label', default: 'Image')}" />
                        
                            <g:sortableColumn property="indexShow" title="${message(code: 'infoType.indexShow.label', default: 'Index Show')}" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${infoTypeInstanceList}" status="i" var="infoTypeInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                          
                        
                            <td><g:link action="show" id="${infoTypeInstance.id}">${fieldValue(bean: infoTypeInstance, field: "name")}</g:link></td>
                        
                            <td>${fieldValue(bean: infoTypeInstance, field: "sequence")}</td>
                        
                            <td><g:formatBoolean boolean="${infoTypeInstance.image}" /></td>
                        
                            <td><g:formatBoolean boolean="${infoTypeInstance.indexShow}" /></td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${infoTypeInstanceTotal}" />
            </div>
        </div>
        </sec:ifAllGranted>
    </body>
</html>
