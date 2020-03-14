package Package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TestClass2 {
  @SuppressWarnings("deprecation")
@Test
  public void f() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\geckodriver.exe");
		 DesiredCapabilities capabilities = new DesiredCapabilities(); //this if for firefox browser
		 capabilities = DesiredCapabilities.firefox();
		 capabilities.setBrowserName("firefox");
		 capabilities.setVersion("your firefox version");
		 capabilities.setPlatform(Platform.WINDOWS);
		 capabilities.setCapability("marionette", false);

		WebDriver d=new FirefoxDriver(capabilities);
		d.get("http://newtours.demoaut.com/");
	  
	  
  }
  @Test
  public void f2() {
	  System.out.println("test2");
  }
}
