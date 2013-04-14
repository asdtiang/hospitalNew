<%@ page import="com.sjzsqjy.www.data.TestType" %>




<div class="fieldcontain ${hasErrors(bean: testTypeInstance, field: 'typeName', 'error')} ">
	<label for="typeName">
		<g:message code="testType.typeName.label" default="Type Name" />
		
	</label>
	<g:textField name="typeName" value="${testTypeInstance?.typeName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: testTypeInstance, field: 'typeTag', 'error')} ">
	<label for="typeTag">
		<g:message code="testType.typeTag.label" default="Type Tag" />
		
	</label>
	<g:textField name="typeTag" value="${testTypeInstance?.typeTag}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: testTypeInstance, field: 'content', 'error')} ">
	<label for="content">
		<g:message code="testType.content.label" default="Content" />

	</label>
	<g:textArea name="content" value="${testTypeInstance?.content}"/>
</div>


