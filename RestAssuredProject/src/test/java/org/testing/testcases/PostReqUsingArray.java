package org.testing.testcases;

import static io.restassured.RestAssured.given;


import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.common.assertion.GetAtPathFragmentEscaper;
import io.restassured.response.Response;

public class PostReqUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject innnerObj1 = new JSONObject();
		innnerObj1.put("Door", "11");
		innnerObj1.put("Area", "Road");
		
		JSONObject innnerObj2 = new JSONObject();
		innnerObj2.put("Door", "13");
		innnerObj2.put("Area", "Road view");
		
		JSONArray array1 = new JSONArray();
		array1.put(0,innnerObj1);
		array1.put(1,innnerObj2);
		
		JSONObject outerObj = new JSONObject();
		outerObj.put("id", "31");
		outerObj.put("name", "New Guy");
		outerObj.put("city", "jaipur");
		outerObj.put("designation", "Marketing");
		outerObj.put("Address", array1);
		
		Response res = 
				given().contentType(ContentType.JSON)
				.body(outerObj.toString())
				.when()
				.post("http://localhost:3000/APIStudentList");
		
		System.out.println(outerObj.toString());
		System.out.println(res.statusCode());
	}

}
