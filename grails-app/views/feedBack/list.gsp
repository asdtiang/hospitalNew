
<%@ page import="com.sjzsqjy.www.site.FeedBack" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'feedBack.label', default: 'FeedBack')}" />
		<title>信息反馈</title>
	</head>
	<body>
    <div class="flash"><img style=" border:1px solid #999;" src="${resource(dir: 'images', file: 'flash2.jpg')}"></div>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
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
            <div class="guide"><span class="dq">当前位置：</span><a href="${createLink(uri: '/')}"> 首页</a> &gt; 信息反馈
            &nbsp;&nbsp;<g:link controller="feedBack" action="create">我要反馈</g:link>
            </div>
            <div class="inside">


                <!--                  新闻列表               -->
                <div class="newsList">
                    <ul>
                        <g:each in="${feedBackInstanceList}"  status="i" var="feedBackInstance">
                            <li>


                                    <span class="date"><g:formatDate format="yyyy-MM-dd" date="${feedBackInstance.dateCreated}" /></span>
                               <samp title="${feedBackInstance?.unitName}"> ${feedBackInstance?.unitName.length()>10?feedBackInstance?.unitName.substring(0,10)+'..':feedBackInstance?.unitName}</samp>&nbsp;写到:
                                <samp title="${feedBackInstance?.comment}"> ${feedBackInstance?.comment.length()>30?feedBackInstance?.comment.substring(0,30)+'..':feedBackInstance?.comment}</samp>


                            </li>
                        </g:each>

                    </ul>
                </div>


            </div>

        </div>
    </div>
	</body>
</html>
