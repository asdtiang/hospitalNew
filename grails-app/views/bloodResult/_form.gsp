<%@ page import="com.sjzsqjy.www.data.blood.BloodResult" %>



<div class="fieldcontain ${hasErrors(bean: bloodResultInstance, field: 'keyStr', 'error')} ">
	<label for="keyStr">
		<g:message code="bloodResult.keyStr.label" default="Key Str" />
		
	</label>
	<g:textField name="keyStr" value="${bloodResultInstance?.keyStr}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodResultInstance, field: 'sequence', 'error')} required">
	<label for="sequence">
		<g:message code="bloodResult.sequence.label" default="Sequence" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sequence" type="number" value="${bloodResultInstance.sequence}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodResultInstance, field: 'value', 'error')} required">
	<label for="value">
		<g:message code="bloodResult.value.label" default="Value" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="value" value="${fieldValue(bean: bloodResultInstance, field: 'value')}" required=""/>
</div>

