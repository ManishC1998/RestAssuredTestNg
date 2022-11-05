package AllMethods;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.http.ContentType;
import pojo.Post;
@Test
public class PostObj {

	
	public void Postrequest()
	{
		
		baseURI ="http://localhost:8080";
		JSONObject JS=new JSONObject();
		JS.put("mAbout","manish");
		JS.put("mArea","qspider");
		JS.put("mName","manu");
		JS.put("mPin",23);
		JS.put("mid","2");
		
		 given().body(JS)
		 .contentType(ContentType.JSON)
		 .when()
		 .post("/mall")
		 .then()
		 .assertThat()
	     .body("data.mid", equalTo("2"))
		 .statusCode(200)
		 .contentType(ContentType.JSON)
		// .body("message",equals("Success"))
		 .log().all();
	}
}
