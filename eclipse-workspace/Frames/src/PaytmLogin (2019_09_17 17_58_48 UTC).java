import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmLogin {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https:paytm.com/");
		Thread.sleep(8000);
		d.findElement(By.xpath("//div[@id='app']/descendant::div[@class='_3ac-']")).click();
		Thread.sleep(30000);
		
		d.switchTo().frame(d.findElement(By.xpath("//div[@class='_1MBe transparent']/descendant::iframe")));
		
		d.findElement(By.cssSelector("span[screen-name='auth-init/QRlogin']")).click();
				
		d.findElement(By.xpath("//*[@id='input_0']")).sendKeys("7709401210");
		d.findElement(By.xpath("//*[@id='input_1']")).sendKeys("poojashitole20");
		d.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(10000);
		String Text=d.findElement(By.cssSelector("span[class='otp-text-link ng-binding']")).getText();
		System.out.println(Text);
		if(Text.contains("1210,"))
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		d.switchTo().defaultContent();
	}

}
