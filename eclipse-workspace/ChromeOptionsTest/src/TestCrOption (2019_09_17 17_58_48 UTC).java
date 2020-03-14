import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCrOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions cOpt= new ChromeOptions();
		cOpt.addArguments("start-maximized");
		cOpt.addArguments("disable-infobars");  //to disable info bar
		cOpt.addExtensions(new File("D:\\Selenium\\extension_1_5_9_0.crx"));
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(cOpt);
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		JavascriptExecutor je=(JavascriptExecutor)driver;
		WebElement TxtBoxUserName=(WebElement)je.executeScript("return document.getElementById('txtUsername')");
		TxtBoxUserName.sendKeys("Admin");

	}

}
