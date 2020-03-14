package controlsHandling_RadioBtn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import CommonLibrary.MercuryTours;
import CommonLibrary.MercuryToursPageObjects;
import CommonLibrary.selectcmb;

public class testcmb {

	public static void main(String[] args) {
		MercuryTours mt=new MercuryTours();
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		selectcmb scmb=new selectcmb();
		if(mt.Login_Mer(driver))
		{
			scmb.SelectVal(driver, MercuryToursPageObjects.cmbBx_fromPort, "London");
		}


	}

}
