package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeInstagram 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().minimize();
		
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc");
//		String text=driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
//		System.out.println(text);
//		driver.close();

		driver.findElement(By.xpath("//input[@autocorrect='off']")).sendKeys("xyz");
		
		String text=driver.findElement(By.xpath("//input[@autocorrect='off']")).getAttribute("value");
		System.out.println(text);
		
		driver.close();
		
	}

}
