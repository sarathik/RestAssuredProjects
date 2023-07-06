package org.testing.rest.BDD;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class CreateStudentComplexJsonLibrary {

	@Test
	public void createStudent2() {
		
		String base = "http://localhost:3000";
		
		JSONObject inobj = new JSONObject();
		JSONObject outobj = new JSONObject();
		
		inobj.put("primarycontact", "Father");
		inobj.put("Contact", "Mobile");
		
		outobj.put("id", "011");
		outobj.put("name", "Kutty");
		outobj.put("place", "Charholi");
		outobj.put("age", "12");
		outobj.put("contactdetails", inobj);

		Response res = 
		given()
			.baseUri(base)
			.contentType(ContentType.JSON)
			.body(outobj.toString())
		.when()
			.post("/StudentList");
		
		res.prettyPrint();
		res.statusCode();
		
	}
	
}
