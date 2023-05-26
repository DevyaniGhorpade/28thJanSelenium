package ExcelSheet_pgm;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetStringData_Excel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
//		FileInputStream file=new FileInputStream("D:\\Exceldata\\Book1.xlsx");
//		
//		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
//		
//		System.out.println(value);
//		
//		
		
//        FileInputStream file=new FileInputStream("D:\\Exceldata\\Book1.xlsx");
//		
//		double value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
//		
//		System.out.println(value);
		
        FileInputStream file=new FileInputStream("D:\\Exceldata\\Book1.xlsx");
		
		boolean value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
		
		System.out.println(value);
		
		
	}

}
