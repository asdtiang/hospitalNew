<%@ page import="com.sjzsqjy.www.site.FeedBack" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'feedBack.label', default: 'FeedBack')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>

	</head>
	<body>
		<div id="create-feedBack" class="loginBox feedback-box" style="width: 525px;">
			<div class="feedback-head" >欢迎留言</div>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${feedBackInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${feedBackInstance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>

			<g:form action="save" >
				<fieldset class="feedback-form">
					<g:render template="form"/>
				</fieldset>

					<g:submitButton name="create" class="btn1" style="margin: 5px 0 5px 0" value="提交留言" />

			</g:form>
		</div>

	</body>
</html>
