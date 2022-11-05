package AllMethods;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class DeleteRequest {

	

	@Test
	public void DeleteRequestTest()
	{
		baseURI ="http://localhost:8080";
		when()
		.delete("/mall?mallid=SATYA_SHOPPINGMALL_00070")
		.then()
		.assertThat().statusCode(200)
		.statusLine("HTTP/1.1 200 ")
		.log().all();
	}
}
