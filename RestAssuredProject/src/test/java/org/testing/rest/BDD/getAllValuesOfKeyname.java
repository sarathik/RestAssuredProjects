package org.testing.rest.BDD;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class getAllValuesOfKeyname {
	
	String base = "http://localhost:3000";
	
	@Test
	public void getAllValuesofKeyname() throws IOException {
		
		Response res =
		RestAssured.given()
						.baseUri(base)
						.contentType(ContentType.JSON)
					.when()
						.get("/StudentList");
		
		File f = new File("../RestAssuredProject/list.txt");
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter br = new BufferedWriter(fw);
		
		
		JSONArray ar = new JSONArray(res.asString());
		int len = ar.length();
		System.out.println("Total objects in the JSON: " + len);
		
		for(int i=0; i<len ;i++) {
			JSONObject j = ar.getJSONObject(i);
			String st =(String) j.get("name");
			br.write(st);
			br.newLine();			
		}
		br.write("--------------------------------------------------------------------------------");
		br.close();
		
	}

}
