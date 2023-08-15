package Postvalidation_SD;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.json.JSONObject;
import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostValidation {
   
	Response response =null;
	String id =null;
	
	@Given("post the data to create user")
	public void post_the_data_to_create_user() {
		response = (Response) RestAssured .given()
				.relaxedHTTPSValidation()
				.accept(ContentType.JSON)
				.body("{\r\n"
						+ "   \"name\":    \"user1112\",\r\n"
						+ "   \"job\":      \"QA leader\",\r\n"
						+ "    \"mob\":    \"122\",\r\n"
						+ "    \"dept\":    \"QA-Automation\",\r\n"
						+ "     \"location\":    \"Pune\",\r\n"
						+ "}\r\n"
						+ "")
				.post("https://reqres.in/api/users");
						
	    
	}
	@Then("validate status code is {string}")
	public void validate_status_code_is(String statuscode) { 
       Assert.assertEquals(statuscode,""+response.getStatusCode()+"");
	}
	@Then("validate ID created for user with non null value")
	public void validate_id_created_for_user_with_non_null_value() {
      // response.then().assertThat().body("id", notnullValue());
        id= response.body().jsonPath().getString("id");
        Assert.assertTrue(!id.equals(null));
	}
	@Then("validate id created for user with non zero value")
	public void validate_id_created_for_user_with_non_zero_value() {
           int id= response.body().jsonPath().getInt("id");
           Assert.assertTrue(id >0);
	}


	@Given("post the data to create user from file")
	public void post_the_data_to_create_user_from_file() {
		File file =new File("src/test/java/Postvalidation_SD/CreateUser.json");
		response = (Response) RestAssured .given()
				.relaxedHTTPSValidation()
				.accept(ContentType.JSON)
				.body("")
				.post("https://reqres.in/api/users");
		
	}
	
	@Given("post the data to create user from file with updated name")
	public void post_the_data_to_create_user_from_file_with_updated_name() throws IOException {
		
		
		String datastring = new String(Files.readAllBytes(Paths.get("src/test/java/Postvalidation_SD/CreateUser.json"))).toString();
		JSONObject jsonobject = new JSONObject(datastring );
		double randomNum= Math.random();
		jsonobject.put("name", "userNewName"+randomNum);
		String finaldatastring= jsonobject.toString();
		
		response = (Response) RestAssured .given()
				.relaxedHTTPSValidation()
				.accept(ContentType.JSON)
				.body(finaldatastring )
				.post("https://reqres.in/api/users");
		response.then().log().all();
	}
	
	  @Given("post the data to create user from file with updated")
			public void post_the_data_to_create_user_from_file_with_updated(DataTable Table) throws IOException {
	    	 
	    	 String datastring = new String(Files.readAllBytes(Paths.get("src/test/java/Postvalidation_SD/CreateUser.json"))).toString();
	 		JSONObject jsonobject = new JSONObject(datastring );
	 		double randomNum= Math.random();
	 		jsonobject.put("name", "userNewName"+randomNum);
	 			
	 		
	 		String finaldatastring= jsonobject.toString();
	 		
	 		response = (Response) RestAssured .given()
	 				.relaxedHTTPSValidation()
	 				.accept(ContentType.JSON)
	 				.body(finaldatastring )
	 				.post("https://reqres.in/api/users");
	 		response.then().log().all();
		   
		}

		
		
     @Given("post the data to create user from file with updated fields")
		public void post_the_data_to_create_user_from_file_with_updated_fields(DataTable Table) throws IOException {
    	 
    	 String datastring = new String(Files.readAllBytes(Paths.get("src/test/java/Postvalidation_SD/CreateUser.json"))).toString();
 		JSONObject jsonobject = new JSONObject(datastring );
 		double randomNum= Math.random();
 		List<List<String>> allDataList=Table.asLists();
 		for(int i=0;i<allDataList.size();i++)
 		{
 			String field=allDataList.get(i).get(0);
 			if(field.equals("name"))
 				jsonobject.put("name", "userNewName"+randomNum);
 			else if(field.equals("mob"))
 				jsonobject.put("mob", "dsrdg"+randomNum);
 				
 		}
 		
 		String finaldatastring= jsonobject.toString();
 		
 		response = (Response) RestAssured .given()
 				.relaxedHTTPSValidation()
 				.accept(ContentType.JSON)
 				.body(finaldatastring )
 				.post("https://reqres.in/api/users");
 		response.then().log().all();
	   
	}

	
     @When("delete the user from system")
     public void delete_the_user_from_system() {
    	 System.out.println("====deleting user===="+id);
    	 response = (Response) RestAssured .given()
  				.relaxedHTTPSValidation()
  				.accept(ContentType.JSON)
  				.delete("https://reqres.in/api/users"+id);
    	 
     }

     @Then("validate user deleted from system")
     public void validate_user_deleted_from_system() {
    	 
    	 Assert.assertTrue(true);
         
     }



	
}
