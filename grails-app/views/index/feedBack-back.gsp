



<div id="feedBack">

	<div class="news1">
		<div class="news1_1">
			<g:link controller="feedBack" action="list">
				<span class="i3">信息反馈</span>
			</g:link>
		</div>
		<div class="news1_2">
			<g:link controller="feedBack" action="list">
				<img border="0" src="${resource(dir: 'images', file: 'more.gif')}">
			</g:link>
		</div>
	</div>





	<div id="feedBackContent">
		<g:each in="${feedBackInstanceList}" status="i" var="feedBackInstance">
			<dt>

				<g:link controller="feedBack" action="show"
					id="${feedBackInstance.id}">
          ${feedBackInstance?.unitName.length()>5?feedBackInstance?.unitName.substring(0,5)+'..':feedBackInstance?.unitName}
         ${feedBackInstance?.comment.length()>15?feedBackInstance?.comment.substring(0,15)+'..':feedBackInstance?.comment}
          
        </g:link>

			</dt>
		</g:each>
	</div>
</div>