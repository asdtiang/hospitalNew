<!doctype html>
<html>
	<head>
		<title>亲对不起－－系统出错</title>
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'errors.css')}" type="text/css">
	</head>
	<body>
   <g:if test="${grails.util.GrailsUtil.environment=='development'}">
       <g:renderException exception="${exception}" />
   </g:if>
    <g:else>
        <h1>对不起，系统出错 </h1>
    </g:else>

	</body>
</html>