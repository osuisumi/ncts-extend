package com.haoyu.ncts.extend.lego.template;

import java.io.IOException;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import com.haoyu.ncts.extend.lego.train.entity.TrainTerm;
import com.haoyu.ncts.extend.lego.train.service.ITrainTermService;
import com.haoyu.sip.core.freemarker.AbstractTemplateDirectiveModel;
import com.haoyu.sip.core.utils.PropertiesLoader;

import freemarker.core.Environment;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import net.legoteacher.m.LegoInfoServiceProxy;
import net.legoteacher.m.TermInfo;

@Component
public class PinfoTermDirective extends AbstractTemplateDirectiveModel {
	
	@Resource
	private LegoInfoServiceProxy legoInfoServiceProxy;
	@Resource
	private ITrainTermService trainTermService;

	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
		Map<String, Object> parameter = getSelectParam(params);
		if (parameter.containsKey("trainId")) {
			TrainTerm trainTerm = trainTermService.getTrainTerm(parameter);
			if (trainTerm != null && StringUtils.isNotEmpty(trainTerm.getTermId())) {
				String systemId = PropertiesLoader.get("glpt.clientId");
				String systemPassword = PropertiesLoader.get("glpt.clientPassword");
				String termId = trainTerm.getTermId();
				TermInfo[] termInfos = legoInfoServiceProxy.readTermInfo(systemId, systemPassword, new String[]{termId});
				if (termInfos != null && termInfos.length > 0) {
					env.setVariable("pinfoTerm", new DefaultObjectWrapper().wrap(termInfos[0]));
				}
			}
		}
		body.render(env.getOut());
	}

}
