package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod 
{ 
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		//for username/email address or phone number
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
//		Thread.sleep(2000);
//		
//		//it will clear the input which is abc
//		driver.findElement(By.xpath("//input[@id='email']")).clear();
//		Thread.sleep(2000);
//		
//		//it will put xyz and remove previous input which is abc
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz");
       
		WebElement UN=driver.findElement(By.xpath("//input[@id='email']"));
		UN.sendKeys("abc");
		
		Thread.sleep(2000);
		UN.clear();
		Thread.sleep(2000);
		UN.sendKeys("xyz");
		
    }

}
