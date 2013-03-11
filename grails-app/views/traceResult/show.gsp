
<%@ page import="com.sjzsqjy.www.data.trace.TraceResult" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'traceResult.label', default: 'TraceResult')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-traceResult" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-traceResult" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list traceResult">
			
				<g:if test="${traceResultInstance?.result}">
				<li class="fieldcontain">
					<span id="result-label" class="property-label"><g:message code="traceResult.result.label" default="Result" /></span>
					
						<span class="property-value" aria-labelledby="result-label"><g:fieldValue bean="${traceResultInstance}" field="result"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceResultInstance?.sampleId}">
				<li class="fieldcontain">
					<span id="sampleId-label" class="property-label"><g:message code="traceResult.sampleId.label" default="Sample Id" /></span>
					
						<span class="property-value" aria-labelledby="sampleId-label"><g:fieldValue bean="${traceResultInstance}" field="sampleId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceResultInstance?.typeStr}">
				<li class="fieldcontain">
					<span id="typeStr-label" class="property-label"><g:message code="traceResult.typeStr.label" default="Type Str" /></span>
					
						<span class="property-value" aria-labelledby="typeStr-label"><g:fieldValue bean="${traceResultInstance}" field="typeStr"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${traceResultInstance?.ybStr}">
				<li class="fieldcontain">
					<span id="ybStr-label" class="property-label"><g:message code="traceResult.ybStr.label" default="Yb Str" /></span>
					
						<span class="property-value" aria-labelledby="ybStr-label"><g:fieldValue bean="${traceResultInstance}" field="ybStr"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${traceResultInstance?.id}" />
					<g:link class="edit" action="edit" id="${traceResultInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
