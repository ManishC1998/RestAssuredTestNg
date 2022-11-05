package Authentication;

import org.testng.annotations.Test;

import BaseClass.BaseClass;

import static io.restassured.RestAssured.*;
public class BasicAuthTest extends BaseClass{
	
	@Test
	
	public void Basicauthtest()
	{
		baseURI ="https://github.com/";
		given().auth().basic( "ManishC1998","Manish@7030869868" );
		when().get("/login")
		.then().log().all();
		
	}

}
