import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class TwoDrivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		//Maximize the window
		
		driver.manage().window().maximize();
		
		//Get the title of the window
		
		String page_Title=driver.getTitle();
		System.out.println(page_Title);
		
		WebDriver driver_other=new ChromeDriver();
		driver_other.get("http://www.Facebook.com");
		
		//Maximize the window
		
		driver.manage().window().maximize();
		
		//get page title
		
		String page_title1=driver_other.getTitle();
		System.out.println(page_title1);
		
		
		
	
		
	}

}
