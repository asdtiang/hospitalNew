
<%@ page import="com.sjzsqjy.www.statistics.Clinic" %>
<!doctype html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="sta" />
        <g:set var="entityName" value="${message(code: 'clinic.label', default: 'Clinic')}" />
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
                            <td valign="top" class="name"><g:message code="clinic.name.label" default="Name" /></td>
                            
                            <td valign="top" class="value">${fieldValue(bean: clinicInstance, field: "name")}</td>
                            
                        </tr>
                        
                          <tr class="prop">
                            <td valign="top" class="name">店名</td>
                            
                           <td valign="top" class="value">${fieldValue(bean: clinicInstance?.shop, field: "name")}</td>
                            
                        </tr>
                        
                         <tr class="prop">
                            <td valign="top" class="name"><g:message code="clinic.checkOutWay.label" default="checkOutWay" /></td>
                            
                           <td valign="top" class="value">
                           ${clinicInstance?.checkOutWay==1?'月结':'次结'}
                           </td>
                            
                        </tr>
                    
                        <tr class="prop">
                            <td valign="top" class="name"><g:message code="clinic.info.label" default="Info" /></td>
                            <td valign="top" class="value">${fieldValue(bean: clinicInstance, field: "info")}</td>
                        </tr>
                    
                    </tbody>
                </table>
            </div>
            <div class="buttons">
                <g:form>
                    <g:hiddenField name="id" value="${clinicInstance?.id}" />
                    <span class="button"><g:actionSubmit class="edit" action="edit" value="${message(code: 'default.button.edit.label', default: 'Edit')}" /></span>
                    <span class="button"><g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" /></span>
                </g:form>
            </div>
        </div>
    </body>
</html>
