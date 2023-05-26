package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectedListBox 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium/html/sample4.html");
		driver.manage().window().maximize();
		
		WebElement country=driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(country);
		s.selectByVisibleText("India");
		s.selectByVisibleText("Sri lanka");
		s.selectByIndex(3);
		
	}

}
