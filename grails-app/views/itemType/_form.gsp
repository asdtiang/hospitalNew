<%@ page import="com.sjzsqjy.www.data.shiqiao.ItemType" %>



<div class="fieldcontain ${hasErrors(bean: itemTypeInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="itemType.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${itemTypeInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: itemTypeInstance, field: 'symbol', 'error')} ">
	<label for="symbol">
		<g:message code="itemType.symbol.label" default="Symbol" />
		
	</label>
	<g:textField name="symbol" value="${itemTypeInstance?.symbol}"/>
</div>

