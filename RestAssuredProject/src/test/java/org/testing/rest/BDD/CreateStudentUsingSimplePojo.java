package org.testing.rest.BDD;

import ObjectsForPojo.StudentInfo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class CreateStudentUsingSimplePojo {
	
	String base = "http://localhost:3000";
	
	@Test
	public void createStuSimplePojo() {
		
		StudentInfo stinfo = new StudentInfo();
		stinfo.setId("84");
		stinfo.setName("Ganesh");
		stinfo.setCity("Dever");
		stinfo.setAge("6");
		
		Response res =
				given()
					.baseUri(base)
					.contentType(ContentType.JSON)
					.body(stinfo)
				.when()
					.post("/StudentList");
		
		System.out.println(res.statusCode());
		
	}

}
