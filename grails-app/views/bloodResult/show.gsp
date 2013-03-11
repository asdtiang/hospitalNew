
<%@ page import="com.sjzsqjy.www.data.blood.BloodResult" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'bloodResult.label', default: 'BloodResult')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-bloodResult" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-bloodResult" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list bloodResult">
			
				<g:if test="${bloodResultInstance?.keyStr}">
				<li class="fieldcontain">
					<span id="keyStr-label" class="property-label"><g:message code="bloodResult.keyStr.label" default="Key Str" /></span>
					
						<span class="property-value" aria-labelledby="keyStr-label"><g:fieldValue bean="${bloodResultInstance}" field="keyStr"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodResultInstance?.sequence}">
				<li class="fieldcontain">
					<span id="sequence-label" class="property-label"><g:message code="bloodResult.sequence.label" default="Sequence" /></span>
					
						<span class="property-value" aria-labelledby="sequence-label"><g:fieldValue bean="${bloodResultInstance}" field="sequence"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodResultInstance?.value}">
				<li class="fieldcontain">
					<span id="value-label" class="property-label"><g:message code="bloodResult.value.label" default="Value" /></span>
					
						<span class="property-value" aria-labelledby="value-label"><g:fieldValue bean="${bloodResultInstance}" field="value"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${bloodResultInstance?.id}" />
					<g:link class="edit" action="edit" id="${bloodResultInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
