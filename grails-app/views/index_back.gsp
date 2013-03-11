<!doctype html>
<html>
<head>
<title><g:message code="site.name" args="['首页']" /></title>
<meta name="layout" content="main" />
</head>
<body>

<div id="left">

<!--医院简介-->
<g:include controller="index" action="hospitalDesc"></g:include>

<!--index1 end-->
<div id="scroll">
<!--仪器滚动-->
<g:include controller="index" action="scroll"></g:include>
</div>
<!--index2 end-->
<div id="index2">
<!---->
<g:include controller="index" action="indexNews"></g:include>
</div>
<!--index2 end-->
</div>
<!--index end-->
<div id="right">
<div id="right1">
<g:include controller="index" action="checkService"></g:include>
</div>

<div id="right2">
<g:include controller="index" action="feedBack"></g:include>
</div>
</div>

<div style="clear:both;">
</div>

</body>
</html>