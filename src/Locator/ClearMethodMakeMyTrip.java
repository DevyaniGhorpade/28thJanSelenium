package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethodMakeMyTrip 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		
		WebElement UN=driver.findElement(By.xpath("\\input[@data-cy='username']"));
	
	    UN.sendKeys("aabbcc");
	    
     	Thread.sleep(4000);
    	UN.clear();
    	Thread.sleep(4000);
		UN.sendKeys("xxyyzz");	
	}
}
