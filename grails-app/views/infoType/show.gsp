
<%@ page import="com.sjzsqjy.www.site.InfoType"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="layout" content="main" />
<g:set var="entityName"
	value="${infoTypeInstance?.name}" />
<title>${entityName}</title>
</head>
<body>
<div class="flash"><img style=" border:1px solid #999;" src="${resource(dir: 'images', file: 'flash2.jpg')}"></div>
<sec:ifAllGranted roles="ROLE_ADMIN">
	<div class="nav"><span class="menuButton"><g:link
		class="list" action="list">
		<g:message code="default.list.label" args="[entityName]" />
	</g:link></span> <span class="menuButton"><g:link class="create" action="create">
		<g:message code="default.new.label" args="[entityName]" />
	</g:link></span></div>
    <div class="buttons"><g:form>
        <g:hiddenField name="id" value="${infoTypeInstance?.id}" />
        <span class="button"><g:actionSubmit class="edit" action="edit"
                                             value="${message(code: 'default.button.edit.label', default: 'Edit')}" /></span>
        <span class="button"><g:actionSubmit class="delete"
                                             action="delete"
                                             value="${message(code: 'default.button.delete.label', default: 'Delete')}"
                                             onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" /></span>
    </g:form></div>
</sec:ifAllGranted>
<g:if test="${flash.message}">
	<div class="message">
	${flash.message}
	</div>
</g:if>

<div class="banner">
    <!--              banner 的左边板块         -->
    <div class="left">
        <!--  网站公告-->
        <g:include controller="index" action="siteNotice"></g:include>
        <g:include controller="index" action="feedBack"></g:include>
        <div class="r_pic" ><img src="${resource(dir: 'images', file: 'web_31.jpg')}" /></div>
    </div>
    <div class="right">
        <div class="guide"><span class="dq">当前位置：</span><a href="${createLink(uri: '/')}"> 首页</a> &gt; ${infoTypeInstance?.name}</div>
        <div class="inside">
                <!--                  新闻列表               -->
                <div class="newsList">
                    <ul>
                        <g:each in="${infoTypeInstance.info}" var="i">
                            <li>
                            <g:link controller="info" action="show" id="${i.id}">
                            <g:if test="${infoTypeInstance.image}">
                                <img width="80" height="80"
                                     src="${createLinkTo(dir: 'images/info', file: i.id+'.jpg')}"
                                     onerror="javascript:this.src='${createLinkTo(dir: 'images/info', file: 'default.jpg')}';" />
                            </g:if>
                                <span class="date"><g:formatDate format="yyyy-MM-dd" date="${i.lastUpdated}" /></span>
                                ${i?.title?.encodeAsHTML()}
                                </g:link>
                                 </li>
                        </g:each>

                    </ul>
                </div>


            </div>

        </div>
</div>
</body>
</html>
