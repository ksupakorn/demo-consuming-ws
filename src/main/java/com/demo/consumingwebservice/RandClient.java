
package com.demo.consumingwebservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.demo.consumingwebservice.wsdl.Next1;
import com.demo.consumingwebservice.wsdl.Next1Response;
import com.demo.consumingwebservice.wsdl.RandReq;
import com.example.consumingwebservice.wsdl.GetCountryRequest;
import com.example.consumingwebservice.wsdl.GetCountryResponse;

public class RandClient extends WebServiceGatewaySupport {

	private static final Logger log = LoggerFactory.getLogger(RandClient.class);

	public Object getNext() {

		Next1 next1 = new Next1();
		
		RandReq req = new RandReq();
		req.setNumber(1);
		
		next1.setRandReq(req);

//		Next1Response response = (Next1Response) getWebServiceTemplate()
//				.marshalSendAndReceive("http://localhost:8080/java-ws/RandService", next1,
//						new SoapActionCallback(
//								"http://ws.demo.com/RandService"));
		
		
//		Next1Response response = (Next1Response) getWebServiceTemplate()
//				.marshalSendAndReceive(next1);
		
		Object response = getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8080/java-ws/RandService",next1);
		
		return response;
	}
	
	

}
