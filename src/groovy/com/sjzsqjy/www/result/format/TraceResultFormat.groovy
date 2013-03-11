package com.sjzsqjy.www.result.format


class TraceResultFormat  implements Comparable<TraceResultFormat>{
     String name
     String result
     String unit
     String child
     String adult
	 int sequence
	 public int compareTo(TraceResultFormat o) {
		 return  o.sequence - this.sequence;
	  }
}
