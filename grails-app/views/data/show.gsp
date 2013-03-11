
<%@ page import="com.sjzsqjy.www.statistics.Data" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="sta" />
        <g:set var="entityName" value="${message(code: 'data.label', default: 'Data')}" />
        <title><g:message code="default.show.label" args="[entityName]" /></title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><g:link class="home" controller="index" action="staIndex">数据统计程序入口</g:link></span>
            <span class="menuButton"><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></span>
            <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.show.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="dialog">
                <table>
                    <tbody>
                    
                       
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="data.clinic.label" default="Clinic" /></td>
                            
                            <td valign="top" class="value"><g:link controller="clinic" action="show" id="${dataInstance?.clinic?.id}">${dataInstance?.clinic?.name?.encodeAsHTML()}</g:link></td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="data.name.label" default="Name" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: dataInstance, field: "name")}</td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="data.item.label" default="Item" /></td>
                            
                            <td valign="top" class="value">${dataInstance?.item?.encodeAsHTML()}</td>
                            
                        </tr>
                    
                        
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="data.money.label" default="Money" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: dataInstance, field: "money")}</td>
                            
                        </tr>
                    
                        
                    
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="data.date.label" default="Date" /></td>
                            
                            <td valign="top" class="value"><g:formatDate format="yyyy-MM-dd" date="${dataInstance?.date}" /></td>
                            
                        </tr>
                        
                        
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="data.dateCreated.label" default="Date" /></td>
                            
                            <td valign="top" class="value"><g:formatDate format="yyyy-MM-dd hh:mm:ss" date="${dataInstance?.dateCreated}" /></td>
                            
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <g:hiddenField name="id" value="${dataInstance?.id}" />
                    <span class="button"><g:actionSubmit class="edit" action="edit" value="${message(code: 'default.button.edit.label', default: 'Edit')}" /></span>
                    <span class="button"><g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
