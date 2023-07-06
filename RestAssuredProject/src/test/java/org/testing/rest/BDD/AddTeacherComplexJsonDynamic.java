package org.testing.rest.BDD;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AddTeacherComplexJsonDynamic {
	
	String base = "http://localhost:3000";
	
	@Test
	public void addT() throws FileNotFoundException {
		
		File f = new File("../RestAssuredProject/ComplexJsonTeacherDynamic.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt1 = new JSONTokener(fr);
		JSONObject j = new JSONObject(jt1);
		
		Scanner s = new Scanner(System.in);
		String idValue;
		System.out.println("Please in the ID: ");
		idValue = s.nextLine();
		
		String teachName;
		System.out.println("Please enter the name of teacher : ");
		teachName = s.nextLine();
		
		String bodyData = j.toString();
		System.out.println(bodyData);
		bodyData = bodyData.replaceAll(Pattern.quote("{{id}}"), idValue);
		bodyData=bodyData.replaceAll(Pattern.quote("{{name}}"), teachName);
		
		Response res = 
				given()
					.baseUri(base)
					.contentType(ContentType.JSON)
					.body(bodyData)
				.when()
					.post("/TeachersList");
		System.out.println(res.statusCode());
		System.out.println(res.asPrettyString());
		
		
		
	}

}
