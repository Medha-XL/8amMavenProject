package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "Features//login.feature",
		glue={"stepDefinition"},
		publish = true,
		monochrome = true)

public class TestRunner {
	
}


