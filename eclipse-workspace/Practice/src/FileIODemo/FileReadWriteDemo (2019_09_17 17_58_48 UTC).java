package FileIODemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileReadWriteDemo {

	public static void main(String[] args) throws Exception  {
	
		/*FileOutputStream fos=new FileOutputStream("Demo.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeUTF("Hello demo content");*/

		FileInputStream fis=new FileInputStream ("Demo.txt");
		DataInputStream dis=new DataInputStream(fis);
		String str=dis.readUTF(dis);
		System.out.println(str);
	}

}
