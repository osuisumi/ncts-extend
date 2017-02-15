package com.haoyu.ncts.extend.lego.user.template;

import java.io.IOException;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.haoyu.ncts.extend.lego.user.entity.UserRegions;
import com.haoyu.ncts.extend.lego.user.service.IUserRegionsService;
import com.haoyu.sip.core.freemarker.AbstractTemplateDirectiveModel;

import freemarker.core.Environment;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

@Component
public class UserRegionsDirective extends AbstractTemplateDirectiveModel {
	
	@Resource
	private IUserRegionsService userRegionsService;

	public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body) throws TemplateException, IOException {
		Map<String,Object> parameter = getSelectParam(params);
		String userId = (String) parameter.get("userId");
		UserRegions userRegions = userRegionsService.getUserRegions(userId);
		env.setVariable("userRegions", new DefaultObjectWrapper().wrap(userRegions));
		body.render(env.getOut());
	}

}
