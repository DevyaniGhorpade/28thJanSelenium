package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText1ForgotPassFacebook 
{ 
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//click on forgotten password link
	    driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	    
    }

}
