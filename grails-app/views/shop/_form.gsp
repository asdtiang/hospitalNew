<%@ page import="com.sjzsqjy.www.statistics.Shop" %>



<div class="fieldcontain ${hasErrors(bean: shopInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="shop.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${shopInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: shopInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="shop.address.label" default="Address" />
		
	</label>
	<g:textField name="address" value="${shopInstance?.address}"/>
</div>

