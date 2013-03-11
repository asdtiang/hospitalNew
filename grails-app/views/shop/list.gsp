
<%@ page import="com.sjzsqjy.www.statistics.Shop" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="sta">
		<g:set var="entityName" value="${message(code: 'shop.label', default: 'Shop')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<div class="nav" >
			<span class="menuButton"><g:link class="home" controller="index" action="staIndex">数据统计程序入口</g:link></span>
				<span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link>
				</span>
		</div>
		<div id="list-shop" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'shop.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="address" title="${message(code: 'shop.address.label', default: 'Address')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${shopInstanceList}" status="i" var="shopInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${shopInstance.id}">${fieldValue(bean: shopInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: shopInstance, field: "address")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${shopInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
