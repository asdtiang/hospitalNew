
<%@ page import="com.sjzsqjy.www.data.trace.TraceUser" %>
<!doctype html>
<html>
	<head>
        <meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'traceUser.label', default: 'TraceUser')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-traceUser" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-traceUser" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list traceUser">
			
				<g:if test="${traceUserInstance?.sex}">
				<li class="fieldcontain">
					<span id="sex-label" class="property-label"><g:message code="traceUser.sex.label" default="Sex" /></span>
					
						<span class="property-value" aria-labelledby="sex-label"><g:fieldValue bean="${traceUserInstance}" field="sex"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceUserInstance?.ageInfo}">
				<li class="fieldcontain">
					<span id="ageInfo-label" class="property-label"><g:message code="traceUser.ageInfo.label" default="Age Info" /></span>
					
						<span class="property-value" aria-labelledby="ageInfo-label"><g:fieldValue bean="${traceUserInstance}" field="ageInfo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceUserInstance?.sendDoctor}">
				<li class="fieldcontain">
					<span id="sendDoctor-label" class="property-label"><g:message code="traceUser.sendDoctor.label" default="Send Doctor" /></span>
					
						<span class="property-value" aria-labelledby="sendDoctor-label"><g:fieldValue bean="${traceUserInstance}" field="sendDoctor"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceUserInstance?.clinic}">
				<li class="fieldcontain">
					<span id="clinic-label" class="property-label"><g:message code="traceUser.clinic.label" default="Clinic" /></span>
					
						<span class="property-value" aria-labelledby="clinic-label"><g:link controller="clinic" action="show" id="${traceUserInstance?.clinic?.id}">
                            ${traceUserInstance?.clinic?.name?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceUserInstance?.date}">
				<li class="fieldcontain">
					<span id="date-label" class="property-label"><g:message code="traceUser.date.label" default="Date" /></span>
					
						<span class="property-value" aria-labelledby="date-label"><g:fieldValue bean="${traceUserInstance}" field="date"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceUserInstance?.doctor}">
				<li class="fieldcontain">
					<span id="doctor-label" class="property-label"><g:message code="traceUser.doctor.label" default="Doctor" /></span>
					
						<span class="property-value" aria-labelledby="doctor-label"><g:fieldValue bean="${traceUserInstance}" field="doctor"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceUserInstance?.keShi}">
				<li class="fieldcontain">
					<span id="keShi-label" class="property-label"><g:message code="traceUser.keShi.label" default="Ke Shi" /></span>
					
						<span class="property-value" aria-labelledby="keShi-label"><g:fieldValue bean="${traceUserInstance}" field="keShi"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceUserInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="traceUser.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${traceUserInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceUserInstance?.sampleId}">
				<li class="fieldcontain">
					<span id="sampleId-label" class="property-label"><g:message code="traceUser.sampleId.label" default="Sample Id" /></span>
					
						<span class="property-value" aria-labelledby="sampleId-label"><g:fieldValue bean="${traceUserInstance}" field="sampleId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceUserInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="traceUser.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:fieldValue bean="${traceUserInstance}" field="type"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${traceUserInstance?.id}" />
					<g:link class="edit" action="edit" id="${traceUserInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
