package org.testing.rest.nonBDD;

import java.util.Scanner;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllStudents {
	
	String baseURI = "http://localhost:3000/";
	
	@Test
	public void getAllStudents() {
				
		RestAssured.baseURI=baseURI;
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.GET,"StudentList");
		System.out.println(res.asString());
		//System.out.println(res.asPrettyString());
		
		System.out.println(res.statusCode()); //only Status code
		System.out.println(res.statusLine()); //Entire status line
		
	}

}
