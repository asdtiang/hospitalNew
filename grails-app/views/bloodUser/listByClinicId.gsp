<%--
  Created by IntelliJ IDEA.
  User: asdtiang
  Date: 12-8-17
  Time: 下午11:07
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<div id="bloodList" class="inside">
    <!--                               普利生仪器中心血流变仪报告单          -->
    <h1 class="bdTitle">普利生仪器中心血流变仪报告单</h1>
    <table cellspacing="0" cellpadding="1" class="biaodan">
        <tbody><tr>
            <td><g:message code="bloodUser.name.label" default="Name" /></td>
            <td><g:message code="bloodUser.sex.label" default="sex" /></td>
            <td><g:message code="bloodUser.age.label" default="Brith" /></td>
            <td><g:message code="bloodUser.testDate.label" default="sampleId" /></td>
        </tr>
        <g:each in="${dataList}" status="i" var="bloodUser">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                <td><g:link controller="bloodUser" action="resultById" id="${bloodUser[0]}">${bloodUser[1].substring(bloodUser[1].indexOf("：")+1,bloodUser[1].length())}</g:link></td>
                <td>${bloodUser[2].substring(bloodUser[2].indexOf("：")+1,bloodUser[2].length())}</td>
                <td>${bloodUser[3].substring(bloodUser[3].indexOf("：")+1,bloodUser[3].length())}</td>
                <td>${bloodUser[4].substring(bloodUser[4].indexOf("：")+1,bloodUser[4].length())}</td>
            </tr>
        </g:each>
        </tbody></table>
<div class="paginateButtons">
    <paginate:jquery  update="bloodList" total="${dataTotal}" selectMax="15" />
</div>
</div>