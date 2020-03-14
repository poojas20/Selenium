package SortArray;

public class SortArrayWithFreq {

	public static void main(String[] args) {
	
		int[] a= {4,3,1,6,4,3,6,4};
		
		for(int i=0; i<a.length;i++) {
			for(int j=i; j<a.length; j++) {
				if(a[i]>a[j]) {
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
		}
		for(int k:a) {
			System.out.print(k +", ");
			
		}
	}

}
