<!doctype html>
<html>

<head>
<title><g:message code='spring.security.ui.login.title'/></title>
<meta name='layout' content='main'/>
    <g:javascript library='jquery' plugin='jquery' />
    <jqui:resources />
</head>
<body>
<g:if test="${flash.message}">
    <script>
        alert('${flash.message}');
    </script>
</g:if>
<script>
$(document).ready(function() {
	$('#username').focus();
});
</script>

<div class="loginBox">
    <div class="loginHead"><span class="loginTitle">登录</span></div>
    <!--                          表单              -->
    <div class="form">
    <form action='${postUrl}' method='POST' id="loginForm" name="loginForm" autocomplete='off'>
            <div class="text"><span class="span1">用户名：</span><span>
                <input type="text" class="input1" name="j_username" id="username">
            </span></div>
            <div class="text"><span class="span1">密&#12288;码：</span><span>
                <input type="password" class="input1" name="j_password" id="password">
            </span></div>
            <div class="text2"><span>

                <input type="checkbox" class="checkbox" name="${rememberMeParameter}" id="remember_me" checked="checked" />
                <label for='remember_me'><g:message code='spring.security.ui.login.rememberme'/></label>
              ｜</span><span class="text3"><a href="/"><g:link controller='register' action='forgotPassword'><g:message code='spring.security.ui.login.forgotPassword'/></g:link></a></span></div>
            <div class="btn"><span>
                <input  type="submit" value="登&#12288;录" class="btn1" name="input3">
            </span><span class="re"><g:link controller="register"> 立即注册</g:link></span></div>
        </form>
    </div>

</div>
</body>
</html>
