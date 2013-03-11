<%@ page import="com.sjzsqjy.www.data.sample.SampleUser" %>



<div class="fieldcontain ${hasErrors(bean: sampleUserInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="sampleUser.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${sampleUserInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: sampleUserInstance, field: 'sex', 'error')} ">
	<label for="sex">
		<g:message code="sampleUser.sex.label" default="Sex" />
		
	</label>
	<g:textField name="sex" value="${sampleUserInstance?.sex}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: sampleUserInstance, field: 'age', 'error')} ">
	<label for="age">
		<g:message code="sampleUser.age.label" default="Age" />
		
	</label>
	<g:textField name="age" value="${sampleUserInstance?.age}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: sampleUserInstance, field: 'sendDoctor', 'error')} ">
	<label for="sendDoctor">
		<g:message code="sampleUser.sendDoctor.label" default="Send Doctor" />
		
	</label>
	<g:textField name="sendDoctor" value="${sampleUserInstance?.sendDoctor}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: sampleUserInstance, field: 'clinic', 'error')} ">
	<label for="clinic">
		<g:message code="sampleUser.clinic.label" default="Clinic" />
		
	</label>
	<g:select id="clinic" name="clinic.id" from="${com.sjzsqjy.www.statistics.Clinic.list()}" optionKey="id" value="${sampleUserInstance?.clinic?.id}" class="many-to-one" noSelection="['null': '']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: sampleUserInstance, field: 'sampleId', 'error')} ">
	<label for="sampleId">
		<g:message code="sampleUser.sampleId.label" default="Sample Id" />
		
	</label>
	<g:textField name="sampleId" value="${sampleUserInstance?.sampleId}"/>
</div>

