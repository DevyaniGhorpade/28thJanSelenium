package ExcelSheet_pgm;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllDataFromRowofExcelSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\Exceldata\\Book1.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastcellindex = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=lastcellindex;i++)
		{
			Cell cellinfo = sh.getRow(0).getCell(i);
			CellType ct = cellinfo.getCellType();
			
			if(ct==CellType.STRING)
			{
				String value = cellinfo.getStringCellValue();
				System.out.print(value+"  ");
			}
			else if(ct==CellType.NUMERIC)
			{
				double value = cellinfo.getNumericCellValue();
				System.out.print(value+"  ");
			}
			else if(ct==CellType.BOOLEAN)
			{
				boolean value = cellinfo.getBooleanCellValue();
				System.out.print(value+"  ");
		    }
		}
	}
}