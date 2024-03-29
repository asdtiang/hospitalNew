
<%@ page import="com.sjzsqjy.www.site.Link" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'link.label', default: 'Link')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}">Home</a></span>
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
                        
                          
                         <g:sortableColumn property="showTitle" title="${message(code: 'link.showTitle.label', default: 'Show Title')}" />
                            <g:sortableColumn property="address" title="${message(code: 'link.address.label', default: 'Address')}" />
                        
                           
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${linkInstanceList}" status="i" var="linkInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                             <td><g:link action="show" id="${linkInstance.id}">${fieldValue(bean: linkInstance, field: "showTitle")}</g:link></td>
                       
                            <td><a target="_blank" href="${linkInstance.address}">${fieldValue(bean: linkInstance, field: "address")}</a></td>
                        
                           
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${linkInstanceTotal}" />
            </div>
        </div>
    </body>
</html>
