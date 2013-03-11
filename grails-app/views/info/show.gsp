<%@ page import="com.sjzsqjy.www.site.Info" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="main"/>
    <title>${infoInstance?.infoType?.name?.encodeAsHTML()}-${infoInstance?.title?.encodeAsHTML()}</title>

    <script language="javascript" src="${resource(dir: 'print', file: 'LodopFuncs.js')}"></script>
    <script language="javascript" type="text/javascript">
        function myPrint() {
            var LODOP=getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));


            LODOP.SET_PRINT_STYLE("FontSize",18);
            LODOP.SET_PRINT_STYLE("Bold",1);
            LODOP.ADD_PRINT_HTM(0,30,673,1000,document.getElementById("content").outerHTML);
            LODOP.PREVIEW();

        };
        function CheckIsInstall() {
            try{
                var LODOP=getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));
                if ((LODOP!=null)&&(typeof(LODOP.VERSION)!="undefined")) alert("本机已成功安装过Lodop控件!\n  版本号:"+LODOP.VERSION);
            }catch(err){
                alert("Error:本机未安装或需要升级!");
            }
        }
    </script>
</head>

<body>
    </div>
<div class="flash"><img style=" border:1px solid #999;" src="${resource(dir: 'images', file: 'flash2.jpg')}"></div>
<sec:ifAllGranted roles="ROLE_ADMIN">
    <div class="nav"><span class="menuButton"><g:link
            class="list" action="list">
        <g:message code="default.list.label" args="[entityName]"/>
    </g:link></span> <span class="menuButton"><g:link class="create" action="create">
        <g:message code="default.new.label" args="[entityName]"/>
    </g:link></span><g:form>
        <g:hiddenField name="id" value="${infoInstance?.id}"/>
        <span class="button"><g:actionSubmit class="edit" action="edit"
                                             value="${message(code: 'default.button.edit.label', default: 'Edit')}"/></span>
        <span class="button"><g:actionSubmit class="delete"
                                             action="delete"
                                             value="${message(code: 'default.button.delete.label', default: 'Delete')}"
                                             onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');"/></span>
    </g:form></div>
</sec:ifAllGranted>
<div>
    <g:if test="${flash.message}">
        <div class="message">
            ${flash.message}
        </div>
    </g:if>
    <div class="banner">
        <!--              banner 的左边板块         -->
        <div class="left">
            <!--  网站公告-->
            <g:include controller="index" action="siteNotice"></g:include>
            <g:include controller="index" action="feedBack"></g:include>
            <div class="r_pic"><img src="${resource(dir: 'images', file: 'web_31.jpg')}"/></div>
        </div>

        <div class="right">
            <div class="guide"><span class="dq">当前位置：</span> <a href="${createLink(uri: '/')}">首页</a> &gt;
                <g:link controller="infoType" action="show"
                        id="${infoInstance?.infoType?.id}">
                    ${infoInstance?.infoType?.name?.encodeAsHTML()}
                </g:link>
            &gt;${infoInstance?.title?.encodeAsHTML()}</div>

            <div class="inside">
                <div class="title"><h1>${infoInstance?.title?.encodeAsHTML()}</h1> <span onclick="myPrint();">打印</span>
                <span onclick="CheckIsInstall();">测试</span>
                </div>

                <div class="showTime"><g:message code="lastUpdated.label"
                                                 default="Last Updated"/>: <g:formatDate
                        date="${infoInstance?.lastUpdated}" format="yyyy-MM-dd"/> <g:message
                        code="dateCreated.label" default="Date Created"/>: <g:formatDate
                        date="${infoInstance?.dateCreated}" format="yyyy-MM-dd"/></div>

                <div class="content" id="content">
                    ${infoInstance?.content}
                </div>
            </div>

        </div>
    </div>
</body>
</html>
