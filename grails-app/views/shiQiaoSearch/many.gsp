<!--思桥软件查询结果多个时显示页面 -->
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

			<g:sortableColumn property="date"
				title="${message(code: 'date.label', default: 'Name')}" />
			<g:sortableColumn property="sampleId"
				title="${message(code: 'sample.no.label', default: 'Name')}" />


		</tr>
	</thead>
	<tbody>
		<g:each in="${patientList}" status="i" var="patient">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

				<td><g:link controller="shiQiaoSearch" action="result"
					params="[date:patient.date,sampleId:patient.sampleId]">
					${fieldValue(bean:patient, field: "name")}
				</g:link></td>

				<td>
				${fieldValue(bean: patient, field: "date")}
				</td>
				<td>
				${fieldValue(bean: patient, field: "sampleId")}
				</td>

				

			</tr>
		</g:each>
	</tbody>
</table>
</div>

</body>
</html>
