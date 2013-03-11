
<%@ page import="com.sjzsqjy.www.statistics.Clinic" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="sta" />
        <g:set var="entityName" value="${message(code: 'clinic.label', default: 'Clinic')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><g:link class="home" controller="index" action="staIndex">数据统计程序入口</g:link></span>
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
                            <g:sortableColumn property="id" title="${message(code: 'clinic.id.label', default: 'ID')}" />
                            <g:sortableColumn property="name" title="${message(code: 'clinic.name.label', default: 'Name')}" />
                            <g:sortableColumn property="shop" title="店名" /> 
                             <g:sortableColumn property="shop" title="${message(code: 'clinic.checkOutWay.label', default: 'Info')}" /> 
                            <g:sortableColumn property="info" title="${message(code: 'clinic.info.label', default: 'Info')}" />
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${clinicInstanceList}" status="i" var="clinicInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                            <td>${clinicInstance?.id }</td>
                            <td><g:link action="show" id="${clinicInstance.id}">${fieldValue(bean: clinicInstance, field: "name")}</g:link></td>
                            <td><g:link controller="shop" action="show" id="${clinicInstance.shop.id}">${fieldValue(bean: clinicInstance.shop, field: "name")}</g:link></td>
                             <td>${clinicInstance?.checkOutWay==1?'月结':'次结'}</td>
                            <td>${fieldValue(bean: clinicInstance, field: "info")}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${clinicInstanceTotal}" />
            </div>
        </div>
    </body>
</html>
