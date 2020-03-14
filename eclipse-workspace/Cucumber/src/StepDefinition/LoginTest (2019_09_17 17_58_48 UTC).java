package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;

	@Given("^Browser Should be launched and URL should be opened$")
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.sentrifugo.com/");
	}
	
	@When("^Enter login Credentials UserName \"(.*)\" Password \"(.*)\"$")
	public void LoginOperation(String UserName,String Password) {
		driver.findElement(By.id("username")).sendKeys(UserName);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("loginsubmit")).click();
	}
	
	@Then("^User should be Login and Dashboard Page should be display$")	
	
	public void VerifyLogin() {
		try {
		String role=driver.findElement(By.xpath("//span[@id='prof_name']")).getText();
		Assert.assertTrue(role.equals("Super Admin"));
		System.out.println(role); 
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
