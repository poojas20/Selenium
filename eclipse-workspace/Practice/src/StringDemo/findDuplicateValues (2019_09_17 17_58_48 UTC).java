package StringDemo;

public class findDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a= {"Java", "C", "Java", "Python", "Java"};
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i].equals(a[j])) {
					System.out.println("duplicate value is: " +a[i]);
				}
				System.out.println("******************");
			}
		}
	}

}
