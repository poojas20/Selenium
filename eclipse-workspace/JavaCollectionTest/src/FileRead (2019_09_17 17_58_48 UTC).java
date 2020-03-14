import java.io.*;
public class FileRead {
	
	 

	public static void main (String args[])throws IOException{
	File file = new File("D:\\Java\\Hello1.txt");
	System.out.println("abs path : "+ file.getAbsolutePath());

	if(file.createNewFile()){
		System.out.println("File Cretaed Successfully");
	}
	FileWriter writer = new FileWriter(file);
	writer.write("This is an example");
	writer.close();

	FileReader fr = new FileReader(file);
	char [] a = new char[50];
	fr.read(a); //reads the content to the array
	for (char c : a)
	System.out.print(c);

	fr.close();
	}
	}

