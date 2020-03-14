import java.io.*;
public class FileSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	BufferedReader bf = new BufferedReader (new FileReader("D:\\Java\\Hello1.txt"));
	//start a line count and declare a string to hold out current line.
	int linecount = 0;
	String line;
	//let the user know that we are searching for
	
	System.out.println("Seraching for "+ args[0] +"in file...");
	//loop through each line , stashing the line into out line variable
	
	while ((line = bf.readLine())!=null)
	{
		//increment the count and find the index of the word
		linecount++;
		int indexfound = line.indexOf(args[0]);
		//if greater than -1, means we found the word
		if (indexfound > -1) {
			System.out.println("Word was found at position"+ indexfound + "one line"+linecount);
			System.out.println("line" + line);
		}
		else
			System.out.println("Not found at line no "+ linecount);
		
	}
	//close the file after searching done
	bf.close();
}
catch(IOException e)
{
	System.out.println("IO Error occured : "+ e.toString());
}
	
	}
}

		
