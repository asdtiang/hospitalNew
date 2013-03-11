
<%@ page import="com.sjzsqjy.www.data.trace.TraceUser" %>
<!doctype html>
<html>
	<head>
        <meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'traceUser.label', default: 'TraceUser')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
    <resource:autoComplete skin="default" />
		<a href="#list-traceUser" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-traceUser" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
                        <g:sortableColumn property="name" title="${message(code: 'traceUser.name.label', default: 'name')}" />
						<g:sortableColumn property="sex" title="${message(code: 'traceUser.sex.label', default: 'Sex')}" />
					
						<g:sortableColumn property="ageInfo" title="${message(code: 'traceUser.ageInfo.label', default: 'Age Info')}" />
					

					
						<th><g:message code="traceUser.clinic.label" default="Clinic" /></th>
					
						<g:sortableColumn property="date" title="${message(code: 'traceUser.date.label', default: 'Date')}" />
					
						<g:sortableColumn property="doctor" title="${message(code: 'traceUser.doctor.label', default: 'Doctor')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${traceUserInstanceList}" status="i" var="traceUserInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${traceUserInstance.id}">${fieldValue(bean: traceUserInstance, field: "name")}</g:link></td>

                        <td>${fieldValue(bean: traceUserInstance, field: "sex")}</td>
					
						<td>${fieldValue(bean: traceUserInstance, field: "ageInfo")}</td>

                        <g:set var="updateId" value="${com.sjzsqjy.www.util.SiteConstant.DATA_TYPE_TRACE}${traceUserInstance.id}"></g:set>
					
						<td  id="${updateId}">
                        <g:remoteLink controller="clinic" update="${updateId}"
                                      params="[id:traceUserInstance.id,type:com.sjzsqjy.www.util.SiteConstant.DATA_TYPE_TRACE]" action="showSearchClinic">
                            ${traceUserInstance?.clinic?.name}&nbsp;<samp style="font-size:12px;">编辑诊所</samp></g:remoteLink>

                        ${fieldValue(bean: traceUserInstance?.clinic, field: "name")}</td>
					
						<td>${fieldValue(bean: traceUserInstance, field: "date")}</td>
					
						<td>${fieldValue(bean: traceUserInstance, field: "doctor")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${traceUserInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
