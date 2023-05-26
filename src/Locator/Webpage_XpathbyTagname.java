package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage_XpathbyTagname 
{   
	public static void main(String[] args) throws InterruptedException 
	{
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/admin/Desktop/TagwithIDpgmExample.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.tagName("input")).sendKeys("Devyani");
    Thread.sleep(3000);
   
   driver.findElement(By.tagName("input")).sendKeys("Ghorpade");
    

}
}
