import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.sentrifugo.com/");
		
		//------------------isDisplayed------------------------
		if(driver.findElement(By.id("loginsubmit")).isDisplayed())
		{
			System.out.println("Login button is visible");
		}
		else
		{
			System.out.println("Login button is not visible");
		}
	
	if(driver.findElement(By.id("loginsubmit")).isEnabled())
	{
		System.out.println("Login button is enabled");
	}
	else
	{
		System.out.println("Login button is not enabled");
	}
	
	//-------------------------GetText------------------------------
	
	if(driver.findElement(By.id("abouttab")).getText().equals("Help"))
	{
		System.out.println("Help tex is written");
	}
	else
	{
		System.out.println("Help text is not written");
		
		
		//-----------------------------GetAttribute--------------------------------------
		
		String AttrValue=driver.findElement(By.className("logo")).getAttribute("onclick");
		System.out.println(AttrValue);
		
	}
	
	
	
	}
	

}
