package com.sjzsqjy.www.data.search

import com.sjzsqjy.www.data.trace.TraceResult
import com.sjzsqjy.www.data.trace.TraceType
import com.sjzsqjy.www.data.trace.TraceUser
import com.sjzsqjy.www.result.format.TraceResultFormat


class TraceSearchController {
	def resultById={
		def traceResultList	   		
		def patient
		if(params.id){
			patient=TraceUser.get(params.id)
			traceResultList=TraceResult.findAllBySampleId(patient.sampleId)
		}
		else{
			render "id不存在"
            return
		}
		def resultList=new ArrayList()
		traceResultList.each {
			def t=new TraceResultFormat()
			t.result=it.result
            println it.typeStr
			def type=TraceType.findByNameAndSampleType(it.typeStr,it.ybStr)
			t.name=type.name
			t.child=type.child
			t.adult=type.adult
			t.unit=type.unit
			t.sequence=type.sequence
			
			resultList.add t
		}
		resultList.sort()
		render view:"result",model:[resultList:resultList,patient:patient]
	}
	/**
	 * 2010-02-09   ->  20100209
	 */
	static String formatDate(String date){
		def result
		def str=date.split("-")
		result=str[0]+str[1]+str[2]
		return result	
	}
	
}
