package basic;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class ApplicationUp_SD {
	
	Response response;
	
	@Given("hit the url")
	public void hit_the_url() {
		response= RestAssured.get("http://demoqa.com/BookStore/v1/Books");
	}

	@Then("validate the response of application")
	public void validate_the_response_of_application() {
	 
		response.then().log().all();
	String  ActualStatusCode = ""+response.getStatusCode()+"";
	int expectedStatusCode = 200;
	
	Assert.assertEquals(expectedStatusCode,ActualStatusCode);
	}
	
	
	@Then("validate the response {string} of application")
	public void validate_the_response_of_application(String statuscode) {
	 
		response.then().log().all();
	String ActualStatusCode = ""+response.getStatusCode()+"";
	
	
	Assert.assertEquals(statuscode, ActualStatusCode);
	
	
	}



}
