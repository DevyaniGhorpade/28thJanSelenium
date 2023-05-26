package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup2 
{
	public static void main(String[] args) 
	{
	
    WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.manage().window().maximize();
	
	//to provide customer ID
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12");
	
	//to click on submit button
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	//switch to alert popup
	Alert alt= driver.switchTo().alert();
	
	//get text from alert popup
	String text = driver.switchTo().alert().getText();
	System.out.println(text);
	
	//to click on cancel button from alert popup
	alt.dismiss();
	
	//click on OK button from 1st alert popup
	alt.accept();
	
	//click on OK button from 2nd alert popup
	alt.accept();
	
	
	}
}
