<sec:ifAllGranted roles="ROLE_ADMIN">
<g:uploadForm controller="info"
						action="uploadLogo" name="upload">
						<g:hiddenField name="id" value="${id}" />
						<input type="file" name="myFile" />
						<input type="submit" value="上传" />
					</g:uploadForm>
					</sec:ifAllGranted>