import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class TestClass {
	
//Sikuli IS USED HERE.

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("input_resumeParser")).click();
		
		Screen s= new Screen();
		Pattern fileName=new Pattern("D:\\Selenium\\FileName.png");
		Pattern OpenBtn=new Pattern("D:\\Selenium\\OpenBtn.png");
		
		if(s.exists(fileName)!=null)
		{
			s.type(fileName,"D:\\Selenium\\test.doc");
			s.click(OpenBtn);
			
			if(s.exists(fileName)==null)
			{
				System.out.println("Dialog got closed");
			}
			
			else
			{
				System.out.println("dialog is not closed");
			}
		}
	}

}
