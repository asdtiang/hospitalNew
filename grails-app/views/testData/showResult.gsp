<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13-4-7
  Time: 下午11:20
  To change this template use File | Settings | File Templates.
--%>
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
     ${result}
</body>
</html>