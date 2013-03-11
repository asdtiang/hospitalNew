<%@ page import="com.sjzsqjy.www.statistics.Data"%>
<!doctype html>
<html>
<g:javascript library="prototype" />
<div class="list" id="listData">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="layout" content="sta" />
<g:set var="entityName"
	value="${message(code: 'data.label', default: 'Data')}" />
<title><g:message code="default.list.label" args="[entityName]" /></title>
</head>
<body>

<div class="nav"><span class="menuButton"><g:link class="home" controller="index" action="staIndex">数据统计程序入口</g:link></span> <span class="menuButton"><g:link
	class="create" action="create">
	<g:message code="default.new.label" args="[entityName]" />
</g:link></span></div>
<div class="body">
<h1><g:message code="default.list.label" args="[entityName]" /></h1>
<g:if test="${flash.message}">
	<div class="message">
	${flash.message}
	</div>
</g:if>
<g:javascript library="prototype" />

<br>
<table border="1">
	<thead>
		<tr>


			<th><g:message code="data.clinic.label" default="Clinic" /></th>

			<g:sortableColumn property="name"
				title="${message(code: 'data.name.label', default: 'Name')}" />

			<th><g:message code="data.item.label" default="Item" /></th>


			<g:sortableColumn property="money"
				title="${message(code: 'data.money.label', default: 'Money')}" />
			<g:sortableColumn property="date"
				title="${message(code: 'data.date.label', default: 'date')}" />
				<td>月</td>
			<td>年</td>
			<td>录入日期</td>
		</tr>
	</thead>
	<tbody>
		<g:each in="${sealInstanceList}" status="i" var="dataInstance">
			<tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
				<td><g:link action="show" id="${dataInstance.id}">
					${dataInstance?.clinic?.name}
				</g:link></td>

				<td>
				${fieldValue(bean: dataInstance, field: "name")}
				</td>

				<td>
				${dataInstance?.item}
				</td>
				<td>
				${fieldValue(bean: dataInstance, field: "money")}
				</td>
				<td><g:formatDate format="yyyy-MM-dd"
					date="${dataInstance.date}" /></td>
				<td>
				${fieldValue(bean: dataInstance, field: "month")}
				</td>
				<td>
				${fieldValue(bean: dataInstance, field: "year")}
				</td>
				<td><g:formatDate format="yyyy-MM-dd hh:mm:ss"
					date="${dataInstance.dateCreated}" /></td>
				<td>
			</tr>
		</g:each>
	</tbody>
</table>

   <br/>
<!-- 如果不是首页则提供首页的链接,如果是首页则不提供链接,以下类似 --> <g:if
	test="${params.pageNow!=1} "> 
            [<g:remoteLink controller="data" action="page"
		update="listData" params="[pageNow:1]">首页</g:remoteLink>]      
        </g:if> <g:else> 
            [首页] 
    </g:else> <g:if test="${myParams.pageNow>1}"> 
            [<g:remoteLink controller="data" action="page"
		update="listData" params="[pageNow:myParams.pageNow-1]">上一页</g:remoteLink>]  
        </g:if> <g:else> 
            [上一页]  
    </g:else> <%i=0%> <g:while test="${i < myParams.pageTotle&&i<20}">
	<%i++%>
	<g:remoteLink controller="data" action="page" update="listData"
		params="[pageNow:i]">
		${i}
	</g:remoteLink>
</g:while> <g:if test="${myParams.pageTotle >myParams.pageNow}"> 
            [<g:remoteLink controller="data" action="page"
		update="listData" params="[pageNow:myParams.pageNow+1]">下一页</g:remoteLink>] 
        </g:if> <g:else> 
            [下一页] 
        </g:else> <g:if test="${myParams.pageTotle != myParams.pageNow}"> 
            [<g:remoteLink controller="data" action="page"
		update="listData" params="[pageNow:myParams.pageTotle]">末页</g:remoteLink>] 
        </g:if> <g:else> 
            [末页] 
    </g:else> 共${sealInstanceTotal}条数据</div>
    

    </body>
        </div>
