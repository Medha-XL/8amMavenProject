package stepDefinition;

import commonMethods.BaseMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginModule {
	
	BaseMethods base;
	String url = "http://orangehrm.qedgetech.com/webapp/login.php";
	
	@Given("Open Browser and Launch the Application")
	public void open_browser_and_launch_the_application() {
       base = new BaseMethods();
       
       base.openBrowser("chrome");
       base.launchERP(url);
	}
	@When("Enter valid credentials and click on Login")
	public void enter_valid_credentials_and_click_on_login() {
        base.loginERP("admin", "master");
	}
	@Then("ERP Home page should display")
	public void erp_home_page_should_display() {
       System.out.println("Dummy Method");
	}


}
