package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.DriverManager;
import Utility.Util;

public class DashboardPage extends DriverManager {

	@FindBy(xpath = "")
	WebElement username;

	@FindBy(xpath = "")
	WebElement password;

	@FindBy(xpath = "")
	WebElement submit;

	public DashboardPage() {
		PageFactory.initElements(webDriver.get(), this);
	}

	public void Login(String userName, String passWord) {
		Util.sendText(username, userName);
		Util.sendText(password, passWord);
		Util.click(submit);
	}

}