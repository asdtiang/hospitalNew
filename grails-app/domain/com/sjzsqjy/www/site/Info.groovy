package com.sjzsqjy.www.site

import java.util.Date;

class Info {
	String title
	String content
	boolean recommand
	Date dateCreated
	Date lastUpdated
	static belongsTo = [infoType:InfoType]
	static constraints = {	
	}
	static mapping={
		content type:'text'
	}
}
