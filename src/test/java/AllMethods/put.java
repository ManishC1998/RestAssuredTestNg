package AllMethods;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojo.Post;
import pojo.Put;

public class put {
@Test

public void post()
{
	baseURI ="http://localhost:8080/";
	 Put det=new Put("Shopping", "Jalgoan", "jalgoan", 3, 4);
	 given().body(det)
	 .contentType(ContentType.JSON)
	 .when()
	 .put("mall?id=SATYA_SHOPPINGMALL_00059")
	 .then()
	 .assertThat()
	 .statusCode(200)
	 //.body("message")
	 .contentType(ContentType.JSON)
	 .log().all();
	 
	
}
}
