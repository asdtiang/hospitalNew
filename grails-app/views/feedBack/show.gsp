
<%@ page import="com.sjzsqjy.www.site.FeedBack" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'feedBack.label', default: 'FeedBack')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>

		<div id="show-feedBack" class="content scaffold-show" role="main" style="margin: 20px 0 20px 0;">
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            ${feedBackInstance.unitName}:${feedBackInstance.comment}



		</div>
	</body>
</html>
