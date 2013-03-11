<%--
  Created by IntelliJ IDEA.
  User: asdtiang
  Date: 12-6-26
  Time: 下午9:26
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<g:form controller="clinic" action="updateClinic">
    <input type="hidden" name="updateId" value="${id}">
    <input type="hidden" name="type" value="${type}">
<richui:autoComplete maxResultsDisplayed="500" name="clinicName" action="${createLinkTo('dir': 'data/listClinicByName')}" />
<g:submitToRemote update="${type}${id}" url="[controller:'clinic',action:'updateClinic']"  value="更新" />
</g:form>