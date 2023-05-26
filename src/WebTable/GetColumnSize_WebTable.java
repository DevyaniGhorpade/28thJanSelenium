package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetColumnSize_WebTable 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium/html/WebTable.html");
		driver.manage().window().maximize();
		
		int colsize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
		System.out.println(colsize);
		
		//for header
	    int colsize1= driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
	    System.out.println(colsize1);
		
	}

}
