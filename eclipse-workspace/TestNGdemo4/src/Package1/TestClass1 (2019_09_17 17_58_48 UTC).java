package Package1;

import org.testng.annotations.Test;

public class TestClass1 {
 
	@Test(invocationCount=3)                //used to run same test case multiple time
  public void f() {
		System.out.println("test");
  }
  
  @Test(enabled=true)
  public void f1() {
	  System.out.println("test1");
  }
  
  @Test(enabled=false)
  public void f2() {
	  System.out.println("test2");
  }
}
