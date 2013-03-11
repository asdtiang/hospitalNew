<!doctype html>
<html>
<head>
<title><g:message code="site.name" args="['首页']" /></title>
<meta name="layout" content="main" />
<style type="text/css" media="screen">
#nav {
	margin-top: 20px;
	margin-left: 30px;
	width: 228px;
	float: left;
}

.homePagePanel * {
	margin: 0px;
}

.homePagePanel .panelBody ul {
	list-style-type: none;
	margin-bottom: 10px;
}

.homePagePanel .panelBody h1 {
	text-transform: uppercase;
	font-size: 1.1em;
	margin-bottom: 10px;
}

.homePagePanel .panelBody {
	background: url(../images/leftnav_midstretch.png) repeat-y top;
	margin: 0px;
	padding: 15px;
}

.homePagePanel .panelBtm {
	background: url(../images/leftnav_btm.png) no-repeat top;
	height: 20px;
	margin: 0px;
}

.homePagePanel .panelTop {
	background: url(../images/leftnav_top.png) no-repeat top;
	height: 11px;
	margin: 0px;
}

h2 {
	margin-top: 15px;
	margin-bottom: 15px;
	font-size: 1.2em;
}

#pageBody {
	text-align:center;
}
</style>
</head>
<body>
<div id="pageBody">
<h1 align="center"><g:message code="site.name" args="['首页']" /></h1>
<br>
<div id="controllerList" class="dialog">
<g:link controller="login"><p id="indexP" aling="left">登录</p></g:link>
    <br>
	<g:link controller="logout"><p id="indexP" aling="left">退出</p></g:link>
<br>
	<sec:ifAllGranted roles="ROLE_ADMIN">
	<br>
		<g:link controller="hosUser"><p id="indexP" aling="left">管理诊所</p>
			</g:link>
   <br>
		<g:link controller="hosRequestMap"><p id="indexP" aling="left" >访问管理</p></g:link>
	</sec:ifAllGranted>

</div>
</div>
<h1 align="center">冀ICP备10011024号</h1>
</body>
</html>