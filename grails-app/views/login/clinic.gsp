<%--
  Created by IntelliJ IDEA.
  User: asdtiang
  Date: 12-7-9
  Time: 下午9:15
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html>
<head>
  <meta name="layout" content="main" />
  <title>诊所主页</title>
    <jq:resources />
    <paginate:resources/>
</head>
<body>
欢迎<sec:username/>：<g:if test="${session.clinicName!=null}">${session.clinicName}</g:if>
<g:if test="${session.clinicId!=null}">
<g:include controller="customData" action="showByClinic" params="[clinicId:session.clinicId]"/>

</g:if>
<g:else>欢迎联系我们，我们尽快回复您</g:else>
<br>
</body>
</html>