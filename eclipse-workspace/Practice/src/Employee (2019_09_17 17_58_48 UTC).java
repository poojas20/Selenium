
public class Employee {
	int empId;
	static String companyName= "Amdocs";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		e1.empId = 1000;
		e2.empId = 1001;
		e3.empId = 1002;
 
		System.out.println(e1.empId );
		System.out.println(e2.empId );
		System.out.println(e3.empId );

	//	e3.companyName="HSBC";
		System.out.println(e1.companyName);
		System.out.println(e2.companyName);
		System.out.println(e3.companyName);


	}

}