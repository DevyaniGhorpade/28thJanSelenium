package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute1 
{ 
	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://login.oracle.com/mysso/signon.jsp?request_id=007");
    
	  driver.findElement(By.xpath("//input[@id='sso_username']")).sendKeys("devyanighorpade23@gmail.com");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ghorpade@23100");
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//input[@class='sign-in-button']")).click();
	  

}
}
