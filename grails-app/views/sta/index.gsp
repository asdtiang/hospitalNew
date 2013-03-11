<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="sta" />
        <title>按诊所统计</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><g:link class="home" controller="index" action="staIndex">数据统计程序入口</g:link>
</span> 
        </div>
        <div class="body">           
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <g:hasErrors bean="${dataInstance}">
            <div class="errors">
                <g:renderErrors bean="${dataInstance}" as="list" />
            </div>
            </g:hasErrors>
            <g:form action="staByClinic" target="_blank" method="post" >
                <div class="dialog">
                    <table>
                        <tbody>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="clinic"><g:message code="data.clinic.label" default="Clinic" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: dataInstance, field: 'clinic', 'errors')}">
                                    <g:select name="clinicId" from="${com.sjzsqjy.www.statistics.Clinic.list()}" optionKey="id" optionValue="name" value="${dataInstance?.clinic?.id}"  />
                                </td>
                            </tr>
                        
                            
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="date"><g:message code="data.date.label" default="Date" /></label>
                                </td>
                                <td valign="top" class="value ${hasErrors(bean: dataInstance, field: 'date', 'errors')}">
                                    <g:datePicker name="date" precision="month" value="${dataInstance?.date}"  />
                                </td>
                            </tr>
                        
                        </tbody>
                    </table>
                </div>
                <div class="buttons">
                    <span class="button"><input class="save" type="submit" value="统计"></span>
                </div>
            </g:form>
        </div>
    </body>
</html>
