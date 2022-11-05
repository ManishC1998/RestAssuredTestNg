package Authentication;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
public class BasicPostAuth1 {

	
	public static void main(String[] args) {
		baseURI ="https://api.github.com/";
		JSONObject obj=new JSONObject();
		obj.put("name","BasicAuth");
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
        		
		
	}
}
