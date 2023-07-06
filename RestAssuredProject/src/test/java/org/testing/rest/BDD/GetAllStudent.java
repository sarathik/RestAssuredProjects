package org.testing.rest.BDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetAllStudent {
	
	@Test
	public void getAll() {
		String baseURI = "http://localhost:3000/StudentList";
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(baseURI);
		String responseOutput = res.asString();
		System.out.println(responseOutput);
		
		int statusCode = res.statusCode();
		System.out.println(statusCode);
		
	}

}
