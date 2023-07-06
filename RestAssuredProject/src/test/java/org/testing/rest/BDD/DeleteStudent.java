package org.testing.rest.BDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteStudent {
	
	String base = "http://localhost:3000";
	
	@Test
	public void deleteStudent() {
		
		Response res =
				given()
					.baseUri(base)
					.contentType(ContentType.JSON)
				.when()
					.delete("/StudentList/84");
		System.out.println(res.statusCode());
	}

}
