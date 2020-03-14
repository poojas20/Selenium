package Package1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass {
	
	GetDriver dr=new GetDriver();
	WebDriver driver;
	@Parameters({"URL","UserName","Pass","Browser"})
  @Test
  public void f(String URL,String UserName,String Pass,String Browser) {
		driver=dr.getDriver(Browser);
		driver.get(URL);
		System.out.println(UserName);
		System.out.println(Pass);
  }
}
