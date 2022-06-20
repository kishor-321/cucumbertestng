package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.DriverManager;
import Utility.Util;

public class PreLoginPage extends DriverManager {

	@FindBy(xpath = "//*[contains(text(),'Log In')]")
	WebElement LoginButton;

	public PreLoginPage() {
		PageFactory.initElements(webDriver.get(), this);
	}

	public LoginPage clickOnLoginButton() {
		Util.click(LoginButton);
		return new LoginPage();
	}
}
