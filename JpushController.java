package com.zqgame.loan.api.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zqgame.loan.api.common.BaseConsts;
import com.zqgame.loan.api.common.enums.CommonStateEnum;
import com.zqgame.loan.api.common.exceptions.BusinessException;
import com.zqgame.loan.api.enums.PlatForm;
import com.zqgame.loan.api.services.JpushService;
import com.zqgame.loan.api.utils.StringUtil;


/**
 * 极光推送
 * @author zhu.qi 2017年11月23日
 *
 */

@Controller
public class JpushController extends BaseController {
	
	sysoutsfjasljdskl
	@ResponseBody
	public String jpushMessage(@RequestAttribute(BaseConsts.PARAM) Map param){
		String adId = param.get("adId") == null ? null : param.get("adId").toString();
		if(StringUtil.isBlank(adId)){
			throw new BusinessException(CommonStateEnum.BADREQ_PARAMETER_ERROR);
		}
		jpushService.pushMessage(Integer.parseInt(adId), null, PlatForm.ALL.getCode());
		return BaseConsts.DEFAULTRETURN;
	}
	
	
}
