package org.testing.testcases;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestUsingSimpleJson {

	public static void main(String[] args) {
		//Test Case Sample to get the records using BDD Framework
		JSONObject js = new JSONObject();
		js.put("id", "25");
		js.put("name", "Vinoth");
		js.put("city", "chennai");
		js.put("designation", "DB Developer");
		
		Response res=
				given().contentType(ContentType.JSON)
				.body(js.toString())
				.when()
				.post("http://localhost:3000/APIStudentList");
		
		System.out.println(js.toString());
		System.out.println("Response is: " + res.statusCode());
		
		System.out.println(res.toString());
		
		
}
}
