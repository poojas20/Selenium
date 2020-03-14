import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.get("http://newtours.demoaut.com/");
		Thread.sleep(5000);
		d1.findElement(By.name("userName")).sendKeys("mercury");
		d1.findElement(By.name("password")).sendKeys("mercury");
		d1.findElement(By.name("login")).click();
		Thread.sleep(1000);
		
		String NewWindow=Keys.chord(Keys.SHIFT, Keys.RETURN);
		String NewTAB=Keys.chord(Keys.CONTROL, Keys.RETURN);
		String TABSwitch=Keys.chord(Keys.CONTROL, Keys.TAB);
		
		d1.findElement(By.linkText("Hotels")).sendKeys(NewTAB);
		Thread.sleep(1000);
		d1.findElement(By.linkText("Flights")).sendKeys(NewWindow);
		System.out.println("Tab opened");
		Thread.sleep(4000);
		
		ArrayList<String>Win=new ArrayList<>(d1.getWindowHandles());
				System.out.println(Win.size());
				d1.switchTo().window(Win.get(1));
				d1.get("https://www.facebook.com");
				System.out.println(d1.getTitle());
				d1.switchTo().window(Win.get(2));
				d1.get("https://www.yahoo.com");
				System.out.println(d1.getTitle());
	}

}
