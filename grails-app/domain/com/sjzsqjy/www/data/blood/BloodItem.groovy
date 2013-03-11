package com.sjzsqjy.www.data.blood

import org.asdtiang.grails.annotation.Title

@Title("血流变诊断项")
class BloodItem {
    @Title("名称")
    String name
    @Title("序号(唯一)")
    int sequence
    @Title("参考上限值")
    double high
    @Title("参考下限值")
    double low
    static constraints = {
        sequence unique: true
        name nullable: false
    }
    static mapping = {
        version false
    }
}
