package org.testing.testcases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestCaseGetAll {

	public static void main(String[] args) {
			//Test Case Sample to get the records using BDD Framework
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/APIStudentList");
		
		System.out.println("The Status code: "+res.statusCode());
		System.out.println("The response data is below: ");
		System.out.println(res.asString());
	}

}
