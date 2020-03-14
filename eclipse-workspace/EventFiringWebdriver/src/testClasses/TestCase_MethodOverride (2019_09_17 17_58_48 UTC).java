package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import listenerClasses.MethodOverriding_Way;

public class TestCase_MethodOverride {
	
	static EventFiringWebDriver eDriver;
	
	//@Test
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		eDriver=new EventFiringWebDriver(driver);
		MethodOverriding_Way EventListen=new MethodOverriding_Way();
		eDriver.register(EventListen);
		eDriver.get("http://newtours.demoaut.com/");
		eDriver.findElement(By.name("userName")).sendKeys("mercury");
		eDriver.findElement(By.name("password")).sendKeys("mercury");
		eDriver.findElement(By.name("login")).click();
		
		
	}

}
