package com.sjzsqjy.www.site

import java.util.Date;

import org.asdtiang.grails.annotation.Title
@Title("留言")
class FeedBack {
	@Title("单位名称")
	String unitName
	@Title("反馈")
	String comment
	Date dateCreated
	static mapping={
        comment type:'text'
	}
	static constraints = {
		unitName blank: false
        comment blank:false
	}
	

}
