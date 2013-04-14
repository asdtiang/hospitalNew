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
    <script type="text/javascript" src="${resource(dir: 'js', file: 'tb.js')}"></script>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'css.css')}"/>
    <link rel="shortcut icon"
          href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon"/>
    <g:layoutHead/>
    <jq:resources />
        <paginate:resources/>
</head>
<body>
<div class="box">
    <!--                        头部   设为首页 加入收藏  登录 注册         -->
    <div class="top">
        <div class="wenzi">欢迎来到石家庄社区检验网！</div>
        <div class="wenzi2">

    <div class="wenzi2"><a href="javascript:void(0)" onclick="setHomepage()">设为首页</a> &nbsp;|&nbsp;<a href="javascript:void(0)" onclick="AddFavorite('http://sjz.asdtiang.org/', '${application.configMap?.siteName}')">加入收藏</a></div>
           </div>
    </div>
    <div class="topM">
        <div class="logo"><span class="mc">${application.configMap?.siteName}</span><br><span class="zs">&mdash;&mdash;&mdash;&nbsp;石家庄社区医学检验专业服务商&nbsp;&mdash;&mdash;&mdash;</span></div>
        <div class="tel"> &nbsp;&nbsp;&nbsp;${application.configMap?.contactTel} </div>
<sec:ifLoggedIn>
    <div class="indexLoginAfter" >
    <g:link controller="login" action="loginAfter"><div class="btnDiv">个人中心</div></g:link>
      <g:link controller="logout"><div class="btnDiv">安全退出</div></g:link>
    </div>
</sec:ifLoggedIn>
<sec:ifNotLoggedIn>
    <g:include controller="login" action="authIndex"/>
</sec:ifNotLoggedIn>
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