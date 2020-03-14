package usingTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestingTestNG4 {
	public static WebDriver driver;
	
  @Test
  public void login() {
	  
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
  }
  
  @BeforeClass
  public void beforeClass()  {
	 
	  System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//Thread.sleep(3000); 
		
  }

  @AfterClass
  public void afterClass() {
	 // driver.close();
	 // System.out.println("executed");
  }

}
