package com.sjzsqjy.www.result.format

class SampleResultFormat implements Comparable<SampleResultFormat> {
	String code
	String name
	String value
	float low
	float high
	String unit
	int isNormal///是否在正常值-1小，0正常，1大于
	int sequence
	void normal(){
		float intValue=value as float
		if(intValue<low){
			isNormal=-1
		}
		else if(intValue>high){
			isNormal=1
		}
		else{
			isNormal=0
		}
	}
	public int compareTo(SampleResultFormat o) {
		return this.sequence - o.sequence;
	 }
 

}
