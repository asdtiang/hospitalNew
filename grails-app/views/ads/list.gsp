
<%@ page import="com.sjzsqjy.www.site.Ads" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'ads.label', default: 'Ads')}" />
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
                        
                            <g:sortableColumn property="id" title="${message(code: 'ads.id.label', default: 'Id')}" />
                        
                            <g:sortableColumn property="height" title="${message(code: 'ads.height.label', default: 'Height')}" />
                        
                            <g:sortableColumn property="sequence" title="${message(code: 'ads.sequence.label', default: 'Sequence')}" />
                        
                            <g:sortableColumn property="width" title="${message(code: 'ads.width.label', default: 'Width')}" />
                        
                            <g:sortableColumn property="name" title="${message(code: 'ads.name.label', default: 'Name')}" />
                        
                            <g:sortableColumn property="code" title="${message(code: 'ads.code.label', default: 'Code')}" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${adsInstanceList}" status="i" var="adsInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${adsInstance.id}">${fieldValue(bean: adsInstance, field: "id")}</g:link></td>
                        
                            <td>${fieldValue(bean: adsInstance, field: "height")}</td>
                        
                            <td>${fieldValue(bean: adsInstance, field: "sequence")}</td>
                        
                            <td>${fieldValue(bean: adsInstance, field: "width")}</td>
                        
                            <td>${fieldValue(bean: adsInstance, field: "name")}</td>
                        
                            <td>${adsInstance?.code}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${adsInstanceTotal}" />
            </div>
        </div>
    </body>
</html>
