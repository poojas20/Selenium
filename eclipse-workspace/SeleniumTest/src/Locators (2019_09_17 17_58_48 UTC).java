import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String TagName;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.sentrifugo.com/");
		driver.navigate().refresh();
		
		//Maximize window
		
	driver.manage().window().maximize();
	
	//-----Find Element---------//
	
	//Finding element using ID
	
	TagName=driver.findElement(By.id("username")).getTagName();
	System.out.println("ID:" +TagName);
	
	//Finding element using name

	TagName=driver.findElement(By.id("username")).getTagName();
	System.out.println("Name:" +TagName);
	
	//Finding element using Name
	TagName=driver.findElement(By.className("demo_div_block")).getTagName();
	System.out.println("Class:" +TagName);
		
	//Finding element using linktext

	TagName=driver.findElement(By.linkText("Home")).getTagName();
	System.out.println("LinkText:" +TagName);
	
	//Finding element using linktext

	TagName=driver.findElement(By.partialLinkText("Ho")).getTagName();
	System.out.println("PartialLinkText:" +TagName);
	
	//Finding element using CSS--Tag&attribute

	TagName=driver.findElement(By.cssSelector("input[value='Log In']")).getTagName();
	System.out.println("CSS:" +TagName);
	
	//Finding element using xpath

	TagName=driver.findElement(By.xpath("//*[@id='loginsubmit']")).getTagName();
	System.out.println("xPath:" +TagName);
	
	//WebElement
	
	WebElement TxtBoxPassword=driver.findElement(By.id("password"));
	TagName=TxtBoxPassword.getTagName();
	System.out.println("WebElement:" +TagName);
	
	//----------------------FindElements------------
	List<WebElement>allControls=driver.findElements(By.xpath("u1[class='credentials']"));
	System.out.println(allControls.size());
	
	
	}

}
