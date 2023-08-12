package Getwithdatatable;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetwithDatatable_SD {
	

    Response response; 
    
    @Given("hit the uri")
	public void hit_the_uri() {
		response= RestAssured.get("http://demoqa.com/BookStore/v1/Books");
		System.out.println("got the response");
	}
	
	@Then("validate value for below table")
	public void validate_value_for_below_table(io.cucumber.datatable.DataTable dataTable) {
	   
		List<List<String>> allData= dataTable.asLists();
		String singlevalueString= allData.get(0).get(0);
		System.out.println("===="+singlevalueString);
		
		String secondvalueString= allData.get(0).get(1);
		System.out.println("===="+secondvalueString);
		
		for(int i=0; i<allData.size(); i++)
		{
			String actualTitle= response.getBody().jsonPath().getString(allData.get(i).get(0));
			Assert.assertTrue(actualTitle.equals(allData.get(i).get(1)));
		}
		
	}


}
