package com.sjzsqjy.www.data.shiqiao

import com.sjzsqjy.www.statistics.Clinic
import org.asdtiang.grails.annotation.Title

@Title("检验用户信息")
class ShiQiaoUser  {
    @Title("姓名")
	String name
    @Title("出生年月")
	String birth
    @Title("性别")
	String sex
    @Title("样品编号")
	String sampleId
    @Title("检验日期")
	String date
    @Title("送检医师")
	Doctor doctor
    @Title("送检诊所")
    Clinic clinic
	static constraints = {
		name(nullable:true)
    	sex(nullable:true)
    	doctor(nullable:true)
        clinic (nullable: true)
    }
}
