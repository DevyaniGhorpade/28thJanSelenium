package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllDataFromExcelSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Exceldata\\Book2.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastrow = sh.getLastRowNum();
		
		for(int i=0;i<=lastrow;i++)
		{
			int lastcellindex = sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=lastcellindex;j++)
			{
		      String value = sh.getRow(i).getCell(j).getStringCellValue();
		      System.out.print(value+"  ");
			}
			System.out.println();
		}
		
	}

}
