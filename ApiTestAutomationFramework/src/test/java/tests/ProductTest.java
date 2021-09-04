package tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import request.RequestFactory;

public class ProductTest extends BaseTest {
	
	
	
	
	@Test
	public void verifyGetRequest() {
		
		extentReport.creteTestcase("Verify Get Product");
		
		Response valResponse = requestFactory.getAllProducts();
		extentReport.addLog(Status.INFO, valResponse.asPrettyString());
		valResponse.then().statusCode(201);
	}
	
	@Test
	public void verifyAddProduct() {
		
		extentReport.creteTestcase("Verify Add Product");
		String requestPayload = "{\n"
				+ "  \"name\": \"Samsung Mobile\",\n"
				+ "  \"type\": \"Mobile\",\n"
				+ "  \"price\": 100,\n"
				+ "  \"shipping\": 10,\n"
				+ "  \"upc\": \"string\",\n"
				+ "  \"description\": \"string\",\n"
				+ "  \"manufacturer\": \"string\",\n"
				+ "  \"model\": \"string\",\n"
				+ "  \"url\": \"string\",\n"
				+ "  \"image\": \"string\"\n"
				+ "}";
		
		requestFactory.addProducts(requestPayload).then().log().all().statusCode(404);
		
		
	}
	
	
	@Test
	public void verifyAddProductWithRequestPayloadAsMap() {
		
		extentReport.creteTestcase("Verify Add Product with request payload as map");
		Map<String, Object> requestPayload = new HashMap<>();
		
		requestPayload.put("name", "Samsung Mobile");
		requestPayload.put("type", "Mobile");
		requestPayload.put("price", 100);
		requestPayload.put("shipping",10);
		requestPayload.put("upc", "string");
		requestPayload.put("description", "string");
		requestPayload.put("manufacturer", "string");
		requestPayload.put("model", "string");
		requestPayload.put("url", "string");
		requestPayload.put("image", "string");
		
		requestFactory.addProducts(requestPayload).then().log().all().statusCode(404);
		
		
	}

	@Test
	public void  verifyEndToEndCallFlow() {
		//1
Map<String, Object> requestPayload = new HashMap<>();
		
		requestPayload.put("name", "Samsung Mobile");
		requestPayload.put("type", "Mobile");
		requestPayload.put("price", 100);
		requestPayload.put("shipping",10);
		requestPayload.put("upc", "string");
		requestPayload.put("description", "string");
		requestPayload.put("manufacturer", "string");
		requestPayload.put("model", "string");
		requestPayload.put("url", "string");
		requestPayload.put("image", "string");
		
		Response response= requestFactory.addProducts(requestPayload);
		
		response.then().log().all().statusCode(404);
		
		
		//Get ID
		
		
	}
}
