
<%@ page import="com.sjzsqjy.www.data.shiqiao.ShiQiaoUser" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'shiQiaoUser.label', default: 'ShiQiaoUser')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
        <script>
        function editClinic(id){
           var instanceId = id.substring(2);
            alert(instanceId);
        }
        </script>
	</head>
	<body>
    <resource:autoComplete skin="default" />
		<a href="#list-shiQiaoUser" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-shiQiaoUser" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'shiQiaoUser.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="sex" title="${message(code: 'shiQiaoUser.sex.label', default: 'Sex')}" />
					
						<th><g:message code="shiQiaoUser.doctor.label" default="Doctor" /></th>
					
						<th><g:message code="shiQiaoUser.clinic.label" default="Clinic" /></th>
					
						<g:sortableColumn property="birth" title="${message(code: 'shiQiaoUser.birth.label', default: 'Brith')}" />
					
						<g:sortableColumn property="date" title="${message(code: 'shiQiaoUser.date.label', default: 'Date')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${shiQiaoUserInstanceList}" status="i" var="shiQiaoUserInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${shiQiaoUserInstance.id}">${fieldValue(bean: shiQiaoUserInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: shiQiaoUserInstance, field: "sex")}</td>
					
						<td>${shiQiaoUserInstance?.doctor?.name}</td>
					     <g:set var="updateId" value="${com.sjzsqjy.www.util.SiteConstant.DATA_TYPE_SHIQIAO}${shiQiaoUserInstance.id}"></g:set>
						<td id="${updateId}">

                                <g:remoteLink controller="clinic" update="${updateId}"
                                              params="[id:shiQiaoUserInstance.id,type:com.sjzsqjy.www.util.SiteConstant.DATA_TYPE_SHIQIAO]" action="showSearchClinic">
                                    ${shiQiaoUserInstance?.clinic?.name}&nbsp;<samp style="font-size:12px;">编辑诊所</samp></g:remoteLink>

                    </td>
					
						<td>${fieldValue(bean: shiQiaoUserInstance, field: "birth")}</td>
					
						<td>${fieldValue(bean: shiQiaoUserInstance, field: "date")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${shiQiaoUserInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
