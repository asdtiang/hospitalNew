package com.sjzsqjy.www.site

import com.sjzsqjy.www.statistics.Clinic
import com.sjzsqjy.www.auth.HosUser
import com.sjzsqjy.www.auth.HosRole
import com.sjzsqjy.www.auth.HosUserHosRole
import com.sjzsqjy.www.auth.UserClinic
import com.sjzsqjy.www.util.StaticMethod

/**
 * Created with IntelliJ IDEA.
 * User: asdtiang
 * Date: 12-8-18
 * Time: 下午11:53
 * To change this template use File | Settings | File Templates.
 */
class AdminController {
    def doWithUser={
        Clinic clinic
        def clinicList = Clinic.list()
        HosRole role = HosRole.get(1)
        clinicList.each {
            StaticMethod.addClinicToUser(it,role)
        }
        render "用户更新完成"
    }
}
