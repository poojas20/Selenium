package CommonLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class selectcmb {
	
	public void SelectVal(WebDriver d, By Cmbinfo, String ValuetoSelect)
	{
		Select cmbbx=new Select(d.findElement(Cmbinfo));
		cmbbx.selectByVisibleText(ValuetoSelect);
	}

}
