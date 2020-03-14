
public class TestLocal {

	 int age=10;
	
	 void pupAge() {
		int age=20;
		age=age+7;
		System.out.println("1- pup age is: " +age);
	}

	public static void main(String[] args) {
			TestLocal test=new TestLocal();
			test.pupAge();
			System.out.println("2- pupage is: "+test.age);
			//System.out.println("3- pupage is: "+age);

	}

}
