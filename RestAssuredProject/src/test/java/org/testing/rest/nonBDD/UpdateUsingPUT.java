package org.testing.rest.nonBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateUsingPUT {
	
		@Test
		public void updateRecordCompleteBody() {
			
			String baseURI = "http://localhost:3000/StudentList";
			
			RestAssured.baseURI=baseURI;
			RequestSpecification req = RestAssured.given()
					.header("Content-Type","application/json")
					.body("{\r\n"
							+ "  \"id\": \"014\",\r\n"
							+ "  \"name\": \"Divya\",\r\n"
							+ "  \"place\": \"Chennai\",\r\n"
							+ "  \"age\": \"12\"\r\n"
							+ "}");
			Response res=req.request(Method.PUT,"/014");
			System.out.println(res.statusCode());
			
			
			
		}
}
