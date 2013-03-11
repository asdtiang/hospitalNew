<%--
  Created by IntelliJ IDEA.
  User: asdtiang
  Date: 12-11-5
  Time: 下午9:25
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<div class="news feedback">

    <div class="more more4"><g:link controller="feedBack" action="list">more</g:link></div>
    <ul>
<g:each in="${feedBackInstanceList}" status="i" var="feedBackInstance">
        <li>
            <g:link controller="feedBack" action="show"
                    id="${feedBackInstance.id}">
                ${feedBackInstance?.unitName.length()>5?feedBackInstance?.unitName.substring(0,5)+'..':feedBackInstance?.unitName}
                ${feedBackInstance?.comment.length()>15?feedBackInstance?.comment.substring(0,15)+'..':feedBackInstance?.comment}

            </g:link>
           </li>
    </g:each>
    </ul>
</div>