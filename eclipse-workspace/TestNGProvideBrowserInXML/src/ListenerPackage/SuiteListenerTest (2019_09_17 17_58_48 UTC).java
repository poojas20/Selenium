package ListenerPackage;

import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;

import Package1.GetDriver;

public class SuiteListenerTest implements ISuiteListener {
public static WebDriver driver;
	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		 driver=new GetDriver().getDriver(suite.getParameter("BrowserName"));
	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		driver.quit();
	}
	

	

}
