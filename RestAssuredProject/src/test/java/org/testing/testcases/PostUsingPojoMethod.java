package org.testing.testcases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostUsingPojoMethod {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddressInformation addressDetails = new AddressInformation();
		addressDetails.setStreetDetails("Vengayam road");
		addressDetails.setPincode("412547");
		
		BaseInformation base = new BaseInformation();
		base.setIdValue("67");
		base.setFname("sdfsdfsdf");
		base.setCity("dfsdfs");
		base.setDesignation("Employee");
		base.setAddressDetails(addressDetails);
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(base)
		.when()
		.post("http://localhost:3000/APIStudentList");
		
		System.out.println(res.statusCode());
		

	}

}
