package StringDemo;

import java.util.HashMap;
import java.util.Iterator;

public class FindDuplicateWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm=new HashMap<>();
		String str="I am am learning Java Java";
		
		String [] s=str.split(" ");
		for(String tempString:s) {
			
			if(hm.get(tempString)!=null) {
				hm.put(tempString, hm.get(tempString)+1); 
			}
			else {
				hm.put(tempString,1); 	
			}
		}
		System.out.println(hm);
		
		Iterator<String> temp=hm.keySet().iterator();
		while(temp.hasNext()) {
			String st=temp.next();
			if(hm.get(st)>1) {
				System.out.println(st + " occured no of times:" + hm.get(st));
			}
		}

	}

}
