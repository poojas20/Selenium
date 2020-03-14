package loopsTest;

public class TestContinue {

	public static void main(String[] args) {
		
		int numbers[]= {10,20,30,40};
		
		for(int x : numbers) {
			
		if(x==30) {
			continue;
		}
		System.out.println(x+",");	
		}
		
		

	}

}
