package CommonLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MercuryTours {
	public boolean Login_Mer(WebDriver d)
	{
		try
		{
			d.findElement(MercuryToursPageObjects.txtBox_UserName).sendKeys("mercury");
			d.findElement(MercuryToursPageObjects.txtBox_Password).sendKeys("mercury");
			d.findElement(MercuryToursPageObjects.btn_Signin).click();
			System.out.println("Passed:Login Successfull");
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	private boolean CheckRadiobtn(WebDriver d, By RadioBtnObjInfo)
	{
		try
		{
			d.findElement(RadioBtnObjInfo).click();
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean RadioBtnSelection(WebDriver d, String Option)
	{
		By rdBtnInfo=null;
		try {
			switch(Option.toUpperCase())
			{
			case "ONEWAY":
				rdBtnInfo=MercuryToursPageObjects.rdBtn_oneway;
				break;
			case "ROUNDTRIP":
				rdBtnInfo=MercuryToursPageObjects.rdBtn_RoundTrip;
				break;
			case "ECONOMY":
				rdBtnInfo=MercuryToursPageObjects.rdBtn_Economy;
				break;
			case "BUSINESS":
				rdBtnInfo=MercuryToursPageObjects.rdBtn_Business;
				break;
			case "FIRST CLASS":
				rdBtnInfo=MercuryToursPageObjects.rdBtn_FirstClass;
				break;
			}
			CheckRadiobtn(d, rdBtnInfo);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("radio button not got clicked");
			System.out.println(e.getMessage());
			return false;
		}
	}

}
