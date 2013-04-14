<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13-3-14
  Time: 下午10:02
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<meta name='layout' content='register'/>
<div class="login">
    <form action='${postUrl}' method='POST' id="loginForm" name="loginForm" autocomplete='off'>
        用户名：<input name="j_username" id="username"  type="text" class="inputLogin" autofocus placeholder="请输入用户名"/><br/>
        密　码：<input name="j_password" id="password"  type="password" class="inputLogin"/><br/>

        <div class="btnLogin">
            <input id="btnLogin" class="btn1" type="submit" value="登陆 ">
            <g:link controller='register' action='forgotPassword'><g:message code='spring.security.ui.login.forgotPassword'/></g:link>
        </div>
    </form>
</div>