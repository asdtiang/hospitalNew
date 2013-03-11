<ul>
<g:each in="${infoTypeInstance.info}" var="i">
    <li>
        <div class="scrollImg">
            <g:link controller="info" action="show" id="${i.id}">
                <img
                     src="${createLinkTo(dir: 'images/info', file: i.id + '.jpg')}"
                     onerror="javascript:this.src = '${createLinkTo(dir: 'images/info', file: 'default.jpg')}';"/>
            </g:link>
            </div>
        <div class="title"><g:link controller="info" action="show"
                                   id="${i.id}">
            <g:if test="${i.title.length()>10 }">
                ${i?.title?.subSequence(0,10)?.encodeAsHTML()}...

            </g:if>
            <g:else>
                ${i?.title?.encodeAsHTML()}
            </g:else>
        </g:link></div>
    </li>
    </g:each>

</ul>

