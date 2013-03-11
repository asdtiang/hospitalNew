
<%@ page import="com.sjzsqjy.www.data.shiqiao.ShiQiaoResult" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'shiQiaoResult.label', default: 'ShiQiaoResult')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-shiQiaoResult" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-shiQiaoResult" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="charValue" title="${message(code: 'shiQiaoResult.charValue.label', default: 'Char Value')}" />
					
						<g:sortableColumn property="sequence" title="${message(code: 'shiQiaoResult.sequence.label', default: 'Sequence')}" />
					
						<g:sortableColumn property="date" title="${message(code: 'shiQiaoResult.date.label', default: 'Date')}" />
					
						<g:sortableColumn property="inputType" title="${message(code: 'shiQiaoResult.inputType.label', default: 'Input Type')}" />
					
						<g:sortableColumn property="itemCode" title="${message(code: 'shiQiaoResult.itemCode.label', default: 'Item Code')}" />
					
						<g:sortableColumn property="sampleId" title="${message(code: 'shiQiaoResult.sampleId.label', default: 'Sample Id')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${shiQiaoResultInstanceList}" status="i" var="shiQiaoResultInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${shiQiaoResultInstance.id}">${fieldValue(bean: shiQiaoResultInstance, field: "charValue")}</g:link></td>
					
						<td>${fieldValue(bean: shiQiaoResultInstance, field: "sequence")}</td>
					
						<td>${fieldValue(bean: shiQiaoResultInstance, field: "date")}</td>
					
						<td>${fieldValue(bean: shiQiaoResultInstance, field: "inputType")}</td>
					
						<td>${fieldValue(bean: shiQiaoResultInstance, field: "itemCode")}</td>
					
						<td>${fieldValue(bean: shiQiaoResultInstance, field: "sampleId")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${shiQiaoResultInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
