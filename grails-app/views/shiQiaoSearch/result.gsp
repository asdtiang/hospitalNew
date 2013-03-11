<!--思桥软件结果显示-->
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" href="${resource(dir:'css',file:'main.css')}" />
<link rel="shortcut icon"
	href="${resource(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
<g:set var="entityName"
	value="${message(code: 'reslut.label', default: 'ItemType')}" />
<title><g:message code="site.name" args="[entityName]" /></title>
</head>
<body>

<div id="body">
<span class="i7">临床检验报告单</span>
<br/>
<div id="div1">
<table width="700" style="font-size:16px;" >
	<tbody>
		<tr >
			<td ><g:message
				code="name.label" default="Symbol" />
			${patient?.name}
			</td>
			<td><g:message
				code="sex.label" default="Symbol" />
			${patient?.sex}
			</td>
			<td ><g:message
				code="age.label" default="Symbol" /></td>
			<td ><g:message
				code="sample.no.label" default="Symbol" />
			${patient?.sampleId}
			</td>
		</tr>
		<tr >
			<td ><g:message
				code="patient.no.label" default="Symbol" /></td>
			<td ><g:message
				code="section.label" default="Symbol" /></td>
			<td><g:message
				code="bed.no.label" default="Symbol" /></td>
			<td ><g:message
				code="send.doctor.label" default="Symbol" /></td>
		</tr>
	</tbody>
</table>

</div>
<!--div div1 end-->

<div id="bodyLeft">
<table width="400"  style="font-size:14px;border-collapse: collapse; border: solid #000000; border-width: 1px 0 1px 0px;">	
	    <tr>
                <td>
				<g:message code="item.code.label" />
				</td>
				<td>
				<g:message code="item.name.label" />
				</td>
				<td>
				<g:message code="result.label" />
				</td>
<td></td>
				<td><g:message code="sample.value.label" />
				</td>
				
				<td>
				<g:message code="unit.label" />
				</td>			
		</tr>			
		<g:each in="${resultList}" status="i" var="resultInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

				<td>
				${fieldValue(bean: resultInstance, field: "code")}
				</td>

				<td>
				${fieldValue(bean: resultInstance, field: "name")}
				</td>

				<td>
				${fieldValue(bean: resultInstance, field: "value")}
				</td>
              
				<td><g:if test="${resultInstance.isNormal==-1}">↓</g:if> <g:if
					test="${resultInstance.isNormal==1}">↑</g:if>
				</td>
<td>
    <g:if test="${resultInstance.low!=resultInstance.hight}"> ${fieldValue(bean: resultInstance, field: "low")}-${fieldValue(bean: resultInstance, field: "hight")}</g:if>
      </td>

				<td>
				${fieldValue(bean: resultInstance, field: "unit")}
				</td>
                 <g:set var="counter" value="${i}" />
			</tr>
		</g:each>
	
</table>
</div>
<!--div bodyLeft end-->
<g:if test="${counter>15}">
<div id="bodyRight">
<img id="img1"
	src="${createLinkTo(dir: 'uploads/pic/', file:patient.date+'/1-'+patient.sampleId+'-CWBC.bmp')}" /><br/>
<img id="img1"
	src="${createLinkTo(dir: 'uploads/pic/', file:patient.date+'/1-'+patient.sampleId+'-CRBC.bmp')}" /></br>
<img id="img1"
	src="${createLinkTo(dir: 'uploads/pic/', file:patient.date+'/1-'+patient.sampleId+'-CPLT.bmp')}" /></br>
</div>
</g:if>
<div id="foot">

<table width="700" style="font-size:16px;">
	<tbody>
		<tr >
			<td ><g:message
				code="send.date.label" default="Symbol" />
			${patient?.date}
			</td>
			<td ><g:message
				code="test.date.label" default="Symbol" />
			${patient?.date}
			</td>
			<td ><g:message
				code="test.doctor.label" default="Symbol" />
			${doctor?.name}
			</td>
			<td ><g:message
				code="check.doctor.label" default="Symbol" /></td>
		</tr>
		<tr class="prop">
			<td valign="top" class="name"></td>
			<td valign="top" class="name"></td>
			<td valign="top" class="name"></td>
			<td valign="top" class="name"><span style="font-size:13px;"><g:message
				code="result.issue.label" default="Symbol" /></span></td>
		</tr>
	</tbody>
</table>
</div>
<!--div foot end-->


<!--div2 end-->
</div>
<!--div body end-->

</body>
</html>
