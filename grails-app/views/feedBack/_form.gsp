<%@ page import="com.sjzsqjy.www.site.FeedBack" %>


<style>
    .fieldcontain{
        width:500px;
        text-align: left;
    }
    label{width:100px;}

</style>
<div class="fieldcontain ${hasErrors(bean: feedBackInstance, field: 'unitName', 'error')} required">
    <label for="unitName"  >
        昵&nbsp;&nbsp;&nbsp; 称
        <span class="required-indicator">*</span>
    </label>
    <g:textField name="unitName" size="20" required="" value="${feedBackInstance?.unitName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: feedBackInstance, field: 'comment', 'error')} ">
    <label for="comment" >
        <g:message code="feedBack.comment.label" default="Comment"/>
        <span class="required-indicator">*</span>
    </label>
    <g:textArea cols="50" rows="5" name="comment"  required="" value="${feedBackInstance?.comment}"/>
</div>

