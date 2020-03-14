package testInterface;

public class Animal implements AnimalInt1, AnimalInt {
	@Override
	public void move1() {
		System.out.println("Animals can move");
		}

	@Override
	public void bark1() {
		System.out.println("Dogs can bark");
		}

	@Override
	public void bark() {
		System.out.println("Dogs can bark");
		}

	@Override
	public void move() {
		System.out.println("Animals can move");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.move();
		a.bark();
		a.bark1();
	}

}