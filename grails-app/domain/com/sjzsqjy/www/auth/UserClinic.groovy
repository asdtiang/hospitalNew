package com.sjzsqjy.www.auth

import com.sjzsqjy.www.statistics.Clinic

class UserClinic  implements Serializable {

    HosUser hosUser
    Clinic clinic
    static constraints  = {
        clinic unique:true
    }
}
