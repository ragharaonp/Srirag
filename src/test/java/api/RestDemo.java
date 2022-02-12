package api;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestDemo {
	
	static RequestSpecification rSpec;
	
	@BeforeClass
	public static void init() {
		rSpec = RestAssured.given()
				.baseUri("https://reqres.in/")
				.basePath("api/users")
				.queryParam("page", 2);
	}
	
	@Test
	public static void execute() {
		Response res = rSpec
				//.spec(rSpec)
				.accept("application/json")
				.get();
		System.out.println(res.asString());
		
		LinkedHashMap<Object, Object> map = res.jsonPath().get("$");
		System.out.println(map);
		System.out.println(map.get("data"));
		
		ArrayList<Object> arr = (ArrayList<Object>) map.get("data");
		System.out.println(arr);
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Virender"); // Cast
		requestParams.put("LastName", "Singh");
		
		rSpec.body(requestParams.toJSONString());
		res = rSpec.post("/register");
		
		File jsonDataInFile = new File("src/test/resources/Payloads/AuthPayload.json");
		rSpec.body(jsonDataInFile);
		res = rSpec.post();
		
	}
}
