<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13-4-10
  Time: 下午9:47
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>


<div id="customDataDiv" class="inside">
    <!--                               临床检验报告单          -->

    <h1 class="bdTitle">检验人信息</h1>
    <table cellspacing="0" cellpadding="1" class="biaodan">
        <tbody><tr>
            <td> 姓名</td>
            <td> 检验日期 </td>

        </tr>
        <g:each in="${dataList}" status="i" var="customData">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                <td><g:link  action="show" id="${customData[0]}">${customData[1]}</g:link></td>
                <td>${customData[2]}</td>
                </tr>
        </g:each>
        </tbody></table>
    <div class="paginateButtons">
        <paginate:jquery  update="customDataDiv" total="${dataTotal}" selectMax="15" />
    </div>
</div>
