
public class HelloWorld3 {

	public static void main(String[] args) {
		HelloWorld3 hw=new HelloWorld3();
		hw.display("java");
		hw.display1(10);
		String a=hw.display2();
		System.out.println(a);
		
	}
	public void display(String username) {
		System.out.println(username);
	}
	
	public void display1(int i) {
		System.out.println(i);
	}
	
	public String display2() {
		String s="program";
	    return s;
	}
}
