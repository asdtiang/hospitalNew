
<%@ page import="com.sjzsqjy.www.auth.AuthKey" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'authKey.label', default: 'AuthKey')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-authKey" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-authKey" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list authKey">
			
				<g:if test="${authKeyInstance?.clientKey}">
				<li class="fieldcontain">
					<span id="clientKey-label" class="property-label"><g:message code="authKey.clientKey.label" default="Client Key" /></span>
					
						<span class="property-value" aria-labelledby="clientKey-label"><g:fieldValue bean="${authKeyInstance}" field="clientKey"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${authKeyInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="authKey.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:fieldValue bean="${authKeyInstance}" field="type"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${authKeyInstance?.id}" />
					<g:link class="edit" action="edit" id="${authKeyInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
