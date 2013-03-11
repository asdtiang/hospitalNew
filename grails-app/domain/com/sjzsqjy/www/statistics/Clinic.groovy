package com.sjzsqjy.www.statistics

import org.asdtiang.grails.annotation.Title

@Title("诊所")
class Clinic {
	@Title("诊所名")
	String name
	@Title("诊所备注")
	String info
	@Title("分店")
	Shop shop
	int checkOutWay //1为月结，2为次结
	Date dateCreated
	static hasMany = [ data: Data]   
	static constraints = {
		name(unique:true)
		info(nullable:true)
	}
	static mapping={

	}
	
}
