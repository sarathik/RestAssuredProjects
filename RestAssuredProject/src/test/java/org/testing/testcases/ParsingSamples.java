package org.testing.testcases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingSamples {

	public static void main(String[] args) {
		// Get particular object value from the JSON Response using Simple JSON value
		
		Response res =
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/APIStudentList");
		
		//Syntax : objectName.searchKeyName
		//array : arrayName[indexnumer].objectName.searchKey
		
		//Parsing from the simple JSON
		String idName = res.jsonPath().get("[1].name");
		System.out.println(idName);
		
		

	}

}
