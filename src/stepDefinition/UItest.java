package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.demo.common.BaseTestCase;
import com.demo.pages.ClassAttributePage;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UItest{

	@Before("@E2E")
	public void beforeMethod() {
		System.out.println("Inside beforeMethod");
	}
	
	@After("@E2E")
	public void afterMethod() {
		System.out.println("Inside afterMethod");

	}

	BaseTestCase baseTestCase = new BaseTestCase();	

	@Given("^Chrome opened and hit URL$")
	public void chrome_opened_and_hit_URL() throws Throwable {
		ClassAttributePage classAttributePage = new ClassAttributePage(baseTestCase.driver);
		classAttributePage.invoke();
	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
		baseTestCase.tearDown();
		
	}

	@Given("^Chrome opened and hit URL \"([^\"]*)\"$")
	public void chrome_opened_and_hit_URL(String arg1) throws Throwable {

		BaseTestCase baseTestCase = new BaseTestCase();
		baseTestCase.openURL(arg1);
		System.out.println("------->e2e");

	}

	@Given("^Chrome opened and hit URLs$")
	public void chrome_opened_and_hit_URLs(DataTable arg1) throws Throwable {
		List<List<String>> data = arg1.raw();
		System.out.println("--------------->"+data.get(0).get(0));
		System.out.println("--------------->"+data.get(1).get(0));
	}

	@Given("^Chrome opened and hit URL using map$")
	public void chrome_opened_and_hit_URL_using_map(DataTable arg1) throws Throwable {
		List<Map<String,String>> data = arg1.asMaps(String.class,String.class);
		System.out.println("---->"+data.get(0).get("URL"));
		data.get(0).get("URL");
	}
}
