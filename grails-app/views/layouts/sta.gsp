<!doctype html>
<html>
<head>
  <title><g:layoutTitle default="数据统计--石家庄社区检验网"/></title>
  <meta name="Author" content="asdtiang-QQ:250753635">
  <link rel="stylesheet" href="${resource(dir: 'css', file: 'sta.css')}"/>
  <link rel="shortcut icon"
          href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon"/>
            <r:layoutResources/>
  <jq:resources/>
  <g:layoutHead/>
</head>
<body>

<div class="box" id="update">
    <a href="${resource(dir: '/')}">网站首页</a>
<g:link style="text-align:center;margin-top:20px;" controller ="shop" action="shopInit">分店选择
<g:if test="${session.shopName==null}">
没有选择
</g:if>
<g:else>当前分店&nbsp;<span style="color:red">${session?.shopName}</span></g:else>
</g:link>
<g:layoutBody/>
</div>
</body>
</html>