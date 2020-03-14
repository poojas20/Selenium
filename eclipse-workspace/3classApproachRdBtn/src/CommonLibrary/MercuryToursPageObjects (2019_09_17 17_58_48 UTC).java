package CommonLibrary;

import org.openqa.selenium.By;

public class MercuryToursPageObjects {

	
		
		public static By txtBox_UserName=By.name("userName");
		public static By txtBox_Password=By.name("password"); 
		public static By btn_Signin=By.name("login");
		public static By rdBtn_oneway=By.cssSelector("input[value='oneway']"); 
		public static By rdBtn_RoundTrip=By.cssSelector("input[value='roundtrip']");
		public static By rdBtn_Business=By.cssSelector("input[value='Business']");
		public static By rdBtn_FirstClass=By.cssSelector("input[value='First']");
		public static By rdBtn_Economy=By.cssSelector("input[value='Coach']");
		//public static By cmbBx_fromPort=By.cssSelector("input[value='fromPort']");
		public static By cmbBx_fromPort=By.cssSelector("select[name='fromPort']");

	}

