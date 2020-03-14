package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import listenerClasses.InterfaceImplementation_Way;

public class TestClass_Interface {

	public static WebDriver driver;
	public static EventFiringWebDriver eDriver;
	
	//@Test
	/*public void f () {
		eDriver.get("http://opensource.demo.orangehrmliver.com/");
		eDriver.findElement(By.id("textUsername")).sendKeys("Admin");
		eDriver.findElement(By.id("txtPasswod")).sendKeys("admin");
		eDriver.findElement(By.id("btnLogin")).click();
	}*/
	
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		eDriver=new EventFiringWebDriver(driver);
		InterfaceImplementation_Way WdEventListen=new InterfaceImplementation_Way();
		eDriver.register(WdEventListen);
		
		eDriver.get("https://opensource-demo.orangehrmlive.com/");
		eDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
		eDriver.findElement(By.id("txtPassword")).sendKeys("admin123");
		eDriver.findElement(By.id("btnLogin")).click();
		
		
	}
	
	public void afterMethod() {
		
	}
	
}


