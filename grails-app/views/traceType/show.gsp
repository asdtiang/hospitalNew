
<%@ page import="com.sjzsqjy.www.data.trace.TraceType" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'traceType.label', default: 'TraceType')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-traceType" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-traceType" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list traceType">
			
				<g:if test="${traceTypeInstance?.adult}">
				<li class="fieldcontain">
					<span id="adult-label" class="property-label"><g:message code="traceType.adult.label" default="Adult" /></span>
					
						<span class="property-value" aria-labelledby="adult-label"><g:fieldValue bean="${traceTypeInstance}" field="adult"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceTypeInstance?.child}">
				<li class="fieldcontain">
					<span id="child-label" class="property-label"><g:message code="traceType.child.label" default="Child" /></span>
					
						<span class="property-value" aria-labelledby="child-label"><g:fieldValue bean="${traceTypeInstance}" field="child"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceTypeInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="traceType.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${traceTypeInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceTypeInstance?.sampleType}">
				<li class="fieldcontain">
					<span id="sampleType-label" class="property-label"><g:message code="traceType.sampleType.label" default="Sample Type" /></span>
					
						<span class="property-value" aria-labelledby="sampleType-label"><g:fieldValue bean="${traceTypeInstance}" field="sampleType"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceTypeInstance?.sequence}">
				<li class="fieldcontain">
					<span id="sequence-label" class="property-label"><g:message code="traceType.sequence.label" default="Sequence" /></span>
					
						<span class="property-value" aria-labelledby="sequence-label"><g:fieldValue bean="${traceTypeInstance}" field="sequence"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceTypeInstance?.unit}">
				<li class="fieldcontain">
					<span id="unit-label" class="property-label"><g:message code="traceType.unit.label" default="Unit" /></span>
					
						<span class="property-value" aria-labelledby="unit-label"><g:fieldValue bean="${traceTypeInstance}" field="unit"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${traceTypeInstance?.id}" />
					<g:link class="edit" action="edit" id="${traceTypeInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
