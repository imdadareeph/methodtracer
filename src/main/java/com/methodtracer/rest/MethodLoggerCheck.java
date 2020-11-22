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
		methodInner1("insidemethod");
		return Response.status(200).entity(output).build();
	}

	public  void methodInner1(String m){
		String someLogic="methodInner1";
		methodInner2();
	}
	public  void methodInner2(){
		String someLogic="methodInner2";
		methodInner3();
	}

	public  void methodInner3(){
		String someLogic="methodInner2";
		methodInner4();
	}

	public  void methodInner4(){
		String someLogic="methodInner2";
		methodInner5();
	}

	public  void methodInner5(){
		String someLogic="methodInner5";
		methodInner6();
	}
	public  void methodInner6(){
		String someLogic="methodInner6";
		methodInner7();
	}

	public  void methodInner7(){
		String someLogic="methodInner7";
		methodInner8();
	}
	public  void methodInner8(){
		String someLogic="methodInner8";
		methodInner9();
	}
	public  void methodInner9(){
		String someLogic="methodInner9";
		methodInner10();
	}
	public  void methodInner10(){
		String someLogic="methodInner10";
	}
	
}
