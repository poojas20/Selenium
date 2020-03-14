package ListnerFactory;

import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;

import ExcelFileHandling.ExcelGetParameter;
import PropertyFileHandler.PropertyFileData;
import PublicStaticData.CommonSharedData;

public class SuiteListner implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		CommonSharedData.AppURL=suite.getParameter("AppURL");
		
		new ExcelGetParameter(CommonSharedData.eXCELFileName).GetAllExcelData(0);
		try 
		{
			new PropertyFileData(CommonSharedData.ConfigFileName).initilizeAllDriverPath();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

}
