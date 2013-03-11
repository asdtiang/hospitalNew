<%--
  Created by IntelliJ IDEA.
  User: asdtiang
  Date: 12-10-30
  Time: 下午10:27
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <title>首页</title>
    <meta name="layout" content="main" />
</head>
<body>
<div class="flash"><img src="${resource(dir: 'images', file: 'web_10.jpg')}" style=" border:1px solid #999;" /></div>
<!--                       banner 部分   左右两块内容                    -->
<div class="banner">

<!--              banner 的左边板块    公司简介  仪器展示   检验服务  业界新闻     -->
<div class="leftSy">
    <g:include controller="index" action="hospitalDesc"></g:include>

    <div class="shebei">
        <div class="more"><g:link controller="infoType" action="show" id="3" title="更多${com.sjzsqjy.www.site.InfoType.get('3')?.name}">more</g:link></div>
        <div id="demoLeft">
            <div class="indemo">
                <div id="demob1">
                    <!--仪器滚动-->
                    <g:include controller="index" action="scroll"></g:include>
                </div>
                <div id="demob2"></div>
            </div>
        </div>
    </div>
    <script type="text/javascript" src="js/lb.js"></script>
    <div class="news">
        <!--  检验服务 -->
        <g:include controller="index" action="checkService"></g:include>
    </div>
    <div class="news news2">
        <!--  业界新闻 -->
        <g:include controller="index" action="indexNews"></g:include>
    </div>
</div>
<!--              banner 的右边板块    最新公告   信息反馈   图片             -->
<div class="rightSy">

      <!--  网站公告-->
        <g:include controller="index" action="siteNotice"></g:include>
    <g:include controller="index" action="feedBack"></g:include>
    <div class="r_pic" ><img src="images/web_31.jpg" /></div>
</div>
    </div>
</body>
</html>