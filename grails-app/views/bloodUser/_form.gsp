<%@ page import="com.sjzsqjy.www.data.blood.BloodUser" %>



<div class="fieldcontain ${hasErrors(bean: bloodUserInstance, field: 'clinic', 'error')} ">
	<label for="clinic">
		<g:message code="bloodUser.clinic.label" default="Clinic" />
		
	</label>
	<g:select id="clinic" name="clinic.id" from="${com.sjzsqjy.www.statistics.Clinic.list()}" optionKey="id" value="${bloodUserInstance?.clinic?.id}" class="many-to-one" noSelection="['null': '']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodUserInstance, field: 'age', 'error')} ">
	<label for="age">
		<g:message code="bloodUser.age.label" default="Age" />
		
	</label>
	<g:textField name="age" value="${bloodUserInstance?.age}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodUserInstance, field: 'bedNum', 'error')} ">
	<label for="bedNum">
		<g:message code="bloodUser.bedNum.label" default="Bed Num" />
		
	</label>
	<g:textField name="bedNum" value="${bloodUserInstance?.bedNum}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodUserInstance, field: 'checkNum', 'error')} ">
	<label for="checkNum">
		<g:message code="bloodUser.checkNum.label" default="Check Num" />
		
	</label>
	<g:textField name="checkNum" value="${bloodUserInstance?.checkNum}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodUserInstance, field: 'hospitalNum', 'error')} ">
	<label for="hospitalNum">
		<g:message code="bloodUser.hospitalNum.label" default="Hospital Num" />
		
	</label>
	<g:textField name="hospitalNum" value="${bloodUserInstance?.hospitalNum}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodUserInstance, field: 'keBie', 'error')} ">
	<label for="keBie">
		<g:message code="bloodUser.keBie.label" default="Ke Bie" />
		
	</label>
	<g:textField name="keBie" value="${bloodUserInstance?.keBie}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodUserInstance, field: 'keyStr', 'error')} ">
	<label for="keyStr">
		<g:message code="bloodUser.keyStr.label" default="Key Str" />
		
	</label>
	<g:textField name="keyStr" value="${bloodUserInstance?.keyStr}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodUserInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="bloodUser.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${bloodUserInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodUserInstance, field: 'patientNum', 'error')} ">
	<label for="patientNum">
		<g:message code="bloodUser.patientNum.label" default="Patient Num" />
		
	</label>
	<g:textField name="patientNum" value="${bloodUserInstance?.patientNum}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodUserInstance, field: 'sampleId', 'error')} ">
	<label for="sampleId">
		<g:message code="bloodUser.sampleId.label" default="Sample Id" />
		
	</label>
	<g:textField name="sampleId" value="${bloodUserInstance?.sampleId}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodUserInstance, field: 'sendDate', 'error')} ">
	<label for="sendDate">
		<g:message code="bloodUser.sendDate.label" default="Send Date" />
		
	</label>
	<g:textField name="sendDate" value="${bloodUserInstance?.sendDate}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodUserInstance, field: 'sendDoctor', 'error')} ">
	<label for="sendDoctor">
		<g:message code="bloodUser.sendDoctor.label" default="Send Doctor" />
		
	</label>
	<g:textField name="sendDoctor" value="${bloodUserInstance?.sendDoctor}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodUserInstance, field: 'sex', 'error')} ">
	<label for="sex">
		<g:message code="bloodUser.sex.label" default="Sex" />
		
	</label>
	<g:textField name="sex" value="${bloodUserInstance?.sex}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodUserInstance, field: 'testDate', 'error')} ">
	<label for="testDate">
		<g:message code="bloodUser.testDate.label" default="Test Date" />
		
	</label>
	<g:textField name="testDate" value="${bloodUserInstance?.testDate}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodUserInstance, field: 'testDoctor', 'error')} ">
	<label for="testDoctor">
		<g:message code="bloodUser.testDoctor.label" default="Test Doctor" />
		
	</label>
	<g:textField name="testDoctor" value="${bloodUserInstance?.testDoctor}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bloodUserInstance, field: 'type', 'error')} ">
	<label for="type">
		<g:message code="bloodUser.type.label" default="Type" />
		
	</label>
	<g:textField name="type" value="${bloodUserInstance?.type}"/>
</div>

