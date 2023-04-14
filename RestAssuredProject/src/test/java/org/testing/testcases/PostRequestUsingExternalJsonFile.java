package org.testing.testcases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostRequestUsingExternalJsonFile {

	public static void main(String[] args) throws FileNotFoundException {
		// Program to post request using external JSON
	
		File filedata = new File("../RestAssuredProject/SampleBody.json"); // Created the connection with external file
		FileReader fr = new FileReader(filedata);
		JSONTokener js = new JSONTokener(fr); //used for reading the json file
		JSONObject j = new JSONObject(js);
		
		System.out.println(j.toString());
				
		Response res =
		given()
		.contentType(ContentType.JSON)
		.body(j.toString())
		.when()
		.post("http://localhost:3000/APIStudentList"); 
			
		System.out.println(res.statusCode());
	}

}
