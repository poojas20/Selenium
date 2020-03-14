package mainClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import commonLibrary.OrangeHRM;
import commonLibrary.SelectCombboxValue;

public class ComboBoxEx_OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		OrangeHRM or= new OrangeHRM();
		String UserName="Admin";
		String Password="admin123";
		String UserRole="ESS";  
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(7000);
		if(or.LoginOrangeHRM(driver, UserName, Password)==true)
		{
			driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			Thread.sleep(5000);
			if(new SelectCombboxValue(driver, By.id("searchSystemUser_userType")).SelectComboboxOption(UserRole,true))
					{
				driver.findElement(By.id("searchBtn")).click();
				int count_TotalRowsinTable=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
			
				int Count_RowBasedonCondition=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr/descendant::td[contains(text(),'"+UserRole+"')]")).size();
				
				if(count_TotalRowsinTable==Count_RowBasedonCondition)
				{
					System.out.println("test case is passed");
				}
				else
				{
					System.out.println("test case is failed");
				}
					}
			else
			{
				System.out.println("test case is failed");
			}
		}

	}

}
