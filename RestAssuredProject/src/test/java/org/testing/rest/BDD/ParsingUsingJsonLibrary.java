package org.testing.rest.BDD;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingUsingJsonLibrary {

	String base = "http://localhost:3000/StudentList";

	@Test
	public void parsingSimpleJSON() {

		System.out.println("This method is used to Parse the data by JSON Path in Simple JSON File");
		Response res = 
				RestAssured
				.given()
				.baseUri(base)
				.contentType(ContentType.JSON)
				.when()
				.get();

		JSONArray jarry = new JSONArray(res.asString());
		JSONObject j = jarry.getJSONObject(0);
		System.out.println(j.get("place"));

	}

	@Test
	public void parsingComplexJSON() {

		System.out.println("This method is used to Parse the data by JSON Path in Complex JSON File");
		Response res = 
				RestAssured
				.given()
				.baseUri(base)
				.contentType(ContentType.JSON)
				.when()
				.get();

		JSONArray jarry = new JSONArray(res.asString());
		JSONObject j = jarry.getJSONObject(8);
		JSONObject jinner = j.getJSONObject("contactdetails");
		System.out.println(jinner.get("primarycontact"));

	}
	
	@Test
	public void parsingArrayJSON() {

		System.out.println("This method is used to Parse the data by JSON Path in Array JSON File");
		Response res = 
				RestAssured
				.given()
				.baseUri(base)
				.contentType(ContentType.JSON)
				.when()
				.get();

		JSONArray jarry = new JSONArray(res.asString());
		JSONObject j = jarry.getJSONObject(11);
		JSONArray jinarr = j.getJSONArray("ClassDetails");
		JSONObject jinnobj = jinarr.getJSONObject(0);
		//jinnobj.get("year");
		System.out.println(jinnobj.get("year"));
		System.out.println(jinnobj.get("topic"));


	}

}
