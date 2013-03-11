
<%@ page import="com.sjzsqjy.www.data.sample.SampleUser" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'sampleUser.label', default: 'SampleUser')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
    <resource:autoComplete skin="default" />
		<a href="#list-sampleUser" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-sampleUser" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'sampleUser.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="sex" title="${message(code: 'sampleUser.sex.label', default: 'Sex')}" />
					
						<g:sortableColumn property="age" title="${message(code: 'sampleUser.age.label', default: 'Age')}" />

						<th><g:message code="sampleUser.clinic.label" default="Clinic" /></th>
					
						<g:sortableColumn property="sampleId" title="${message(code: 'sampleUser.sampleId.label', default: 'Sample Id')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${sampleUserInstanceList}" status="i" var="sampleUserInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${sampleUserInstance.id}">${fieldValue(bean: sampleUserInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: sampleUserInstance, field: "sex")}</td>
					
						<td>${fieldValue(bean: sampleUserInstance, field: "age")}</td>

                        <g:set var="updateId" value="${com.sjzsqjy.www.util.SiteConstant.DATA_TYPE_SAMPLE}${sampleUserInstance.id}"></g:set>
                        <td id="${updateId}">

                            <g:remoteLink controller="clinic" update="${updateId}"
                                          params="[id:sampleUserInstance.id,type:com.sjzsqjy.www.util.SiteConstant.DATA_TYPE_SAMPLE]" action="showSearchClinic">
                                ${sampleUserInstance?.clinic?.name}&nbsp;<samp style="font-size:12px;">编辑诊所</samp></g:remoteLink>


                        <td>${fieldValue(bean: sampleUserInstance, field: "sampleId")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${sampleUserInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
