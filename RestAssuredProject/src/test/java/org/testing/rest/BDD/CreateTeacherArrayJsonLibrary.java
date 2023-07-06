package org.testing.rest.BDD;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateTeacherArrayJsonLibrary {
	
	@Test
	public void createTeacher1() {
		
		String base = "http://localhost:3000";
		
		JSONObject inn1 = new JSONObject();
		inn1.put("topic", "Data Science");
		inn1.put("year","Year2");
		
		JSONObject inn2 = new JSONObject();
		inn2.put("topic", "Networking");
		inn2.put("year", "Year1");
		
		JSONArray arr1 = new JSONArray();
		arr1.put(0,inn1);
		arr1.put(1,inn2);
		
		JSONObject out = new JSONObject();
		out.put("id", "31");
		out.put("teacherId", "5533");
		out.put("teachername", "Kavitha");
		out.put("subject", "Computer Science");
		out.put("ClassDetails", arr1);
		
		RestAssured
			.given()
				.baseUri(base)
				.contentType(ContentType.JSON)
				.body(out.toString())
			.when()
				.post("/TeachersList")
				.statusLine();
			
		
		
	}

}
