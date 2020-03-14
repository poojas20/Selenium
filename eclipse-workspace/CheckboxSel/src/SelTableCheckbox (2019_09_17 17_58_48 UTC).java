import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTableCheckbox {

	public void SelectUserCheckBox_XpathAxes(WebDriver d, String Name)
	{
		d.findElement(By.id("resultTable")).findElement(By.xpath("//tbody/descendant::a[text()='"+Name+"']/parent::*"+"/parent::*/descendant::input")).click();
	}
	public void SelectUserCheckBox(WebDriver d, String Name)
	{
		WebElement e=d.findElement(By.id("resultTable")).findElement(By.tagName("tbody"));
		List<WebElement>rows=e.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for(WebElement row:rows) {
			List<WebElement>Cols=row.findElements(By.tagName("td"));
			System.out.println(Cols.size());
			System.out.println(row.getAttribute("class"));
			if(Cols.get(1).getText().equals(Name))
			{
				System.out.println(Cols.get(1).getText());
				System.out.println(Cols.get(0).findElement(By.tagName("input")));
				Cols.get(0).findElement(By.tagName("input")).click();
				break;
			}
		}
	}
	
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
		SelTableCheckbox s=new SelTableCheckbox();
		s.SelectUserCheckBox(d, "john.smith");
	
	}

}
