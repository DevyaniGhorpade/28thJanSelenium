package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndexInstagramLogin 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@autocorrect='off'])[1]")).sendKeys("abc");
		
		driver.findElement(By.xpath("(//input[@autocorrect='off'])[2]")).sendKeys("xyz");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(@class,'x168nmei x13lgxp2 x5pf9jr')])[6]")).click();
//		
		
		//click on create account or sign UP
//		driver.findElement(By.xpath("//span[contains(@class,'aad0 _aad7')]")).click();
//		
//		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("9987750118");
//		
//		driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("Devyani");
		
	}

}
