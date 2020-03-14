package Package1;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GetDriver {
	public WebDriver getDriver(String BrowserName)
	{
		WebDriver driver;
		switch(BrowserName.toUpperCase()) 
		{
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
			
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium\\geckodriver.exe");
			 DesiredCapabilities capabilities = new DesiredCapabilities(); //this if for firefox browser
			 capabilities = DesiredCapabilities.firefox();
			 capabilities.setBrowserName("firefox");
			 capabilities.setVersion("your firefox version");
			 capabilities.setPlatform(Platform.WINDOWS);
			 capabilities.setCapability("marionette", false);
			 driver=new FirefoxDriver(capabilities);
			
		default:
				System.out.println("no matching case: Browser name is not there");
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				break;
		}
		return driver;
		
		
	}

}
