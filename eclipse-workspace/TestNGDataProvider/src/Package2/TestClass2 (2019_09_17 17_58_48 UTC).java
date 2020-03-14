package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestClass2 {
	@Parameters({"username_MER","password_MER","URL_MER"})
  @Test
  public void f(String Uname,String Passwd,String URL) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get(URL);
	    d.findElement(By.name("userName")).sendKeys(Uname);
		d.findElement(By.name("password")).sendKeys(Passwd);
		
		d.findElement(By.name("login")).click();
		System.out.println("Passed:Login Successfull");
	  
	  
  }
}
