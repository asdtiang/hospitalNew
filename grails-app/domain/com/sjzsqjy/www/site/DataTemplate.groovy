package com.sjzsqjy.www.site

import org.asdtiang.grails.annotation.Title

/**
 * Created with IntelliJ IDEA.
 * 自定义模板和测试数据模板内容不一样，测试数据为ftl模板，自定义数据为html
 * User: Administrator
 * Date: 13-3-28
 * Time: 下午7:43
 * To change this template use File | Settings | File Templates.
 */
@Title("自定义数据模板")
class DataTemplate {
    @Title("模板名称")
    String title;
    @Title("模板内容")
    String templateStr;


    static mapping={
        templateStr type:'text'
    	}

}
