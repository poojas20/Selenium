package Package1;

import org.testng.annotations.Test;

public class TestClass1 {
	@Test(groups= {"Regression"})
	public void f() {
		System.out.println("test");
	}

	@Test(groups= {"Regression"})
	  public void f1() {
			System.out.println("test1");
	  }
	  
	  @Test(groups= {"Sanity"})
	  public void f2() {
		  System.out.println("test2");
	  }
	  @Test(groups= {"Sanity"})
	  public void f3() {
		  System.out.println("test3");
	  }
	  
	  @Test(groups= {"Regression","Sanity"})
	  public void f4() {
		  System.out.println("test4");
	  }

}
