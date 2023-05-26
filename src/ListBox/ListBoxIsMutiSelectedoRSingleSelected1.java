package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxIsMutiSelectedoRSingleSelected1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/selenium/html/sample4.html");
		driver.manage().window().maximize();
		
		WebElement country=driver.findElement(By.xpath("//select[@id='1234']"));
		Thread.sleep(2000);
		
		Select s=new Select(country);
		
		boolean result=s.isMultiple();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("Listbox is multiselected");
		}
		else
		{
			System.out.println("Listbox is single selected");
		}
		driver.close();
	}

}
