package controlsHandling_RadioBtn;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import CommonLibrary.MercuryTours;

public class RadioBtn_mercury {

	public static void main(String[] args) {
		MercuryTours mt=new MercuryTours();
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		if(mt.Login_Mer(driver))
		{
			if(mt.RadioBtnSelection(driver,"oneway"))
			{
				if(mt.RadioBtnSelection(driver,"FirstClass"))
				{
					System.out.println("Passed:TestCase is passed");
				}
			}
		}

	}

}
