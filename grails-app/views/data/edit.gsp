
<%@ page import="com.sjzsqjy.www.statistics.Data" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="sta" />
        <g:set var="entityName" value="${message(code: 'data.label', default: 'Data')}" />
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
            <g:hasErrors bean="${dataInstance}">
            <div class="errors">
                <g:renderErrors bean="${dataInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form method="post" >
                <g:hiddenField name="id" value="${dataInstance?.id}" />
                <g:hiddenField name="version" value="${dataInstance?.version}" />
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="clinic"><g:message code="data.clinic.label" default="Clinic" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: dataInstance, field: 'clinic', 'errors')}">
                                    <g:select name="clinic.id" from="${com.sjzsqjy.www.statistics.Clinic.list()}" optionKey="id" optionValue="name" value="${dataInstance?.clinic?.id}"  />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="name"><g:message code="data.name.label" default="Name" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: dataInstance, field: 'name', 'errors')}">
                                    <g:textField name="name" value="${dataInstance?.name}" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="item"><g:message code="data.item.label" default="Item" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: dataInstance, field: 'item', 'errors')}">
                                    <g:textField name="item" value="${dataInstance?.item}" />
                                </td>
                            </tr>
                        
                          
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="money"><g:message code="data.money.label" default="Money" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: dataInstance, field: 'money', 'errors')}">
                                    <g:textField name="money" value="${fieldValue(bean: dataInstance, field: 'money')}" />
                                </td>
                            </tr>
                        
                           
                        
                            
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="date"><g:message code="data.date.label" default="Date" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: dataInstance, field: 'date', 'errors')}">
                                    <g:datePicker name="date" precision="day" value="${dataInstance?.date}"  />
                                </td>
                            </tr>
                             <tr class="prop">
                                <td valign="top" class="name">
                                  <label for="date">录入日期</label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: dataInstance, field: 'date', 'errors')}">
                                    <g:datePicker name="dateCreated"  value="${dataInstance?.dateCreated}"  />
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
