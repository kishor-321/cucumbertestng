package stepDef;

import org.testng.Assert;

import Base.DriverManager;
import Pages.LoginPage;
import Pages.PreLoginPage;
import Utility.Util;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef extends DriverManager{

	@Then("^Login page is displayed$")
	public void login_page_is_displayed() throws Throwable {
		Assert.assertEquals(Util.getURL(), "https://ui.cogmento.com/");
	}

	@And("^Enter the email and password and click on submit$")
	public void enter_the_email_and_password_and_click_on_submit() throws Throwable {
		LoginPage login = new LoginPage();
		login.Login("abc", "1234");
	}
	
	@Given("^User is on the CRM website$")
	public void user_is_on_the_crm_website() throws Throwable {
		Assert.assertEquals(Util.getURL(), Util.properties("config", "Applink"));
	}

	@When("^User clicks on Login button in the pre login page$")
    public void user_clicks_on_login_button_in_the_pre_login_page() throws Throwable {
    	PreLoginPage p = new PreLoginPage();
    	p.clickOnLoginButton();
    }
	
	@Then("^Dashboard page is displayed$")
	public void dashboard_page_is_displayed() throws Throwable {

	}

}