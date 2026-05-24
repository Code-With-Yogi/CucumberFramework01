package stepDefinations;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import utils.TestContextSetUp;

public class OfferPageStepDefination {
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	TestContextSetUp testContextSetup;

	public OfferPageStepDefination(TestContextSetUp testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Then("^user serached for (.+) shortname in offers page$")
	public void user_serached_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortName)
			throws InterruptedException {
		switchToOffersPage();
		OffersPage offersPage = testContextSetup.pageObjectManager.getOffersPage();
		Thread.sleep(2000);
		offersPage.searchItem(shortName);
		Thread.sleep(2000);
		offerPageProductName = offersPage.getProductName();
	}

	public void switchToOffersPage() {

		LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		landingPage.selectTopDeals();
		testContextSetup.genericUtils.SwitchWindowToChild();

	}

	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(offerPageProductName, testContextSetup.landingPageProductName);
	}

}
