<!--样品软件结果显示-->
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
<body id="body" >

<div id="bodyLeft" style="font-size:16px"><br/>
<span class="i8">临床生化检验报告单</span> <br/>
<table width="680"
	style="border-collapse: collapse; border: solid #000000; border-width: 1px 0 1px 0px;font-size:16px;">
	<tbody>
		<tr >
			<td ><g:message
				code="name.label" default="Symbol" /> ${patient?.name} </td>
			<td ><g:message
				code="age.label" default="Symbol" /> ${patient?.age} </td>
			<td ><g:message
				code="section.label" default="Symbol" /></td>
			<td ><g:message
				code="sample.type.label" default="Symbol" /> </td>

			<td ><g:message
				code="sample.type.no.label" default="Symbol" /> ${patient?.sampleId}
			</td>
		</tr>
		<tr>
			<td ><g:message
				code="sex.label" default="Symbol" /> ${patient?.sex} </td>
			<td >病床：</td>

			<td ><g:message
				code="send.doctor.label" default="Symbol" /> ${patient?.sendDoctor} </td>
			<td >诊断：</td>
			<td >送检日期：${date}
			</td>
		</tr>


	</tbody>
</table>
<table style="width: 640px; margin-top: 10px;font-size:16px; border-collapse:collapse;" >
    <tr  style="">
		<td style="border-bottom: 1px solid black;">#</td>
		<td style="border-bottom: 1px solid black;">项目</td>

		<td style="border-bottom: 1px solid black;">名称</td>

		<td style="border-bottom: 1px solid black;">结果</td>

		<td style="border-bottom: 1px solid black;"></td>

		<td style="border-bottom: 1px solid black;">参考值</td>

		<td style="border-bottom: 1px solid black;">单位</td>

	</tr>
	<g:each in="${resultList}" status="i" var="resultInstance">
		<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
			<td>
			${i+1}
			</td>
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
				test="${resultInstance.isNormal==1}">↑</g:if></td>
			<td>
			${fieldValue(bean: resultInstance, field: "low")}-${fieldValue(bean: resultInstance, field: "high")}
			</td>
			<td><g:if test="${resultInstance.unit=='null'}"></g:if> <g:else>
				${fieldValue(bean: resultInstance, field: "unit")}
			</g:else></td>

		</tr>
	</g:each>

</table>
<table
	style="width: 680px; margin-top: 10px; border-collapse: collapse; border: solid #000000; border-width: 1px 0 0 0;font-size:16px"
	>

	<tr>
		<td>检验者：李从伟</td>
		<td></td>

		<td>审核：</td>

		<td></td>

		<td>备注：</td>

		<td></td>

		<td>报告日期：${date}
		</td>

	</tr>
	<tr>
		<td>此结果仅对该标本负责</td>
	</tr>
</table>
</div>
</body>
</html>
