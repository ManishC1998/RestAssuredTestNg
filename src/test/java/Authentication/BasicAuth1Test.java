package Authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class BasicAuth1Test {
	
	@Test
	public void DigestiveTest()
	{
		baseURI ="https://github.com/";
		given().auth().preemptive().basic( "ManishC1998","Manish@7030869868" );
		when().get("/login")
		.then().log().all();
		
	}
}
