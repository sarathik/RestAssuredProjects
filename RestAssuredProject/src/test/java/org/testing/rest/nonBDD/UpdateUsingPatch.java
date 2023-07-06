package org.testing.rest.nonBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateUsingPatch {
	
	@Test
	public void updateValue() {
		
		String baseURI = "http://localhost:3000/StudentList/014";
		
		RestAssured.baseURI=baseURI;
		
		RequestSpecification req = RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "  \"place\": \"Brookfield\",\r\n"
						+ "  \"age\": \"9\"\r\n"
						+ "}");
		
		Response res = req.request(Method.PATCH);
		System.out.println(res.statusLine());
		
	}

}
