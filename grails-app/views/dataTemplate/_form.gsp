<%@ page import="com.sjzsqjy.www.site.DataTemplate" %>


<div class="fieldcontain ${hasErrors(bean: dataTemplateInstance, field: 'title', 'error')} ">
	<label for="title">
		<g:message code="dataTemplate.title.label" default="Title" />

	</label>
	<g:textField name="title" value="${dataTemplateInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: dataTemplateInstance, field: 'templateStr', 'error')} ">
	<label for="templateStr">
		<g:message code="dataTemplate.templateStr.label" default="Template Str" />
		
	</label>

    <ckeditor:config height="600px" width="800px" />
         <ckeditor:editor name="templateStr">${dataTemplateInstance?.templateStr}</ckeditor:editor>

</div>


