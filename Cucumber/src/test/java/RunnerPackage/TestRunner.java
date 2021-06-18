package RunnerPackage;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:Features/Login.feature", glue = {"classpath:Steps"},tags= {"@test"},dryRun=false)

public class TestRunner {

}
