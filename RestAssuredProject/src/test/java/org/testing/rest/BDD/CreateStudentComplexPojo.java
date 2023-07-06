package org.testing.rest.BDD;

import org.testng.annotations.Test;

import ObjectsForPojo.StudentAddtionalInfo;
import ObjectsForPojo.StudentInfo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateStudentComplexPojo {
	
	String base = "http://localhost:3000";
	
	@Test
	public void createStudentCompPojo() {
		StudentAddtionalInfo stAddin = new StudentAddtionalInfo();
		stAddin.setPrimaryContact("Father");
		stAddin.setContact("Email");
		
		StudentInfo stin = new StudentInfo();
		stin.setId("26");
		stin.setName("Lucky");
		stin.setCity("Dallas");
		stin.setAge("5");
		stin.setStAddinfo(stAddin);
		
		RestAssured
			.given()
				.baseUri(base)
				.contentType(ContentType.JSON)
				.body(stin)
			.when()
				.post("/StudentList")
				.prettyPrint();
				
			
	}

}
