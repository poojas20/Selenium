package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(7000);;
		String s=driver.getPageSource();
		if(s.contains("sign in")) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		//System.out.println(s);
		
		

	}

}
