<!doctype html>
<html>
<head>
    <title><g:message code="site.name" args="['首页']"/></title>
    <meta name="layout" content="sta"/>
</head>

<body>
<sec:ifAllGranted roles="ROLE_ADMIN">
    <div class="clear"></div>
    <br/>
    <ul>
        <li class="controller"><g:link controller="shop" class="myLink">分店管理</g:link>

        </li>
        <li class="controller"><g:link controller="clinic" class="myLink">诊所管理</g:link>
        </li>

        <li class="controller"><g:link controller="item" class="myLink">项目管理</g:link>

        </li>

        <li class="controller"><g:link controller="data" action="create"
                                       class="myLink">录入数据</g:link> <br/>
        </li>

        <li class="controller"><g:link controller="sta" class="myLink">按诊所导出数据</g:link>

        </li>

        <li class="controller">

            <g:form controller="sta" action="sta"
                    target="_blank">
                <g:datePicker name="date" precision="month"
                              value="${new Date()}"/>
                <input type="submit" value="统计本月"/></g:form>
        </li>


        <li class="controller">
       <g:form controller="sta" action="sumMonth" target="_blank">
        <g:datePicker name="date" precision="month"  value="${new Date()}"/>
        <input type="submit" value="统计诊所收入"/>
        </g:form>
        </li>
        <li class="controller"><g:link controller="sta" action="sumAll"
                                       target="_blank" class="myLink">统计诊所收入</g:link>
        </li>
        <li class="controller"><g:link controller="data" action="deleteByDate" target="_blank"
                                       class="myLink">数据删除</g:link>
        </li>
        <li class="controller"><g:link target="_blank" class="myLink" controller="shiQiaoUser">临床检验数据管理</g:link></li>
        <li class="controller"><g:link target="_blank" class="myLink" controller="sampleUser">临床生化检验数据管理</g:link>
        </li>
        <li class="controller"><g:link target="_blank" class="myLink" controller="traceUser">微量元素检测数据管理</g:link>
        </li>
        <li class="controller"><g:link target="_blank" class="myLink" controller="bloodUser">普利生仪器中心血流变仪数据管理</g:link>
        </li>
        <li class="controller"><g:link target="_blank" controller="user">管理诊所绑定</g:link>
        </li>
        <li class="controller"><g:link target="_blank" controller="requestmap">访问管理</g:link>
        </li>
        <li class="controller"><g:link target="_blank" controller="link">友情链接管理</g:link>
        </li>
    </ul>

    <div class="clear"></div>
</sec:ifAllGranted>
</body>
</html>