package com.sjzsqjy.www.data

import com.sjzsqjy.www.statistics.Clinic
import org.asdtiang.grails.annotation.Title

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-4-1
 * Time: 下午9:55
 * To change this template use File | Settings | File Templates.
 */
@Title("检验数据")
class TestData {
    @Title("检验者姓名")
    String name
    @Title("诊所")
    Clinic clinic
    @Title("年龄")
    String age
    @Title("检验日期")
    Date testDate
    @Title("检验类型")
    TestType type
    @Title("检验结果")
    String jsonData

    Date dateCreated

    static mapping={
        jsonData type:'text'
           	}


}
