<!doctype html>
<html>
<head>
<title>统计结果</title>
<meta name="layout" content="null" />
<link rel="stylesheet" href="${resource(dir: 'css', file: 'sta.css')}"/>
<style type="text/css">
<!--
.tdclass {
	border: 1px solid #000000;
	border-collapse: collapse;
	text-align:center;
}
-->
</style>
</head>
<div align="center"><br></br>
<g:each in="${resultList}" status="j" var="result">
	${result?.name}-${month}-统计报告
	<br></br>
<table class="tdclass">
		<tr>
		    <td class="tdclass"><g:message code="data.date.label"
				default="date" /></td>
			<td class="tdclass"><g:message code="data.name.label"
				default="name" /></td>
			<td class="tdclass"><g:message code="data.item.label"
				default="Item" /></td>

			<td class="tdclass"><g:message code="data.money.label"
				default="money" /></td>
			
		</tr>
		<g:each in="${resultList[j].dataList}" status="i" var="dataInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
				<td class="tdclass"><g:formatDate format="yyyy-MM-dd"
					date="${dataInstance.date}" /></td>
				
				<td class="tdclass">
				${fieldValue(bean: dataInstance, field: "name")}
				</td >
				<td class="tdclass">
				${dataInstance?.item}
				</td>
				<td class="tdclass">
				${fieldValue(bean: dataInstance, field: "money")}
				</td>
				
			</tr>
		</g:each>
		<tr>
		<td></td>
		<td></td>
		<td></td>
		
			<td>${result.sum}</td>
		</tr>
       
	</table>
	<br></br><br></br>
</g:each></div>
</html>
