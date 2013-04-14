
<%@ page import="com.sjzsqjy.www.data.TestData" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'testData.label', default: 'TestData')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-testData" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-testData" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list testData">
			
				<g:if test="${testDataInstance?.age}">
				<li class="fieldcontain">
					<span id="age-label" class="property-label"><g:message code="testData.age.label" default="Age" /></span>
					
						<span class="property-value" aria-labelledby="age-label"><g:fieldValue bean="${testDataInstance}" field="age"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${testDataInstance?.clinic}">
				<li class="fieldcontain">
					<span id="clinic-label" class="property-label"><g:message code="testData.clinic.label" default="Clinic" /></span>
					
						<span class="property-value" aria-labelledby="clinic-label"><g:link controller="clinic" action="show" id="${testDataInstance?.clinic?.id}">${testDataInstance?.clinic?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${testDataInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="testData.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${testDataInstance?.dateCreated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${testDataInstance?.jsonData}">
				<li class="fieldcontain">
					<span id="jsonData-label" class="property-label"><g:message code="testData.jsonData.label" default="Json Data" /></span>
					
						<span class="property-value" aria-labelledby="jsonData-label"><g:fieldValue bean="${testDataInstance}" field="jsonData"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${testDataInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="testData.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${testDataInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${testDataInstance?.testDate}">
				<li class="fieldcontain">
					<span id="testDate-label" class="property-label"><g:message code="testData.testDate.label" default="Test Date" /></span>
					
						<span class="property-value" aria-labelledby="testDate-label"><g:formatDate date="${testDataInstance?.testDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${testDataInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="testData.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:link controller="testType" action="show" id="${testDataInstance?.type?.id}">${testDataInstance?.type?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${testDataInstance?.id}" />
					<g:link class="edit" action="edit" id="${testDataInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
