
<%@ page import="com.sjzsqjy.www.statistics.Data"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<g:javascript src="My97DatePicker/WdatePicker.js" />
<meta name="layout" content="sta" />
<g:set var="entityName"
	value="${message(code: 'data.label', default: 'Data')}" />
<title><g:message code="default.create.label"
		args="[entityName]" /></title>
<script>
	function changePrice(obj){
		var money = $("#money"+obj.id).text();
		var calculate = $("#calculate");
		var total = $("#money").val();
		if(obj.checked==true){
			if(calculate.text()==""){
				calculate.text(obj.value+"￥"+money);
			}
			else{
				calculate.text(calculate.text()+"+"+obj.value+"￥"+money);
				}
			$("#money").val(Number(total)+Number(money));
			}
		if(obj.checked==false){
			var calculateText=calculate.text();
			calculateText = calculateText.replace("+"+obj.value+"￥"+money,"");
			calculateText = calculateText.replace(obj.value+"￥"+money+"+","");
			calculateText = calculateText.replace(obj.value+"￥"+money,"");
			calculate.text(calculateText);
			$("#money").val(Number(total)-Number(money));
		}
		
	}
	$(document).ready(function(){
		var calculate = $("#calculate");
		$("input:checked").each(function(i){
			var money = $("#money"+this.id).text();
			var total = $("#money").val();
			if(calculate.text()==""){
				calculate.text(this.value+"￥"+money);
			}
			else{
				calculate.text(calculate.text()+"+"+this.value+"￥"+money);
				}
		});
	});
	</script>

</head>
<body>
	<div class="nav">
		<span class="menuButton"><g:link class="home"
				controller="index" action="staIndex">数据统计程序入口</g:link> </span> <span
			class="menuButton"><g:link class="list" action="list">
				<g:message code="default.list.label" args="[entityName]" />
			</g:link></span>
	</div>
	<div class="body">
		<h1>
			<g:message code="default.create.label" args="[entityName]" />
		</h1>
		<g:if test="${flash.message}">
			<div class="message">
				${flash.message}
			</div>
		</g:if>
		<g:hasErrors bean="${dataInstance}">
			<div class="errors">
				<g:renderErrors bean="${dataInstance}" as="list" />
			</div>
		</g:hasErrors>
		<resource:autoComplete skin="default" />
		<g:form action="save" method="post">
			<div class="dialog">
				<table>
					<tbody>

						<tr class="prop" width="1000">
							<td valign="top" class="name"><label for="clinic"><g:message
										code="data.clinic.label" default="Clinic" /></label></td>
							<td valign="top" width="1000"
								class="value ${hasErrors(bean: dataInstance, field: 'clinic', 'errors')}">
								<richui:autoComplete maxResultsDisplayed="500" name="clinicName"
									action="${createLinkTo('dir': 'data/searchAJAX')}" />
							</td>
						</tr>

						<tr class="prop">
							<td valign="top" class="name"><label for="name"><g:message
										code="data.name.label" default="Name" /></label></td>
							<td valign="top"
								class="value ${hasErrors(bean: dataInstance, field: 'name', 'errors')}">
								<g:textField name="name" value="${dataInstance?.name}" />
							</td>
						</tr>

						<tr class="prop">
							<td valign="top" class="name"><label for="item"><g:message
										code="data.item.label" default="Item" /></label></td>
							<td valign="top"
								class="value ${hasErrors(bean: dataInstance, field: 'item', 'errors')}">

								<g:checkBoxListItem name="items"
									from="${com.sjzsqjy.www.statistics.Item.list()}"
									optionKey="name" optionValue="price" lineCount="7" />
						</tr>



						<tr class="prop">
							<td valign="top" class="name"><label for="money"><g:message
										code="data.money.label" default="Money" /></label></td>
							<td valign="top"
								class="value ${hasErrors(bean: dataInstance, field: 'money', 'errors')}">
								<g:textField name="money"
									value="${fieldValue(bean: dataInstance, field: 'money')}" /> <label
								id="calculate"></label>
							</td>
						</tr>
						<tr class="prop">
							<td valign="top" class="name"><label for="date"><g:message
										code="data.date.label" default="Date" /></label></td>
							<td valign="top"
								class="value ${hasErrors(bean: dataInstance, field: 'date', 'errors')}">
								<input class="Wdate" id="date" name="testDate" type="text" value="" onfocus="WdatePicker()" />
							</td>
						</tr>
						<SCRIPT LANGUAGE="JavaScript">
   <!--
   // 获取客户端时间做为检验日期 
	var now= new Date();
	var year=now.getFullYear();
	var month=now.getMonth()+1;
	if(month<10){
		month="0"+month;
	}
	var day=now.getDate();
	if(day<10){
		day="0"+day;
	}
    $("#date").val(year+"-"+month+"-"+day);
   -->
   </SCRIPT>
						

					</tbody>
				</table>
			</div>
			<div class="buttons">
				<span class="button"><g:submitButton name="create"
						class="save"
						value="${message(code: 'default.button.create.label', default: 'Create')}" /></span>
			</div>
		</g:form>
	</div>
</body>
</html>
