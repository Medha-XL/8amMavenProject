package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo2 {
	
	String sname;
	String output;
	
	@Given("User Assign the vaule of name in String")
	public void user_assign_the_vaule_of_name_in_string() {
	    sname = "Raghav";
	}
	@When("User Reads the Name from a String")
	public void user_reads_the_name_from_a_string() {
	    output = sname;
	}
	@Then("USer displays the Name.")
	public void u_ser_displays_the_name() {
	   System.out.println("The name of string is : " + output);
	}


}
