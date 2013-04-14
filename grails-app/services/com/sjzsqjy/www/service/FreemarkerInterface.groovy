package com.sjzsqjy.www.service


interface FreemarkerInterface {
    /**
     * 初始化模板
     */
	String JSON_TAG="data";
   String JSON_CONTENT="""<#assign text="\${data}" /><#assign data=text?eval />\n""";
   void   addOrUpdateTemplate(String key,String templateStr );
   String generateResult(String key,String content);
   String deleteTemplate(String key);
}
