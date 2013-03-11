
<%@ page import="com.sjzsqjy.www.data.shiqiao.ItemSet" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="admin">
		<g:set var="entityName" value="${message(code: 'itemSet.label', default: 'ItemSet')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-itemSet" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-itemSet" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list itemSet">
			
				<g:if test="${itemSetInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="itemSet.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${itemSetInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${itemSetInstance?.unit}">
				<li class="fieldcontain">
					<span id="unit-label" class="property-label"><g:message code="itemSet.unit.label" default="Unit" /></span>
					
						<span class="property-value" aria-labelledby="unit-label"><g:fieldValue bean="${itemSetInstance}" field="unit"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${itemSetInstance?.code}">
				<li class="fieldcontain">
					<span id="code-label" class="property-label"><g:message code="itemSet.code.label" default="Code" /></span>
					
						<span class="property-value" aria-labelledby="code-label"><g:fieldValue bean="${itemSetInstance}" field="code"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${itemSetInstance?.hight}">
				<li class="fieldcontain">
					<span id="hight-label" class="property-label"><g:message code="itemSet.hight.label" default="Hight" /></span>
					
						<span class="property-value" aria-labelledby="hight-label"><g:fieldValue bean="${itemSetInstance}" field="hight"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${itemSetInstance?.itemType}">
				<li class="fieldcontain">
					<span id="itemType-label" class="property-label"><g:message code="itemSet.itemType.label" default="Item Type" /></span>
					
						<span class="property-value" aria-labelledby="itemType-label"><g:link controller="itemType" action="show" id="${itemSetInstance?.itemType?.id}">${itemSetInstance?.itemType?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${itemSetInstance?.low}">
				<li class="fieldcontain">
					<span id="low-label" class="property-label"><g:message code="itemSet.low.label" default="Low" /></span>
					
						<span class="property-value" aria-labelledby="low-label"><g:fieldValue bean="${itemSetInstance}" field="low"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${itemSetInstance?.sequence}">
				<li class="fieldcontain">
					<span id="sequence-label" class="property-label"><g:message code="itemSet.sequence.label" default="Sequence" /></span>
					
						<span class="property-value" aria-labelledby="sequence-label"><g:fieldValue bean="${itemSetInstance}" field="sequence"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${itemSetInstance?.id}" />
					<g:link class="edit" action="edit" id="${itemSetInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
