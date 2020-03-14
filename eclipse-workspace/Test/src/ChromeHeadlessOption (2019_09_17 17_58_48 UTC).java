import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadlessOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions cOpt= new ChromeOptions();
		cOpt.setHeadless(true);
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(cOpt);
		driver.get("http://opensource.demo.orangehrmlive.com");
		System.out.println("URL opened");
		driver.quit();
	}

}
