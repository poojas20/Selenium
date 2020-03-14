package Package1;

import org.testng.annotations.Test;

import ListenerPackage.SuiteListenerTest;

public class ListenerTestNGclass {
  @Test
  public void f() {
	  SuiteListenerTest.driver.get("http://www.google.co.in");
	  System.out.println(SuiteListenerTest.driver.getTitle());
  }
}
