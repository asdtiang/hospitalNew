<!--微量元素检测结果显示-->
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
<style type="text/css">
<!--
.tdclass {
	border: 1px solid #000000;
	border-collapse: collapse;
	text-align:center;
}
.STYLE2 {
	font-family: "宋体";
	font-size: 14px;
	line-height:20px;
}
#text12{
   margin-left:20px;
   
}
#myCenter1 {
	position: relative;
	clear: left;
	margin-top:5px;
	margin-left: 20px;
}
.ii9 {
	font-size: 24px;
	text-align: center;
	margin-left: 220px;
	margin-bottom: 5px;
}
.i11{
   font-size:12px;
}
-->
</style>


</head>
<body id="body">
<span class="ii9">微量元素检测检验报告单</span>
<br/>
<div id="myCenter1">
<table width="600" >
	<tbody>
		<tr class="prop">
			<td valign="top" class="name"><label for="symbol"><g:message
				code="serial.number" default="Symbol" /> ${patient?.sampleId} </label></td>
			<td valign="top" class="name"><label for="symbol"><g:message
				code="name.label" default="Symbol" /> ${patient?.name} </label></td>
			<td valign="top" class="name"><label for="symbol"><g:message
				code="age.label" default="Symbol" /> ${patient?.ageInfo} </label></td>
			<td valign="top" class="name"><label for="symbol"><g:message
				code="sex.label" default="Symbol" /> ${patient?.sex} </label></td>
		</tr>
		<tr class="prop">
			<td valign="top" class="name"><label for="symbol"><g:message
				code="send.dep.label" default="Symbol" /> ${patient?.keShi} </label></td>
			<td valign="top" class="name"><label for="symbol"><g:message
				code="sample.label" default="Symbol" /> ${patient?.type} </label></td>
			<td valign="top" class="name"><label for="symbol"><g:message
				code="hospital.no.label" default="Symbol" /></label></td>
			<td valign="top" class="name"><label for="symbol"><g:message
				code="send.doctor.label" default="Symbol" /> ${patient?.sendDoctor} </label></td>
		</tr>


	</tbody>
</table>
</div>

<div id="myCenter1">
<table width="600" class="tdclass" >

	<tr>
		<td class="tdclass"><g:message code="trace.label" /></td>

		<td class="tdclass"><g:message code="test.value.label" /></td>

		<td class="tdclass"><g:message code="unit1.label" /></td>
		<td class="tdclass"><g:message code="child.label" /></td>
		<td class="tdclass"><g:message code="adult.label" /></td>

	</tr>

	<g:each in="${resultList}" status="i" var="resultInstance">
		<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

			<td class="tdclass">
			<span class="i11">${fieldValue(bean: resultInstance, field: "name")}</span>
			</td>

			<td class="tdclass">
			<span class="i11">${fieldValue(bean: resultInstance, field: "result")}</span>
			</td>

			<td class="tdclass">
			<span class="i11">${fieldValue(bean: resultInstance, field: "unit")}</span>
			</td>

			<td class="tdclass">
			<span class="i11">${fieldValue(bean: resultInstance, field: "child")}</span>
			</td>

			<td class="tdclass">
			<span class="i11">${fieldValue(bean: resultInstance, field: "adult")}</span>
			</td>

		</tr>
	</g:each>



</table>
<br/>

<span style="text-align:center;margin-left:250px;">*检验仅对此样品结果负责*</span>

<table  width="600">
	<tr>
		<td><g:message code="test.doctor" />
		${patient?.doctor}
		</td>
		<td></td>	
		<td></td>
		<td></td>	
		<td><g:message code="test.time.label" />
		${patient?.date}
		</td>
	</tr>
</table>

</div>
<div id="text12">
<span class="STYLE2">临床意义：<br />
铅：铅增高可导致儿童多动症，食欲不振，注意力不集中、智力下降。<br />
铜：青少年缺铜导致贫血，不利于身体长高。<br />
锌：缺锌时味觉减退，厌食及发育不良，伤口难愈合，免疫力下降，易患病毒感染及化脓性炎症。<br />
铁：缺铁时，可引起低色素性小细胞贫血，及腹泻，孕妇缺铁可引起新生儿体重偏轻。<br />
钙：钙是人体骨骼的重要组成部分，缺钙可导致骨骼发育不良，儿童缺钙时睡眠不安，夜啼，龋齿<br />
&nbsp;&nbsp;&nbsp; 等症状。<br />
镁：参与人体新陈代谢，维持体内环境稳定及正常生命活动起重要作用。</span>
</div>
</body>
</html>
