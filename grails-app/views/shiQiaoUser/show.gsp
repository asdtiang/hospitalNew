
<%@ page import="com.sjzsqjy.www.data.shiqiao.ShiQiaoUser" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'shiQiaoUser.label', default: 'ShiQiaoUser')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-shiQiaoUser" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-shiQiaoUser" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list shiQiaoUser">
			
				<g:if test="${shiQiaoUserInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="shiQiaoUser.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${shiQiaoUserInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiQiaoUserInstance?.sex}">
				<li class="fieldcontain">
					<span id="sex-label" class="property-label"><g:message code="shiQiaoUser.sex.label" default="Sex" /></span>
					
						<span class="property-value" aria-labelledby="sex-label"><g:fieldValue bean="${shiQiaoUserInstance}" field="sex"/></span>
					
				</li>
				</g:if>

                <g:if test="${shiQiaoUserInstance?.doctor}">
                    <li class="fieldcontain">
                        <span id="doctor-label" class="property-label"><g:message code="shiQiaoUser.doctor.label" default="Doctor" /></span>

                        <span class="property-value" aria-labelledby="doctor-label"><g:link controller="doctor" action="show" id="${shiQiaoUserInstance?.doctor?.id}">${shiQiaoUserInstance?.doctor?.name?.encodeAsHTML()}</g:link></span>

                    </li>
                </g:if>

			
				<g:if test="${null!=shiQiaoUserInstance?.clinic}">
				<li class="fieldcontain">
					<span id="clinic-label" class="property-label"><g:message code="shiQiaoUser.clinic.label" default="Clinic" /></span>

						<span class="property-value" aria-labelledby="clinic-label"><g:link controller="clinic" action="show" id="${shiQiaoUserInstance?.clinic?.id}">${shiQiaoUserInstance?.clinic?.name?.encodeAsHTML()}</g:link></span>

				</li>
				</g:if>
			
				<g:if test="${shiQiaoUserInstance?.birth}">
				<li class="fieldcontain">
					<span id="birth-label" class="property-label"><g:message code="shiQiaoUser.birth.label" default="birth" /></span>
					
						<span class="property-value" aria-labelledby="birth-label"><g:fieldValue bean="${shiQiaoUserInstance}" field="birth"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiQiaoUserInstance?.date}">
				<li class="fieldcontain">
					<span id="date-label" class="property-label"><g:message code="shiQiaoUser.date.label" default="Date" /></span>
					
						<span class="property-value" aria-labelledby="date-label"><g:fieldValue bean="${shiQiaoUserInstance}" field="date"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiQiaoUserInstance?.sampleId}">
				<li class="fieldcontain">
					<span id="sampleId-label" class="property-label"><g:message code="shiQiaoUser.sampleId.label" default="Sample Id" /></span>
					
						<span class="property-value" aria-labelledby="sampleId-label"><g:fieldValue bean="${shiQiaoUserInstance}" field="sampleId"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${shiQiaoUserInstance?.id}" />
					<g:link class="edit" action="edit" id="${shiQiaoUserInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
