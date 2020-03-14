import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("file:///D:/Selenium/iGuru%20class%20practice/Test.html");
		d.findElement(By.xpath("//*[@id='selectTable']/tbody/tr[2]/td/button")).click();
		Alert a=d.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
	}

}
