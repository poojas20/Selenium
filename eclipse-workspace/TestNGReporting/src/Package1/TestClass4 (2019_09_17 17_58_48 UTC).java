package Package1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass4 {
  @Test
  public void f() {
  }
  
  @Test
  public void f1() {
  	  System.out.println("test1");
  	  Assert.fail("this is failed");
  }

  @Test
  public void f2() {
  	  System.out.println("test2");
  	  Reporter.log("test is pass in f2 of class1");
  }
}
