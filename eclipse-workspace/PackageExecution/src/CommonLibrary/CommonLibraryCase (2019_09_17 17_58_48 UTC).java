package CommonLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class CommonLibraryCase {

	boolean FlagAccountVisible=false;
	public boolean Login_Gmail(WebDriver d,String Username,String Password)
	{
		try
		{
			if(!FlagAccountVisible)
			{
				d.findElement(By.id("identifierId")).sendKeys(Username);
				d.findElement(By.id("identifierNext")).click();
				Thread.sleep(5000);
			}
			d.findElement(By.name("password")).sendKeys(Password);
			d.findElement(By.id("passwordNext")).click();
			return true;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			return false;
		}
	}
	
	public boolean VerifyLoginSuccessfull(WebDriver d, String Username)
	{
		try
		{
			String title=d.findElement(By.xpath("//a[@class='gb_b gb_eb gb_R']")).getAttribute("Title");
			if(title.contains(Username))
			{
				System.out.println("Test is passed, user got logged in successfully");
				return true;
			}
			else
			{
				System.out.println("Test is failed, user not got logged in");
				return false;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			return false;
		}
	}
	
	public boolean Logout_Gmail(WebDriver d)
	{
		try
		{
			d.findElement(By.xpath("//a[@class='gb_b gb_fb gb_R']")).click();
			d.findElement(By.linkText("Sign out")).click();
			Thread.sleep(5000);
			if(d.findElement(By.xpath("//*[@id='headingText']")).isDisplayed())
			{
				System.out.println("Passed:User got logged out successfully");
				return true;
			}
			else
			{
				System.out.println("Failed:User not got logged out successfully");
				return false;
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			return false;
		}
	}
	
	public boolean CheckAccountPage(WebDriver d,String Username)
	{
		try
		{
			WebElement UserNameLink=d.findElement(By.xpath("//p[.='"+Username+"']"));
			if(UserNameLink.isDisplayed())
			{
				UserNameLink.click();
				FlagAccountVisible=true;
			}
			else
			{
				d.findElement(By.xpath("//p[.='Use another accoynt']")).click();
			}
			return true;
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			return false;
		}
		
	}
	
}








