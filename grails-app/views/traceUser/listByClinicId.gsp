<%--
  Created by IntelliJ IDEA.
  User: asdtiang
  Date: 12-8-17
  Time: 下午10:52
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<div id="traceList" class="inside">
    <!--                               微量元素检测检验报告单          -->
    <h1 class="bdTitle">微量元素检测检验报告单</h1>
    <table cellspacing="0" cellpadding="1" class="biaodan">
        <tbody><tr>
            <td><g:message code="traceUser.name.label" default="Name" /></td>
            <td><g:message code="traceUser.sex.label" default="sex" /></td>
            <td><g:message code="traceUser.ageInfo.label" default="ageInfo" /></td>
            <td><g:message code="traceUser.date.label" default="date" /></td>
        </tr>
        <g:each in="${dataList}" status="i" var="traceUser">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                <td><g:link controller="traceSearch" action="resultById" id="${traceUser[0]}">${traceUser[1]}</g:link></td>
                <td>${traceUser[2]}</td>
                <td>${traceUser[3]}</td>
                <td>${traceUser[4]}</td>
            </tr>
        </g:each>
        </tbody></table>
    <div class="paginateButtons">
        <paginate:jquery  update="traceList" total="${dataTotal}" selectMax="15" />
    </div>
</div>