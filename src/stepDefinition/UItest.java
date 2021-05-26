package stepDefinition;

import common.BaseTestCase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class UItest {

	@Given("^Chrome opened and hit URL$")
	public void chrome_opened_and_hit_URL() throws Throwable {
		BaseTestCase baseTestCase = new BaseTestCase();
		baseTestCase.preStep();
	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
		BaseTestCase baseTestCase = new BaseTestCase();
		baseTestCase.tearDown();
	}

}
