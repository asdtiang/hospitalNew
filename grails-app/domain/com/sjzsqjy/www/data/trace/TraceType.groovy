package com.sjzsqjy.www.data.trace

import org.asdtiang.grails.annotation.Title

/**
 * 微量元素类型表
 * @author asdtiang asdtiang@hotmail.com
 *2010-6-3下午04:07:38
 *
 */
@Title("微量元素检验类型")
class TraceType{
    @Title("名称")
	String name
    @Title("单位")
	String unit
    @Title("儿童参考")
	String child
    @Title("成人参考")
	String adult
    @Title("样品类型")
	String sampleType
    @Title("显示序号")
	int sequence
}
