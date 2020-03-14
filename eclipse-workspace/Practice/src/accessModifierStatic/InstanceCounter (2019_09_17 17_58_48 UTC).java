package accessModifierStatic;

public class InstanceCounter {
 static int numInstances=0;
	
 static int getCount() {
	 return numInstances;
 }
 
 InstanceCounter(){
 InstanceCounter.addInstance();
 }
 
 static void addInstance() {
	 numInstances++;
	 System.out.println(numInstances);
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Starting with " +InstanceCounter.getCount()+ " instances");

for(int i=0; i<500; ++i) {
new InstanceCounter();
}
System.out.println("created " +InstanceCounter.getCount()+ " instances");
	}
	
}
