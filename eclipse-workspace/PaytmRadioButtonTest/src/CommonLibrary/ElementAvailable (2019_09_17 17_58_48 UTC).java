package CommonLibrary;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;

public class ElementAvailable {
	public static boolean isElementAvailable(WebDriver d,By objectinfo)
	{
		try
		{
			return d.findElement(objectinfo).isDisplayed();
		}
		catch(NoSuchElementException e)
		{
			return false;
		}
	}

}
