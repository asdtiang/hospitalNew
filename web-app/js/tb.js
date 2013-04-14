// JavaScript Document
 function addCookie(){// 加入收藏  
alert('test');
 if (document.all){  
window.external.addFavorite('http://sjz.asdtiang.org/', '石家庄社区检验网');  
 }  
 else if (window.sidebar){  
 window.sidebar.addPanel('石家庄社区检验网','http://sjz.asdtiang.org/', "");  
 }  
}  
 function setHomepage(){ // 设为首页
 if (document.all) {  
 document.body.style.behavior = 'url(#default#homepage)';  
document.body.setHomePage('http://sjz.asdtiang.org/');  
}  
 else if(window.sidebar){  
 if (window.netscape){  
 try {  
 netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");  
 }  
 catch(e){  
 alert("该操作被浏览器拒绝，假如想启用该功能，请在地址栏内输入 about:config,然后将项 signed.applets.codebase_principal_support 值该为true");  
 }  
}  
 var prefs = Components.classes['@mozilla.org/preferences-service;1'].getService(Components.interfaces.nsIPrefBranch);  
 prefs.setCharPref('browser.startup.homepage','http://sjz.asdtiang.org/');  
 }
}  


function AddFavorite(sURL, sTitle)
{
    try
    {
        window.external.addFavorite(sURL, sTitle);
    }
    catch (e)
    {
        try
        {
            window.sidebar.addPanel(sTitle, sURL, "");
        }
        catch (e)
        {
            alert("加入收藏失败，请使用Ctrl+D进行添加");
        }
    }
}
function SetHome(obj,vrl){
        try{
                obj.style.behavior='url(#default#homepage)';obj.setHomePage(vrl);
        }
        catch(e){
                if(window.netscape) {
                        try {
                                netscape.security.PrivilegeManager.enablePrivilege("UniversalXPConnect");
                        }
                        catch (e) {
                                alert("此操作被浏览器拒绝！\n请在浏览器地址栏输入about:config并回车\n然后将 [signed.applets.codebase_principal_support]的值设置为'true',双击即可。");
                        }
                        var prefs = Components.classes['@mozilla.org/preferences-service;1'].getService(Components.interfaces.nsIPrefBranch);
                        prefs.setCharPref('browser.startup.homepage',vrl);
                 }
        }
}