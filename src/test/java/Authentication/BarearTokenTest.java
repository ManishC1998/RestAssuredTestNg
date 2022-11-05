package Authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import io.restassured.http.ContentType;

public class BarearTokenTest extends BaseClass {

	
	@Test
	public void BarearTokenTest()
	{
		baseURI ="https://api.github.com";
		JSONObject obj =new JSONObject();
		obj.put("name", "CG");
		
		
		given().auth().oauth2( "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" )
		.body(obj).contentType(ContentType.JSON);
		
		when().post("/user/repos")
		.then().log().all();
		
	}
}
