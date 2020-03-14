import java.time.LocalTime;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightAftrTwoMonths {
	private String today;
	public void selectdate(WebDriver driver) {
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//today=getCurrentDay();
	}
	
	public void getCurrentDay() {
		Calendar c= Calendar.getInstance();
		System.out.println(c);
		
		
	}
}
