package com.sjzsqjy.www.result.format

class ShiQiaoResultFormat implements Comparable<ShiQiaoResultFormat> {
	String code
	String name
	String value
	float low
	float hight
	String unit
	int sequence
	int isNormal///是否在正常值-1小，0正常，1大于
	void normal(){
		float intValue=value as float
		if(intValue<low){
			isNormal=-1
		}
		else if(intValue>hight){
			isNormal=1
		}
		else{
			isNormal=0
		}
	}
	public int compareTo(ShiQiaoResultFormat o) {
		return this.sequence - o.sequence;
	 }

}
