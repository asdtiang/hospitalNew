package com.sjzsqjy.www.data.sample

import com.sjzsqjy.www.statistics.Clinic
import org.asdtiang.grails.annotation.Title
/**
 * 样品软件检测用户品
 * @author asdtiang asdtiang@hotmail.com
 *2010-6-7下午04:40:46
 *
 */
@Title("样品")
class SampleUser {
    @Title("姓名")
	String name
    @Title("性别")
	String sex
    @Title("样品号")
	String sampleId
    @Title("年龄")
    String age
    @Title("送检医师")
	String sendDoctor
    @Title("诊所")
    Clinic clinic
	static constraints = {
		name(nullable:true)
    	sex(nullable:true)
    	age(nullable:true)
    	sendDoctor(nullable:true)
        clinic(nullable: true)
    }
}
