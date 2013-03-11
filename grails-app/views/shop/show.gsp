
<%@ page import="com.sjzsqjy.www.statistics.Shop" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="sta">
		<g:set var="entityName" value="${message(code: 'shop.label', default: 'Shop')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<div class="nav" >
			<span class="menuButton"><g:link class="home" controller="index" action="staIndex">数据统计程序入口</g:link></span>
		<span class="menuButton"><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></span>
		<span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
		</div>
		<div id="show-shop" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list shop">
			
				<g:if test="${shopInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="shop.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${shopInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${shopInstance?.address}">
				<li class="fieldcontain">
					<span id="address-label" class="property-label"><g:message code="shop.address.label" default="Address" /></span>
					
						<span class="property-value" aria-labelledby="address-label"><g:fieldValue bean="${shopInstance}" field="address"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${shopInstance?.id}" />
					<g:link class="edit" action="edit" id="${shopInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
