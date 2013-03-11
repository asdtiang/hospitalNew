<%--
  Created by IntelliJ IDEA.
  User: asdtiang
  Date: 12-7-9
  Time: 下午10:27
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<div id="shiQiaolist" class="inside">
    <!--                               临床检验报告单          -->

    <h1 class="bdTitle">临床检验报告单</h1>
    <table cellspacing="0" cellpadding="1" class="biaodan">
        <tbody><tr>
            <td> <g:message code="shiQiaoUser.name.label" default="Name" /> </td>
            <td><g:message code="shiQiaoUser.sex.label" default="sex" /></td>
            <td><g:message code="shiQiaoUser.birth.label" default="birth" /></td>
            <td><g:message code="shiQiaoUser.date.label" default="Date" /></td>
        </tr>
        <g:each in="${dataList}" status="i" var="shiQiaoUser">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                <td><g:link controller="shiQiaoSearch" action="resultById" id="${shiQiaoUser[0]}">${shiQiaoUser[1]}</g:link></td>
                <td>${shiQiaoUser[2]}</td>
                <td>${shiQiaoUser[3]}</td>
                <td>${shiQiaoUser[4]}</td>
            </tr>
        </g:each>
        </tbody></table>
    <div class="paginateButtons">
        <paginate:jquery  update="shiQiaolist" total="${dataTotal}" selectMax="15" />
    </div>
</div>
