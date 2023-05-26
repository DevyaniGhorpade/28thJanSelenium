package ListBox;

import javax.crypto.SealedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectOptionForMultiSelectedListbox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium/html/sample4.html");
		driver.manage().window().maximize();
		
		WebElement country=driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(country);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		
		s.deselectByIndex(2);
		//s.deselectAll();
		Thread.sleep(4000);
		driver.close();
		
		
	}
}
