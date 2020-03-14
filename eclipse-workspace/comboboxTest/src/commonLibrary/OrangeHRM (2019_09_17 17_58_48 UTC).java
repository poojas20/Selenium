package commonLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM {
	public boolean LoginOrangeHRM(WebDriver d, String UserName,String Password)
	{
		try
		{
			d.findElement(By.id("txtUsername")).sendKeys(UserName);
			d.findElement(By.id("txtPassword")).sendKeys(Password);
			d.findElement(By.id("btnLogin")).click();
			System.out.println("Login Successfull");
			return true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

}
