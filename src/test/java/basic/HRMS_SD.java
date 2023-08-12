package basic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMS_SD {
	@Given("Login with admin user")
	public void login_with_admin_user() {
	    System.out.println("Admin User");
	}
	@When("Go to PIM TAB")
	public void go_to_PIM_TAB() {
	    System.out.println("Pim TAB");
	}

	@When("hit add employee section")
	public void hit_add_employee_section() {
	    System.out.println("Employee section");
	}

	@When("enter user details")
	public void enter_user_details() {
	   System.out.println("Enter user details");
	}

	@When("hit save button")
	public void hit_save_button() {
	   System.out.println("save button");
	}

	@When("search the user")
	public void search_the_user() {
	   System.out.println("Search the User");
	}

	@Then("validate user getting searched")
	public void validate_user_getting_searched() {
	    System.out.println("getting searched");
	}

	@When("Go to PIM Tab")
	public void go_to_pim_tab() {
	   System.out.println("pim tab");
	}

	@Then("validate user not getting searched")
	public void validate_user_not_getting_searched() {
	    System.out.println(" not getting searched");
	}

}
