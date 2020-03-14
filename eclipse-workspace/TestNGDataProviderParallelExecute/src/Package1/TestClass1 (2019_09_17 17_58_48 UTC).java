package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass1 {
  @Test
  public void f() {
	  
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.get("https://opensource-demo.orangehrmlive.com/");
			
		}
  @Test
  public void f1() {
	  System.out.println("test1");
  }
  
}
