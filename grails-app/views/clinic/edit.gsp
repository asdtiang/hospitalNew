
<%@ page import="com.sjzsqjy.www.statistics.Clinic" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="sta" />
        <g:set var="entityName" value="${message(code: 'clinic.label', default: 'Clinic')}" />
        <title><g:message code="default.edit.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><g:link class="home" controller="index" action="staIndex">数据统计程序入口</g:link></span>
            <span class="menuButton"><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></span>
            <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.edit.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${clinicInstance}">
            <div class="errors">
                <g:renderErrors bean="${clinicInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <g:hiddenField name="id" value="${clinicInstance?.id}" />
                <g:hiddenField name="version" value="${clinicInstance?.version}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="name"><g:message code="clinic.name.label" default="Name" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: clinicInstance, field: 'name', 'errors')}">
                                    <g:textField name="name" value="${clinicInstance?.name}" />
                                </td>
                            </tr>
                        
                           
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="shop">店名</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: clinicInstance, field: 'shop', 'errors')}">
                                      <g:select name="shop.id" from="${com.sjzsqjy.www.statistics.Shop.list()}" optionValue="name" value="${clinicInstance?.shop?.id}" optionKey="id" />    
                                </td>
                            </tr>
                              <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="checkOutWay"> <g:message code="clinic.checkOutWay.label" default="checkOutWay" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: clinicInstance, field: 'checkOutWay', 'errors')}">
                                      <g:select name="checkOutWay" from="${[[id:1,name:'月结'],[id:2,name:'次结']]}" optionValue="name" value="${clinicInstance?.checkOutWay}" optionKey="id" />    
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="info"><g:message code="clinic.info.label" default="Info" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: clinicInstance, field: 'info', 'errors')}">
                                    <g:textField name="info" value="${clinicInstance?.info}" />
                                </td>
                            </tr>
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><g:actionSubmit class="save" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" /></span>
                    <span class="button"><g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" /></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
