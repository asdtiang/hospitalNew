
<%@ page import="com.sjzsqjy.www.statistics.Data"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="layout" content="sta" />
<g:set var="entityName"
	value="${message(code: 'data.label', default: 'Data')}" />
<title>数据删除</title>
<style type="text/css">
#myButton{
    font-size:20px;
}
</style>	
</head>
<body>
<div class="nav"><span class="menuButton"><g:link class="home" controller="index" action="staIndex">数据统计程序入口</g:link></span> <span class="menuButton"><g:link
	class="list" action="list">
	<g:message code="default.list.label" args="[entityName]" />
</g:link></span></div>
<br>
<br>
<br>
<br>
<br>
<center><h1>请选择日期--该日期之前的数据会被删</h1><br>
<g:form  controller="data" action="deleteData">
<g:datePicker name="date" precision="day" value="${new Date()-60}"/><br><br>
 <g:submitToRemote id="myButton" url="[controller:'data',action:'deleteData']"  update="updateResult" value="提交"/>
</g:form>
<div id="updateResult"></div>
</center>			
</body>
</html>
