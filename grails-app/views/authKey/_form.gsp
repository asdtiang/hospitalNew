<%@ page import="com.sjzsqjy.www.auth.AuthKey" %>



<div class="fieldcontain ${hasErrors(bean: authKeyInstance, field: 'clientKey', 'error')} required">
	<label for="clientKey">
		<g:message code="authKey.clientKey.label" default="Client Key" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="clientKey" required="" value="${authKeyInstance?.clientKey}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: authKeyInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="authKey.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="type" from="${com.sjzsqjy.www.auth.AuthKey$DataType?.values()}" keys="${com.sjzsqjy.www.auth.AuthKey$DataType.values()*.name()}" required="" value="${authKeyInstance?.type?.name()}"/>
</div>

