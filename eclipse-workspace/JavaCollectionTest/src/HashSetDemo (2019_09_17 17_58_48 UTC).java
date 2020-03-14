import java.util.*;

public class HashSetDemo {
	public static void main(String args[]) {
		//create a hash set
		HashSet hs= new HashSet();
		//add elements to the hash set
		hs.add("B");
		hs.add("java");
		hs.add("D");
		hs.add("E");
		hs.add("10");
		hs.add("F");
		hs.add("F");
		hs.remove("D");
		System.out.println(hs);
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
HashSet hs1=new HashSet();
hs1.add("A1");
hs1.add("A2");
hs1.add("A3");

hs.addAll(hs1);
System.out.println(hs);

hs.removeAll(hs1);
System.out.println(hs);

hs.clone();
System.out.println(hs);

	}
}
