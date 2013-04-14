<%@ page import="com.sjzsqjy.www.site.CustomData" %>

<script>
    //模板更改时更新内容到textArea
 function   changeTemplate() {

     var checkValue=$("#template").val();
     $.ajax({
         url:"${g.createLink(controller:'dataTemplate',action:'changeTemplate')}",
         dataType: 'json',
         data: {
             id: checkValue
         },
         success: function(data) {
             $("#data").text(data.dataTemplate.templateStr);
             CKEDITOR.instances.data.setData(data.dataTemplate.templateStr);
         },
         error: function(request, status, error) {
             alert("模板id不存在！"+error)
         },
         complete: function() {
         }
     });
 }
</script>


<div class="fieldcontain ${hasErrors(bean: customDataInstance, field: 'clinic', 'error')} required">
	<label for="clinicName">
		<g:message code="customData.clinic.label" default="Clinic" />
		<span class="required-indicator">*</span>
	</label>
    <style >
        .yui-ac{width:625px;float:right}
        </style>
    <richui:autoComplete maxResultsDisplayed="500" name="clinicName"
                         value="${customDataInstance?.clinic?.name}" action="${createLinkTo('dir': 'data/listClinicByName')}" />

</div>

<div class="fieldcontain ${hasErrors(bean: customDataInstance, field: 'template', 'error')} required">
	<label for="template">
		<g:message code="customData.template.label" default="Template" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="template" name="template.id" onchange="changeTemplate();" from="${com.sjzsqjy.www.site.DataTemplate.list()}" optionKey="id" required="" optionValue="title" value="${customDataInstance?.template?.id}" class="many-to-one"/>
</div>




<div class="fieldcontain ${hasErrors(bean: customDataInstance, field: 'patientName', 'error')} ">
	<label for="patientName">
		<g:message code="customData.patientName.label" default="Patient Name" />
		
	</label>
	<g:textField name="patientName" value="${customDataInstance?.patientName}"/>
</div>



<div class="fieldcontain ${hasErrors(bean: customDataInstance, field: 'testDate', 'error')} required">
	<label for="testDate">
		<g:message code="customData.testDate.label" default="Test Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="testDate" precision="day"    value="${customDataInstance?.testDate}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: customDataInstance, field: 'data', 'error')} ">
	<label for="data">
		<g:message code="customData.data.label" default="Data" />
	</label>
    <ckeditor:config height="600px" width="800px" />
             <ckeditor:editor name="data">${customDataInstance?.data}</ckeditor:editor>
</div>
