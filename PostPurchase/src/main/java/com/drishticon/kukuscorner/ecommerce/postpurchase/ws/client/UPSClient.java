package com.drishticon.kukuscorner.ecommerce.postpurchase.ws.client;

import java.util.List;

import javax.xml.ws.BindingProvider;

import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.drishticon.kukuscorner.ecommerce.carrier.model.jaxb.ups.TrackRequest;
import com.drishticon.kukuscorner.ecommerce.carrier.model.jaxb.ups.TrackResponse;




public class UPSClient extends WebServiceGatewaySupport  {

	
	public String getTracking(String trackingNumber){
	
	
		TrackRequest request = new TrackRequest();
		request.setTrackingOption("02");	
		request.setInquiryNumber(trackingNumber);
		
		TrackResponse response = (TrackResponse) getWebServiceTemplate().marshalSendAndReceive(
				"https://wwwcie.ups.com/webservices/Track",
				request,
				new SoapActionCallback("https://wwwcie.ups.com/webservices/Track"));

		
		
	/*	
		com.drishticon.kukuscorner.ecommerce.carrier.model.jaxb.ups.TrackRequest upsTrackRequest = new com.drishticon.kukuscorner.ecommerce.carrier.model.jaxb.ups.TrackRequest();
		upsTrackRequest.setTrackingOption("02");	
		upsTrackRequest.setInquiryNumber(trackingNumber);
		
		
		TrackResponse  upsTrackResponse  =  (TrackResponse) getWebServiceTemplate().marshalSendAndReceive(
						"http://wsf.cdyne.com/WeatherWS/Weather.asmx",
						upsTrackRequest,
						new SoapActionCallback("http://ws.cdyne.com/WeatherWS/GetCityForecastByZIP"));
	
		return upsTrackResponse.getResponse().toString();
		
	*/
		
		return response.getResponse().toString();
		
	}
	
	
}
