package commonLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class commonTest {
	Select ComboBox;
	public void Test(WebDriver d) {
		Select ComboBox= new Select(d.findElement(By.xpath("//input[@id='hp-widget__sfrom']")));
		ComboBox.selectByVisibleText("Pune, India");
	}
	
		
}
