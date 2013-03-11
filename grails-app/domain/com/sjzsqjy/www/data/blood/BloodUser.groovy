package com.sjzsqjy.www.data.blood

import org.asdtiang.grails.annotation.Title
import com.sjzsqjy.www.statistics.Clinic

@Title("血流变")
class BloodUser {
     @Title("姓名")
     String name
    @Title("年龄")
    String age
    @Title("性别")
    String sex
    @Title("送检日期")
     String sendDate
    @Title("检验日期")
     String testDate
    @Title("科别")
    String keBie
    @Title("样品号")
    String sampleId
    @Title("送检医生")
    String sendDoctor
    @Title("检验医生")
    String testDoctor
    @Title("病床号")
    String bedNum
    @Title("门诊号")
    String checkNum
    @Title("住院号")
    String hospitalNum
    @Title("病区号")
    String patientNum
    @Title("诊断")
    String type
    @Title("keyStr（日期加样品号）")
    String keyStr

    @Title("诊所")
    Clinic clinic


    static constraints = {
        clinic(nullable: true)
    }
}
