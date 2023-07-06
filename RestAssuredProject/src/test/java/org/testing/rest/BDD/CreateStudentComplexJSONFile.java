package org.testing.rest.BDD;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class CreateStudentComplexJSONFile {
	
	String base = "http://localhost:3000";
	
	@Test
	public void createStudent5() throws FileNotFoundException {
		
		File f = new File("../RestAssuredProject/ComplexJson.json");
		FileReader fReader = new FileReader(f);
		JSONTokener jtoken = new JSONTokener(fReader);
		JSONObject jobj = new JSONObject(jtoken);
		
		Response res =
		given()
			.baseUri(base)
			.contentType(ContentType.JSON)
			.body(jobj.toString())
		.when()
			.post("/StudentList");
		
		System.out.println("Inserted Data : " + res.asPrettyString());
		System.out.println("Status Code : "+res.statusCode());
	}
	
	@Test
	public void createTeacherArray() throws FileNotFoundException {
		
		File f = new File("../RestAssuredProject/ComplexJsonTeacher.json");
		FileReader fr1 = new FileReader(f);
		JSONTokener jtk = new JSONTokener(fr1);
		JSONObject jb =  new JSONObject(jtk);
		
		Response res =
		given()
			.baseUri(base)
			.contentType(ContentType.JSON)
			.body(jb.toString())
		.when()
			.post("/TeachersList");
		System.out.println("Inserted Data : " + res.asPrettyString());
		System.out.println("Status Code : "+res.statusCode());
		
				
		
		
	}

}
