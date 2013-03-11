package com.sjzsqjy.www.site

class InfoType {
	String name
	int sequence
	boolean image
	boolean indexShow
	static hasMany = [ info : Info]
	static constraints = {
		name(unique:true)
		sequence(unique:true)
		image(default:"false")
		indexShow(default:"false")
	}
	static mapping={
		id generator:'uuid'
		info sort: 'id', order: 'asc'
	}


}
