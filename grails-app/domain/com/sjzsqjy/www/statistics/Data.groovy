package com.sjzsqjy.www.statistics

import java.util.Date;

import org.asdtiang.grails.annotation.Title

@Title("化验数据")
class Data {	
	String id
	@Title("化验数据")
	String name
	@Title("化验内容")
	String item
	static belongsTo = [clinic:Clinic]
	@Title("价格")
    float money
    String month
    String year
    Date date
    Date dateCreated
    static mapping={
		id generator:'uuid'
		clinic lazy:false
		
	}
}
