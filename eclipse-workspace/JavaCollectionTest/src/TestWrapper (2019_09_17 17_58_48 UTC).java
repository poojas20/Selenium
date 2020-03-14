
public class TestWrapper {
	
	public static void main(String args[]) {
		Integer x=5;//boxes int to an Integer object int i=5
		x=x+10;//unboxes the Integer to a int
		System.out.println(x);
		
		Integer y=5;
		System.out.println(y.toString());
		System.out.println(Integer.toString(12));
			
			Integer a=5;
			Integer b=10;
			Integer c=5;
			short d=5;
			
			System.out.println(a.equals(b));
			System.out.println(a.equals(c));
			System.out.println(a.equals(d));
			
			
			int e=Integer.parseInt("9");
			
			double f=Double.parseDouble("5.2");
			
			System.out.println(e);
			System.out.println(f);
			//System.out.println(g);
	}

}
