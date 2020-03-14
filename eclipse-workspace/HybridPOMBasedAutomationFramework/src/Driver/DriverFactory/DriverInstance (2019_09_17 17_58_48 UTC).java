package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import org.openqa.selenium.remote.DesiredCapabilities;

import PublicStaticData.CommonSharedData;
import PublicStaticData.DriverPaths;

public class DriverInstance {
	public static WebDriver driver;
	public DriverInstance(String BrowserName)
	{
		switch(BrowserName.toUpperCase())
		{
		case "CHROME":
			createChromeDriver();
			break;
		case "FIREFOX":
			createfirefoxDriver();
			break;
		case "IE":
			createIEDriver();
			break;
		default:
			createChromeDriver();
			break;
		}
	}
	
	private void createChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver",DriverPaths.ChromeDriverPath );
        driver = new ChromeDriver();
        driver.get(CommonSharedData.AppURL);
	}
	
	private void createfirefoxDriver()
	{
		System.setProperty("webdriver.gecko.driver",DriverPaths.FireFoxDriverPath );
		driver=new FirefoxDriver();
		driver.get(CommonSharedData.AppURL);
	} 
	
	private void createIEDriver()
	{
		System.setProperty("webdriver.ie.driver",DriverPaths.IEDriverPath);
    	DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		cap.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
		cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		cap.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, CommonSharedData.AppURL);
		InternetExplorerOptions ieOptions = new InternetExplorerOptions(cap);
		driver = new InternetExplorerDriver(ieOptions);
	} 
}
