package Package1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
  @Test(dataProvider = "TestData")
  public void Test_Para(String UN, String Pass) {
	  System.out.println("Uname " +UN + "Pass " + Pass);
  }

  @DataProvider
  public Object[][] TestData() {
	  Object[][] data = new Object[3][2];
	  data[0][0] = "U1";
	  data[0][1] = "P1";
	  
	  data[1][0] = "U2";
	  data[1][1] = "P2";
	  
	  data[2][0] = "U3";
	  data[2][1] = "P3";
	  
	  return data;
  }
}
