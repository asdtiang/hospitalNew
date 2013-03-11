package com.sjzsqjy.www.site

import com.sjzsqjy.www.statistics.Clinic
import com.sjzsqjy.www.auth.HosUser
import com.sjzsqjy.www.auth.HosRole
import com.sjzsqjy.www.auth.HosUserHosRole
import com.sjzsqjy.www.auth.UserClinic

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
            clinic = it
            HosUser user = new HosUser()
            user.setUsername(clinic.name)
            user.setPassword("8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92")
            user.email="${clinic.name}@sjzsqjy.com"
            user.enabled=true
            user.save(flush: true)
            HosUserHosRole userRole = new HosUserHosRole()
            userRole.setHosRole(role)
            userRole.setHosUser(user)
            userRole.save(flush: true)
            UserClinic userClinic = new UserClinic()
            userClinic.setClinic(clinic)
            userClinic.setHosUser(user)
            userClinic.save(flush: true)
        }
        render "OKOKOK"
    }
}
