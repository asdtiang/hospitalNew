<!doctype html>
<html>
<head>
  <title><g:layoutTitle default="石家庄社区检验网"/></title>
  
  <meta name="Author" content="asdtiang-QQ:250753635">
  <link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}"/>
  <link rel="shortcut icon"
          href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon"/>
  <g:layoutHead/>
  <r:layoutResources/>
  <g:javascript library="application"/>
  <script  type="text/javascript">
    function addCookie() { // 加入收藏
      if (document.all) {
        window.external.addFavorite('http://www.sjzsqjy.com', '石家庄社区检验网！');
      }
      else if (window.sidebar) {
        window.sidebar.addPanel('石家庄社区检验网！', 'http://www.sjzsqjy.com', "");
      }
    }

    function setHomepage() { // 设为首页
      if (document.all) {
        document.body.style.behavior = 'url(#default#homepage)';
        document.body.setHomePage('http://www.sjzsqjy.com');
      }
      else if (window.sidebar) {
        if (window.netscape) {
          try {
            netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");
          }
          catch (e) {
            alert("该操作被浏览器拒绝，假如想启用该功能，请在地址栏内输入 about:config,然后将项 signed.applets.codebase_principal_support 值该为true");
          }
        }
        var prefs = Components.classes['@mozilla.org/preferences-service;1'].getService(Components.interfaces.nsIPrefBranch);
        prefs.setCharPref('browser.startup.homepage', 'http://www.sjzsqjy.com');
      }
    }
  </script>
  

</head>
<body >
<div id="box">
<div id="top">
  <div id="top_left">欢迎光临！<script type="text/javascript" src="${resource(dir: 'js', file: 'date.js')}"></script> </div>
  <div id="top_right">
  <a href="javascript:void(0)" onclick="setHomepage()"><span
          class="i2">设为首页</span></a> | <a href="javascript:void(0)"
        onclick="addCookie()"><span class="i2">加入收藏</span></a>|<a
        href="http://www.sjzsqjy.com"><span class="i2">www.sjzsqjy.com</span></a>
    </div>
</div>
<div id="logo_top">
<div id="logo">
  <div style="float:left;" >
   <img    height="90" src="${resource(dir: 'images', file: 'ten.jpg')}"/>
     </div>


  <div style="float:left;" >
     <a href="${createLink(uri: '/')}">
  <span
        class="text1">石家庄社区检验网</span></a><br/>
  <span class="text3"><a href="${createLink(uri: '/')}">石家庄社区医学检验专业服务商</a></span>
  </div>
  </div>


<!-- 开始 Comm100在线客服系统按钮代码 -->
<div id="kefu"><!-- 开始 Comm100在线客服系统按钮代码 -->
  <div>
  <div id="comm100_LiveChatDiv"></div><a href="http://www.comm100.cn/livechat/" onclick="comm100_Chat();return false;" target="_blank" title="在线客服">
    <img width="200" height="90" id="comm100_ButtonImage" src="http://chatserver.comm100.cn/BBS.aspx?siteId=80010974&planId=647" border="0px" alt="在线客服" /></a>
  <script src="http://chatserver.comm100.cn/js/LiveChat.js?siteId=80010974&planId=647" type="text/javascript">

  </script>
  <div id="comm100_track" style="z-index:99;  margin-top:2px;">

  </div>
  <script type="text/javascript">document.getElementById("comm100_track").style.visibility = "hidden";</script>
</div>
  <!-- 结束 Comm100在线客服系统按钮代码--></div>

  <div style="width:160px;float:left;height:90px;">
  </div>
  <g:include controller="login" action="indexAuth1"></g:include> 
  </div>
&nbsp;<g:include controller="index" action="menu"/>
<div id="scroll0">
<g:include controller="index" action="scrollNotice"></g:include>
</div>
<g:layoutBody/>

<div id="end">
<g:include controller="link" action="menu"/>
</div>

</div>
</body>
</html>