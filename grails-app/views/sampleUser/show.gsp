
<%@ page import="com.sjzsqjy.www.data.sample.SampleUser" %>
<!doctype html>
<html>
	<head>
        <meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'sampleUser.label', default: 'SampleUser')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-sampleUser" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-sampleUser" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list sampleUser">
			
				<g:if test="${sampleUserInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="sampleUser.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${sampleUserInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${sampleUserInstance?.sex}">
				<li class="fieldcontain">
					<span id="sex-label" class="property-label"><g:message code="sampleUser.sex.label" default="Sex" /></span>
					
						<span class="property-value" aria-labelledby="sex-label"><g:fieldValue bean="${sampleUserInstance}" field="sex"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${sampleUserInstance?.age}">
				<li class="fieldcontain">
					<span id="age-label" class="property-label"><g:message code="sampleUser.age.label" default="Age" /></span>
					
						<span class="property-value" aria-labelledby="age-label"><g:fieldValue bean="${sampleUserInstance}" field="age"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${sampleUserInstance?.sendDoctor}">
				<li class="fieldcontain">
					<span id="sendDoctor-label" class="property-label"><g:message code="sampleUser.sendDoctor.label" default="Send Doctor" /></span>
					
						<span class="property-value" aria-labelledby="sendDoctor-label"><g:fieldValue bean="${sampleUserInstance}" field="sendDoctor"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${sampleUserInstance?.clinic}">
				<li class="fieldcontain">
					<span id="clinic-label" class="property-label"><g:message code="sampleUser.clinic.label" default="Clinic" /></span>
					
						<span class="property-value" aria-labelledby="clinic-label"><g:link controller="clinic" action="show" id="${sampleUserInstance?.clinic?.id}">${sampleUserInstance?.clinic?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${sampleUserInstance?.sampleId}">
				<li class="fieldcontain">
					<span id="sampleId-label" class="property-label"><g:message code="sampleUser.sampleId.label" default="Sample Id" /></span>
					
						<span class="property-value" aria-labelledby="sampleId-label"><g:fieldValue bean="${sampleUserInstance}" field="sampleId"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${sampleUserInstance?.id}" />
					<g:link class="edit" action="edit" id="${sampleUserInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
