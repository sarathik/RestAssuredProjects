package org.testing.rest.BDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PostTeacherDetails {
	
	String baseURI = "http://localhost:3000";
	
	@Test
	public void postTeacher() {
		
		given()
			.baseUri(baseURI)
			.header("Content-Type","application/json")
			.body("{\r\n"
					+ "        \"id\": \"3\",\r\n"
					+ "        \"teacherID\": \"25\",\r\n"
					+ "        \"teachername\": \"Suresh\",\r\n"
					+ "        \"subject\": \"Business\"\r\n"
					+ "    }")
		.when()
			.post("/TeachersList")
		.prettyPrint();
		
	}

}
