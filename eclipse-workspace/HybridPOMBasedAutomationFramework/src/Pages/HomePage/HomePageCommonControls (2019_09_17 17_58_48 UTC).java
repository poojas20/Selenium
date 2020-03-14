package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageCommonControls {
	
	WebDriver driver;
	
	@FindBy(how = How.ID, using = "menu_admin_viewAdminModule")
	public WebElement TabAdmin;
	@FindBy(how = How.ID, using = "menu_pim_viewPimModule")
	public WebElement TabPIM;
	@FindBy(how = How.ID, using = "menu_leave_viewLeaveModule")
	public WebElement TabLeave;
	@FindBy(how = How.ID, using = "menu_time_viewTimeModule")
	public WebElement TabTime;
	
	public HomePageCommonControls(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public static By LinkLogout= By.linkText("Logout");
	private By CreateLinkUserName(String UserName)
	{
		return By.linkText("Welcome "+UserName);
	}
	
	public boolean LogoutApplication(String UserName)
	{
		try
		{
			this.driver.findElement(CreateLinkUserName(UserName)).click();
			this.driver.findElement(LinkLogout).click();
			return true;
		}
		catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
}
