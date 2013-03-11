package com.sjzsqjy.www.data.blood

import org.asdtiang.grails.annotation.Title

@Title("血流变结果")
class BloodResult {
    @Title("结果项序号")
    int sequence
    @Title("结果值")
    double value
    @Title("keyStr（日期加样品号）")
    String keyStr
    static constraints = {
    }
    static mapping = {
        version false
    }
}
