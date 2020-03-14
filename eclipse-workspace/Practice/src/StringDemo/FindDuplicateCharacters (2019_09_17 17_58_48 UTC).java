package StringDemo;

import java.util.HashMap;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		String str="PoojaJava";
		HashMap<Character,Integer> hm=new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {	
			
			char c=str.charAt(i);  
			if(hm.get(c)!=null) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c,1);
			}
		}
		System.out.println(hm);
 
	}

}
