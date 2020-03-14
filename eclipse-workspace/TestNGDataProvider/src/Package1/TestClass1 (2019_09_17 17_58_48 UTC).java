package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass1 {
  @Parameters({"username_ORHRM","password_ORHRM","URL_ORHRM"})
	@Test
  public void f(String Uname,String Passwd,String URL) {
	  
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get(URL);
		d.findElement(By.id("txtUsername")).sendKeys(Uname);
		d.findElement(By.id("txtPassword")).sendKeys(Passwd);
		d.findElement(By.id("btnLogin")).click();
	}
  
}
