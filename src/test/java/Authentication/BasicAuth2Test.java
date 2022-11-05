package Authentication;

import org.testng.annotations.Test;

import BaseClass.BaseClass;

import static io.restassured.RestAssured.*;
public class BasicAuth2Test extends BaseClass {
@Test

	
	public void DigestiveTest()
	{
		baseURI ="https://github.com/";
		given().auth().preemptive().basic( "ManishC1998","Manish@7030869868" );
		when().get("/login")
		.then().log().all();
		
	}
	  
}
