<%--
  Created by IntelliJ IDEA.
  User: asdtiang
  Date: 12-10-30
  Time: 下午10:24
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title><g:layoutTitle></g:layoutTitle>-${application.configMap?.siteName}</title>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'css.css')}"/>
    <link rel="shortcut icon"
          href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon"/>
    <g:layoutHead/>
    <g:javascript library="application"/>
</head>
<body>
<div class="box">
    <!--                        头部   设为首页 加入收藏  登录 注册         -->
    <div class="top">
        <div class="wenzi">欢迎来到石家庄社区检验网！</div>
        <div class="wenzi2">
<sec:ifLoggedIn>
    <g:link controller="login" action="loginAfter">个人中心</g:link>  |
    <g:link controller="logout">安全退出</g:link>
    </sec:ifLoggedIn>
<sec:ifNotLoggedIn>
            <g:link controller="login"> 登　录</g:link> | <g:link controller="register" >注　册</g:link></div>
 </sec:ifNotLoggedIn>
    </div>
    <div class="topM">
        <div class="logo"><span class="mc">${application.configMap?.siteName}</span><br><span class="zs">&mdash;&mdash;&mdash;&nbsp;石家庄社区医学检验专业服务商&nbsp;&mdash;&mdash;&mdash;</span></div>
        <div class="tel">${application.configMap?.contactTel} </div>
    </div>
    <!--                        导航                                 -->
    <div class="menu">
    <g:include controller="index" action="menu"/>
    </div>
    <!--                        flash图片                                 -->

    <g:layoutBody/>

</div>
<!--                       底部友情链接版权信息                                -->
<div class="bottom">
    <g:include controller="link" action="menu"/>
</div>
</body>
</html>