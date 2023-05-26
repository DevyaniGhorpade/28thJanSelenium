package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRowSize_WebTable 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium/html/WebTable.html");
		driver.manage().window().maximize();
		
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='1234']//tr"));
		int size=allrows.size();
		System.out.println(size);
		
	    //int rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
	   // System.out.println(rowsize);
	    
	}

}

