
<%@ page import="com.sjzsqjy.www.site.CustomData" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'customData.label', default: 'CustomData')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-customData" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-customData" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<th><g:message code="customData.clinic.label" default="Clinic" /></th>
					

					
						<g:sortableColumn property="dateCreated" title="${message(code: 'customData.dateCreated.label', default: 'Date Created')}" />
					
						<g:sortableColumn property="patientName" title="${message(code: 'customData.patientName.label', default: 'Patient Name')}" />
					
						<th><g:message code="customData.template.label" default="Template" /></th>
					
						<g:sortableColumn property="testDate" title="${message(code: 'customData.testDate.label', default: 'Test Date')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${customDataInstanceList}" status="i" var="customDataInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${customDataInstance.id}">${fieldValue(bean: customDataInstance?.clinic, field: "name")}</g:link> &nbsp;
                        <g:link action="edit" id="${customDataInstance.id}">编辑</g:link>
                        </td>
					

					
						<td><g:formatDate date="${customDataInstance.dateCreated}" /></td>
					
						<td>${fieldValue(bean: customDataInstance, field: "patientName")}</td>
					
						<td>${fieldValue(bean: customDataInstance?.template, field: "title")}</td>
					
						<td><g:formatDate date="${customDataInstance.testDate}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${customDataInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
