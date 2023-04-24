package org.testing.testcases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostUsingPojoMethod {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseInformation base = new BaseInformation();
		base.setIdValue("35");
		base.setFname("abced");
		base.setCity("Hyderabad");
		base.setDesignation("Employee");
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(base)
		.when()
		.post("http://localhost:3000/APIStudentList");
		
		System.out.println(res.statusCode());
		

	}

}
