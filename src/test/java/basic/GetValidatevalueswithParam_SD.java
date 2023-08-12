package basic;


import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetValidatevalueswithParam_SD {
	
       Response response; 
       
       @Given("hit the uri")
   	public void hit_the_uri() {
   		response= RestAssured.get("http://demoqa.com/BookStore/v1/Books");
   		System.out.println("got the response");
   	}

	 @Then("validate title {string} and pages {string} of the application")
	public void validate_title_and_pages_of_the_application(String title, String int1 ) {
	  String datastring = response.getBody().asString();
	  System.out.println("All data=="+ datastring);
		
	  String actualTitle= response.getBody().jsonPath().getString("books[0].title");
	  Assert.assertTrue(actualTitle.equals(title));
	  
//	  int pageInt = response.getBody().jsonPath().getInt("books[0].pages");
//	  String pagesString= ""+pageInt+"";
//	  Assert.assertEquals(pagesString, int1);
	  
	String page= response.getBody().jsonPath().getString("books[0].pages");
	  Assert.assertTrue(page.equals(int1));
}
       @Then("validate value for {string} is {string}")
      public void validate_value_for_is(String string, String string2) {
    	   String datastring = response.getBody().asString();
           String actualTitle= response.getBody().jsonPath().getString(string);
    		  Assert.assertTrue(actualTitle.equals(string2));
    		  
       }
    @Then("validate value for attribute {string} is {string} present the response")
      public void validate_value_for_attribute_is_present_the_response(String string, String expvalue) {
    		      
    	List<Object>allItems= response.getBody().jsonPath().getList("books."+string);
    	System.out.println("===="+allItems.toString());
    	Assert.assertTrue(allItems.contains(expvalue));
		  
    	   
    	   
    	   
    }   
       }
