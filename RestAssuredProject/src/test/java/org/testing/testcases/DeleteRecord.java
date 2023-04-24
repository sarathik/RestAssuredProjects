package org.testing.testcases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete("http://localhost:3000/APIStudentList/45");
				
				System.out.println(res.statusCode());
		
	}

}
