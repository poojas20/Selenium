import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrgDrp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.theautomatedtester.co.uk/demo2.html");
		
		WebElement someElement=driver.findElement(By.xpath("/html/body/div[1]"));
		
		WebElement otherElement= driver.findElement(By.name("droppable"));
		
		Actions builder=new Actions(driver);
		builder.dragAndDrop(someElement, otherElement).build().perform();
		

	}

}
