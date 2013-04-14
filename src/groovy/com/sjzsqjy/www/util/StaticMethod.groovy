package com.sjzsqjy.www.util

import com.sjzsqjy.www.auth.HosRole
import com.sjzsqjy.www.auth.HosUser
import com.sjzsqjy.www.auth.HosUserHosRole
import com.sjzsqjy.www.auth.UserClinic
import com.sjzsqjy.www.site.ConfigDomain
import com.sjzsqjy.www.statistics.Clinic

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-4-1
 * Time: 下午9:20
 * To change this template use File | Settings | File Templates.
 */
class StaticMethod {
    public static Map addToConfigMap(Map configMap, ConfigDomain configDomain) {
        if (configDomain.valueType == ConfigDomain.ValueType.Integer) {
            configMap.put(configDomain.mapName, Integer.parseInt(configDomain.mapValue))
        } else {
            configMap.put(configDomain.mapName, configDomain.mapValue)
        }
        return configMap
    }

    public static addClinicToUser(Clinic clinic,HosRole role) {
        if (UserClinic.findByClinic(clinic) == null) {
            HosUser user = new HosUser()
            user.setUsername(clinic.name)
            user.setPassword("8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92")
            user.email = "${clinic.name}@sjzsqjy.com"
            user.enabled = true
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
    }

}
