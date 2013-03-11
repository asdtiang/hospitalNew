
<%@ page import="com.sjzsqjy.www.site.SiteInfo" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'siteInfo.label', default: 'SiteInfo')}" />
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
                        
                           
                        
                            <g:sortableColumn property="address" title="${message(code: 'siteInfo.address.label', default: 'Address')}" />
                        
                            <g:sortableColumn property="description" title="${message(code: 'siteInfo.description.label', default: 'Description')}" />
                        
                            <g:sortableColumn property="name" title="${message(code: 'siteInfo.name.label', default: 'Name')}" />
                        
                            <g:sortableColumn property="keyWords" title="${message(code: 'siteInfo.keyWords.label', default: 'Key Words')}" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${siteInfoInstanceList}" status="i" var="siteInfoInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                           
                        
                            <td><g:link action="show" id="${siteInfoInstance.id}">${fieldValue(bean: siteInfoInstance, field: "address")}</g:link></td>
                        
                            <td>${fieldValue(bean: siteInfoInstance, field: "description")}</td>
                        
                            <td>${fieldValue(bean: siteInfoInstance, field: "name")}</td>
                        
                            <td>${fieldValue(bean: siteInfoInstance, field: "keyWords")}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${siteInfoInstanceTotal}" />
            </div>
        </div>
    </body>
</html>
