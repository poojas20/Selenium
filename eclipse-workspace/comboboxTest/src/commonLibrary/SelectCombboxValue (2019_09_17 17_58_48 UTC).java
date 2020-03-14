package commonLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCombboxValue {
	Select ComboBox;
	public SelectCombboxValue(WebDriver d, By SelectObjectInfo) {
		this.ComboBox=new Select(d.findElement(SelectObjectInfo));
	}
	
	public boolean SelectComboboxOption(int index)
	{
		try
		{
			ComboBox.selectByIndex(index);
			return VerifySelectedValue(ComboBox.getOptions().get(index).getText());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean SelectComboboxOption(String OptiontoSelect_visibleText_Value,boolean Flag_Value_VisibleText)
	{
		String sValue=OptiontoSelect_visibleText_Value;
		try
		{
			if(Flag_Value_VisibleText)
			{
				ComboBox.selectByVisibleText(OptiontoSelect_visibleText_Value);
			}
			else
			{
				ComboBox.selectByValue(OptiontoSelect_visibleText_Value);
				OptiontoSelect_visibleText_Value=ComboBox.getOptions().stream().filter(o->o.getAttribute("value").equals(sValue)).findFirst().get().getText();
			}
			return VerifySelectedValue(OptiontoSelect_visibleText_Value);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	private boolean VerifySelectedValue(String VerifyText)
	{
		try
		{
			if(ComboBox.getFirstSelectedOption().getText().equals(VerifyText))
			{
				System.out.println("Provided option is selected");
				return true;
			}
			else
			{
				System.out.println("provided option is not selected");
				return false;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

}
