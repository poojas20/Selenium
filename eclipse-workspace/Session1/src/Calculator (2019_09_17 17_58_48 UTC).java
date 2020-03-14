
public class Calculator {

	void add() {
		int i=10;
		int j=20;
		int k=i+j;
		System.out.println("sum in add method is: "+k);
	}
	
	void add1(int i, int j) {
		int b=i+j;
		System.out.println("sum in add1 method: " +b);
	}
	
	int add2(int i, int j) {
		int b=i+j;
		System.out.println("sum in add2 method: " +b);
		return b;
	}
	
	String display() {
		String name="Selenium";
		String name1=" java";
		String name2= name+" "+name1;
		System.out.println(name2);
		return name2;
	}
	
	public static void main(String args[]) {
		Calculator a=new Calculator();
		int s=a.add2(30,40);
		System.out.println(s);
		a.add1(20, 30);
		a.add2(30, 40);
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
