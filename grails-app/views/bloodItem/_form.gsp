<%@ page import="com.sjzsqjy.www.data.blood.BloodItem" %>



<div class="fieldcontain ${hasErrors(bean: bloodItemInstance, field: 'sequence', 'error')} required">
	<label for="sequence">
		<g:message code="bloodItem.sequence.label" default="Sequence" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sequence" type="number" value="${bloodItemInstance.sequence}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodItemInstance, field: 'high', 'error')} required">
	<label for="high">
		<g:message code="bloodItem.high.label" default="High" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="high" type="number" value="${bloodItemInstance.high}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodItemInstance, field: 'low', 'error')} required">
	<label for="low">
		<g:message code="bloodItem.low.label" default="Low" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="low" type="number" value="${bloodItemInstance.low}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodItemInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="bloodItem.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${bloodItemInstance?.name}"/>
</div>

