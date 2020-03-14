package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
	@FindBy(how=How.ID, using="txtUsername")
	private WebElement TxtBoxUserName;
	@FindBy(id="txtPassword")
	private WebElement TxtBoxPassword;
	
	@FindBy(how=How.ID, using="btnLogin")
	private WebElement BtnLogin;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Login(String UserName, String Password)
	{
		try {
			TxtBoxUserName.sendKeys(UserName);
			TxtBoxPassword.sendKeys(Password);
			BtnLogin.click();
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
}
