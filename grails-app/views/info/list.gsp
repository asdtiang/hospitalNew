
<%@ page import="com.sjzsqjy.www.site.Info" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'info.label', default: 'Info')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
    <sec:ifAllGranted roles="ROLE_ADMIN">
        <div class="nav">
            
            <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
        </div>
        </sec:ifAllGranted>
        <div class="body">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                            <g:sortableColumn property="title" title="${message(code: 'info.title.label', default: 'Title')}" />
                        
                            <th><g:message code="info.infoType.label" default="Info Type" /></th>
                   	    
                            <g:sortableColumn property="lastUpdated" title="${message(code: 'lastUpdated.label', default: 'Last Updated')}" />
                        
                            <g:sortableColumn property="dateCreated" title="${message(code: 'dateCreated.label', default: 'Date Created')}" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${infoInstanceList}" status="i" var="infoInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">                          
                        
                            <td><g:link action="show" id="${infoInstance.id}">${fieldValue(bean: infoInstance, field: "title")}</g:link></td>
                        
                            <td>${infoInstance?.infoType?.name}</td>
                        
                            <td><g:formatDate date="${infoInstance.lastUpdated}" /></td>
                        
                            <td><g:formatDate date="${infoInstance.dateCreated}" /></td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${infoInstanceTotal}" />
            </div>
        </div>
    </body>
</html>
