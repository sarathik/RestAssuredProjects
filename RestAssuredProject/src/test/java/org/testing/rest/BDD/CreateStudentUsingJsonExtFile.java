package org.testing.rest.BDD;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateStudentUsingJsonExtFile {
	
	@Test
	public void createStudentExt() {
	File inputJson = new File("../RestAssuredProject/SimpleJsonFile.json");
	
	String baseURI = "http://localhost:3000";
	
	given()
		.baseUri(baseURI)
		.contentType(ContentType.JSON)
		.body(inputJson)
	.when()
		.post("/StudentList")
	.prettyPrint();
		
	}
}
