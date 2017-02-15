package com.haoyu.ncts.extend.lego.train.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.haoyu.ncts.extend.lego.train.entity.TrainTerm;
import com.haoyu.ncts.extend.lego.train.service.ITrainTermService;
import com.haoyu.sip.core.service.Response;
import com.haoyu.sip.core.web.AbstractBaseController;
import com.haoyu.tip.train.service.ITrainRelationService;
import com.haoyu.tip.train.service.ITrainService;

@Controller
@RequestMapping("**/lego/train")
public class TrainLegoExtendController extends AbstractBaseController{

	@Resource
	private ITrainService trainService;
	
	@Resource
	private ITrainRelationService trainRelationService;
	
	@Resource
	private ITrainTermService trainTermLegoService;
	
	@InitBinder  
	public void initBinder(WebDataBinder binder) {  
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
		dateFormat.setLenient(false);  
		//true:允许输入空值，false:不能为空值
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	@RequestMapping(value="createTrainTerm", method = RequestMethod.POST)
	@ResponseBody
	public Response createTrainTerm(TrainTerm trainTerm){
		return trainTermLegoService.createTrain(trainTerm);
	}
	
	@RequestMapping(value="{train.id}/updateTrainTerm",method = RequestMethod.PUT)
	@ResponseBody
	public Response updateTrainTerm(TrainTerm trainTerm){
		return trainTermLegoService.updateTrain(trainTerm);
	}
	
}
