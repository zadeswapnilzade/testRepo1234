package com.drishticon.kukuscorner.ecommerce.postpurchase.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.drishticon.kukuscorner.ecommerce.postpurchase.service.TrackingService;
import com.drishticon.kukuscorner.ecommerce.postpurchase.util.ApplicationContextUtils;

@Controller
public class TrackingController {
	

	
	@RequestMapping(path="/tracking/{carrier}/{trackingNumber}" , method=RequestMethod.GET )
	@ResponseBody	
	public String getTracking(@PathVariable("trackingNumber")String trackingNumber , @PathVariable("carrier")String carrier ){
		
		TrackingService trackingService = null;
		if(carrier.equalsIgnoreCase("ups")){
			 trackingService = (TrackingService) ApplicationContextUtils.getApplicationContext().getBean("UPSTrackingImpl");
		}else if(carrier.equalsIgnoreCase("fedex")){
			 trackingService = (TrackingService) ApplicationContextUtils.getApplicationContext().getBean("FedExTrackingImpl");
		}
		
		return trackingService.getTracking(trackingNumber);
		
	}
	

}
