package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainsUsingTextFacebookLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//for username tab
		driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("devyanighorpade23@gmail.com");
	    Thread.sleep(2000);
	    
		//for password tab
		driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("Ghorpade@23100");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[contains(@class,'selected _51sy')]")).click();
		
	}

}
