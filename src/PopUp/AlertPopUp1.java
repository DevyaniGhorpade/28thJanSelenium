package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("11");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//get text from alert popup
		//String text = driver.switchTo().alert().getText();
		//System.out.println(text);
		
		//to click on cancel button
		//driver.switchTo().alert().dismiss();
		
		//to click on OK button
		driver.switchTo().alert().accept();
		
		
		
		
	}

}
