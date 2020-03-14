import java.util.*;
public class ArrayListDemo{
	public static void main(String args[]){
		//create an array list
		
		ArrayList al=new ArrayList();
				
		System.out.println("Initial size of al:" +al.size());
		
		//add elements to the array list
		al.add("C");
		al.add("F");
		al.add("java");
		
		al.add("B");
		al.add("D");
		al.add("10");
		al.add("F");
		al.add("E");
		
		System.out.println("Contents of al:" +al);
		System.out.println("size of al after additions:" +al.size());
		
		//Remove elements from the array list
		al.remove("C");
		al.remove(2);
		
		System.out.println("size of al after deletion:" +al.size());
		System.out.println("Contents of al:" +al);
		
		ListIterator it=al.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
