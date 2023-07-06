package org.testing.rest.BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class WithImportAsStaticGet {
	
	@Test
	public void getAll() {
		
		String baseURI = "http://localhost:3000";
		
		RestAssured
			.given()
				.baseUri(baseURI)
			.when()
				.get("/StudentList/014")
			.prettyPrint();
	}

}
