package Webdrivermethods1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaBeginerSite_Xpath 
{ 
	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver=new ChromeDriver();
	     driver.get("https://beginnersbook.com/2017/09/java-examples/");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//a[@data-replyto='Reply to manisha']")).click();
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("//textarea[@name='comment']"));
	     driver.close();
	     
	     
	}

}
