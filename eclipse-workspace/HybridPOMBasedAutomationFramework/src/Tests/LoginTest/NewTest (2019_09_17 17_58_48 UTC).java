package LoginTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import AppPageClasses.LoginPage;
import DriverFactory.DriverInstance;
import PublicStaticData.CommonSharedData;

public class NewTest {
  @Test
  public void LoginTest() {
	  
	  LoginPage login = new LoginPage(DriverInstance.driver);
	  try
	  {
		  Assert.assertTrue(login.Login(CommonSharedData.TestData.get("UserName"), CommonSharedData.TestData.get("Password")));
		  Reporter.log("Login test is Passed");
	  }
	  catch(AssertionError e)
	  {
		  Assert.fail(e.getStackTrace()[0].toString());
	  }
  }
}
