<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'search.title', default: 'ItemType')}" />
        <title><g:message code="site.name" args="[entityName]" /></title>
    </head>
    <body>
       <g:if test="${flash.message}">
	<div class="message" style="clear:left;">
	${flash.message}
	</div>
</g:if>
        <div id="searchBody">
            <g:form name="myForm" target="_blank" controller="search" action="search" >
             
             <table>
                        <tbody >                       
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="symbol"><g:message code="name.label" default="Symbol" /></label>
                                </td>
                                <td valign="top" class="value">
                                    <g:textField name="name" value="" />
                                </td>
                            </tr>
                        
                            <tr class="prop">
                                <td valign="top" class="name">
                                    <label for="name"><g:message code="date.label" default="Name" /></label>
                                </td>
                                <td valign="top" class="value">
                                    <g:datePicker name="myDate" precision="day" value="${new Date()}" 
                                                     />
                                </td>
                            </tr>
                             <tr class="prop">
                                <td valign="top" class="name">
                                    <input type="submit" value="${message(code:'search.button.label')}">
                                </td>                               
                            </tr>
                           
                        </tbody>
                    </table>
                   
            </g:form>
            
        </div>
    </body>
</html>
