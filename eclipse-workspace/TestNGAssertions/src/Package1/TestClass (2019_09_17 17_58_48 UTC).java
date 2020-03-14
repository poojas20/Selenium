package Package1;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
	 int i=5;
	  int j=6;
  @Test
  public void f() {
	 
			  /*if(j<i){
			  System.out.println("test is pass");
			  }
			  else{
				  System.out.println("test is fail");
			 
			  }*/
			  Assert.assertTrue(j<i);
  }
}
