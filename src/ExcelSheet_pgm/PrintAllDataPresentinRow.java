package ExcelSheet_pgm;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllDataPresentinRow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
        FileInputStream file=new FileInputStream("D:\\Exceldata\\Book1.xlsx");
		
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
	     int lastcellindex = sh.getRow(0).getLastCellNum()-1;
	     
	     for(int i=0;i<=lastcellindex;i++)
	     {
	    	 String value = sh.getRow(0).getCell(i).getStringCellValue();
	    	 System.out.println(value+" ");
	     }
		
	}

}
