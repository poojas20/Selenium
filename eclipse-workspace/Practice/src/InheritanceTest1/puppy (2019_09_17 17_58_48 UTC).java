package InheritanceTest1;

public class puppy extends Dog {
void move() {
	super.move();
	System.out.println("puppy can move");
	System.out.println(super.name);
	this.run();
}

public void run() {
	System.out.println("Dogs test can run");
	
}

public static void main(String[] args) {
	puppy b=new puppy();
	b.move();
	System.out.println(b.name);
}
}
