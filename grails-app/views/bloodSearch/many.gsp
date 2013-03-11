<!--样品软件检测报告查询多个结果里页面-->
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="layout" content="main" />
<g:set var="entityName"
	value="${message(code: 'search.title', default: 'ItemType')}" />
<title><g:message code="site.name" args="[entityName]" /></title>
</head>
<body>
<div class="body">

<g:if test="${flash.message}">
	<div class="message">
	${flash.message}
	</div>
</g:if>
<div id="body">
<table>
	<thead>
		<tr>

			<g:sortableColumn property="name"
				title="${message(code: 'name.label', default: 'Id')}" />

			
			


		</tr>
	</thead>
	<tbody>
		<g:each in="${patientList}" status="i" var="patient">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

				<td><g:link controller="sampleSearch" action="result"
					params="[fileName:patient]">
					${patient}
				</g:link></td>										
			</tr>
		</g:each>
	</tbody>
</table>
</div>

</body>
</html>
