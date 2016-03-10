package com.drishticon.kukuscorner.ecommerce.postpurchase.serviceImpl;

import org.springframework.stereotype.Component;

import com.drishticon.kukuscorner.ecommerce.postpurchase.service.TrackingService;
import com.drishticon.kukuscorner.ecommerce.postpurchase.ws.client.UPSClient;

@Component("UPSTrackingImpl")
public class UPSTrackingImpl implements TrackingService {

	@Override
	public String getTracking(String trackingNumber) {

		
		UPSClient upsClient = new UPSClient();
		return upsClient.getTracking(trackingNumber);
	}

	
}
