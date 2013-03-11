package com.sjzsqjy.www.statistics

import org.asdtiang.grails.annotation.Title

@Title("化验项目")
class Item {
	String id
	@Title("项目名")
	String name
	@Title("项目默认价格")
	int price
	static hasMany = [ data: Data]
	static constraints = {
		name(unique:true)
	}
	static mapping={
		id generator:'uuid'
	}
	

}
