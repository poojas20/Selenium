package staticKeyword;


class Emp{
	int eid;
	int salary;
	static String ceo;
	
	static {         //it will call when class is loaded in loader memory and class loaded only once.
		 ceo="Larry";
	}
	
	public Emp(){   //it will call when object is created 
	 eid=1;
	 salary=500;
	 
	}
	
	public void show() {
		System.out.println(eid + " : " + salary + " : " + ceo);
	}
	
}


public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Emp navin=new Emp();
		Emp rahul=new Emp();
		
		
		navin.eid=9;
		navin.salary=1000;
		
		
		rahul.eid=10;
		rahul.salary=11000;
		
		
		navin.show();
		rahul.show();
		
	}

}
