package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = {"src/test/resources/OrganeHRMLogin/login.feature"}, glue = {"Definition"})

public class testRunner extends AbstractTestNGCucumberTests{
	

}
