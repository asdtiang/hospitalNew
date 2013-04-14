package com.sjzsqjy.www.data

import org.asdtiang.grails.annotation.Title

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-4-1
 * Time: 下午9:59
 * To change this template use File | Settings | File Templates.
 */
@Title("模板名称")
class TestType {
    @Title("模板名称")
    String typeName
    @Title("模板标识")
    String typeTag
    @Title("模板内容")
    String content

    static mapping={
        content type:'text'
        	}
}
