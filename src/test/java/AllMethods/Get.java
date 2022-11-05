package AllMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Get 
{
	@Test
	public void GetRequestTest()
	{
		baseURI ="http://localhost:8080";
		when()
		.get("/allmall")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		
		
	}

}
