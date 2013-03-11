<%@ page import="com.sjzsqjy.www.data.trace.TraceType" %>



<div class="fieldcontain ${hasErrors(bean: traceTypeInstance, field: 'adult', 'error')} ">
	<label for="adult">
		<g:message code="traceType.adult.label" default="Adult" />
		
	</label>
	<g:textField name="adult" value="${traceTypeInstance?.adult}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceTypeInstance, field: 'child', 'error')} ">
	<label for="child">
		<g:message code="traceType.child.label" default="Child" />
		
	</label>
	<g:textField name="child" value="${traceTypeInstance?.child}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceTypeInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="traceType.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${traceTypeInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceTypeInstance, field: 'sampleType', 'error')} ">
	<label for="sampleType">
		<g:message code="traceType.sampleType.label" default="Sample Type" />
		
	</label>
	<g:textField name="sampleType" value="${traceTypeInstance?.sampleType}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceTypeInstance, field: 'sequence', 'error')} required">
	<label for="sequence">
		<g:message code="traceType.sequence.label" default="Sequence" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sequence" type="number" value="${traceTypeInstance.sequence}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceTypeInstance, field: 'unit', 'error')} ">
	<label for="unit">
		<g:message code="traceType.unit.label" default="Unit" />
		
	</label>
	<g:textField name="unit" value="${traceTypeInstance?.unit}"/>
</div>

