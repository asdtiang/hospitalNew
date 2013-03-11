package com.sjzsqjy.www.data.shiqiao

import org.asdtiang.grails.annotation.Title

@Title("送检医师")
class Doctor {
    @Title("送检医师姓名")
	String name
    static constraints = {
        name(nullable:true)
    }
}
