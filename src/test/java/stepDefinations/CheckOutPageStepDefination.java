package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;

import pageObjects.CheckoutPage;

import utils.TestContextSetUp;

public class CheckOutPageStepDefination {
	public WebDriver driver;
	public String landingPageProductName;
	public CheckoutPage checkoutPage;
	TestContextSetUp testContextSetup;

	public CheckOutPageStepDefination(TestContextSetUp testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
	}

	@Then("verify user has ability to enter promo code and place order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_order() {

		Assert.assertTrue(checkoutPage.VerifyPlanOrder());
		Assert.assertTrue(checkoutPage.VerifyPromoBtn());
	}

	@Then("^User proceed to Checkout and validate the (.+) items in checkout page")
	public void user_proceed_to_checkout_and_validate_the_tom_items_in_checkout_page(String name) throws InterruptedException {
		checkoutPage.CheckoutItems();
		Thread.sleep(2000);
	}

}
