<%@ page import="com.sjzsqjy.www.data.shiqiao.Doctor" %>



<div class="fieldcontain ${hasErrors(bean: doctorInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="doctor.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${doctorInstance?.name}"/>
</div>

