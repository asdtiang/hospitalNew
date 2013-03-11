/**
 * 
 */
package com.sjzsqjy.www.statistics

import org.asdtiang.grails.annotation.Title

/**
 * @author Administrator
 *
 */
@Title("分店")
class Shop {
	@Title("分店名")
	String name
	@Title("分店地址")
	String address
	static constraints = {
		name(unique:true)
	}

}
