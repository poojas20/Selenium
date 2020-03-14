import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		//Maximize the window
		
		driver.manage().window().maximize();
		
		//Get the title of the window
		
		String page_Title=driver.getTitle();
		System.out.println(page_Title);
		
		//Get the URL of the page
		String page_URL=driver.getCurrentUrl();
		System.out.println(page_URL);
		
		
		
		
	}
}
