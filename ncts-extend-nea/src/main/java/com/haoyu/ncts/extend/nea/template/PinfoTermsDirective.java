package com.haoyu.ncts.extend.nea.template;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.haoyu.sip.core.freemarker.AbstractTemplateDirectiveModel;
import com.haoyu.sip.core.mapper.JsonMapper;
import com.haoyu.sip.core.utils.PropertiesLoader;

import cn.gdjsw.m.PinfoTermProxy;
import freemarker.core.Environment;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

@Component
public class PinfoTermsDirective extends AbstractTemplateDirectiveModel {
	
	@Resource
	private PinfoTermProxy pinfoTermProxy;

	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
		Map<String, Object> parameter = getSelectParam(params);

		String systemId = PropertiesLoader.get("gdjsw.systemId");
		String systemPassword = PropertiesLoader.get("gdjsw.systemPassword");
		String json = pinfoTermProxy.listPinfoTerm(systemId, systemPassword, 1, 1000);
		Map<String, Object> map = new JsonMapper().fromJson(json, HashMap.class);
		
		List<Map<String, Object>> pinfoTerms = (List<Map<String, Object>>) map.get("pinfoTermList");
		env.setVariable("pinfoTerms", new DefaultObjectWrapper().wrap(pinfoTerms));

		body.render(env.getOut());
	}

}
