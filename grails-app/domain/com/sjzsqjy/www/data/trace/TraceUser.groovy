package com.sjzsqjy.www.data.trace

import com.sjzsqjy.www.statistics.Clinic
import org.asdtiang.grails.annotation.Title

/**
 * 微量元素表用户表
 * @author asdtiang asdtiang@hotmail.com
 *2010-6-3下午04:01:55
 *
 */
/**
 *
 */
@Title("微量元素用户")
class TraceUser {
    @Title("检测时间")
	String date//检验时间
    @Title("编号")
	String sampleId///编号
    @Title("姓名")
    String name//姓名
    @Title("性别")
	String sex//性别
    @Title("送检科室")
    String keShi//送检科室
    @Title("样本")
	String type//样本
    @Title("检验医师")
	String doctor///检验医师
    @Title("送检医师")
	String sendDoctor//送检医师
    @Title("年龄信息")
	String ageInfo///年龄信息
    @Title("诊所")
    Clinic clinic
	static constraints = {
    	sex(nullable:true)
    	ageInfo(nullable:true)
    	sendDoctor(nullable:true)
        clinic(nullable: true)
    }
}
