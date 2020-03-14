import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelAction {
	
public void SelectAllCheckBOx(WebDriver d, String option, By ojinfo) 
{
	boolean status=d.findElement(ojinfo).isSelected();
	if(status)
	{
		if(option.equals("CHECK"))
		{
			System.out.println("Checkbox is already checked");
		}
		else
		{
			d.findElement(ojinfo).click();
		}
	}
	else
	{
		if(option.equals("CHECK"))
		{
			d.findElement(ojinfo).click();
		}
		else
		{
			System.out.println("Checkbox is already unchecked");
		}
	}
}
	public static void main(String[] args) {
		
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
		SelAction s=new SelAction();
	s.SelectAllCheckBOx(d, "UNCHECK", By.id("ohrmList_chkSelectAll"));
			}

}
