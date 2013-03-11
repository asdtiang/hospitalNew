package com.sjzsqjy.www.site
/**
 * 
 * @author asdtiang asdtiang@hotmail.com
 *2010-5-5下午02:51:01
 *
 */
class Ads {
	String info  //广告信息，及尺寸信息
	String code////广告代码
	String name
    int sequence////序号
	int width
	int height
    static constraints = {
    }
	static mapping={
      code type:'text'
      info type:'text'
	}
	
}
