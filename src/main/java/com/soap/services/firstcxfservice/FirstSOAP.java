package com.soap.services.firstcxfservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class FirstSOAP {
	@WebMethod
    public String greet(@WebParam(name="person") String person) {
    	return "Hello " + person;
    }
	
	public long  times(int x, int y) {
		return (long) Math.pow(x, y);
	}
}
