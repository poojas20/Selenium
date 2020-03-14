package superThis;

public class B extends A  {
//int a=2000;
	int a=0;
	
public B(String s1) {
	this(34);
	//super();
	//super(34);
	
	System.out.println("B constructor default");
}

//this();
//this (10);
//this("java");
//B("java");

public B(int z) {
	
	System.out.println("B constrctor with arg");
}

public void m2() {
	System.out.println("I m in m2, the value of a: "+a);
	a++;
	m1();
}

public void m1() {
	System.out.println("i m in m1, the value of a: "+a);
	if (a<10) {
		m2();
	}
}
//B b1=new B(10);
}












