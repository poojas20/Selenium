 import java.sql.Driver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import commonLibrary.commonTest;

public class BookFilghtMain {

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.makemytrip.com");
		Thread.sleep(7000);
		driver.manage().window().maximize();
			
		SelectLocation sl=new SelectLocation();
		sl.FromToLocation(driver);
		
		FlightAftrTwoMonths flightDate=new FlightAftrTwoMonths();
		flightDate.selectdate(driver);
		flightDate.getCurrentDay();
		
		driver.quit();
	}
	
}
 