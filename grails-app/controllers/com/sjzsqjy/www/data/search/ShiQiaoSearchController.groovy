package com.sjzsqjy.www.data.search

import com.sjzsqjy.www.data.shiqiao.Doctor
import com.sjzsqjy.www.data.shiqiao.ItemSet
import com.sjzsqjy.www.data.shiqiao.ShiQiaoResult
import com.sjzsqjy.www.data.shiqiao.ShiQiaoUser
import com.sjzsqjy.www.result.format.ShiQiaoResultFormat




class ShiQiaoSearchController {

   def resultById={
       def shiQiaoResultList
       def  patient = ShiQiaoUser.get(params.id)
       shiQiaoResultList = ShiQiaoResult.findAllBySampleIdAndDate(patient.sampleId+"",patient.date)
       def doctor = Doctor.get(patient.doctorId)
       def resultList = new ArrayList()
       shiQiaoResultList.each {
           def r = new ShiQiaoResultFormat()

           //代号赋值
           r.code = it.itemCode
           println r.code
           ///查找类型

           def item = ItemSet.findByCode(it.itemCode)
           if (item) {
               r.name = item.name
               println item.name +"-"+item.id
               r.unit = item.unit
               if (it.charValue == " ") {
                   r.value = it.value as float
                   r.low = item.low as float
                   r.hight = item.hight as float
                   r.sequence = item.sequence
                   r.normal()
               }
               else {
                   r.value = it.charValue
                   if (r.code=="ASO"){
                       r.hight = item.hight as float
                   }
                   if (r.code=="RF"){
                       r.hight = item.hight as float
                   }
               }
               if (r.code == "RBC" && patient.sex == "女") {
                   r.hight = 5
               }
               if (r.code == "HGB" && patient.sex == "女") {
                   r.hight = 160
               }
               if (r.code == "CRBC" || r.code == "CWBC" || r.code == "CPLT") {
                   ////为这三项时不用添加到显示
               }
               else {
                   resultList.add r
               }
           }

       }
       resultList.sort()
       render view: "result", model: [resultList: resultList, doctor: doctor, patient: patient]
   }
  /**
   *
   * @param 2010 -05-08
   * @return 2010-5-8
   */
  static String formatDate(String date) {
    def str = date.split("-")
    def result = str[0] + "-" + str[1].toInteger() + "-" + str[2].toInteger()
    return result
  }
}

