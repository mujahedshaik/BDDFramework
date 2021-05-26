package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(cucumber.class)
@CucumberOptions(features="src/Features/UITest.feature",
glue= {"stepDefinition"}
		)


public class RunnerClass extends AbstractTestNGCucumberTests {
}
