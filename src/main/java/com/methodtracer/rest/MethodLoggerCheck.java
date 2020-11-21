package com.methodtracer.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.Date;

 
@Path("/")
public class MethodLoggerCheck
{
	
	@GET
	@Produces("text/html")
	public Response getTraceLog()
	{
		String output = "<h2>method trace check !<h2>" +
						"<p>MethodLoggerCheck Service is running ... <br> " + new Date().toString() + "</p<br>";
		methodInner("insidemethod");
		return Response.status(200).entity(output).build();
	}

	public  void methodInner(String m){
		String someLogic="methodInner";
		methodInner2();
	}
	public  void methodInner2(){
		String someLogic="methodInner2";
	}
	
}
