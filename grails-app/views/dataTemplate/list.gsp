
<%@ page import="com.sjzsqjy.www.site.DataTemplate" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'dataTemplate.label', default: 'DataTemplate')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-dataTemplate" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-dataTemplate" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
                        <g:sortableColumn property="title" title="${message(code: 'dataTemplate.title.label', default: 'Title')}" />
						<g:sortableColumn property="templateStr" title="操作" />
					

					
					</tr>
				</thead>
				<tbody>
				<g:each in="${dataTemplateInstanceList}" status="i" var="dataTemplateInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${dataTemplateInstance.id}">${fieldValue(bean: dataTemplateInstance, field: "title")}</g:link></td>

						<td><g:link action="edit" id="${dataTemplateInstance.id}">编辑</g:link></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${dataTemplateInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
