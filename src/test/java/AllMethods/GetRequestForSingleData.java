package AllMethods;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetRequestForSingleData {

	

	@Test
	public void GetRequestTest()
	{
		baseURI ="http://localhost:8080";
		when()
		.get("mall?mallid=SATYA_SHOPPINGMALL_00073")
		.then()
		
		.assertThat()
		 .body("data.mid", equalTo("SATYA_SHOPPINGMALL_00073"))
		 .statusCode(200)
		.assertThat().contentType(ContentType.JSON)
		.log().all();
	}
}
