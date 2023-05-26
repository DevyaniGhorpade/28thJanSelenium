package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod_InstaLogo 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		
		boolean result=driver.findElement(By.xpath("//i[@class role='img']")).isDisplayed();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
	}

}
