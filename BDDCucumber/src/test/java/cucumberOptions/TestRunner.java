package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "src/test/java/featureLayer",
		glue = "stepDefinitions"
		)


public class TestRunner extends AbstractTestNGCucumberTests  {

}
