package org.testing.rest.BDD;

import ObjectsForPojo.TeacherClassInfo;
import ObjectsForPojo.TeacherInfo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class CreateTeacherArrayPojo {
	
	String base = "http://localhost:3000";
	
	@Test
	public void createTeacherByPojoArray() {
		
		TeacherClassInfo[] teach = new TeacherClassInfo[3];
		teach[0]=new TeacherClassInfo();
		teach[0].setTopic("Accounts");
		teach[0].setYear("Year2");
		
		teach[1]=new TeacherClassInfo();
		teach[1].setTopic("Tally");
		teach[1].setYear("Year1");
		
		teach[2]=new TeacherClassInfo();
		teach[2].setTopic("Maths");
		teach[2].setYear("Year1");
		
		TeacherInfo t = new TeacherInfo();
		t.setId("76");
		t.setTeacherId("345345");
		t.setTeachername("Rathitha");
		t.setSubject("Commerce");
		t.setTeacherAddinfo(teach);
		
		Response res = 
				given()
					.baseUri(base)
					.contentType(ContentType.JSON)
					.body(t)
				.when()
					.post("/TeachersList");
				
		System.out.println(res.statusCode());
				
	}

}
