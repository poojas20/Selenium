package Package1;

import org.testng.annotations.Test;

public class TestClass1 {
  @Test(priority=1)
  public void f4() {
	  System.out.println("test4");
  }
  
  @Test(priority=2)
  public void f() {
	  System.out.println("test");
  }
  
  @Test(priority=3)
  public void f3() {
	  System.out.println("test3");
  }
  
  @Test(priority=4)
  public void f2() {
	  System.out.println("test2");
  }
  
  @Test(priority=5)
  public void f1() {
	  System.out.println("test1");
  }
}
