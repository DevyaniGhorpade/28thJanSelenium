package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetData_WebTable 
{
	public static void main(String[] args) 
	{
		
	  WebDriver driver=new ChromeDriver();
	  driver.get("file:///D:/selenium/html/WebTable.html");
	  driver.manage().window().maximize();
	  
	  String text = driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[3]")).getText();
	  System.out.println(text);
	  
	  String text1 = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[2]")).getText();
	  System.out.println(text1);
	
	}

}
