package com.sjzsqjy.www.data.search

import java.text.NumberFormat 
import com.sjzsqjy.www.result.format.SampleResultFormat
import com.sjzsqjy.www.data.sample.SampleUser
import com.sjzsqjy.www.data.sample.SampleResult
import com.sjzsqjy.www.data.sample.SampleResultChar
import com.sjzsqjy.www.data.sample.SampleType


class SampleSearchController {
	def result={
		def sampleResultList
		def sampleResultCharList
		def patient=session.patient
		if(params.sampleId){
			patient=SampleUser.findBySampleId(params.sampleId)
			sampleResultList=SampleResult.findAllBySampleId(params.sampleId)
			sampleResultCharList=SampleResultChar.findAllBySampleId(params.sampleId)
		}
		else{
			sampleResultList=SampleResult.findAllBySampleId(patient.sampleId)
			sampleResultCharList=SampleResultChar.findAllBySampleId(patient.sampleId)
		}
		def resultList=new ArrayList()
		sampleResultList.each {
			def r=new SampleResultFormat()
			log.info it.name
			def item=SampleType.findByItem(it.name)
			r.sequence=item.sequence
			r.code=it.name
			r.name=item.name
			r.unit=item.unit			
			r.value=it.value as float
			r.low=item.low as float
			r.high=item.high as float
			r.normal()			
			resultList.add r
		}
		sampleResultCharList.each {
			def r=new SampleResultFormat()			
			r.code=it.item		
			r.name=it.name
			r.unit=it.unit
			try{
				r.value=it.value as float
				r.low=it.low as float
				r.high=it.high as float
				r.sequence=11
				r.normal()
			}
			catch(Exception e){
				r.value=it.value
				r.sequence=13
				}
				
			resultList.add r
		}
		Iterator iterator =resultList.iterator();
		def resultList1= new ArrayList()
		int ldl_c=0///标记是否有LDL_C
		int ggt=0//标记是否是肝功能12，为0表示没有
		while (iterator.hasNext()) {
			def SampleResultFormat sample=iterator.next();
			resultList1.add sample
			log.info sample.code+"   dddddd"
			if(sample.code=="TP"){
				def alb=getItemValue("ALB",resultList)
				def tp=getItemValue("TP",resultList)
				def result1=SampleType.findByItem("A/G")
				def r=new SampleResultFormat()
				r.value=alb/(tp-alb)
				NumberFormat nf = NumberFormat.getInstance();		
				nf.setMaximumFractionDigits(2);
				r.value=nf.format(r.value as double);
				resultList1.add getFormat(r,result1)
			}
			if(sample.code=="LDL_C"){
				ldl_c=1//有LDL_C
			}
			if(sample.code=="GGT"){
				ggt=1//有LDL_C
			}
		}
		if(ldl_c==0){////没有LDL_C
			
			if(getItemValue("CHO",resultList)!=null&&getItemValue("TG",resultList)!=null
			&&getItemValue("HDL_C",resultList)!=null){		
				def cho=getItemValue("CHO",resultList)				
				def tg=getItemValue("TG",resultList)
				def hdl_c=getItemValue("HDL_C",resultList)
				def result1=SampleType.findByItem("LDL_C")
				def r=new SampleResultFormat()
				r.value=cho-tg/2.2-hdl_c
				NumberFormat nf = NumberFormat.getInstance();
				nf.setMaximumFractionDigits(2);
				r.value=nf.format(r.value as double);
				resultList1.add getFormat(r,result1)
			}
		}
		if(ggt==1){
			
			NumberFormat nf = NumberFormat.getInstance();
			nf.setMaximumFractionDigits(2);
			if(getItemValue("ALB",resultList)!=null&&getItemValue("TP",resultList)!=null) {				
				def alb=getItemValue("ALB",resultList)
				def tp=getItemValue("TP",resultList)
				def result2=SampleType.findByItem("GLB")
				def r2=new SampleResultFormat()
				r2.value=tp-alb
				r2.value=nf.format(r2.value as double);
				resultList1.add getFormat(r2,result2)
			}
			if(getItemValue("TBIL",resultList)!=null&&getItemValue("DBIL",resultList)!=null) {		
				def tbil=getItemValue("TBIL",resultList)
				def dbil=getItemValue("DBIL",resultList)
				def result1=SampleType.findByItem("IBiL")
				def r=new SampleResultFormat()
				r.value=tbil-dbil
				r.value=nf.format(r.value as double);
				resultList1.add getFormat(r,result1)
			}
		}
		resultList1.sort()
		render view:"result",model:[resultList:resultList1,patient:patient,date:formatDate(patient.sampleId)]
	}

