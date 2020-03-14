
class StrTest {

	public static void main(String[] args) {
String s1="Hello";//String literal
String s2="Hello";//String literal
String s3=s1;//same reference
String s4=new String("Hello");//String object
String s5=new String("Hello");//String object

if(s1==s2)
	System.out.println("s1==s2-->true");//true, same pointer

if(s1==s2)
	System.out.println("s1==s2-->true");//true, same pointer

if(s1==s3)
	System.out.println("s1==s3-->true");//true, same pointer

if(s1.equals(s3))//true, same contents
	System.out.println("s1.equals(s3)-->true");//true, same pointer

if(s1==s4)
	System.out.println("s1==s4-->true");
else
	System.out.println("s1==s4-->false");

if(s1.equals(s4))//true, same contents
	System.out.println("s1.equals(s4)-->true");

if(s4==s5)
	System.out.println("s4==s5-->true");//false,different pointers in heap
else
	System.out.println("s1==s5-->false");

if(s4.equals(s5))//true, same contents
	System.out.println("s4.equals(s5)-->true");
	}

}
