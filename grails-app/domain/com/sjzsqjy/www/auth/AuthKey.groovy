package com.sjzsqjy.www.auth

import org.asdtiang.grails.annotation.Title

@Title("访问key")
class AuthKey {
    @Title("key")
    String clientKey
    DataType type
    static constraints = {
        clientKey blank: false, unique: true
    }

   static enum DataType {
        SAMPLE, SHIQIAO, TRACE,BLOOD
    }

}
