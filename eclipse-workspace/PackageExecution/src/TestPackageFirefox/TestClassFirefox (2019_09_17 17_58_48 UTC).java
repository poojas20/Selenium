package TestPackageFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import CommonLibrary.CommonLibraryCase;

public class TestClassFirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String LoginID="poojashitole96@gmail.com";
		String LoginPassword="pvsoddodd20";
		String AppURL="http://mail.google.com/";
		
		CommonLibraryCase LoginLib=new CommonLibraryCase();
		//String AppURL=https://accounts.google.com/Login/identifier?flowName=
		
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\Selenium\\geckodriver-v0.23.0-win64.exe");
		
	
		WebDriver driver=new FirefoxDriver();
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

