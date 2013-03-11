<div class="link">友情链接：
<g:each in="${linkInstanceList}" status="i"
        var="linkInstance">
    <a target="_blank" href="${linkInstance.address}"> ${fieldValue(bean: linkInstance, field: "showTitle")}
    </a> |
    </g:each>
    <g:link controller="login">
    数据查询
</g:link>
    <sec:ifAllGranted
            roles="ROLE_ADMIN">
        <g:link controller="index" action="admin">
            <span>|</span>进入管理
        </g:link>
    </sec:ifAllGranted>

</div>
<div class="banquan">
    <a target="_blank" href="http://wpa.qq.com/msgrd?v=3&uin=384962609&site=qq&menu=yes"><img border="0" src="http://wpa.qq.com/pa?p=2:384962609:41" alt="点击这里给我发消息" title="点击这里给我发消息"></a></li>

    <g:link controller="info" action="show"
                             id="12">
    联系我们
</g:link>${application.configMap?.ICP} Copyright 2010, 版权所有 www.sjzsqjy.com.</div>
    <script src="http://s16.cnzz.com/stat.php?id=2349267&web_id=2349267&show=pic" language="JavaScript"></script>
