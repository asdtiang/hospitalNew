
<%@ page import="com.sjzsqjy.www.data.blood.BloodItem" %>
<!doctype html>
<html>
	<head>
        <meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'bloodItem.label', default: 'BloodItem')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-bloodItem" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-bloodItem" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="sequence" title="${message(code: 'bloodItem.sequence.label', default: 'Sequence')}" />
					
						<g:sortableColumn property="high" title="${message(code: 'bloodItem.high.label', default: 'High')}" />
					
						<g:sortableColumn property="low" title="${message(code: 'bloodItem.low.label', default: 'Low')}" />
					
						<g:sortableColumn property="name" title="${message(code: 'bloodItem.name.label', default: 'Name')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${bloodItemInstanceList}" status="i" var="bloodItemInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${bloodItemInstance.id}">${fieldValue(bean: bloodItemInstance, field: "sequence")}</g:link></td>
					
						<td>${fieldValue(bean: bloodItemInstance, field: "high")}</td>
					
						<td>${fieldValue(bean: bloodItemInstance, field: "low")}</td>
					
						<td>${fieldValue(bean: bloodItemInstance, field: "name")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${bloodItemInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
