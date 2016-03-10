package com.drishticon.kukuscorner.ecommerce.postpurchase.service;

import org.springframework.stereotype.Service;

@Service
public interface TrackingService {
	
	public String getTracking(String trackingNumber);
}
