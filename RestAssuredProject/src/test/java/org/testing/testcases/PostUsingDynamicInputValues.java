package org.testing.testcases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PostUsingDynamicInputValues {

	public static void main(String[] args) throws FileNotFoundException {
		// This program is to taken input values dynamically and send into JSON file
		
		File fileBody = new File("../RestAssuredProject/SampleBodyWithVariableDeclaration.json");
		FileReader fr = new FileReader(fileBody);
		JSONTokener js = new JSONTokener(fr);
		JSONObject j = new JSONObject(js);
		
		String jsonBody = j.toString();
		
		Scanner inp = new Scanner(System.in);
		
		String idValue = inp.next();
		jsonBody = jsonBody.replaceAll(Pattern.quote("{{id}}"), idValue);
		
		String nameValue = inp.next();
		jsonBody = jsonBody.replaceAll(Pattern.quote("{{name}}"), nameValue);
		
		String cityValue = inp.next();
		jsonBody = jsonBody.replaceAll(Pattern.quote("{{city}}"), cityValue);
		
		String designationValue = inp.next();
		jsonBody = jsonBody.replaceAll(Pattern.quote("{{designation}}"), designationValue);
		
		String streetValue = inp.next();
		jsonBody = jsonBody.replaceAll(Pattern.quote("{{street}}"), streetValue);
		
		String pinValue = inp.next();
		jsonBody = 	jsonBody.replaceAll(Pattern.quote("{{pin}}"), pinValue);
		
		Response res =
				given()
				.contentType(ContentType.JSON)
				.body(jsonBody)
				.when()
				.post("http://localhost:3000/APIStudentList");
		
		System.out.println(res.statusCode());
	}

}
