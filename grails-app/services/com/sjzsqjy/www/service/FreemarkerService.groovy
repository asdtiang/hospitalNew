package com.sjzsqjy.www.service

import freemarker.template.Configuration
import freemarker.template.DefaultObjectWrapper
import freemarker.template.Template
import freemarker.template.TemplateException
import org.apache.commons.io.FileUtils


/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-4-4
 * Time: 上午10:08
 * To change this template use File | Settings | File Templates.
 */
class FreemarkerService implements FreemarkerInterface{
	private Map<String,Template> templateMap = new HashMap<String,Template>()
	private static Configuration cfg = new Configuration();
	static {
		try {
			cfg.setDirectoryForTemplateLoading(new File(""));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cfg.setDefaultEncoding("utf-8");
		cfg.setObjectWrapper(new DefaultObjectWrapper());
	}
	@Override
	void addOrUpdateTemplate(String key, String templateStr) {
		Template template = new Template(key,
				new StringReader(JSON_CONTENT+templateStr),
				cfg,
				)
		templateMap.put(key,template);
	}

	@Override
	String generateResult(String key, String content) {
		Template template = templateMap.get(key);
		Writer out = new StringWriter();
		Map map = new HashMap();
		map.put(JSON_TAG,content);
		try {
			template.process(map, out);
			out.flush();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return out.toString()
	}

	@Override
	String deleteTemplate(String key) {
		templateMap.remove(key);  //To change body of implemented methods use File | Settings | File Templates.
	}

	public static void main(String[] args){

		FreemarkerService service = new FreemarkerService();
		String testStr = """data.name=\${data.name} <br/>"""
		service.addOrUpdateTemplate("test",testStr);
		println service.generateResult("test","{'name':'opal','age':'30+','addr':'上海上海'}");
	}
}
