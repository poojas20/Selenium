package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoutTest {
	WebDriver driver;
	
	@Given("^Application should be logged in$")
	public void LogIn() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.sentrifugo.com/");
		driver.findElement(By.id("username")).sendKeys("EM01");
		driver.findElement(By.id("password")).sendKeys("sentrifugo");
		driver.findElement(By.id("loginsubmit")).click();
	}
	
	@When("^Click on UserName and select Logout option$")
	public void Logout() {
		driver.findElement(By.xpath("//a[@id='logoutbutton']")).click();
		driver.findElement(By.xpath("//a[@href='http://demo.sentrifugo.com/index.php/index/logout']")).click();
	}
	
	@Then("^User should be logged out$")
	public void VerifyLogout() {
		System.out.println("user is logged out");
	}

}
