package superThis;

public class C extends B {
	int a =3000;
C(){
	this(9);

	  //this(); -- not allowed this(9); // C c=new C(); --allowed new C();
	 
	System.out.println("default const C...");
}
	C(int x){
		super(99);
		//this();
		System.out.println("arg 1 constrctor..");
	}
	
	public void m1() {
		//this();
		int a=4000;
		
		System.out.println(a); //4000
		System.out.println(this.a); //3000
		System.out.println(super.a); //0
		A a1= new A();
		System.out.println(a1.a); //1000
	}
	
	void B() {
		System.out.println("In method B");
	}
	
	public void C() {
		System.out.println("in method c");
	}

}
