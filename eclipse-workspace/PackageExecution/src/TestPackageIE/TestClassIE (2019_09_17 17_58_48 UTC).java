package TestPackageIE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import CommonLibrary.CommonLibraryCase;

public class TestClassIE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String LoginID="poojashitole96@gmail.com";
		String LoginPassword="pvsoddodd20";
		String AppURL="http://mail.google.com/";
		
		CommonLibraryCase LoginLib=new CommonLibraryCase();
		//String AppURL=https://accounts.google.com/Login/identifier?flowName=
		
		System.setProperty("webdriver.ie.driver","C:\\Program Files\\Selenium\\IEDriver\\IEDriverServer.exe");
		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
		
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		cap.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
		cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
		//cap.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL,AppURL);
		InternetExplorerOptions ieOpt=new InternetExplorerOptions(cap);
		WebDriver driver=new InternetExplorerDriver(ieOpt);
		//driver=new FirefoxDriver();
		driver.get(AppURL);
		Thread.sleep(5000);
		LoginLib.CheckAccountPage(driver, LoginID);
		if(LoginLib.Login_Gmail(driver, LoginID, LoginPassword))
		{
			Thread.sleep(10000);
			if(LoginLib.VerifyLoginSuccessfull(driver, LoginID))
			{
			System.out.println("Test is passed");
			LoginLib.Logout_Gmail(driver);
			driver.quit();
		}
		else
		{
			System.out.println("Failed:Verify Login failed");
		}
	}
	else
	{
		System.out.println("Failed:Login operation is not successfull");
	}
	
}
}


