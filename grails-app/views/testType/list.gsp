
<%@ page import="com.sjzsqjy.www.data.TestType" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'testType.label', default: 'TestType')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-testType" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-testType" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					

					
						<g:sortableColumn property="typeName" title="${message(code: 'testType.typeName.label', default: 'Type Name')}" />
					
						<g:sortableColumn property="typeTag" title="${message(code: 'testType.typeTag.label', default: 'Type Tag')}" />


					
					</tr>
				</thead>
				<tbody>
				<g:each in="${testTypeInstanceList}" status="i" var="testTypeInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${testTypeInstance.id}">${fieldValue(bean: testTypeInstance, field: "typeName")}
                            </g:link></td>
					

					
						<td>${fieldValue(bean: testTypeInstance, field: "typeTag")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${testTypeInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
