package org.testing.testcases;
import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostUsingComplexJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//minimum 2 objects required
		//it is the concept of inner data of the key

		JSONObject jsInner = new JSONObject();
		jsInner.put("Door", "20");
		jsInner.put("Area", "Charholi");
		//jsInner.put("City", "Pune");

		JSONObject jsOuter = new JSONObject();
		jsOuter.put("id", "29");
		jsOuter.put("name", "Balu");
		jsOuter.put("designation", "Sales Manager");
		jsOuter.put("city", "Pune");
		jsOuter.put("Address", jsInner);

		Response res  = 
				given().contentType(ContentType.JSON)
				.body(jsOuter.toString())
				.when()
				.get("http://localhost:3000/APIStudentList");

		System.out.println(jsOuter.toString());
		System.out.println(res.statusCode());

	}


}

