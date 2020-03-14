 import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class CsvFileWriter {
	
	//Delimiter used in csv file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	
	//CSV file header
	private static final String FILE_HEADER= "id,firstName,lastName,gender,age";
	
	public static void writeCsvFile(String fileName) {
		
		//create new studentsObj objects
		
		Student student1 = new Student(1,"Amit","Kumar","M",25);
		Student student2 = new Student(2,"Sumit","Kumar","M",26);
		Student student3 = new Student(3,"pranay","Kumar","M",27);
		Student student4 = new Student(4,"virat","Kumar","M",28);
		
		//create new list of student objects
		List<Student> studentsObj= new ArrayList<Student>();
		studentsObj.add(student1);
		studentsObj.add(student2);
		studentsObj.add(student3);
		studentsObj.add(student4);
		
		FileWriter fileWriter = null;
		
		try {
			//File f1=new File("C://s1.csv");
		fileName= "D:\\Java\\s1.csv";
		fileWriter= new FileWriter(fileName);
		
		//Write the CSV file header
		fileWriter.append(FILE_HEADER.toString());
		
		//add a new line separator after the header
		fileWriter.append(NEW_LINE_SEPARATOR);
		String s1=null;
		ListIterator it=studentsObj.listIterator();
			while(it.hasNext()) {
				//s1=it.next();
			Student std=(Student)it.next();
			System.out.println(std.getFirstName());
			}
			
			//Write a new student object list to the csv file
			
			for(Student student : studentsObj) {
				fileWriter.append(String.valueOf(student.getId()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(student.getFirstName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(student.getLastName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(student.getGender());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(student.getAge()));
				fileWriter.append(NEW_LINE_SEPARATOR);
			}
			
			System.out.println("CSV file was created successfully!!!");
		
	}
	catch (Exception e) {
		System.out.println("Error in CSVFileWriter!!!");
		e.printStackTrace();
	}
	finally {
		try {
			fileWriter.flush();
			fileWriter.close();
		}
		catch(IOException e) {
			System.out.println("error while flushing/closing filewriter");
			e.printStackTrace();
		}
	}
	}
	
public static void main(String[] args) {
	String fileName="student.csv";
	
	System.out.println("Write CSV file:");
	writeCsvFile(fileName);
}
}
