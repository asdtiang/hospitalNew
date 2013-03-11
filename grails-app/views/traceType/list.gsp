
<%@ page import="com.sjzsqjy.www.data.trace.TraceType" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'traceType.label', default: 'TraceType')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-traceType" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-traceType" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="adult" title="${message(code: 'traceType.adult.label', default: 'Adult')}" />
					
						<g:sortableColumn property="child" title="${message(code: 'traceType.child.label', default: 'Child')}" />
					
						<g:sortableColumn property="name" title="${message(code: 'traceType.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="sampleType" title="${message(code: 'traceType.sampleType.label', default: 'Sample Type')}" />
					
						<g:sortableColumn property="sequence" title="${message(code: 'traceType.sequence.label', default: 'Sequence')}" />
					
						<g:sortableColumn property="unit" title="${message(code: 'traceType.unit.label', default: 'Unit')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${traceTypeInstanceList}" status="i" var="traceTypeInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${traceTypeInstance.id}">${fieldValue(bean: traceTypeInstance, field: "adult")}</g:link></td>
					
						<td>${fieldValue(bean: traceTypeInstance, field: "child")}</td>
					
						<td>${fieldValue(bean: traceTypeInstance, field: "name")}</td>
					
						<td>${fieldValue(bean: traceTypeInstance, field: "sampleType")}</td>
					
						<td>${fieldValue(bean: traceTypeInstance, field: "sequence")}</td>
					
						<td>${fieldValue(bean: traceTypeInstance, field: "unit")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${traceTypeInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
