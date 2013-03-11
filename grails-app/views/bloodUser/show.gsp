
<%@ page import="com.sjzsqjy.www.data.blood.BloodUser" %>
<!doctype html>
<html>
	<head>
        <meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'bloodUser.label', default: 'BloodUser')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-bloodUser" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-bloodUser" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list bloodUser">
			
				<g:if test="${bloodUserInstance?.clinic}">
				<li class="fieldcontain">
					<span id="clinic-label" class="property-label"><g:message code="bloodUser.clinic.label" default="Clinic" /></span>
					
						<span class="property-value" aria-labelledby="clinic-label"><g:link controller="clinic" action="show" id="${bloodUserInstance?.clinic?.id}">${bloodUserInstance?.clinic?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodUserInstance?.age}">
				<li class="fieldcontain">
					<span id="age-label" class="property-label"><g:message code="bloodUser.age.label" default="Age" /></span>
					
						<span class="property-value" aria-labelledby="age-label"><g:fieldValue bean="${bloodUserInstance}" field="age"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodUserInstance?.bedNum}">
				<li class="fieldcontain">
					<span id="bedNum-label" class="property-label"><g:message code="bloodUser.bedNum.label" default="Bed Num" /></span>
					
						<span class="property-value" aria-labelledby="bedNum-label"><g:fieldValue bean="${bloodUserInstance}" field="bedNum"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodUserInstance?.checkNum}">
				<li class="fieldcontain">
					<span id="checkNum-label" class="property-label"><g:message code="bloodUser.checkNum.label" default="Check Num" /></span>
					
						<span class="property-value" aria-labelledby="checkNum-label"><g:fieldValue bean="${bloodUserInstance}" field="checkNum"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodUserInstance?.hospitalNum}">
				<li class="fieldcontain">
					<span id="hospitalNum-label" class="property-label"><g:message code="bloodUser.hospitalNum.label" default="Hospital Num" /></span>
					
						<span class="property-value" aria-labelledby="hospitalNum-label"><g:fieldValue bean="${bloodUserInstance}" field="hospitalNum"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodUserInstance?.keBie}">
				<li class="fieldcontain">
					<span id="keBie-label" class="property-label"><g:message code="bloodUser.keBie.label" default="Ke Bie" /></span>
					
						<span class="property-value" aria-labelledby="keBie-label"><g:fieldValue bean="${bloodUserInstance}" field="keBie"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodUserInstance?.keyStr}">
				<li class="fieldcontain">
					<span id="keyStr-label" class="property-label"><g:message code="bloodUser.keyStr.label" default="Key Str" /></span>
					
						<span class="property-value" aria-labelledby="keyStr-label"><g:fieldValue bean="${bloodUserInstance}" field="keyStr"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodUserInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="bloodUser.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${bloodUserInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodUserInstance?.patientNum}">
				<li class="fieldcontain">
					<span id="patientNum-label" class="property-label"><g:message code="bloodUser.patientNum.label" default="Patient Num" /></span>
					
						<span class="property-value" aria-labelledby="patientNum-label"><g:fieldValue bean="${bloodUserInstance}" field="patientNum"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodUserInstance?.sampleId}">
				<li class="fieldcontain">
					<span id="sampleId-label" class="property-label"><g:message code="bloodUser.sampleId.label" default="Sample Id" /></span>
					
						<span class="property-value" aria-labelledby="sampleId-label"><g:fieldValue bean="${bloodUserInstance}" field="sampleId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodUserInstance?.sendDate}">
				<li class="fieldcontain">
					<span id="sendDate-label" class="property-label"><g:message code="bloodUser.sendDate.label" default="Send Date" /></span>
					
						<span class="property-value" aria-labelledby="sendDate-label"><g:fieldValue bean="${bloodUserInstance}" field="sendDate"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodUserInstance?.sendDoctor}">
				<li class="fieldcontain">
					<span id="sendDoctor-label" class="property-label"><g:message code="bloodUser.sendDoctor.label" default="Send Doctor" /></span>
					
						<span class="property-value" aria-labelledby="sendDoctor-label"><g:fieldValue bean="${bloodUserInstance}" field="sendDoctor"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodUserInstance?.sex}">
				<li class="fieldcontain">
					<span id="sex-label" class="property-label"><g:message code="bloodUser.sex.label" default="Sex" /></span>
					
						<span class="property-value" aria-labelledby="sex-label"><g:fieldValue bean="${bloodUserInstance}" field="sex"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodUserInstance?.testDate}">
				<li class="fieldcontain">
					<span id="testDate-label" class="property-label"><g:message code="bloodUser.testDate.label" default="Test Date" /></span>
					
						<span class="property-value" aria-labelledby="testDate-label"><g:fieldValue bean="${bloodUserInstance}" field="testDate"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodUserInstance?.testDoctor}">
				<li class="fieldcontain">
					<span id="testDoctor-label" class="property-label"><g:message code="bloodUser.testDoctor.label" default="Test Doctor" /></span>
					
						<span class="property-value" aria-labelledby="testDoctor-label"><g:fieldValue bean="${bloodUserInstance}" field="testDoctor"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodUserInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="bloodUser.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:fieldValue bean="${bloodUserInstance}" field="type"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${bloodUserInstance?.id}" />
					<g:link class="edit" action="edit" id="${bloodUserInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
