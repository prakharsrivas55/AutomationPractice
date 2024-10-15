package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		// plugin = { "com.epam.reportportal.cucumber.ScenarioReporter","rerun:target/rerun.txt" },
		features = "classpath:features",
		glue = "steps",
		publish = true
 		// tags = "@Testcase9"
		)

public class Runner extends AbstractTestNGCucumberTests{

	
}