    def resultById = {
        def sampleResultList
        def sampleResultCharList
        def patient=SampleUser.get(params.id)
        sampleResultList=SampleResult.findAllBySampleId(patient.sampleId)
        sampleResultCharList=SampleResultChar.findAllBySampleId(patient.sampleId)
        def resultList=new ArrayList()
        sampleResultList.each {
            def r=new SampleResultFormat()
            println  it.name
            def item=SampleType.findByItem(it.name)
            r.sequence=item.sequence
            r.code=it.name
            r.name=item.name
            r.unit=item.unit
            r.value=it.value as float
            r.low=item.low as float
            r.high=item.high as float
            r.normal()
            resultList.add r
        }
        sampleResultCharList.each {
            def r=new SampleResultFormat()
            r.code=it.item
            r.name=it.name
            r.unit=it.unit
            try{
                r.value=it.value as float
                r.low=it.low as float
                r.high=it.high as float
                r.sequence=11
                r.normal()
            }
            catch(Exception e){
                r.value=it.value
                r.sequence=13
            }

            resultList.add r
        }
        Iterator iterator =resultList.iterator();
        def resultList1= new ArrayList()
        int ldl_c=0///标记是否有LDL_C
        int ggt=0//标记是否是肝功能12，为0表示没有
        while (iterator.hasNext()) {
            def SampleResultFormat sample=iterator.next();
            resultList1.add sample
            log.info sample.code+"   dddddd"
            if(sample.code=="TP"){
                def alb=getItemValue("ALB",resultList)
                def tp=getItemValue("TP",resultList)
                def result1=SampleType.findByItem("A/G")
                def r=new SampleResultFormat()
                r.value=alb/(tp-alb)
                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(2);
                r.value=nf.format(r.value as double);
                resultList1.add getFormat(r,result1)
            }
            if(sample.code=="LDL_C"){
                ldl_c=1//有LDL_C
            }
            if(sample.code=="GGT"){
                ggt=1//有LDL_C
            }
        }
        if(ldl_c==0){////没有LDL_C

            if(getItemValue("CHO",resultList)!=null&&getItemValue("TG",resultList)!=null
                    &&getItemValue("HDL_C",resultList)!=null){
                def cho=getItemValue("CHO",resultList)
                def tg=getItemValue("TG",resultList)
                def hdl_c=getItemValue("HDL_C",resultList)
                def result1=SampleType.findByItem("LDL_C")
                def r=new SampleResultFormat()
                r.value=cho-tg/2.2-hdl_c
                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(2);
                r.value=nf.format(r.value as double);
                resultList1.add getFormat(r,result1)
            }
        }
        if(ggt==1){

            NumberFormat nf = NumberFormat.getInstance();
            nf.setMaximumFractionDigits(2);
            if(getItemValue("ALB",resultList)!=null&&getItemValue("TP",resultList)!=null) {
                def alb=getItemValue("ALB",resultList)
                def tp=getItemValue("TP",resultList)
                def result2=SampleType.findByItem("GLB")
                def r2=new SampleResultFormat()
                r2.value=tp-alb
                r2.value=nf.format(r2.value as double);
                resultList1.add getFormat(r2,result2)
            }
            if(getItemValue("TBIL",resultList)!=null&&getItemValue("DBIL",resultList)!=null) {
                def tbil=getItemValue("TBIL",resultList)
                def dbil=getItemValue("DBIL",resultList)
                def result1=SampleType.findByItem("IBiL")
                def r=new SampleResultFormat()
                r.value=tbil-dbil
                r.value=nf.format(r.value as double);
                resultList1.add getFormat(r,result1)
            }
        }
        resultList1.sort()
        render view:"result",model:[resultList:resultList1,patient:patient,date:formatDate(patient.sampleId)]
    }
	/**
	 * 
	 */
	static String formatDate(String date){
		def result=date.substring(0, 4)+"-"+date.substring(4, 6)+"-"+date.substring(6,8)
		return result
	}
	static  getItemValue(String item,ArrayList list){
		for(l in list){
			if(l.code==item){
				if(l.value){
					
					return l.value as float
				}
				else{
					
					return 0.0
				}
			}
		}
		
		return null
	}
	static SampleResultFormat getFormat(r,result1){
		r.low=result1.low as float
		r.high=result1.high as float
		r.code=result1.item
		r.name=result1.name
		r.unit=result1.unit
		r.sequence=result1.sequence
		r.normal()
		return r
	}
}
