
public class CalMulti {

	void Multi() {
		int i=10;
		int j=20;
		int k=i*j;
		System.out.println("value of k in multi method is: " +k);
		
	}
	
	void Multi1(int i, int j) {
		int k=i*j;
		System.out.println("value of k in Multi1 method: " +k);
	}
	
	int Multi2(int i, int j) {
		int k=i*j;
		System.out.println("value in the Multi2: " +k);
		return k;
		
	}
	
	public static void main(String [] args) {
		CalMulti c=new CalMulti();
		c.Multi();
		c.Multi1(10, 30);
		c.Multi2(100, 300);
		
		int value=c.Multi2(40, 50);
		value= value+100;
	System.out.println("value returned- Multi2 method: " +value);
	}
	
}
