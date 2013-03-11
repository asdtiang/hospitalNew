<%@ page import="com.sjzsqjy.www.data.trace.TraceUser" %>



<div class="fieldcontain ${hasErrors(bean: traceUserInstance, field: 'sex', 'error')} ">
	<label for="sex">
		<g:message code="traceUser.sex.label" default="Sex" />
		
	</label>
	<g:textField name="sex" value="${traceUserInstance?.sex}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceUserInstance, field: 'ageInfo', 'error')} ">
	<label for="ageInfo">
		<g:message code="traceUser.ageInfo.label" default="Age Info" />
		
	</label>
	<g:textField name="ageInfo" value="${traceUserInstance?.ageInfo}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceUserInstance, field: 'sendDoctor', 'error')} ">
	<label for="sendDoctor">
		<g:message code="traceUser.sendDoctor.label" default="Send Doctor" />
		
	</label>
	<g:textField name="sendDoctor" value="${traceUserInstance?.sendDoctor}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceUserInstance, field: 'clinic', 'error')} ">
	<label for="clinic">
		<g:message code="traceUser.clinic.label" default="Clinic" />
		
	</label>
	<g:select id="clinic" name="clinic.id" from="${com.sjzsqjy.www.statistics.Clinic.list()}" optionKey="id" optionValue="name" value="${traceUserInstance?.clinic?.id}" class="many-to-one" noSelection="['null': '']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceUserInstance, field: 'date', 'error')} ">
	<label for="date">
		<g:message code="traceUser.date.label" default="Date" />
		
	</label>
	<g:textField name="date" value="${traceUserInstance?.date}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceUserInstance, field: 'doctor', 'error')} ">
	<label for="doctor">
		<g:message code="traceUser.doctor.label" default="Doctor" />
		
	</label>
	<g:textField name="doctor" value="${traceUserInstance?.doctor}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceUserInstance, field: 'keShi', 'error')} ">
	<label for="keShi">
		<g:message code="traceUser.keShi.label" default="Ke Shi" />
		
	</label>
	<g:textField name="keShi" value="${traceUserInstance?.keShi}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceUserInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="traceUser.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${traceUserInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceUserInstance, field: 'sampleId', 'error')} ">
	<label for="sampleId">
		<g:message code="traceUser.sampleId.label" default="Sample Id" />
		
	</label>
	<g:textField name="sampleId" value="${traceUserInstance?.sampleId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: traceUserInstance, field: 'type', 'error')} ">
	<label for="type">
		<g:message code="traceUser.type.label" default="Type" />
		
	</label>
	<g:textField name="type" value="${traceUserInstance?.type}"/>
</div>

