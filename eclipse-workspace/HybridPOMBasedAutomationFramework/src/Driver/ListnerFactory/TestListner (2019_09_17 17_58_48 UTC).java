package ListnerFactory;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import DriverFactory.DriverInstance;

public class TestListner implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		new DriverInstance(context.getCurrentXmlTest().getParameter("BrowserName"));
	}

	@Override
	public void onFinish(ITestContext context) {
		
			if(DriverInstance.driver!=null)
			{
				DriverInstance.driver.quit();
			}
	}

}
