package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Demo3 {
	
	int a, b, result;
	
	@Given("Read {int} and {int}")
	public void read_and(int num1, int num2) {
	   a = num1;
	   b = num2;
	}
	@When("Calculate a+b")
	public void calculate_a_b() {
	   result = a+b;
	}
	@Then("Display the {int}")
	public void display_the_results(int expResult) {
	   System.out.println("The Result is: " + result);
	   Assert.assertEquals(expResult, result);
	}
	@When("Calculate a*b")
	public void multiply_a_b() {
		result = a*b;
	}

}
