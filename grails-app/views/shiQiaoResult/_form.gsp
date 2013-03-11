<%@ page import="com.sjzsqjy.www.data.shiqiao.ShiQiaoResult" %>



<div class="fieldcontain ${hasErrors(bean: shiQiaoResultInstance, field: 'charValue', 'error')} ">
	<label for="charValue">
		<g:message code="shiQiaoResult.charValue.label" default="Char Value" />
		
	</label>
	<g:textField name="charValue" value="${shiQiaoResultInstance?.charValue}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shiQiaoResultInstance, field: 'sequence', 'error')} required">
	<label for="sequence">
		<g:message code="shiQiaoResult.sequence.label" default="Sequence" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="sequence" required="" value="${shiQiaoResultInstance.sequence}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shiQiaoResultInstance, field: 'date', 'error')} ">
	<label for="date">
		<g:message code="shiQiaoResult.date.label" default="Date" />
		
	</label>
	<g:textField name="date" value="${shiQiaoResultInstance?.date}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shiQiaoResultInstance, field: 'inputType', 'error')} required">
	<label for="inputType">
		<g:message code="shiQiaoResult.inputType.label" default="Input Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="inputType" required="" value="${shiQiaoResultInstance.inputType}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shiQiaoResultInstance, field: 'itemCode', 'error')} ">
	<label for="itemCode">
		<g:message code="shiQiaoResult.itemCode.label" default="Item Code" />
		
	</label>
	<g:textField name="itemCode" value="${shiQiaoResultInstance?.itemCode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shiQiaoResultInstance, field: 'sampleId', 'error')} ">
	<label for="sampleId">
		<g:message code="shiQiaoResult.sampleId.label" default="Sample Id" />
		
	</label>
	<g:textField name="sampleId" value="${shiQiaoResultInstance?.sampleId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shiQiaoResultInstance, field: 'typeId', 'error')} ">
	<label for="typeId">
		<g:message code="shiQiaoResult.typeId.label" default="Type Id" />
		
	</label>
	<g:textField name="typeId" value="${shiQiaoResultInstance?.typeId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shiQiaoResultInstance, field: 'value', 'error')} ">
	<label for="value">
		<g:message code="shiQiaoResult.value.label" default="Value" />
		
	</label>
	<g:textField name="value" value="${shiQiaoResultInstance?.value}"/>
</div>

