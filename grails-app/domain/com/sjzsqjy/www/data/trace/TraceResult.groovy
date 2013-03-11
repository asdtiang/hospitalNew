package com.sjzsqjy.www.data.trace

import org.asdtiang.grails.annotation.Title
/**
 * 微量元素检测报告
 * @author asdtiang asdtiang@hotmail.com
 *2010-6-3下午04:24:49
 *
 */
@Title("微量元素检验结果")
class TraceResult {
    /**
     *sampleId参照 traceUser中的sampleId
     */
    @Title("样品id")
	String sampleId
    /**
     * typeStr 参照traceType中的name
     */
    @Title("检验类型")
    String typeStr
    @Title("结果值")
	String result
    @Title("类型YB")
    String ybStr
}
