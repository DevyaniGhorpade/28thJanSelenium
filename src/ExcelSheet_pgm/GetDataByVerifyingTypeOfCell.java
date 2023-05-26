package ExcelSheet_pgm;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataByVerifyingTypeOfCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
        FileInputStream file=new FileInputStream("D:\\Exceldata\\Book1.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		Cell cellinfo = sh.getRow(0).getCell(3);
		
		CellType ct = cellinfo.getCellType();
		
		if(ct==CellType.STRING)
		{
			String value = cellinfo.getStringCellValue();
			System.out.println(value);
		}
		else if(ct==CellType.NUMERIC)
		{
			double value = cellinfo.getNumericCellValue();
			System.out.println(value);
		}
		else if(ct==CellType.BOOLEAN)
		{
			boolean value = cellinfo.getBooleanCellValue();
			System.out.println(value);
		}
	}

}
