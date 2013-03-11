<%@ page import="com.sjzsqjy.www.data.shiqiao.ItemSet" %>



<div class="fieldcontain ${hasErrors(bean: itemSetInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="itemSet.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${itemSetInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: itemSetInstance, field: 'unit', 'error')} ">
	<label for="unit">
		<g:message code="itemSet.unit.label" default="Unit" />
		
	</label>
	<g:textField name="unit" value="${itemSetInstance?.unit}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: itemSetInstance, field: 'code', 'error')} ">
	<label for="code">
		<g:message code="itemSet.code.label" default="Code" />
		
	</label>
	<g:textField name="code" value="${itemSetInstance?.code}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: itemSetInstance, field: 'hight', 'error')} ">
	<label for="hight">
		<g:message code="itemSet.hight.label" default="Hight" />
		
	</label>
	<g:textField name="hight" value="${itemSetInstance?.hight}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: itemSetInstance, field: 'itemType', 'error')} required">
	<label for="itemType">
		<g:message code="itemSet.itemType.label" default="Item Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="itemType" name="itemType.id" from="${com.sjzsqjy.www.data.shiqiao.ItemType.list()}" optionKey="id" required="" value="${itemSetInstance?.itemType?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: itemSetInstance, field: 'low', 'error')} ">
	<label for="low">
		<g:message code="itemSet.low.label" default="Low" />
		
	</label>
	<g:textField name="low" value="${itemSetInstance?.low}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: itemSetInstance, field: 'sequence', 'error')} required">
	<label for="sequence">
		<g:message code="itemSet.sequence.label" default="Sequence" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="number" name="sequence" required="" value="${itemSetInstance.sequence}"/>
</div>

