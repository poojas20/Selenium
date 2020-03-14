package ControlsHandling_RadioBtn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import CommonLibrary.ElementAvailable;

public class RadioBtnPaytm {
	public static WebDriver driver;
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(20000);
		//UseRadioBtn("postpaid");
		UseRadioBtn("radio1");
		
		Thread.sleep(20000);
		//UseRadioBtn("Prepaid");
		UseRadioBtn("radio0");
		//if(VerifyPrePaidorPostpaid("prePaid"))
		if(VerifyPrePaidorPostpaid("radio0"))
		{
			System.out.println("Passed:Radio button test is passed");
		}
		//UseRadioBtn("postpaid");
		UseRadioBtn("radio1");
		//if(VerifyPrePaidorPostpaid("postpaid"))
		if(VerifyPrePaidorPostpaid("radio1"))
		{
			System.out.println("Passed:Radio button test is passed");
		}
		else
		{
			System.out.println("Failed:Radio button test is failed");
		}
	}
	
	public static void UseRadioBtn(String Option)
	{
		//driver.findElement(By.xpath("//lable[.='"+Option+"']")).click();
		//driver.findElement(By.xpath("//label/input[@value='"+Option+"']")).click();
		//driver.findElement(By.xpath("//div[@class='wt_a']/label/input[@id='"+Option+"']")).click();
		WebElement element = driver.findElement(By.xpath("//div[@class='wt_a']/label/input[@id='"+Option+"']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
	}
	
	public static boolean VerifyPrePaidorPostpaid(String OptionToverify)
	{
		try
		{
			//if(ElementAvailable.isElementAvailable(driver,By.xpath("//div[contains(.,'Browse Plans')]"))&&OptionToverify.toUpperCase().equals("PREPAID"))
			if(ElementAvailable.isElementAvailable(driver,By.xpath("//div[@class=\"_2Y3T _1eRq\"]/div[contains(.,'Browse Plans')]"))&&OptionToverify.toUpperCase().equals("PREPAID"))
			
			{
				System.out.println("PrePaid is selected");
				return true;
			}
			else
			{
				if(OptionToverify.toUpperCase().equals("POSTPAID")&&!ElementAvailable.isElementAvailable(driver,By.xpath("//div[contains(.,Browse Plans')]")))
				{
					System.out.println("PostPaid is selected");
					return true;
				}
				return false;
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured:->"+e.getMessage());
			return false;
		}
	}

}
















