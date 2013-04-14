package com.sjzsqjy.www.site

import com.sjzsqjy.www.statistics.Clinic
import org.asdtiang.grails.annotation.Title

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-3-28
 * Time: 下午7:41
 * To change this template use File | Settings | File Templates.
 */
@Title("自定义数据")
class CustomData {
    @Title("诊所名称")
    Clinic clinic ;
    @Title("姓名")
    String patientName;
    @Title("检验日期")
    Date testDate;
    @Title("内容")
    String data;
    @Title("内容模板")
    DataTemplate template;
    Date dateCreated

    static mapping={
        data type:'text'
    	}
}
