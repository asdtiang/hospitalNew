
<%@ page import="com.sjzsqjy.www.site.Info"%>

<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="layout" content="main" />
<g:set var="entityName"
	value="${message(code: 'info.label', default: 'Info')}" />
<title><g:message code="default.edit.label" args="[entityName]" /></title>
  <ckeditor:resources />
</head>
<body>
<sec:ifAllGranted roles="ROLE_ADMIN">
<div class="nav"><span class="menuButton"><a class="home"
	href="${createLink(uri: '/')}">Home</a></span> <span class="menuButton"><g:link
	class="list" action="list">
	<g:message code="default.list.label" args="[entityName]" />
</g:link></span> <span class="menuButton"><g:link class="create" action="create">
	<g:message code="default.new.label" args="[entityName]" />
</g:link></span></div>
<div class="body1">
<h1><g:message code="default.edit.label" args="[entityName]" /></h1>
<g:if test="${flash.message}">
	<div class="message">
	${flash.message}
	</div>
</g:if> <g:hasErrors bean="${infoInstance}">
	<div class="errors"><g:renderErrors bean="${infoInstance}"
		as="list" /></div>
</g:hasErrors> <g:form method="post">
	<g:hiddenField name="id" value="${infoInstance?.id}" />
	<g:hiddenField name="version" value="${infoInstance?.version}" />
	<div class="dialog">
	<table>
		<tbody>
			<tr class="prop">
				<td valign="top" class="name"><label for="infoType"><g:message
					code="info.infoType.label" default="Info Type" /></label></td>
				<td valign="top"
					class="value ${hasErrors(bean: infoInstance, field: 'infoType', 'errors')}">
				<g:select name="infoType.id"
					from="${com.sjzsqjy.www.site.InfoType.list()}" optionKey="id"
					optionValue="name" value="${infoInstance?.infoType?.id}" /></td>
			</tr>
			<tr class="prop">
				<td valign="top" class="name"><label for="title"><g:message
					code="info.title.label" default="Title" /></label></td>
				<td valign="top"
					class="value ${hasErrors(bean: infoInstance, field: 'title', 'errors')}">
				<g:textField name="title" value="${infoInstance?.title}" /></td>
			</tr>
			<tr class="prop">
				<td valign="top" class="name">上传标志图</td>

				<td valign="top" class="value"><img width="80" height="80"
					src="${createLinkTo(dir: 'images/info', file: infoInstance.id+'.jpg')}"
					onerror="javascript:this.src='${createLinkTo(dir: 'images/info', file: 'default.jpg')}';" />
				<sec:ifAllGranted roles="ROLE_ADMIN">
					<g:link target="_blank" controller="info" action="alterLogo"
						params="[id:infoInstance?.id]">
                                               更改</g:link>
				</sec:ifAllGranted></td>

			</tr>
			<tr class="prop">
				<td valign="top" class="name"><label for="content"><g:message
					code="info.content.label" default="Content" /></label></td>
				<td valign="top"
					class="value ${hasErrors(bean: infoInstance, field: 'content', 'errors')}">
 <ckeditor:config height="600px" width="800px" />
     <ckeditor:editor name="content">${infoInstance?.content}</ckeditor:editor>
			</td>
			</tr>			
		</tbody>
	</table>
	</div>
	
	<div class="buttons"><span class="button"><g:actionSubmit
		class="save" action="update"
		value="${message(code: 'default.button.update.label', default: 'Update')}" /></span>
	<span class="button"><g:actionSubmit class="delete"
		action="delete"
		value="${message(code: 'default.button.delete.label', default: 'Delete')}"
		onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" /></span>
	</div>
</g:form></div>
</sec:ifAllGranted>
</body>
</html>
