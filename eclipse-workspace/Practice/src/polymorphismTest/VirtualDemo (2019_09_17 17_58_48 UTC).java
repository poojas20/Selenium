package polymorphismTest;

public class VirtualDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Salary s = new Salary("Sumit", "Lucknow,UP",3, 3600.00);
	      System.out.println("Call mailCheck using Salary reference --");
	      s.mailCheck();

	      Employee e = new Salary("Ajit", "Mumbai,MH", 2, 2400.00);
	      System.out.println("Call mailCheck using  Employee reference--");
	      e.mailCheck();

	      Employee e1 = new Employee("Amit", "Mumbai,MH", 1);
	      System.out.println(" Call mailCheck using  Employee reference--");
	      e1.mailCheck();
	}

}
