package InheritanceTest1;

public class Dog extends Animal{
	
	Dog(){                                 //constructor of class dog
		System.out.println("in dog");   
	}
	
	String name= "Dog";
	void move() {
		System.out.println("Dog can move");
		super.move();
		run();
	}
	public void run() {
		System.out.println("Dogs can run");
	}
	
	public static void main(String args[]) {
		Dog b=new Dog();                          //when we create object of subclass, it will call constructor of super class with constructor of subclass
		b.move();
		System.out.println(b.name);
	}

}
