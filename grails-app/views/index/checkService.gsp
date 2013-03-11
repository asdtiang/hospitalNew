

<div class="more more2"><g:link controller="infoType" action="show" id="2" title="更多${com.sjzsqjy.www.site.InfoType.get('2')?.name}">more</g:link></div>
<ul>
<g:each in="${infoList}" var="i">
    <li><g:link controller="info" action="show" id="${i.id}"><span class="date">
    <g:formatDate format="yyyy-MM-dd" date="${i.dateCreated}" /></span></span>${i.title}</g:link>
    </li>
 </g:each>
</ul>
