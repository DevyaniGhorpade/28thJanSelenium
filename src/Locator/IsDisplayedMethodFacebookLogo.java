package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethodFacebookLogo 
{
	
	 public static void main(String[] args) 
     {
    	 WebDriver driver=new ChromeDriver();
    	 driver.get("https://www.facebook.com/");
    	 driver.manage().window().maximize();
    	 
    	 boolean result=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
    	 System.out.println(result);
    	 
    	 if(result)
    	 {
    		 System.out.println("Logo is present");
    	 }
    	 else
    	 {
    		 System.out.println("Logo not present");
    	 }

}
}
