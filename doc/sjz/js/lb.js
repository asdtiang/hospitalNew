// JavaScript Document
var speed=1;
var tabLeft=document.getElementById("demoLeft");
var tabb1=document.getElementById("demob1");
var tabb2=document.getElementById("demob2");
tabb2.innerHTML=tabb1.innerHTML;
function Marqueeb(){
if(tabLeft.scrollLeft>=tabb2.offsetWidth)
tabLeft.scrollLeft-=tabb1.offsetWidth
else{
tabLeft.scrollLeft++;
}
}
var MyMarb=setInterval(Marqueeb,speed);
tabLeft.onmouseover=function() {clearInterval(MyMarb)};
tabLeft.onmouseout=function() {MyMarb=setInterval(Marqueeb,speed)};