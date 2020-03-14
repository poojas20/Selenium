package listenerClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;


public class MethodOverriding_Way extends AbstractWebDriverEventListener {
 
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before Navigating to: '" +url+"'");
		driver.manage().window().maximize();
	}
	
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("Navigated to: '" +url+"'");
	}
	
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Trying to click on: " +driver.hashCode()+"::"+element.toString());
	}
	
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("Clicked on: "+ + driver.hashCode()+"::"+element.toString());
	}
	
	public void onException(Throwable error, WebDriver driver) {
		System.out.println("Error occured: " +error);
	}

}
