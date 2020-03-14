import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectLocation {
public void FromToLocation(WebDriver driver) {
	
	WebElement FromDropDown= driver.findElement(By.xpath("//span[text()='From']"));
	FromDropDown.click();
	List<WebElement> FromOptions=FromDropDown.findElements(By.xpath("//label[@for='fromCity']/following-sibling::div/descendant::ul/li[@role='option']"));
try {
		for(WebElement a:FromOptions) {
			//System.out.println(a.getText());
			if(a.getText().contains("Pune, India")) {
				a.click();
				System.out.println("Pune city selected");
				break;
			}
			/*else {
				System.out.println("from city not found");
			}*/
		}}
catch(Exception e) {
System.out.println(e);
}		
WebElement ToDropDown= driver.findElement(By.xpath("//span[text()='To']"));
ToDropDown.click();
	List<WebElement> ToOptions=ToDropDown.findElements(By.xpath("//div[@class='fsw_inputBox searchToCity inactiveWidget activeWidget']/descendant::div[6]/child::ul/li[@role='option']"));
	
	for(WebElement b:ToOptions) {
	if(b.getText().contains("Bangkok, Thailand"))
	{
		b.click();
		System.out.println("Bangkok city selected");
		break;
	}
}
	FlightAftrTwoMonths selectDate=new FlightAftrTwoMonths();
	selectDate.selectdate(driver);
//driver.quit();	
}
}
