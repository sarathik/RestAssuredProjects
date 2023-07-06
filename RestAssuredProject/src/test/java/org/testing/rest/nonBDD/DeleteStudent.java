package org.testing.rest.nonBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteStudent {
	
	@Test
	public void deleteStudent() {
		
		String baseURI = "http://localhost:3000";
		
		RestAssured.baseURI=baseURI;
		RequestSpecification req = RestAssured.given();
		Response res = req.request(Method.DELETE,"/StudentList/003");
		System.out.println(res.statusCode());
	}

}
