
<%@ page import="com.sjzsqjy.www.data.blood.BloodUser" %>
<!doctype html>
<html>
	<head>
        <meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'bloodUser.label', default: 'BloodUser')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
    <resource:autoComplete skin="default" />
		<a href="#list-bloodUser" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-bloodUser" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<th> <g:message code="bloodUser.keyStr.label" default="keyStr" /> </th>

                        <g:sortableColumn property="clinic" title="${message(code: 'bloodUser.clinic.label', default: 'clinic')}" />

                        <g:sortableColumn property="name" title="${message(code: 'bloodUser.name.label', default: 'name')}" />

                        <g:sortableColumn property="sendDate" title="${message(code: 'bloodUser.sendDate.label', default: 'send date')}" />
					
						<g:sortableColumn property="age" title="${message(code: 'bloodUser.age.label', default: 'Age')}" />
					

					
					</tr>
				</thead>
				<tbody>
				<g:each in="${bloodUserInstanceList}" status="i" var="bloodUserInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					

						<td><g:link action="show" id="${bloodUserInstance.id}">${fieldValue(bean: bloodUserInstance, field: "keyStr")}</g:link></td>
                        <g:set var="updateId" value="${com.sjzsqjy.www.util.SiteConstant.DATA_TYPE_BLOOD}${bloodUserInstance.id}"></g:set>
                        <td id="${updateId}">

                            <g:remoteLink controller="clinic" update="${updateId}"
                                          params="[id:bloodUserInstance.id,type:com.sjzsqjy.www.util.SiteConstant.DATA_TYPE_BLOOD]" action="showSearchClinic">
                                ${bloodUserInstance?.clinic?.name}&nbsp;<samp style="font-size:12px;">编辑诊所</samp></g:remoteLink>
                        </td>
						<td>${fieldValue(bean: bloodUserInstance, field: "name")}</td>

                        <td>${fieldValue(bean: bloodUserInstance, field: "sendDate")}</td>
					
						<td>${fieldValue(bean: bloodUserInstance, field: "age")}</td>


					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${bloodUserInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
