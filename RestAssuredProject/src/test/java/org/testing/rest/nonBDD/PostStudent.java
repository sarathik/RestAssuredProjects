package org.testing.rest.nonBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostStudent {
	
	String baseURI = "http://localhost:3000/";
	
	@Test
	public void postStudentDetails() {
		
		RestAssured.baseURI=baseURI;
		RequestSpecification request=RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"id\": \"015\",\r\n"
						+ "    \"name\": \"Praneeil\",\r\n"
						+ "    \"place\": \"USA\",\r\n"
						+ "    \"age\": \"21\"\r\n"
						+ "}");
		Response res= request.request(Method.POST,"StudentList");
		System.out.println(res.statusLine());
		System.out.println(res.getStatusLine());
		
	}

}
