package stepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetUp;

public class LandingPageStepDefination {
	public WebDriver driver;
	public String landingPageProductName;
	TestContextSetUp testContextSetup;

	public LandingPageStepDefination(TestContextSetUp testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Given("user is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {

	}

	@When("user searched with Shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_anme_of_product(String shortName)
			throws InterruptedException {
		LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		landingPage.searchItem(shortName);
		Thread.sleep(2000);
		testContextSetup.landingPageProductName = landingPage.getProductName().split("-")[0].trim();
		System.out.println("productName: " + landingPageProductName);
	}

}
