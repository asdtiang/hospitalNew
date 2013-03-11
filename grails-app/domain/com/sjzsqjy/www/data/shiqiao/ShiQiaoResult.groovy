package com.sjzsqjy.www.data.shiqiao

import org.asdtiang.grails.annotation.Title

@Title("思桥结果")
class ShiQiaoResult implements Serializable {
    @Title("检验日期")
	String date
    @Title("样品id")
	String sampleId
    @Title("项目类型Id")
	String typeId
    @Title("项目标识")
	String itemCode
    @Title("检验值")
	String value
    @Title("检验值")
	String charValue
    @Title("输入类型")
	int inputType
    @Title("序号")
    int sequence
	static constraints = {
		charValue(nullable:true)
        sequence(nullable:true)

    }
	static mapping={
		
	}

}
