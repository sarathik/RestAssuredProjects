package org.testing.testcases;

import static io.restassured.RestAssured.*;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ParsingSingleValueUsingOrgJSON {

	public static void main(String[] args) {
		// Get JSON value using Org.JSON in the JSON
		
		//1. Extract single value using the json org library
		
		String apiDetails = "http://localhost:3000/APIStudentList";
		
		Response res =
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(apiDetails);
		
		JSONArray resArray = new JSONArray(res.asString());
		JSONObject resObj = resArray.getJSONObject(1);
		System.out.println(resObj.get("name"));
		
		
		//2. Extract all the values of specific key id of the JSON object

		
		int length = resArray.length();
		System.out.println(length);
		
		for (int i = 0; i < length; i++) {	
			JSONObject js = resArray.getJSONObject(i);
			System.out.println(js.get("id"));
		}
		
		
		//3. Extract all the key values of the particular Object array
		
		JSONObject js1 = resArray.getJSONObject(2);
		Set<String> keyName = js1.keySet();
		System.out.println(keyName);
		
		for (String string : keyName) {
			System.out.println(js1.get(string));
			
		}
		
		//4. Extract all the values inside the JSON Array
		
		for(int a=0; a<length ; a++) {
			JSONObject js2 = resArray.getJSONObject(a);
			Set<String> keyName1 = js2.keySet();
			for (String str : keyName1) {
				System.out.print("KeyName is : " + str);
				System.out.println(js2.get(str));
			}
			
		}
}

}
