import javax.swing.JOptionPane;

public class Add
{
public static void main(String [] args) {
	
	Add a=new Add();
	a.add();
	a.add1(20, 60);
	int p=a.add2(20, 20);
	System.out.println(p);
	String s1=a.display();
	System.out.println(s1);
	JOptionPane.showMessageDialog(null, s1);
	
}

void add() {
	int i=10;
	int j=20;
	int c=i+j;
	System.out.println(c);
}

void add1(int i, int j) {
	int b=i+j;
	System.out.println(b);
}

int add2(int i, int j) {
	
	int b=i+j;
	System.out.println(b);
	return b;
}

String display() {
	String name="Pooja";
	String name1="Shitole";
	String name2=name+" "+name1;
	return name2;
}
 
String display1() {
	char name='S';
	char name1='P';
	String name2=name+" "+name1;
	System.out.println(name2);
	return name2;
}

}
