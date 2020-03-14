package ListenerPackage;

import java.time.Instant;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class MethodListenerTest implements IInvokedMethodListener{

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println(method.getTestMethod().getMethodName()+"::Execution Started at:"+Instant.now());
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		System.out.println(method.getTestMethod().getMethodName()+"::Execution End at:"+ Instant.now());
	}
	
	

}
