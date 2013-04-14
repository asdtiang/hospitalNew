
<%@ page import="com.sjzsqjy.www.data.TestData" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'testData.label', default: 'TestData')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-testData" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-testData" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="age" title="${message(code: 'testData.age.label', default: 'Age')}" />
					
						<th><g:message code="testData.clinic.label" default="Clinic" /></th>
					
						<g:sortableColumn property="dateCreated" title="${message(code: 'testData.dateCreated.label', default: 'Date Created')}" />
					

					
						<g:sortableColumn property="name" title="${message(code: 'testData.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="testDate" title="检验时间" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${testDataInstanceList}" status="i" var="testDataInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${testDataInstance.id}">${fieldValue(bean: testDataInstance, field: "age")}</g:link></td>
					
						<td>${fieldValue(bean: testDataInstance, field: "clinic")}</td>
					
						<td><g:formatDate date="${testDataInstance.dateCreated}" /></td>
					

					
						<td>${fieldValue(bean: testDataInstance, field: "name")}</td>
					
						<td><g:formatDate date="${testDataInstance.testDate}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${testDataInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
