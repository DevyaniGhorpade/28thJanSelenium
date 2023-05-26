package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage_XpathByID 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/admin/Desktop/TagwithIDpgmExample.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("1234")).sendKeys("Devyani");
		Thread.sleep(3000);
		
		driver.findElement(By.id("1234")).sendKeys("Ghorpade");
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
