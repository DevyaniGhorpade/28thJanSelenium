package ExcelSheet_pgm;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetNumericDataAsString 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
        FileInputStream file=new FileInputStream("D:\\Exceldata\\Book1.xlsx");
		
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(value);
		
	}

}
