import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestSeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeoptions=new ChromeOptions();
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.225.206:6878/wd/hub"),chromeoptions);
		
		driver.get("http://opensource.demo.orangehrmlive.com");
		System.out.println("URL opened");

	}

}
