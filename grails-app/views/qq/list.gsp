
<%@ page import="com.sjzsqjy.www.site.Qq" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'qq.label', default: 'Qq')}" />
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
                        
                            <g:sortableColumn property="id" title="${message(code: 'qq.id.label', default: 'Id')}" />
                        
                            <g:sortableColumn property="sequence" title="${message(code: 'qq.sequence.label', default: 'Sequence')}" />
                        
                            <g:sortableColumn property="code" title="${message(code: 'qq.code.label', default: 'Code')}" />
                        
                            <g:sortableColumn property="info" title="${message(code: 'qq.info.label', default: 'Info')}" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${qqInstanceList}" status="i" var="qqInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${qqInstance.id}">${fieldValue(bean: qqInstance, field: "id")}</g:link></td>
                        
                            <td>${fieldValue(bean: qqInstance, field: "sequence")}</td>
                        
                            <td>${fieldValue(bean: qqInstance, field: "code")}</td>
                        
                            <td>${fieldValue(bean: qqInstance, field: "info")}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${qqInstanceTotal}" />
            </div>
        </div>
    </body>
</html>
