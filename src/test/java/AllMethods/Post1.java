package AllMethods;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import io.restassured.http.ContentType;
import pojo.Post;

import static  io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
public class Post1  extends BaseClass
{
	@Test
	public void post()
	{
		baseURI ="http://localhost:8080";
		 Post det=new Post("Leader", "Dhule", "Pune", 2, 4);
		 given().body(det)
		 .contentType(ContentType.JSON)
		 .when()
		 .post("/mall")
		 .then()
		 .assertThat()
		 .statusCode(200)
		 .contentType(ContentType.JSON)
		  .body("data.mid", equalTo("4"))
		 .log().all();
		 
		 
		
	}

}

//"mAbout": "Cricket lover",
//"mArea": "pune",
//"mName": "sonu",
//"mPin": 1,
//"mid": "12"