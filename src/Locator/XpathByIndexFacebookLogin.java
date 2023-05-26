package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndexFacebookLogin 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//click on create new account link
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//for first name
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Devyani");
		
		//For last name/surname
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("Ghorpade");
		
		//for mobile number
		driver.findElement(By.xpath("//input[@type='text'][4]")).sendKeys("9987750118");
		
	}

}
