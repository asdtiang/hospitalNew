<head>
<style type="text/css">
<!--
.tdclass {
	border: 1px solid #ccc;
	border-collapse: collapse;
	text-align:center;
}


-->
</style>
</head>
<div align="center">
${clinicName}-${month}-统计报告
<br></br>

<table class="tdclass">
	<thead>
		<tr>


			<td class="tdclass"><g:message code="data.date.label" default="date" /></td> 
            <td class="tdclass"><g:message code="data.name.label" default="name" /></td> 
			

			 <td class="tdclass"><g:message code="data.item.label" default="Item" /></td>

            <td class="tdclass"><g:message code="data.money.label" default="money" /></td> 
			
			
			
		</tr>
	</thead>
	<tbody>
		<g:each in="${dataList}" status="i" var="dataInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">


<td class="tdclass"><g:formatDate format="yyyy-MM-dd"
					date="${dataInstance.date}" /></td>
				
				<td class="tdclass" >
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
		<td>${sum}</td>
		</tr>
	</tbody>
</table>
</div>
