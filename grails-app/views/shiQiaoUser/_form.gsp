<%@ page import="com.sjzsqjy.www.data.shiqiao.ShiQiaoUser" %>



<div class="fieldcontain ${hasErrors(bean: shiQiaoUserInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="shiQiaoUser.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${shiQiaoUserInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shiQiaoUserInstance, field: 'sex', 'error')} ">
	<label for="sex">
		<g:message code="shiQiaoUser.sex.label" default="Sex" />
		
	</label>
	<g:textField name="sex" value="${shiQiaoUserInstance?.sex}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shiQiaoUserInstance, field: 'doctor', 'error')} ">
	<label for="doctor">
		<g:message code="shiQiaoUser.doctor.label" default="Doctor" />
		
	</label>
	<g:select id="doctor" name="doctor.id" from="${com.sjzsqjy.www.data.shiqiao.Doctor.list()}" optionKey="id" optionValue="name" value="${shiQiaoUserInstance?.doctor?.id}" class="many-to-one" noSelection="['null': '']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shiQiaoUserInstance, field: 'clinic', 'error')} ">
	<label for="clinic">
		<g:message code="shiQiaoUser.clinic.label" default="Clinic" />
		
	</label>
	<g:select id="clinic" name="clinic.id" from="${com.sjzsqjy.www.statistics.Clinic.list()}" optionKey="id" optionValue="name" value="${shiQiaoUserInstance?.clinic?.id}" class="many-to-one" noSelection="['null': '']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shiQiaoUserInstance, field: 'birth', 'error')} ">
	<label for="birth">
		<g:message code="shiQiaoUser.birth.label" default="birth" />
		
	</label>
	<g:textField name="birth" value="${shiQiaoUserInstance?.birth}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shiQiaoUserInstance, field: 'date', 'error')} ">
	<label for="date">
		<g:message code="shiQiaoUser.date.label" default="Date" />
		
	</label>
	<g:textField name="date" value="${shiQiaoUserInstance?.date}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shiQiaoUserInstance, field: 'sampleId', 'error')} ">
	<label for="sampleId">
		<g:message code="shiQiaoUser.sampleId.label" default="Sample Id" />
		
	</label>
	<g:textField name="sampleId" value="${shiQiaoUserInstance?.sampleId}"/>
</div>

