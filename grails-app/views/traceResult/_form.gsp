<%@ page import="com.sjzsqjy.www.data.trace.TraceResult" %>



<div class="fieldcontain ${hasErrors(bean: traceResultInstance, field: 'result', 'error')} ">
	<label for="result">
		<g:message code="traceResult.result.label" default="Result" />
		
	</label>
	<g:textField name="result" value="${traceResultInstance?.result}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceResultInstance, field: 'sampleId', 'error')} ">
	<label for="sampleId">
		<g:message code="traceResult.sampleId.label" default="Sample Id" />
		
	</label>
	<g:textField name="sampleId" value="${traceResultInstance?.sampleId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceResultInstance, field: 'typeStr', 'error')} ">
	<label for="typeStr">
		<g:message code="traceResult.typeStr.label" default="Type Str" />
		
	</label>
	<g:textField name="typeStr" value="${traceResultInstance?.typeStr}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceResultInstance, field: 'ybStr', 'error')} ">
	<label for="ybStr">
		<g:message code="traceResult.ybStr.label" default="Yb Str" />
		
	</label>
	<g:textField name="ybStr" value="${traceResultInstance?.ybStr}"/>
</div>

