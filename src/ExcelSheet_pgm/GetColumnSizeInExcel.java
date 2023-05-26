package ExcelSheet_pgm;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetColumnSizeInExcel 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
  	{
//        FileInputStream file=new FileInputStream("D:\\Exceldata\\Book1.xlsx");
//		
//		short columnsize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
//		
//		System.out.println(columnsize);
		
//		FileInputStream file=new FileInputStream("D:\\Exceldata\\Book1.xlsx");
//		
//		short colsize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
//		
//		System.out.println(colsize);
		
        FileInputStream file=new FileInputStream("D:\\Exceldata\\Book1.xlsx");
		
		short rowsize = (short) WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		
		System.out.println(rowsize);
		
		
	}
}
