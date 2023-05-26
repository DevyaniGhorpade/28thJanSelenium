package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintColumnDataOfExcelSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
 
	   FileInputStream file=new FileInputStream("D:\\Exceldata\\Book1.xlsx");
	   
	   Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	   
	   short lastcell = sh.getRow(0).getLastCellNum();
	   
	   for(int i=0;i<=lastcell;i++)
	   {
		   String value = sh.getRow(i).getCell(0).getStringCellValue();
		   System.out.println(value);
	   }
	
	}
	
}
