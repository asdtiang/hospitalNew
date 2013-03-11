
<%@ page import="com.sjzsqjy.www.data.shiqiao.ShiQiaoResult" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'shiQiaoResult.label', default: 'ShiQiaoResult')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-shiQiaoResult" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-shiQiaoResult" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list shiQiaoResult">
			
				<g:if test="${shiQiaoResultInstance?.charValue}">
				<li class="fieldcontain">
					<span id="charValue-label" class="property-label"><g:message code="shiQiaoResult.charValue.label" default="Char Value" /></span>
					
						<span class="property-value" aria-labelledby="charValue-label"><g:fieldValue bean="${shiQiaoResultInstance}" field="charValue"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiQiaoResultInstance?.sequence}">
				<li class="fieldcontain">
					<span id="sequence-label" class="property-label"><g:message code="shiQiaoResult.sequence.label" default="Sequence" /></span>
					
						<span class="property-value" aria-labelledby="sequence-label"><g:fieldValue bean="${shiQiaoResultInstance}" field="sequence"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiQiaoResultInstance?.date}">
				<li class="fieldcontain">
					<span id="date-label" class="property-label"><g:message code="shiQiaoResult.date.label" default="Date" /></span>
					
						<span class="property-value" aria-labelledby="date-label"><g:fieldValue bean="${shiQiaoResultInstance}" field="date"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiQiaoResultInstance?.inputType}">
				<li class="fieldcontain">
					<span id="inputType-label" class="property-label"><g:message code="shiQiaoResult.inputType.label" default="Input Type" /></span>
					
						<span class="property-value" aria-labelledby="inputType-label"><g:fieldValue bean="${shiQiaoResultInstance}" field="inputType"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiQiaoResultInstance?.itemCode}">
				<li class="fieldcontain">
					<span id="itemCode-label" class="property-label"><g:message code="shiQiaoResult.itemCode.label" default="Item Code" /></span>
					
						<span class="property-value" aria-labelledby="itemCode-label"><g:fieldValue bean="${shiQiaoResultInstance}" field="itemCode"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiQiaoResultInstance?.sampleId}">
				<li class="fieldcontain">
					<span id="sampleId-label" class="property-label"><g:message code="shiQiaoResult.sampleId.label" default="Sample Id" /></span>
					
						<span class="property-value" aria-labelledby="sampleId-label"><g:fieldValue bean="${shiQiaoResultInstance}" field="sampleId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiQiaoResultInstance?.typeId}">
				<li class="fieldcontain">
					<span id="typeId-label" class="property-label"><g:message code="shiQiaoResult.typeId.label" default="Type Id" /></span>
					
						<span class="property-value" aria-labelledby="typeId-label"><g:fieldValue bean="${shiQiaoResultInstance}" field="typeId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shiQiaoResultInstance?.value}">
				<li class="fieldcontain">
					<span id="value-label" class="property-label"><g:message code="shiQiaoResult.value.label" default="Value" /></span>
					
						<span class="property-value" aria-labelledby="value-label"><g:fieldValue bean="${shiQiaoResultInstance}" field="value"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${shiQiaoResultInstance?.id}" />
					<g:link class="edit" action="edit" id="${shiQiaoResultInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
