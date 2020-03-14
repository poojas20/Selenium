package Package1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass2 {
  @Test
  public void f() {
	  System.out.println("Test");
	  Reporter.log("test is pass in f of class2");
  }
 
  @Test
  public void f1() {
	  System.out.println("test1");
	  Reporter.log("test is pass in f1 of class2"); 
	  
  }
  
  @Test
  public void f2() {
	  System.out.println("test2");
	  Assert.fail("this is failed in f2 of class2");
  }
}
