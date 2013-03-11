
<%@ page import="com.sjzsqjy.www.data.blood.BloodItem" %>
<!doctype html>
<html>
	<head>
        <meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'bloodItem.label', default: 'BloodItem')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-bloodItem" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-bloodItem" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list bloodItem">
			
				<g:if test="${bloodItemInstance?.sequence}">
				<li class="fieldcontain">
					<span id="sequence-label" class="property-label"><g:message code="bloodItem.sequence.label" default="Sequence" /></span>
					
						<span class="property-value" aria-labelledby="sequence-label"><g:fieldValue bean="${bloodItemInstance}" field="sequence"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodItemInstance?.high}">
				<li class="fieldcontain">
					<span id="high-label" class="property-label"><g:message code="bloodItem.high.label" default="High" /></span>
					
						<span class="property-value" aria-labelledby="high-label"><g:fieldValue bean="${bloodItemInstance}" field="high"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodItemInstance?.low}">
				<li class="fieldcontain">
					<span id="low-label" class="property-label"><g:message code="bloodItem.low.label" default="Low" /></span>
					
						<span class="property-value" aria-labelledby="low-label"><g:fieldValue bean="${bloodItemInstance}" field="low"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${bloodItemInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="bloodItem.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${bloodItemInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${bloodItemInstance?.id}" />
					<g:link class="edit" action="edit" id="${bloodItemInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
