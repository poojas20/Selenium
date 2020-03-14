package ExcelFileHandling;

import java.io.File;

import PublicStaticData.CommonSharedData;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelGetParameter {
	private String ExcelFileName;
	public ExcelGetParameter(String FileName)
	{
		this.ExcelFileName= FileName;
	}
	
	public void GetAllExcelData(int sheetindex)
	{
		try		
		{
			Workbook dataWkBook= Workbook.getWorkbook(new File(this.ExcelFileName));
			Sheet dataSheet = dataWkBook.getSheet(sheetindex);
			int rows= dataSheet.getRows();
			int colnumParameter= dataSheet.findCell("Parameter").getColumn();
			for(int i =dataSheet.findCell("Parameter").getRow()+1;i<rows;i++)
			{
				CommonSharedData.TestData.put(dataSheet.getCell(colnumParameter, i).getContents(), dataSheet.getCell(colnumParameter+1, i).getContents());
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
