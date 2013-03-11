<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="layout" content="sta" />
<g:set var="entityName"
	value="${message(code: 'data.label', default: 'Data')}" />
<title>请选择分店</title>	
</head>
<body>
<div class="nav"><span class="menuButton"><g:link class="home" controller="index" action="staIndex">数据统计程序入口</g:link></span> 
</div>
<br/>
<g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            
<g:form action="shopInit" controller="shop" method="post">
<g:select name="shopId"
          from="${com.sjzsqjy.www.statistics.Shop.list()}"
          value="${session.shopId}"
          optionKey="id"
          optionValue="name"
           />	
  <g:submitButton name="submit" value="确定" />         
</g:form>		
</body>
</html>
