package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class GetScreenshot 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  System.out.println(src);
	  
	  File dest=new File("D:\\Screenshots\\abc.jpg");
	  
      FileHandler.copy(src, dest);
      
      //click on Create account 
      driver.findElement(By.xpath("//a[text()='Create new account']")).click();
      Thread.sleep(3000);
      
      File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  System.out.println(src1);
	  
	  File dest1=new File("D:\\Screenshots\\abc1.jpg");
	  FileHandler.copy(src1, dest1);
      }
}
