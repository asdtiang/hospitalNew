package com.sjzsqjy.www.data.sample

import org.asdtiang.grails.annotation.Title

@Title("样品结果")
class SampleResult {
    @Title("样品id")
    String  sampleId
    @Title("名称")
    String name
    @Title("结果值")
    String value
}
