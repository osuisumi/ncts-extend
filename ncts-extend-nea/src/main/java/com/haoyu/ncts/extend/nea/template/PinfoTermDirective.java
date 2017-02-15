package com.haoyu.ncts.extend.nea.template;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.haoyu.ncts.extend.nea.train.entity.TrainTerm;
import com.haoyu.ncts.extend.nea.train.service.ITrainTermService;
import com.haoyu.sip.core.freemarker.AbstractTemplateDirectiveModel;
import com.haoyu.sip.core.mapper.JsonMapper;
import com.haoyu.sip.core.utils.PropertiesLoader;
import com.haoyu.sip.utils.Collections3;

import cn.gdjsw.m.PinfoTermProxy;
import freemarker.core.Environment;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

@Component
public class PinfoTermDirective extends AbstractTemplateDirectiveModel {
	
	@Resource
	private PinfoTermProxy pinfoTermProxy;
	@Resource
	private ITrainTermService trainTermService;

	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
		Map<String, Object> parameter = getSelectParam(params);
		if (parameter.containsKey("trainId")) {
			TrainTerm trainTerm = trainTermService.getTrainTerm(parameter);
			if (trainTerm != null && StringUtils.isNotEmpty(trainTerm.getTermId())) {
				String systemId = PropertiesLoader.get("gdjsw.systemId");
				String systemPassword = PropertiesLoader.get("gdjsw.systemPassword");
				String termId = trainTerm.getTermId();
				String json = pinfoTermProxy.readPinfoTerm(systemId, systemPassword, new String[]{termId});
				Map<String, Object> map = new JsonMapper().fromJson(json, HashMap.class);
				List<Map<String, Object>> pinfoTerms = (List<Map<String, Object>>) map.get("pinfoTermList");
				if (Collections3.isNotEmpty(pinfoTerms)) {
					env.setVariable("pinfoTerm", new DefaultObjectWrapper().wrap(pinfoTerms.get(0)));
				}
			}
		}
		body.render(env.getOut());
	}

}
