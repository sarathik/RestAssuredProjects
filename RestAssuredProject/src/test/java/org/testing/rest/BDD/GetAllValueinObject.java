package org.testing.rest.BDD;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetAllValueinObject {
	
	String base = "http://localhost:3000";
	
	@Test
	public void getall() {
		Response res = RestAssured.given()
										.baseUri(base)
										.contentType(ContentType.JSON)
									.when()
										.get("/StudentList");
		JSONArray array = new JSONArray(res.asString());
		
		
		JSONObject j = array.getJSONObject(7);
		Set<String> keyname = j.keySet();
		for (String string : keyname) {
			System.out.println("KeyName : " + string + " and KeyValue : " + j.get(string));
		}
		System.out.println();
	}
	
	@Test
	public void getallDetailsinJSONfile() {
		Response res = RestAssured.given()
										.baseUri(base)
										.contentType(ContentType.JSON)
									.when()
										.get("/TeachersList");
		JSONArray array = new JSONArray(res.asString());
		
		for(int i=0; i<array.length();i++) {	
		JSONObject j = array.getJSONObject(i);
		Set<String> keyname = j.keySet();
		for (String string : keyname) {
			System.out.println("KeyName : " + string + " ||||  KeyValue : " + j.get(string));
		}
		System.out.println();
		}
	}
}
