
<%@ page import="com.sjzsqjy.www.data.shiqiao.ItemSet" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'itemSet.label', default: 'ItemSet')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-itemSet" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-itemSet" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'itemSet.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="unit" title="${message(code: 'itemSet.unit.label', default: 'Unit')}" />
					
						<g:sortableColumn property="code" title="${message(code: 'itemSet.code.label', default: 'Code')}" />
					
						<g:sortableColumn property="hight" title="${message(code: 'itemSet.hight.label', default: 'Hight')}" />
					
						<th><g:message code="itemSet.itemType.label" default="Item Type" /></th>
					
						<g:sortableColumn property="low" title="${message(code: 'itemSet.low.label', default: 'Low')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${itemSetInstanceList}" status="i" var="itemSetInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${itemSetInstance.id}">${fieldValue(bean: itemSetInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: itemSetInstance, field: "unit")}</td>
					
						<td>${fieldValue(bean: itemSetInstance, field: "code")}</td>
					
						<td>${fieldValue(bean: itemSetInstance, field: "hight")}</td>
					
						<td>${fieldValue(bean: itemSetInstance, field: "itemType")}</td>
					
						<td>${fieldValue(bean: itemSetInstance, field: "low")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${itemSetInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
