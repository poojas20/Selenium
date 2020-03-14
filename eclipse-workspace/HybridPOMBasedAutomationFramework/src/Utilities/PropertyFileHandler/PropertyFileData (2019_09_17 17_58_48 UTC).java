package PropertyFileHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import PublicStaticData.DriverPaths;

public class PropertyFileData {
	
	
	Properties prop = new Properties();
	InputStream input = null;
	public PropertyFileData(String PrFileName) 
	{
		try
		{
			input = new FileInputStream(PrFileName);
		}
		catch (IOException ex) {
	        ex.printStackTrace();
	    }
	}
	public void initilizeAllDriverPath() throws IOException
	{
		try {

		        prop.load(input);
		        // get the property value and print it out
		       DriverPaths.ChromeDriverPath =prop.getProperty("ChromeDriverPath");
		        DriverPaths.IEDriverPath= prop.getProperty("IEDriverPath");
		        DriverPaths.FireFoxDriverPath= prop.getProperty("FirefoxDriverPath");

		    }  catch (IOException ex) {
		        ex.printStackTrace();
		    }finally {
		        if (input != null) {
		            try {
		                input.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		    }

	}
}
