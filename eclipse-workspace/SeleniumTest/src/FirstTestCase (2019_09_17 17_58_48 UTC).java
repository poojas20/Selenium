
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.sentrifugo.com/");
		Thread.sleep(2000);
		if(Login(driver))
		{
			System.out.println("Test case is passed");
  		}
		else
		{
			System.out.println("Test case is failed");
		}
	}
	
	public static boolean Login(WebDriver d) {
		String userName="EM01";
		String password="sentrifugo";
		try {
			if(d.getTitle().contains("Open Source HRMS"))
			{
				System.out.println("Web application is opened successfully");
				
				//performing operation by storing Control in WebElement
				WebElement TxtBoxUserName=d.findElement(By.id("username"));
				TxtBoxUserName.sendKeys(userName);
				
				//Search element and perform operation
				d.findElement(By.name("password")).sendKeys(password);
				
				//Click on login button
				
				d.findElement(By.cssSelector("input[value='Log In']")).click();
				return true;
				}
			else
			{
				System.out.println("Web application is not opened");
				return false;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			return false;
		}
	}
	
	public static boolean verifyLogin(WebDriver d)
	{
		try
		{
			if(d.findElement(By.cssSelector("span[title='Super Admin']")).isDisplayed())
			{
				System.out.println("got logged in successfully");
				return true;
			}
			else
			{
				System.out.println("not logged in");
				return false;
			}
		}
			catch(Exception ex) {
				System.out.println(ex.getMessage()); 
				return false;
			}
	}

}

