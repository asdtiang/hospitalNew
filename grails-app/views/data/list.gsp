
<%@ page import="com.sjzsqjy.www.statistics.Data"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta name="layout" content="sta" />
  <g:javascript src="My97DatePicker/WdatePicker.js" />
   <jq:resources />
   <paginate:resources/>
   <calendar:resources lang="cn"/>
</head>
<body>

<div class="nav"><span class="menuButton">
<g:link class="home" controller="index" action="staIndex">数据统计程序入口</g:link></span>
 <span class="menuButton"><g:link
	class="create" action="create">
	<g:message code="default.new.label" args="[entityName]" />
</g:link></span></div>
<div class="body">
${condition}
<div id="form1"><g:form controller="data"
	action="search">
	
起始时间：<input  class="Wdate" name="startDate" type="text" value="<g:formatDate format="yyyy-MM-dd" date="${new Date()-30}"/>" onfocus="WdatePicker()"/>
结束时间：
<input  class="Wdate" name="endDate" type="text" value="<g:formatDate format="yyyy-MM-dd" date="${new Date()}"/>" onfocus="WdatePicker()"/>

	<g:submitToRemote controller="data" action="search"
		update="update" value="检索" />

</g:form></div>
<div >
<table>
	<thead>
		<tr>


			<th><g:message code="data.clinic.label" default="Clinic" /></th>

			<g:sortableColumn property="name"
				title="${message(code: 'data.name.label', default: 'Name')}" />

			<th><g:message code="data.item.label" default="Item" /></th>


			<g:sortableColumn property="money"
				title="${message(code: 'data.money.label', default: 'Money')}" />
			<g:sortableColumn property="date"
				title="${message(code: 'data.date.label', default: 'date')}" />
				<td>月</td>
			<td>年</td>
			<td>录入日期</td>
		</tr>
	</thead>
	<tbody>
		<g:each in="${pageAjaxList}" status="i" var="dataInstance">
			<tr>



				<td><g:link target="_blank" action="show" id="${dataInstance[0]}">
					${dataInstance[1]}
				</g:link></td>

				<td>
				${dataInstance[2]}
				</td>

				<td>
				${dataInstance[3]}
				</td>
				<td>
				${dataInstance[4]}
				</td>
				<td><g:formatDate format="yyyy-MM-dd"
					date="${dataInstance[5]}" /></td>
				<td>
				${dataInstance[6]}
				</td>
				<td>
				${dataInstance[7]}
				</td>
				<td><g:formatDate format="yyyy-MM-dd hh:mm:ss"
					date="${dataInstance[8]}" /></td>
				<td>
			</tr>
		</g:each>
	</tbody>
</table>
</div>
 <paginate:jquery update="update" total="${paginateAjaxTotal}" selectMax="30" />
</div>
</body></html>
