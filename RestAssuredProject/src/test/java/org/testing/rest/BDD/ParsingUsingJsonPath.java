package org.testing.rest.BDD;

import org.apache.http.ContentTooLongException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingUsingJsonPath {
	
	public String base = "http://localhost:3000";
	
	public Response getAll() {
		Response res = 
				given()
					.baseUri(base)
					.contentType(ContentType.JSON)
				.when()
					.get("/StudentList");
		return res;		
	}
		
	@Test
	public void parseJsonPath() {		
		System.out.println("This method is used to Parse the data by JSON Path in Simple JSON File");
				Response res = 
				given()
					.baseUri(base)
					.contentType(ContentType.JSON)
				.when()
					.get("/StudentList");
		String data = res.jsonPath().get("[3].place");
		System.out.println("Place name = " + data);					
	}

	@Test
	public void parseComplexJson() {
		System.out.println("This method is used to Parse the data by JSON Path in Complex JSON File");
		Response res = 
				given()
					.baseUri(base)
					.contentType(ContentType.JSON)
				.when()
					.get("/StudentList");
		String data = res.jsonPath()
						.get("[8].contactdetails.primarycontact");
		System.out.println("Complex JSON object name : " + data);
	}
	
	@Test
	public void parseArrayJson() {
		System.out.println("This methos is used to Parse the data by JSON Path in Array JSON File");
		Response res = 
				given()
					.baseUri(base)
					.contentType(ContentType.JSON)
				.when()
					.get("/StudentList");
		String data = res.jsonPath()
						.get("[11].ClassDetails[0].topic");
		System.out.println("Array JSON object name of Topic: " + data);
	}
}
