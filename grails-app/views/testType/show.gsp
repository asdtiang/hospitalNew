
<%@ page import="com.sjzsqjy.www.data.TestType" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'testType.label', default: 'TestType')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-testType" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-testType" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list testType">
			
				<g:if test="${testTypeInstance?.content}">
				<li class="fieldcontain">
					<span id="content-label" class="property-label"><g:message code="testType.content.label" default="Content" /></span>
					
						<span class="property-value" aria-labelledby="content-label"><g:fieldValue bean="${testTypeInstance}" field="content"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${testTypeInstance?.typeName}">
				<li class="fieldcontain">
					<span id="typeName-label" class="property-label"><g:message code="testType.typeName.label" default="Type Name" /></span>
					
						<span class="property-value" aria-labelledby="typeName-label"><g:fieldValue bean="${testTypeInstance}" field="typeName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${testTypeInstance?.typeTag}">
				<li class="fieldcontain">
					<span id="typeTag-label" class="property-label"><g:message code="testType.typeTag.label" default="Type Tag" /></span>
					
						<span class="property-value" aria-labelledby="typeTag-label"><g:fieldValue bean="${testTypeInstance}" field="typeTag"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${testTypeInstance?.id}" />
					<g:link class="edit" action="edit" id="${testTypeInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
