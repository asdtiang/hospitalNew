
<%@ page import="com.sjzsqjy.www.data.trace.TraceResult" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'traceResult.label', default: 'TraceResult')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-traceResult" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-traceResult" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="result" title="${message(code: 'traceResult.result.label', default: 'Result')}" />
					
						<g:sortableColumn property="sampleId" title="${message(code: 'traceResult.sampleId.label', default: 'Sample Id')}" />
					
						<g:sortableColumn property="typeStr" title="${message(code: 'traceResult.typeStr.label', default: 'Type Str')}" />
					
						<g:sortableColumn property="ybStr" title="${message(code: 'traceResult.ybStr.label', default: 'Yb Str')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${traceResultInstanceList}" status="i" var="traceResultInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${traceResultInstance.id}">${fieldValue(bean: traceResultInstance, field: "result")}</g:link></td>
					
						<td>${fieldValue(bean: traceResultInstance, field: "sampleId")}</td>
					
						<td>${fieldValue(bean: traceResultInstance, field: "typeStr")}</td>
					
						<td>${fieldValue(bean: traceResultInstance, field: "ybStr")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${traceResultInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
