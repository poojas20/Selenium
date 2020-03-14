import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		JavascriptExecutor je= (JavascriptExecutor) driver; //typecasting je to JavascriptExecutor from driver type so the je will be of type JavascriptExecutor
		String Title=(String) je.executeScript("return document.title");// to get value from element 'return', and that title typecasted in String type
		System.out.println(Title);
		WebElement TxtBoxUserName=(WebElement)je.executeScript("return document.getElementById('txtUsername')"); //returned element is type casted in Webelement as we are performing operation using selenium on element found by javascript
		TxtBoxUserName.sendKeys("Admin");
		WebElement TxtBoxPassword=driver.findElement(By.id("txtPassword"));
		je.executeScript("arguments[0].value='admin123'",TxtBoxPassword);//passing arguments in argument[0]
		je.executeScript("arguments[0].click()",driver.findElement(By.id("btnLogin")));
		Thread.sleep(6000);
		WebElement Admin=(WebElement)je.executeScript("return document.evaluate(\"//a[@id='menu_admin_viewAdminModule']\",document,null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue");
	    Admin.click();
	
	}
	

}
