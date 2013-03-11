<%--
  Created by IntelliJ IDEA.
  User: asdtiang
  Date: 12-7-10
  Time: 下午10:51
  To change this template use File | Settings | File Templates.
--%>

<%--
  Created by IntelliJ IDEA.
  User: asdtiang
  Date: 12-7-9
  Time: 下午10:27
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<div id="samplelist" class="inside">
    <!--                               临床检验报告单          -->

    <h1 class="bdTitle">临床生化检验报告单</h1>
    <table cellspacing="0" cellpadding="1" class="biaodan">
        <tbody><tr>
            <td>  <g:message code="sampleUser.name.label" default="Name" /> </td>
            <td> <g:message code="sampleUser.sex.label" default="sex" /> </td>
            <td>  <g:message code="sampleUser.age.label" default="Brith" /> </td>
            <td> <g:message code="sampleUser.sampleId.label" default="sampleId" /></td>
        </tr>
        <g:each in="${dataList}" status="i" var="sampleUser">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                <td><g:link controller="sampleSearch" action="resultById" id="${sampleUser[0]}">${sampleUser[1]}</g:link></td>
                <td>${sampleUser[2]}</td>
                <td>${sampleUser[3]}</td>
                <td>${sampleUser[4]}</td>
            </tr>
        </g:each>
        </tbody></table>
    <div class="paginateButtons">
        <paginate:jquery  update="samplelist" total="${dataTotal}" selectMax="15" />
    </div>
</div>
