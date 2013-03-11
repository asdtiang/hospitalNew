<ul>
    <li><a href="${createLink(uri: '/')}">首&nbsp;&nbsp;&nbsp;&nbsp;页</a></li>
    <g:each in="${infoTypeInstanceList}" status="i"
            var="infoTypeInstance">
        <li>
            <g:link controller="infoType" action="show" id="${infoTypeInstance.id}">
                ${infoTypeInstance.name}

            </g:link>
        </li>
    </g:each>
    <li><g:link controller="feedBack">
        信息反馈
    </g:link></li>
</ul>


