package org.testing.rest.BDD;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateStudentSimpleJsonlibrary {
	
	@Test
	public void createStudent1() {
		
		String base = "http://localhost:3000";
		
		JSONObject jo = new JSONObject();
		jo.put("id", "008");
		jo.put("name", "Shri");
		jo.put("place", "Erode");
		jo.put("age", "9");
		jo.put("result", "Pass");
		
		RestAssured
			.given()
				.baseUri(base)
				.contentType(ContentType.JSON)
				.body(jo.toString())
			.when()
				.post("/StudentList")
			.prettyPrint();
		
				
		
	}

}
