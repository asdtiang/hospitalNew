<%@ page import="com.sjzsqjy.www.data.TestData" %>



<div class="fieldcontain ${hasErrors(bean: testDataInstance, field: 'age', 'error')} ">
	<label for="age">
		<g:message code="testData.age.label" default="Age" />
		
	</label>
	<g:textField name="age" value="${testDataInstance?.age}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: testDataInstance, field: 'clinic', 'error')} required">
	<label for="clinic">
		<g:message code="testData.clinic.label" default="Clinic" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="clinic" name="clinic.id" from="${com.sjzsqjy.www.statistics.Clinic.list()}" optionKey="id" optionValue="name" required="" value="${testDataInstance?.clinic?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: testDataInstance, field: 'jsonData', 'error')} ">
	<label for="jsonData">
		<g:message code="testData.jsonData.label" default="Json Data" />
		
	</label>
	<g:textField name="jsonData" value="${testDataInstance?.jsonData}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: testDataInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="testData.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${testDataInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: testDataInstance, field: 'testDate', 'error')} required">
	<label for="testDate">
		<g:message code="testData.testDate.label" default="Test Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="testDate" precision="day"  value="${testDataInstance?.testDate}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: testDataInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="testData.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="type" name="type.id" from="${com.sjzsqjy.www.data.TestType.list()}" optionKey="id" required="" value="${testDataInstance?.type?.id}" class="many-to-one"/>
</div>

