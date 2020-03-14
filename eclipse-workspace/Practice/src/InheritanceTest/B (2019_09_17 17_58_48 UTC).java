package InheritanceTest;

public class B extends A{
	B()
	 {
	   super(5);
	   System.out.println("in B default");

	 }
	B(int j)
	 {
	   super(1);
	   System.out.println("in overloaded B");

	 }

	public static void main( String args[]){

	B obj=new B(10);
	

	
}
}
