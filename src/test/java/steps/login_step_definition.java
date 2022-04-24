package steps;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TestBase;
import pages.LoginPage;

public class login_step_definition extends TestBase{

	LoginPage loginpage;
	String username = "demo@techfios.com";
	String password = "abc123";
	

	@Before
	public void BeforeRun() {
		initDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);

	}

	@Given("^user is on Techfios login page$")
	public void user_is_on_Techfios_login_page() {

		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}
	
	@When("^User enters password$")
	public void user_enters_password()  {
		loginpage.InsertPassword(password);
	}

	@When("^User enters username$")
	public void user_enters_username() {
		loginpage.InsertUsername(username);
	}

	@When("^User clicks on Signin button$")
	public void user_clicks_on_Signin_button()  {
		loginpage.ClickSigninButton();
	}

	@Then("^User should land on Dashb oard page$")
	public void user_should_land_on_Dashb_oard_page() {
		String expectedtext = "Dashboard- iBilling";
		String actualtext = driver.getTitle();
		Assert.assertEquals(expectedtext, actualtext);
	}

//	@When("^User enters username as \"([^\"]*)\"$")
//	public void user_enters_username_as(String username) {
//
//		loginpage.InsertUsername(username);
//	}
//
//	@When("^User enters password as \"([^\"]*)\"$")
//	public void user_enters_password_as(String password) {
//		loginpage = PageFactory.initElements(driver, LoginPage.class);
//		loginpage.InsertPassword(password);
//	}
//
//	@And("^User clicks on Signin button$")
//	public void user_clicks_on_Signin_button() {
//		loginpage.ClickSigninButton();
//	}
//
//	@Then("^User should land on Dashb oard page$")
//	public void user_should_land_on_Dashb_oard_page() throws IOException {
//		String expectedtext = "Dashboard- iBilling";
//		String actualtext = driver.getTitle();
//		Assert.assertEquals(expectedtext, actualtext);
////		TakeScreenShot(driver);
//		
//	}
//
//	@After
//	public void TearDown() {
//		driver.close();
//		driver.quit();
//	}
}
