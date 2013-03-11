

<div class="more more3"><g:link controller="infoType" action="show" id="4" title="更多${com.sjzsqjy.www.site.InfoType.get('4')?.name}">more</g:link></div>
<ul>
<g:each in="${infoList}" var="i">
    <li><g:link controller="info" action="show" id="${i.id}"><span class="date"><g:formatDate format="yyyy-MM-dd"
                                                                                              date="${i.dateCreated}" /></span>${i.title}</g:link></li>
    </g:each>
</ul>