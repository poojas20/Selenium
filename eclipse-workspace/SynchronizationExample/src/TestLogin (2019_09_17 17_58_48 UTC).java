import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		//Explicit wait
		WebDriverWait wait= new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.titleContains("OrangeHRM"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername"))).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		if(wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Welcome Admin"))).isDisplayed())
		{
			System.out.println("Test is passed");
		
		}
		else
		{
			System.out.println("Test is failed");
		}
		
	}

}
