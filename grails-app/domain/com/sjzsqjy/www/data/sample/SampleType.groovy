package com.sjzsqjy.www.data.sample

import org.asdtiang.grails.annotation.Title
/**
 * 名称---ca-钙-单位--正常范围
 */
@Title("样品检验类型")
class SampleType {
    @Title("英文名称")
	String item
    @Title("名称")
	String name
    @Title("单位")
	String unit
    @Title("最低值")
	String low
    @Title("最高值")
	String high
    @Title("显示序号")
	int sequence
	

}
