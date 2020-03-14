import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelAction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UserName="Admin";
		String Password="admin123";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/");
		d.findElement(By.id("txtUsername")).sendKeys(UserName);
		d.findElement(By.id("txtPassword")).sendKeys(Password);
		d.findElement(By.id("btnLogin")).click();
		System.out.println("Login Successll");
		d.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		Actions action=new Actions(d);
		action.moveToElement(d.findElement(By.id("menu_admin_viewAdminModule"))).moveToElement(d.findElement(By.id("menu_admin_UserManagement"))).moveToElement(d.findElement(By.id("menu_admin_viewSystemUsers"))).click().build().perform();
		
		action.moveToElement(d.findElement(By.id("menu_leave_viewLeaveModule"))).moveToElement(d.findElement(By.id("menu_leave_Configure"))).moveToElement(d.findElement(By.id("menu_leave_viewHolidayList"))).click().build().perform();
	}

}
