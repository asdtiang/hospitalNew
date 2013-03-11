package com.sjzsqjy.www.data.shiqiao

import org.asdtiang.grails.annotation.Title

@Title("检测项标识")
class ItemSet {
    @Title("项目标识")
	ItemType itemType
    @Title("标识符")
	String code
    @Title("名称")
	String name
    @Title("最低值")
	String low
    @Title("最高值")
	String hight
    @Title("单位")
	String unit
    @Title("结果显示序号")
	int sequence
	static constraints = {
		name(nullable:true)
    	unit(nullable:true)
    }
}
