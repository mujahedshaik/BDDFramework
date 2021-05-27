package Runner;

import org.testng.annotations.Listeners;

import com.demo.Listener.TestListerner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Listeners(TestListerner.class)
//@RunWith(cucumber.class)
@CucumberOptions(features="src/Features/UITest.feature",
glue= {"stepDefinition"},tags = "@E2E"

		)


public class RunnerClass extends AbstractTestNGCucumberTests {
}
