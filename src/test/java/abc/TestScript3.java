package abc;

import java.util.HashMap;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestScript3 {

	@Test
	public void createUser() {
		given()
		.contentType("application/json")
		.body("{\r\n"
				+ "    \"name\": \"prab\",\r\n"
				+ "    \"job\": \"Solider\"\r\n"
				+ "}")
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then()
		.statusCode(201)
		.log().all();		
	}
	
	@Test
	public void getUser()
	{
		given()
		
		.when()
	     .get("https://reqres.in/api/users?page=2")
		
		.then()
		.statusCode(200)
		.body("page",equalTo(2))
		.log().all();
		
	}
	
	@Test
	public void updateUser()
	{
	HashMap hm=new HashMap();
	hm.put("name","morpheus");
	hm.put("job","zion resident");
		
	given()
	.contentType("application/json")
	.body(hm)
		
	    .when()
		.put("https://reqres.in/api/users/2")
		
		.then()
		.statusCode(200)
	    .log().all();
		
	}
	
	@Test
	public void deleteUser(){
		given()
		
		.when()
		.delete()
		
		.then();		
	}
}

