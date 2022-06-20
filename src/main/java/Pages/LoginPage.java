package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.DriverManager;
import Utility.Util;

public class LoginPage extends DriverManager {

	@FindBy(xpath = "//*[@name='email']")
	WebElement email;

	@FindBy(xpath = "//*[@name='password']")
	WebElement password;

	@FindBy(xpath = "//*[starts-with(text(),'Login')]")
	WebElement login;

	@FindBy(xpath = "//*[starts-with(text(),'Forgot your password')]")
	WebElement forgotPassword;
	
	public LoginPage() {
		PageFactory.initElements(webDriver.get(), this);
	}

	public DashboardPage Login(String eMail, String passWord) {
		Util.sendText(email, eMail);
		Util.sendText(password, passWord);
		Util.click(login);
		return new DashboardPage();
	}

	public void clickOnForgotPassword() {
		Util.click(forgotPassword);
	}
}